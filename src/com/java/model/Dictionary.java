package com.java.model;

public class Dictionary {
	
	private String word;
	private String wordtype;
	private String definition;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getWordtype() {
		return wordtype;
	}

	public void setWordtype(String wordtype) {
		this.wordtype = wordtype;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	@Override
	public String toString() {
		return "Dictionary [word=" + word + ", wordtype=" + wordtype + ", definition=" + definition + "]";
	}

}
