package com.moodanalyzer;

public class MoodAnalyzer {
	
	public String analyzeMood(String message) {
		
		if (message.contains("happy")) return "Happy";
		
		//TC 1.1 taken care below
		else if (message.contains("sad")) return "Sad";
		
		//TC 1.2 taken care below
		else return "Happy";
	}
}
