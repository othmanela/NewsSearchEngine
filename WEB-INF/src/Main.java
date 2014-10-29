import java.io.StringReader;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;


public class Main {

	public static void main(String[] args) {

		ArrayList<String> saisie = Saisie.read();
		ArrayList<ArrayList<String>> result1 = Anamorpho.runAnamorpho(saisie, "/Users/Othmane/Documents/workspace2/td05/lexic1.txt");
        ArrayList<String> request1 = result1.get(0);
        ArrayList<String> request1Debug = result1.get(1);
		ArrayList<ArrayList<String>> result2 = Anamorpho.runAnamorpho(request1, "/Users/Othmane/Documents/workspace2/td05/lexicA12.txt");
		ArrayList<String> request2 = result2.get(0);
        ArrayList<String> request2Debug = result2.get(1);
		
		String newS1 = concat(request1);	
		System.out.println(newS1);
		String newS2 = concat(request1Debug);	
		String newS3 = concat(request2);	
		System.out.println(newS3);
		String newS4 = concat(request2Debug);
		
		// ANTLR 
		try{
            tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(newS3)));
CommonTokenStream tokens = new CommonTokenStream(lexer);
            tal_sqlParser parser = new tal_sqlParser(tokens);
               String arbre = parser.requetesql();
		System.out.println(arbre);
				
		// POSTGRESQL
		InterrogPostgresql.runInterrog(arbre+';');
		
            } catch(Exception e) {  }
		
		}
	
		public static String concat (ArrayList<String> request) {
	    	String newS = "";	
			for (String s : request)
			{
			    newS += s + " ";
			}
			return newS;
	    }
	}



/*
for (int i = 0; i < request2.size()-1; i++) {
	newS= newS + (request2.get(i) + " ");	
}
newS= newS + (request2.get(request2.size()-1) + ".");*/