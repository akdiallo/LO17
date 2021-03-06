

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Lemmatisation {

	private HashMap<String, String> hash;
	private String[] inputs;
	private String input;
	private static double prefix_seuil = 0.75;
	private static int levenshteinN = 2;

	public Lemmatisation(String s) throws IOException {
		this.input = s;
		this.hash = new HashMap<String, String>();
		importIntoHash();
		userInput();

	}

	public void importIntoHash() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/lexique_lemme.txt"));
		String line;
		while ((line = br.readLine()) != null) {
			String[] lexique = line.split("\t", 0);
			this.hash.put(lexique[0].trim().toLowerCase(), lexique[1].trim().toLowerCase());
		}
		br.close();
	}

	public void userInput() {
		String input = this.input;
		String[] tmp = input.split(" ", -1);
		this.inputs = new String[tmp.length];
		for (int i=0; i<tmp.length;i++){
			this.inputs[i]=tmp[i].trim().toLowerCase();
		}
	}

	public String getLemmes() {
		String lemme = new String();
		String word = new String();
		String res = "";
		for (int i = 0; i < this.inputs.length; i++) {
			word = inputs[i];
			lemme = getLemme(inputs[i]);
			res += lemme+" ";
		}
		return res;
	}

	public String getLemme(String word) {
		boolean too_small = false;
		String res = "";
		if (word.length() < 3) too_small = true;
		String lemme = "";
		lemme = this.hash.get(word);
		if (word.length() > 0 && word.charAt(0) == '$') return word.toUpperCase();
		if (lemme!=null && lemme.length()>0) return lemme;
		if (!getBestPrefix(word).equals("") && !too_small)
			return getBestPrefix(word);
		if (!levenshtein(word).equals("") && !too_small)
			return levenshtein(word);
		return word;
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
			double moy = ((double)(word.length() + lemme.length()))/2; //au moins 50% de la moyenne de la somme de la taille des deux mots commun
			double seuil = moy*getPrefixSeuil(moy);
			if (n > seuil) return lemme;
		}
		return "";
	}

	public double getPrefixSeuil(double moy) {
		if (moy <= 4) return 0.90;
		if (moy <= 5) return 0.86;
		if (moy <= 6) return 0.82;
		if (moy <= 7) return 0.78;
		if (moy <= 8) return 0.74;
		if (moy <= 9) return 0.70;
		if (moy <= 10) return 0.66;
		if (moy <= 11) return 0.62;
		return 0.58;
	}

	public String levenshtein(String word) {
		List<Levenshtein> bestCandidats =  new ArrayList<Levenshtein>();
		Collection<String> lemmes = this.hash.values();
		for(String lemme : lemmes){
			int n = levenshteinDistance(word,lemme);
			if (n<=levenshteinN) bestCandidats.add(new Levenshtein(lemme,n,nbLetterCommon(word,lemme)));
		}
		if (bestCandidats.size() > 0) {
			Collections.sort(bestCandidats);
			return bestCandidats.get(0).word; //"Found "+bestCandidats.size()+" candidats (by levenshtein algorith): "+bestCandidats.toString();
		}
		else 
			return "";
	}
	
	public int nbLetterCommon(String word1, String word2) {
		int n = 0;
		int minLength = (int)Math.min(word1.length(), word2.length());
		for(int i=0;i<minLength;i++) {
			if (word1.indexOf(word2.charAt(i)) != -1) n++;
		}
		return n;
	}

	int levenshteinDistance(String str1, String str2) {
		int editRow = str1.length() + 1; //initialize row
		int editCol = str2.length() + 1; //initialize column
		int[][] editMatrix = new int[editRow][editCol];
		editMatrix = editMatrixGenerator(str1, str2, editMatrix, editRow,
				editCol);
		int editDistance = 999;
		editDistance = editMatrix[editRow - 1][editCol - 1];
		return editDistance;
	}


	int[][] editMatrixGenerator(String str1, String str2, int[][] editMatrix, int editRow, int editCol) {
		int i, j;
		char[] rowString = str1.toCharArray();
		char[] colString = str2.toCharArray();
		for (i = 0; i < editRow; i++) {
			for (j = 0; j < editCol; j++) {
				if (i == 0) {
					editMatrix[0][j] = j;
				}
				if (j == 0) {
					editMatrix[i][0] = i;
				}
				if (i != 0 && j != 0) {
					if (rowString[i - 1] == colString[j - 1]) {
						editMatrix[i][j] = editMatrix[i - 1][j - 1];
					} else {
						editMatrix[i][j] = (Math.min(editMatrix[i - 1][j - 1],
								Math.min(editMatrix[i][j - 1],
										editMatrix[i - 1][j]))) + 1;
					}
				}
			}
		}
		return editMatrix;
	}

	float edSimilarityCal(String string1, String string2, int editDistance) {
		float maxLen=string1.length();
		if (maxLen < string2.length())
			maxLen = string2.length();
		if (maxLen == 0.0F)
			return 1.0F;
		else
			return 1.0F - editDistance/maxLen;   
	}

}