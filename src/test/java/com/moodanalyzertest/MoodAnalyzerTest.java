package com.moodanalyzertest;
import com.moodanalyzer.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	@Test
	public void givenMood_WhenHavingHappy_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy mood.");
		String result = moodAnalyzer.analyzeMood();
		Assert.assertEquals("Happy", result);
	}
	
	//Repeat TC 1.1
	@Test
	public void givenMood_WhenHavingSad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood.");
		String result = moodAnalyzer.analyzeMood();
		Assert.assertEquals("Sad", result);
	}
	
	//Repeat TC 1.2
	@Test
	public void givenMood_WhenHavingAny_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood.");
		String result = moodAnalyzer.analyzeMood();
		Assert.assertEquals("Happy", result);
	}
	
	//TC 2.1
	@Test
	public void givenMood_WhenNull_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		String result = moodAnalyzer.analyzeMood();
		Assert.assertEquals("Happy", result);
	}
	
}
