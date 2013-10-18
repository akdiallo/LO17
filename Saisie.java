package jsearch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Saisie {

	public static void main(String[] args) throws IOException {
		Saisie saisie = new Saisie();
		saisie.importIntoHash();
		while(true){
			saisie.userInput();
			saisie.getLemmes();
		}
	}

	private HashMap<String, String> hash;
	private String[] inputs;
	private static int prefixN = 4;
	private static int levenshteinN = 2;

	public Saisie() {
		this.hash = new HashMap<String, String>();
	}

	public void importIntoHash() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/Romain/Desktop/lexique_lemme.txt"));
		String line;
		while ((line = br.readLine()) != null) {
			String[] lexique = line.split("\t", 0);
			this.hash.put(lexique[0].trim().toLowerCase(), lexique[1].trim().toLowerCase());
			//System.out.println(lexique[0]+" "+lexique[1]);
		}
		br.close();
	}

	public void userInput() {
		Scanner inputReader = new Scanner(System.in);
		System.out.print("\n\n\nRequest: " );
		String input = inputReader.nextLine();
		String[] tmp = input.split(" ", -1);
		this.inputs = new String[tmp.length];
		for (int i=0; i<tmp.length;i++){
			this.inputs[i]=tmp[i].trim().toLowerCase();
		}
	}

	public void getLemmes() {
		String lemme = new String();
		String word = new String();
		for (int i = 0; i < this.inputs.length; i++) {
			word = inputs[i];
			lemme = getLemme(inputs[i]);
			System.out.println("Word: "+word+"\n"+lemme+"\n");
		}
		System.out.println("");
	}

	public String getLemme(String word) {
		String lemme = this.hash.get(word);
		if (lemme != null) {
			return "Lemme: "+lemme;
		} else if (!getBestPrefix(word).equals("")){
			return getBestPrefix(word);
		} else if (!levenshtein(word).equals("")){
			return levenshtein(word);
		} else
			return "Nothing found";
	}

	public String getBestPrefix(String word) {
		Collection<String> bestCandidats =  new ArrayList<String>();
		Collection<String> lemmes = this.hash.values();
		for(String lemme : lemmes){
			int minLength = (int)Math.min(word.length(), lemme.length());
			int n = 0;
			for(int i = 0; i < minLength; i++) {
				if (word.charAt(i) == lemme.charAt(i)) n++;
				else break;
			}
			if (n >= this.prefixN) bestCandidats.add(lemme);
		}
		if (bestCandidats.size() > 0)
			return "Found "+bestCandidats.size()+" candidats (by prefix algorithm): "+bestCandidats.toString();
		else 
			return "";
	}

	public String levenshtein(String word) {
		Collection<String> bestCandidats =  new ArrayList<String>();
		Collection<String> lemmes = this.hash.values();
		for(String lemme : lemmes){
			int n = computeLevenshteinDistance(word,lemme);
			if (n==levenshteinN) bestCandidats.add(lemme);
		}
		if (bestCandidats.size() > 0)
			return "Found "+bestCandidats.size()+" candidats (by levenshtein algorith): "+bestCandidats.toString();
		else 
			return "";
	}

	public static int computeLevenshteinDistance(String str1, String str2) {
		int[][] distance = new int[str1.length() + 1][str2.length() + 1];

		for (int i = 0; i <= str1.length(); i++)
			distance[i][0] = i;
		for (int j = 1; j <= str2.length(); j++)
			distance[0][j] = j;

		for (int i = 1; i <= str1.length(); i++)
			for (int j = 1; j <= str2.length(); j++)
				distance[i][j] = minimum(
						distance[i - 1][j] + 1,
						distance[i][j - 1] + 1,
						distance[i - 1][j - 1]
								+ ((str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0
										: 1));

		return distance[str1.length()][str2.length()];    
	}
	
    private static int minimum(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}