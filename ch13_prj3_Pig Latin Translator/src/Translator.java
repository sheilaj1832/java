
public class Translator {

	private String englishInput;
	private String[] words;
	private String pigLatinOutput;

	// anything that is a result, you don't need a constructor. 
	public Translator(String englishInput) {
		super();
		this.englishInput = englishInput;
	}

	public String getEnglishInput() {
		return englishInput;
	}

	public void setEnglishInput(String englishInput) {
		this.englishInput = englishInput;
	}

	public String[] getWords() {
		return words;
	}

	public void setWords(String[] words) {
		this.words = words;
	}

	public String getPigLatinOutput() {
		return pigLatinOutput;
	}

	public void setPigLatinOutput(String pigLatinOutput) {
		this.pigLatinOutput = pigLatinOutput;
	}
	public String translate() {
		convertToLowercase();
		parseToStringArray();
		removePunctuation();
		
		//words is now 'clean' and ready for translation
		//1.) If the word starts with a vowel add 'way" to the end. 
		//    Set up a method StartsWithVowel.
		//2.) If the word starts with a consonant, move all of the 
		//    consonants that appear before the first vowel to the end 
		//    of the word, then add ay to the end of the word.
		//3.) If a word starts with the letter y, the y should be 
		//    treated as a consonant. If the y appears anywhere else in 
		//    the word, it should be treated as a vowel.
		for (int i = 0; i< words.length; i++) {
			String s = words[i];
			if (startsWithVowel(s)) {
				s+="way";
			}
			else if (!startsWithVowel(s)) {
				int v = indexOfFirstVowel(s);
				String sub1 = s.substring(0,v);
				String sub2 = s.substring(v,s.length());
				s = sub2+sub1+"ay";
			}
			words[i] = s;
		}
		for (String s: words) {
			pigLatinOutput+=(s+ " ");
		}
		
		return pigLatinOutput;

	}
	
		private void parseToStringArray() {
		// TODO Auto-generated method stub
		
	}

		private int indexOfFirstVowel(String s) {
			int i = 0;
				if (s.startsWith("a") || s.startsWith("e") ||
					s.startsWith("i") || s.startsWith("o") ||
					s.startsWith("u")) {
				}
			return i;
		}
		private boolean startsWithVowel(String s) {
		boolean startsWithVowel = false;
		if (s.startsWith("a") || s.startsWith("e") ||
			s.startsWith("i") || s.startsWith("o") ||
			s.startsWith("u")) {
			startsWithVowel = true;
		}

		return startsWithVowel;
		
	}
	
	//resetting the English input to lower case
	private void convertToLowercase() {
		englishInput = englishInput.toLowerCase();
	}
	//splitting the sentence to words.
	private void parseStringToArray() {
		words = englishInput.split(" ");
		}
	//remove punctuation (,.!?) from end of each word with enhanced for loop
	private void removePunctuation() {
		for (String s: words) {
			if (s.endsWith(",")||s.endsWith(".")||s.endsWith("!")||s.endsWith("?")) {
				int l = s.length();
				s = s.substring(0,l-1);
			}
		}
	}
}
