import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class TalMain3 {

	private HashMap<String, String> hash;
	private String[] inputs;
	private String requete;
	private String arbre;
	private String thisnormalisation;
	private String thislemmatisation;
	
	public TalMain3(String s) {
		this.requete = s;
		try{
			System.out.print("\n\nTexte : ");
			System.out.println("Phrase d'origine: "+s);

			//Normalisation

			//import in hashmap
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/VARIABLEGLOBALES.txt"), "UTF8"));
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
			String[] tmp = s.replaceAll("'", " ").split(" ", -1);
			String[] inputs = new String[tmp.length];
			for (int i=0; i<tmp.length;i++){
				inputs[i]=tmp[i].trim().toLowerCase();
			}
			String var = "";
			String normalisation = "";
			for (int i = 0; i < inputs.length; i++) {
				var = norm_hash.get(inputs[i]);
				if (var != null && var.length()>0)
					normalisation += '$'+var;
				else
					normalisation += inputs[i];
				normalisation += " ";
			}

			this.thisnormalisation = normalisation;
			System.out.println("Normalisation: "+normalisation);

			//Lemmatisation
			Lemmatisation lemmatisation = new Lemmatisation(normalisation);
			String lemme = lemmatisation.getLemmes();
			lemme = lemme.substring(0, lemme.length() - 2);
			lemme = lemme + '.';
			System.out.println("Lemmatisation: "+lemme);
			s = lemme;
			tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(s)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			tal_sqlParser parser = new tal_sqlParser(tokens);
			this.arbre = parser.listerequetes();
			this.thislemmatisation = lemme;
			this.thisnormalisation = normalisation;
			System.out.println(this.arbre);
		}
		catch(Exception e) {  }
	}
	
	public String getArbre() {
		return this.arbre;
	}
	
	public String getNormalisation() {
		return this.thisnormalisation;
	}
	
	public String getLemmatisation() {
		return this.thislemmatisation;
	}
}


//TODO
//Creer une grammaire avec des requete normalise a la main.
//Faire marcher la grammaire
//Lemmatiser nos requete part1
//Lemmatiser nos requete part2 - avec variable globale
//Get l'arbre en java. 
