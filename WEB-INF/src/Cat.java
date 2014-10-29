import java.io.*;
import java.util.*;

class Cat {
	public static Hashtable<String, String> createTable(String filePath) {
		BufferedReader br = null;
		String chaine;
		Hashtable<String, String> lemmeTable = new Hashtable<String, String>();

		try {
			try {
				br = new BufferedReader(new FileReader(filePath));
				while ((chaine = br.readLine()) != null) {

					StringTokenizer tokenizer = new StringTokenizer(chaine);
					ArrayList<String> lemmeArray = new ArrayList<String>();
					while (tokenizer.hasMoreTokens()) {
						lemmeArray.add(tokenizer.nextToken());
					}
					lemmeTable.put(lemmeArray.get(0), lemmeArray.get(1));
				}
				return lemmeTable;
			} catch (EOFException e) {
				br.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("fichier inconnu : " + filePath);
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
		return new Hashtable<String, String>();
	}
}