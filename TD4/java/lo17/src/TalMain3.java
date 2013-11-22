import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class TalMain3 {
	
	private HashMap<String, String> hash;
	private String[] inputs;
	
	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String s = "";
		while (!s.equals("*")) {
			System.out.print("Texte : ");
			s = scanner.nextLine();
			s = normalisation(s);
			tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(s)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			tal_sqlParser parser = new tal_sqlParser(tokens);
			String arbre = parser.listerequetes();
			System.out.println(arbre);
		}
	}
	
	private static String normalisation(String s) throws IOException {
		System.out.println("Phrase d'origine: "+s);
		
		//Normalisation
		
		//import in hashmap
		BufferedReader br = new BufferedReader(new FileReader("/Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/VARIABLEGLOBALES.txt"));
		String line;
		String GLOBALE = "";
		HashMap<String,String>norm_hash = new HashMap<String, String>();
		while ((line = br.readLine()) != null) {
			if (line.charAt(1) == '$') {
				GLOBALE = line.substring(2, line.length());
			} else {
				norm_hash.put(line.split("\t", 0)[1].toLowerCase(), GLOBALE);
			}
		}
		br.close();
		
		//norm action
		String[] tmp = s.split(" ", -1);
		String[] inputs = new String[tmp.length];
		for (int i=0; i<tmp.length;i++){
			inputs[i]=tmp[i].trim().toLowerCase();
		}
		String var = "";
		String normalisation = "";
		for (int i = 0; i < inputs.length; i++) {
			var = norm_hash.get(inputs[i]);
			if (var != null && var.length()>0)
				normalisation += '$'+var+'$';
			else
				normalisation += inputs[i];
			normalisation += " ";
		}
		
		System.out.println("Normalisation: "+normalisation);
		
		//Lemmatisation
		Lemmatisation lemmatisation = new Lemmatisation(normalisation);
		String lemme = lemmatisation.getLemmes();
		System.out.println("Lemmatisation: "+lemme);

		return lemme+'.';
	}
}


//TODO
//Creer une grammaire avec des requete normalise a la main.
//Faire marcher la grammaire
//Lemmatiser nos requete part1
//Lemmatiser nos requete part2 - avec variable globale
//Get l'arbre en java. 