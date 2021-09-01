package com.moodanalyzer;

public class MoodAnalyzer {
	
	private String message;
	
	public MoodAnalyzer() {
	}
	
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	public String analyzeMood() {
		try {
			if (message.contains("happy")) return "Happy";
			
			else if (message.contains("sad")) return "Sad";
			
			else return "Happy";
		}
		catch(NullPointerException exception) {
			return "Happy";
		}
	}
}
