package com.ananyev.task2.test.caunter;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ananyev.task2.Caunter;

/*
 * Unit tests for caltulate() of task2.Caunter.class
 * method calculates lucky number(sum of first half == sum of second half
 */
public class CaltulateTest {
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
		double expected = -1.52262917695930048E17d;
		String[] actual = { "111111", "12", "111" };
		Assert.assertEquals(caunter.caltulate(actual), expected);
	}
	
	// Let's imagine that, MAX digits number of our array is 6
	@Test(priority = 3, expectedExceptions = IllegalArgumentException.class)
	public void calculateSumNegativeMaXNumberValidArgs() {
		String[] actual = { "777777777","1","2" };
		caunter.caltulate(actual);
	}

	@Test(priority = 4, expectedExceptions = IllegalArgumentException.class)
	public void calculateSumNegativeValidMaxNumberValid() {
		String[] actual = { "1","1232323232","2" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 5, expectedExceptions = IllegalArgumentException.class)
	public void calculateSumNegativeValidArgsMaxNumber() {
		String[] actual = { "2","1","2232323232" };
		caunter.caltulate(actual);
	}
	
	//our expression cannot recieve zeros
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionWithZeroValidArgs() {
		String[] actual = { "0", "1", "1" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionValidArgsZeroValidArgs() {
		String[] actual = { "2", "0", "1" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionValidArgsZero() {
		String[] actual = { "3", "2", "0" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionWithLettersValidArgs() {
		String[] actual = { "2d", "1", "1" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionValidLettersValid() {
		String[] actual = { "11", "3fff", "1" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionValidArgsLetters() {
		String[] actual = { "22", "11", "1rt2" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionSpecialSymbolsValidArgs() {
		String[] actual = { "18&*", "1&*^", "1" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionValidSpecialSymbolsValid() {
		String[] actual = { "2", "1&*^", "1" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 14, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionValidArgsSpecialSymbols() {
		String[] actual = { "2", "23", "1*^" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 15, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionEmptyStringValidArgs() {
		String[] actual = { "", "23", "1" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 16, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionValidEmptyStringValid() {
		String[] actual = { "1", "", "1" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 17, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionUTF16ValidArgsEmptyString() {
		String[] actual = { "\uD835\uDD0A", "22", "1" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 18, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionValidUTF16Valid() {
		String[] actual = {"1", "\uD835\uDD0A", "1" };
		caunter.caltulate(actual);
	}
	
	@Test(priority = 19, expectedExceptions = IllegalArgumentException.class)
	public void calculateExpressionUTF16ValidArgs() {
		String[] actual = {"22", "1", "\uD835\uDD0A" };
		caunter.caltulate(actual);
	}
}
