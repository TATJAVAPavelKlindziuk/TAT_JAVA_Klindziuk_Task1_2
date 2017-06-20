package com.ananyev.task2.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ananyev.task2.Caunter;

public class CaunterTest {
	Caunter caunter;

	@BeforeClass
	public void beforeClass() {
		caunter = new Caunter();
	}

	@AfterClass
	public void afterClass() {
		caunter = null;
	}

	@Test(priority = 1)
	public void calculateExpressionSmokeTest() {
		double expected = 0.75d;
		String[] actual = { "1", "2", "3" };
		Assert.assertEquals(caunter.caltulate(actual), expected);
	}

	// Let's imagine that, MAX digits number in our line is 6
	@Test(priority = 2)
	public void calculateExpressionMaxNumber() {
		double expected = 0;
		String[] actual = { "111111", "111111", "111111" };
		Assert.assertEquals(caunter.caltulate(actual), expected);
	}
	
	// Let's imagine that, MIN digits number of our array is 3
	@Test(priority = 3, expectedExceptions = IllegalArgumentException.class)
	public void calculateSumNegativeMinNumber() {
		String[] actual = { "","1","2" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 4, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionTestWithZero() {
		String[] actual = { "0", "1", "1" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 5, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionTestWithLetters() {
		String[] actual = { "2d", "1", "1" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionTestWithSpecialSymbols() {
		String[] actual = { "0a2", "1", "1" };
		caunter.caltulate(actual);
	}
	
}
