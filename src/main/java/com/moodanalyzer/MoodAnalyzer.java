package com.moodanalyzer;

public class MoodAnalyzer {
	
	private String message;
	
	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	public String analyzeMood() throws MoodAnalysisException {
		try {
			if (message.length()<=0) throw new MoodAnalysisException("Please enter proper mood.",ExceptionType.NOT_EMPTY);
			if (message.contains("happy")) return "Happy";
			
			else if (message.contains("sad")) return "Sad";
			
			else return "Happy";
			
		}
		catch(NullPointerException exception) {
			throw new MoodAnalysisException("Please enter proper mood.",ExceptionType.NOT_NULL);
		}
	}
}
