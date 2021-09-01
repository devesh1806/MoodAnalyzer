package com.moodanalyzertest;
import com.moodanalyzer.MoodAnalysisException;
import com.moodanalyzer.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	@Test
	public void givenMood_WhenHavingHappy_ShouldReturnHappy(){
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy mood.");
		String result;
		try {
			result = moodAnalyzer.analyzeMood();
			Assert.assertEquals("Happy", result);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
	
	//Repeat TC 1.1
	@Test
	public void givenMood_WhenHavingSad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood.");
		String result;
		try {
			result = moodAnalyzer.analyzeMood();
			Assert.assertEquals("Sad", result);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		
	}
	
	//Repeat TC 1.2
	@Test
	public void givenMood_WhenHavingAny_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood.");
		String result;
		try {
			result = moodAnalyzer.analyzeMood();
			Assert.assertEquals("Happy", result);
		} catch (MoodAnalysisException e) {
			
			e.printStackTrace();
		}
	}
	
	//TC 2.1 && TC 3.1
	@Test
	public void givenMood_WhenNull_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		String result;
		try {
			result = moodAnalyzer.analyzeMood();
			
		} catch (MoodAnalysisException e) {
			Assert.assertEquals("Please enter proper mood.", e.getMessage());
		}
		
	}
	
	//TC 3.2
	@Test
	public void givenMood_WhenEmpty_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		String result;
		try {
			result = moodAnalyzer.analyzeMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals("Message is Empty.", e.getMessage());
		}
		
	}
	
}
