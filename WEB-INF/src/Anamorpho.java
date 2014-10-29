import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;


public class Anamorpho {
	
	 public static ArrayList<ArrayList<String>> runAnamorpho (ArrayList<String> request, String filePath) {
		 
		 Hashtable<String, String> lemmeTable = Cat.createTable(filePath);
		 HashMap<String, String> requestAnalysed = analyse (request, lemmeTable);
		 ArrayList<ArrayList<String>> finalRequest = convert(request, requestAnalysed);		 
		 return finalRequest;
	 }
	 
	 private static HashMap<String, String> analyse (ArrayList<String> request, Hashtable<String, String> lemmeTable) {
		 
		 HashMap<String, String> result = new HashMap<String, String>();
		 String temp="";
			
			for (int i = 0; i < request.size(); i++) {
				
				String currentWord = request.get(i).toString();
				
				if (currentWord.matches("\\d+")) {
					result.put(currentWord, currentWord);
					System.out.println("Nombre");
					continue;
				}
				
				temp = tryLexique(currentWord, lemmeTable);

				if (!"".equals(temp)) {				
					result.put(currentWord, temp);
					System.out.println("Methode lemme");
					continue;
				}
				else {
					temp = tryPrefix(currentWord, lemmeTable);
					//System.out.println(temp);
				}			
				if (!"".equals(temp) && !" ".equals(temp)) {	
					
					result.put(currentWord, temp);
					System.out.println("Methode prefixe");
					//System.out.println(temp);
					continue;
				}
				else {
					temp = tryLevenshtein(currentWord, lemmeTable);
					//System.out.println(temp);
				}
				if (!"".equals(temp) && !" ".equals(temp)) {				
					result.put(currentWord, temp);
					System.out.println("Methode Levenshtein");
					//System.out.println(temp);
					continue;
				}
				else {
					//temp = new ArrayList<String>();
					//temp.add("Sorry, no word found!");
					System.out.println("Not Found");
					result.put(currentWord, currentWord);
				}
				
			}
		 
		 
		 return result;
	 }
	 
		private static String tryLexique (String word,  Hashtable<String, String> lemmeTable) {
			
			String valLexique ="";
			
			if (lemmeTable.containsKey(word)) {			
				valLexique = lemmeTable.get(word);
			}
			
			return valLexique;
			
		}
			
		private static String tryPrefix (String word, Hashtable<String, String> lemmeTable) {
			
			//List<String> valPrefixe = new ArrayList<String>();
			String valPrefixe = "";
			int lengthWord = word.length();
			int seuilProximite = 80;
			int maxProximite = 0;
			
			for (Enumeration<String> keys = lemmeTable.keys(); keys.hasMoreElements();) {
				int lengthMin = 3;
				int seuil = 5;
				
				String lexiqueWord = keys.nextElement();
				int lengthLexiqueWord = lexiqueWord.length();

				if ((lengthWord < lengthMin) || (lengthLexiqueWord < lengthMin)) {
					if (0 >= seuilProximite && 0 > maxProximite) {
						maxProximite = 0;
						valPrefixe= lemmeTable.get(lexiqueWord);
						//valPrefixe.add(lexiqueWord);
					}
				}
				else if (Math.abs (lengthWord - lengthLexiqueWord) > seuil) {
					if (0 >= seuilProximite && 0 > maxProximite) {
						maxProximite = 0;
						//valPrefixe.add(lexiqueWord);
						valPrefixe= lemmeTable.get(lexiqueWord);
					}
				}
				else {
					int j = 1;
					while ((j < Math.min(lengthWord, lengthLexiqueWord) && (word.charAt(j) == lexiqueWord.charAt(j))))
						j++;
					int prox = (j * 100) / (Math.max(lengthWord, lengthLexiqueWord));
					if ((prox >= seuilProximite) && (!valPrefixe.contains(lemmeTable.get(lexiqueWord))) && (prox >  maxProximite)) {
						//valPrefixe.add(lexiqueWord);
						valPrefixe= lemmeTable.get(lexiqueWord);
						maxProximite = prox; 
						
					}
				}
			}

			return valPrefixe;
		}
		
		private static String tryLevenshtein (String word,Hashtable<String, String> lemmeTable) {
			
			String valLevenshtein = "";		
			int lengthWord = word.length();
			int seuilProximite = (int) Math.round(0.30 * lengthWord);
			int minProx = 99999;
			
			for (Enumeration<String> keys = lemmeTable.keys(); keys.hasMoreElements();) {
				String lexiqueWord = keys.nextElement();
				
				if ((levenshtein(word, lexiqueWord) <= seuilProximite) && (!valLevenshtein.contains(lemmeTable.get(lexiqueWord))) && (levenshtein(word, lexiqueWord)<minProx)) {
					valLevenshtein= lemmeTable.get(lexiqueWord);
					
					minProx= levenshtein(word, lexiqueWord); 
					
				}
			}
			
			return valLevenshtein;
			
		}
		
		private static int levenshtein (String s0, String s1) {
			
			int len0 = s0.length()+1;
			int len1 = s1.length()+1;
		 
			// the array of distances
			int[] cost = new int[len0];
			int[] newcost = new int[len0];
		 
			// initial cost of skipping prefix in String s0
			for(int i=0;i<len0;i++) cost[i]=i;
		 
			// dynamicaly computing the array of distances
		 
			// transformation cost for each letter in s1
			for(int j=1;j<len1;j++) {
		 
				// initial cost of skipping prefix in String s1
				newcost[0]=j-1;
		 
				// transformation cost for each letter in s0
				for(int i=1;i<len0;i++) {
		 
					// matching current letters in both strings
					int match = (s0.charAt(i-1)==s1.charAt(j-1))?0:1;
		 
					// computing cost for each transformation
					int cost_replace = cost[i-1]+match;
					int cost_insert  = cost[i]+1;
					int cost_delete  = newcost[i-1]+1;
		 
					// keep minimum cost
					newcost[i] = Math.min(Math.min(cost_insert, cost_delete),cost_replace );
				}
		 
				// swap cost/newcost arrays
				int[] swap=cost; cost=newcost; newcost=swap;
			}
		 
			// the distance is the cost for transforming all letters in both strings
			return cost[len0-1];
			
		}
		
		private static ArrayList<ArrayList<String>> convert ( ArrayList<String> request, HashMap<String,String> requestAnalysed){
			ArrayList<ArrayList<String>> finalRequest= new ArrayList<ArrayList<String>>();
			finalRequest.add(new ArrayList<String>());
			finalRequest.add(new ArrayList<String>());
			for (int i = 0; i < request.size(); i++) {
				
				System.out.println("Word : " + request.get(i).toString());
				System.out.println("Lemme : " + requestAnalysed.get(request.get(i)));	
				System.out.println("************");
				finalRequest.get(0).add(requestAnalysed.get(request.get(i)));
				finalRequest.get(1).add("Word : " + request.get(i).toString() + "<br>" + "Lemme : " + requestAnalysed.get(request.get(i)) + "<br>" + "************" + "<br>");
				
			}
			
			return finalRequest;
		}
		
		
		

}
