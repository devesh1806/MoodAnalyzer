package com.moodanalyzer;

public class MoodAnalysisException extends Exception {
	public ExceptionType exceptionType;
	
	public MoodAnalysisException(String message,ExceptionType exceptionType) {
		super(message);
		this.exceptionType=exceptionType;
	}
}
