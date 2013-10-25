package jsearch;

public class Levenshtein implements Comparable {
	
	public int score;
	public int nbCommun;
	public String word;
	
	public Levenshtein(String w, int s, int n) {
		this.score = s;
		this.nbCommun = n;
		this.word = new String(w);
	}
	
	public int getScore(){
		return this.score;
	}
	
	public String getWord(){
		return this.word;
	}
	
	public String toString() {
		return this.word+" ("+score+","+nbCommun+")";
	}

	@Override
	public int compareTo(Object arg0) {
		if (this.score < ((Levenshtein)arg0).score)
			return 0;
		else if (this.nbCommun > ((Levenshtein)arg0).nbCommun)
			return 0;
		else
			return 1;
	}
}
