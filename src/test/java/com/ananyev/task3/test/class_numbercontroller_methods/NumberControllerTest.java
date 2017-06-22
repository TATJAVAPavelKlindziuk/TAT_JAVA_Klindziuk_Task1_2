package com.ananyev.task3.test.class_numbercontroller_methods;

import org.testng.annotations.Test;

import com.ananyev.task3.NumberController;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * Unit tests for hasAllScores() this method checks quantity elements of
 * array ( == 3)
 */

public class NumberControllerTest extends NumberController {
	NumberControllerTest controller;

	@BeforeClass
	public void beforeClass() {
		controller = new NumberControllerTest();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test
	public void hasAllScoresSmokePositiveTrue() {
		String[] args = { "1", "2", "3" };
		Assert.assertTrue(controller.hasAllScores(args));
	}

	@Test
	public void hasAllScoresSmokePositiveFalse() {
		String[] args = { "1", "2", };
		Assert.assertFalse(controller.hasAllScores(args));
	}

	@Test
	public void hasAllScoresSmokePositiveOverLengthTrue() {
		String[] args = { "1", "2", "3", "4" };
		Assert.assertFalse(controller.hasAllScores(args));
	}

	@Test
	public void hasAllScoresSmokePositiveEmptyArray() {
		String[] args = {};
		Assert.assertFalse(controller.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number of our array is 8.
	// Checking quantity of digits in number
	@Test
	public void hasAllScoresSizePositiveMaxNumber() {
		String[] args = { "11442233", "12324247", "222" };
		Assert.assertTrue(controller.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number of our array is 8.
	// Checking quantity of digits in number
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresSizeNegativeMaxNumber() {
		String[] args = { "11442233", "12324247", "222" };
		controller.hasAllScores(args);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresNull() {
		controller.hasAllScores(null);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresEmptyString() {
		String[] args = { "", "1", "222" };
		controller.hasAllScores(args);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresSpecialSymbols() {
		String[] args = { "1**%", "1232", "222" };
		controller.hasAllScores(args);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresLetters() {
		String[] args = { "123d4", "123", "44" };
		controller.hasAllScores(args);
	}

	/*
	 * Unit tests for checkForSpecialSymbols() this method checks arguments of
	 * array for containing special symbols or letters
	 */

	@Test
	public void checkForSpecialSymbolsSmokePositiveTrue() {
		String[] args = { "1", "1", "4" };
		Assert.assertTrue(controller.hasAllScores(args));
	}

	@Test
	public void checkForSpecialSymbolsPositiveFalseLetters() {
		String[] args = { "123d4", "123", "44" };
		Assert.assertFalse(controller.hasAllScores(args));
	}

	@Test
	public void checkForSpecialSymbolsPositiveFalse() {
		String[] args = { "555", "12&*3", "442" };
		Assert.assertTrue(controller.hasAllScores(args));
	}

	@Test
	public void checkForSpecialSymbolsSmokePositiveZero() {
		String[] args = { "0", "0", "0" };
		Assert.assertTrue(controller.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number in our line is 8
	@Test
	public void checkForSpecialSymbolssSizePositiveMaxNumber() {
		String[] args = { "55555555", "122", "44" };
		Assert.assertTrue(controller.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number in our line is 8
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsSizeNegativeMaxNumber() {
		String[] args = { "11442233", "12324247", "222" };
		controller.hasAllScores(args);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsNull() {
		controller.hasAllScores(null);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsEmptyString() {
		String[] args = { "", "12324247", "222" };
		controller.hasAllScores(args);
	}

}
