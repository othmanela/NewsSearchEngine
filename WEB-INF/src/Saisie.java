import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Saisie {
	public static ArrayList<String> read() {
		BufferedReader br = null;
		String chaine = "";
		try {
			try {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("saisie : ");
				chaine = br.readLine();
				// System.out.println("j'ai saisi "+chaine);
				// return chaine;
				/*StringTokenizer tokenizer = new StringTokenizer(chaine," ,.'?!;");
				ArrayList<String> sentence = new ArrayList<String>();
				while (tokenizer.hasMoreTokens()) {
					sentence.add(tokenizer.nextToken().toLowerCase());
				}*/
				if( chaine.substring(chaine.length() - 1).equals(".") ){
					chaine= chaine.substring(0,chaine.length() - 1);
				}
				if( chaine.substring(chaine.length() - 2).equals(". ") ){
					chaine= chaine.substring(0,chaine.length() - 2);
				}
				StringTokenizer tokenizer = new StringTokenizer(chaine," ,'’?!;");
				//StringTokenizer tokenizer = new StringTokenizer(chaine," ,.'?!;");
				ArrayList<String> sentence = new ArrayList<String>();
				while (tokenizer.hasMoreTokens()) {
					String token = tokenizer.nextToken().toLowerCase();
					if (token != " ")
						sentence.add(token);
				}
				return sentence;
			} catch (EOFException e) {
				br.close();
			}
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
		return new ArrayList<String>();
	}

}