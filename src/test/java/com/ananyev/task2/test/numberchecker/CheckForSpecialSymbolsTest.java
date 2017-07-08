package com.ananyev.task2.test.numberchecker;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ananyev.task2.NumberChecker;

/*
 * Unit tests for checkForSpecialSymbols() of task2.NumberChecker.class
 * method checks for containing special symbols in arguments of array
 */

public class CheckForSpecialSymbolsTest extends NumberChecker {
 
	CheckForSpecialSymbolsTest checker;
	String line;

	@BeforeClass
	public void beforeClass() {
		checker = new CheckForSpecialSymbolsTest();
	}

	@AfterClass
	public void afterClass() {
		checker = null;
	}

	@Test(priority = 1)
	public void checkForSpecialSymbolsSmokeTest() {
		String[] actual = { "1", "2", "3" };
		Assert.assertTrue(checker.checkForSpecialSymbols(actual));
	}

	// Let's imagine that, MAX digits number in our line is 6
	@Test(priority = 2)
	public void checkForSpecialSymbolsMaxNumber() {
		String[] actual = { "111111", "12", "111" };
		Assert.assertTrue(checker.checkForSpecialSymbols(actual));
	}
	
	// Let's imagine that, MAX digits number of our array is 6
	@Test(priority = 3, expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsNegativeMaXNumberValidArgs() {
		String[] actual = { "777777777","1","2" };
		Assert.assertFalse(checker.checkForSpecialSymbols(actual));
	}

	@Test(priority = 4, expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsNegativeValidMaxNumberValid() {
		String[] actual = { "1","1232323232","2" };
		Assert.assertFalse(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 5, expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsNegativeValidArgsMaxNumber() {
		String[] actual = { "2","1","2232323232" };
		Assert.assertTrue(checker.checkForSpecialSymbols(actual));
	}
	
	//our expression cannot recieve zeros
	@Test(priority = 6)
	public void checkForSpecialSymbolsWithZeroValidArgs() {
		String[] actual = { "0", "1", "1" };
		Assert.assertTrue(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 7)
	public void checkForSpecialSymbolsValidArgsZeroValidArgs() {
		String[] actual = { "2", "0", "1" };
		Assert.assertTrue(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 8)
	public void checkForSpecialSymbolsValidArgsZero() {
		String[] actual = { "3", "2", "0" };
		Assert.assertTrue(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 9)
	public void checkForSpecialSymbolsWithLettersValidArgs() {
		String[] actual = { "2d", "1", "1" };
		Assert.assertFalse(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 10)
	public void checkForSpecialSymbolsValidLettersValid() {
		String[] actual = { "11", "3fff", "1" };
		Assert.assertFalse(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 11)
	public void checkForSpecialSymbolsValidArgsLetters() {
		String[] actual = { "22", "11", "1rt2" };
		Assert.assertFalse(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 12)
	public void checkForSpecialSymbolsSpecialSymbolsValidArgs() {
		String[] actual = { "18&*", "1", "12" };
		Assert.assertFalse(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 13)
	public void checkForSpecialSymbolsValidSpecialSymbolsValid() {
		String[] actual = { "2", "1&*^", "1" };
		Assert.assertFalse(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 14)
	public void checkForSpecialSymbolsValidArgsSpecialSymbols() {
		String[] actual = { "2", "23", "1*^" };
		Assert.assertFalse(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 15)
	public void checkForSpecialSymbolsEmptyStringValidArgs() {
		String[] actual = { "", "23", "1" };
		Assert.assertFalse(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 16)
	public void checkForSpecialSymbolsValidEmptyStringValid() {
		String[] actual = { "1", "", "1" };
		Assert.assertFalse(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 17)
	public void checkForSpecialSymbolsUTF16ValidArgsEmptyString() {
		String[] actual = { "\uD835\uDD0A", "22", "1" };
		Assert.assertFalse(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 18)
	public void checkForSpecialSymbolsValidUTF16Valid() {
		String[] actual = {"1", "\uD835\uDD0A", "1" };
		Assert.assertFalse(checker.checkForSpecialSymbols(actual));
	}
	
	@Test(priority = 19, expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsUTF16ValidArgs() {
		String[] actual = {"22", "1", "\uD835\uDD0A" };
		checker.checkForSpecialSymbols(actual);
	}
}
