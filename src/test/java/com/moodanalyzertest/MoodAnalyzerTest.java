package com.moodanalyzertest;
import com.moodanalyzer.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	@Test
	public void givenMood_WhenHavingHappy_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String result = moodAnalyzer.analyzeMood("I am in happy mood.");
		Assert.assertEquals("Happy", result);
	}
	
	//TC 1.1
	@Test
	public void givenMood_WhenHavingSad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String result = moodAnalyzer.analyzeMood("I am in sad mood.");
		Assert.assertEquals("Sad", result);
	}
	
	//TC 1.2
	@Test
	public void givenMood_WhenHavingAny_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String result = moodAnalyzer.analyzeMood("I am in any mood.");
		Assert.assertEquals("Happy", result);
	}
}
