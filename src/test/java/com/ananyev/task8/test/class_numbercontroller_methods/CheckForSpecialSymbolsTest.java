package com.ananyev.task8.test.class_numbercontroller_methods;

import org.testng.annotations.Test;

import com.ananyev.task6.NumberController;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * Unit tests for checkForSpecialSymbols() of task8.NumberController.class
 *  this method checks arguments of
 * array for containing special symbols or letters
 */
public class CheckForSpecialSymbolsTest extends NumberController {
	CheckForSpecialSymbolsTest checker;

	@BeforeClass
	public void beforeClass() {
		checker = new CheckForSpecialSymbolsTest();
	}

	@AfterClass
	public void afterClass() {
		checker = null;
	}

	@Test(priority = 1)
	public void checkForSpecialSymbolsSmokePositiveTrue() {
		String[] args = { "1", "1", "4" };
		Assert.assertTrue(checker.hasAllScores(args));
	}

	@Test(priority = 2)
	public void checkForSpecialSymbolsPositiveFalseLetters() {
		String[] args = { "123d4", "123", "44" };
		Assert.assertFalse(checker.hasAllScores(args));
	}

	@Test(priority = 3)
	public void checkForSpecialSymbolsPositiveFalse() {
		String[] args = { "555", "12&*3", "442" };
		Assert.assertTrue(checker.hasAllScores(args));
	}

	@Test(priority = 4)
	public void checkForSpecialSymbolsSmokePositiveZero() {
		String[] args = { "0", "0", "0" };
		Assert.assertTrue(checker.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number in our line is 8
	@Test(priority = 5)
	public void checkForSpecialSymbolssSizePositiveMaxNumber() {
		String[] args = { "55555555", "122", "44" };
		Assert.assertTrue(checker.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number in our line is 8
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsSizeNegativeMaxNumber() {
		String[] args = { "11442233", "12324247", "222" };
		checker.hasAllScores(args);
	}

	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsNull() {
		checker.hasAllScores(null);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsEmptyString() {
		String[] args = { "", "12324247", "222" };
		checker.hasAllScores(args);
	}
	
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsUTF16String() {
		String[] args = { "23223", "\uD835\uDD0A", "222" };
		checker.hasAllScores(args);
	}
	
	@Test(priority = 10)
	public void checkForSpecialSymbolsSmokeNegativeTrue() {
		String[] args = { "1", "-1", "-4" };
		Assert.assertTrue(checker.hasAllScores(args));
	}
}
