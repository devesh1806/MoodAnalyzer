package com.moodanalyzer;

public class MoodAnalyzer {
	
	private String message;
	
	public MoodAnalyzer() {
	}
	
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	public String analyzeMood() {
		if (message.contains("happy")) return "Happy";
		
		//TC 1.1 taken care below
		else if (message.contains("sad")) return "Sad";
		
		//TC 1.2 taken care below
		else return "Happy";
	}
}
