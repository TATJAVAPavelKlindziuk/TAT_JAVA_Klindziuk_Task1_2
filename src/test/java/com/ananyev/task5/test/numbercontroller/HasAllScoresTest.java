package com.ananyev.task5.test.numbercontroller;

import org.testng.annotations.Test;


import com.ananyev.task5.NumberController;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * Unit tests for hasAllScores() task5.NumberController
 *  this method checks quantity elements of
 * array ( == 3)
 */

/*
 * Unit tests for hasAllScores() this method checks quantity elements of
 * array ( == 3)
 */

public class HasAllScoresTest extends NumberController {
	HasAllScoresTest controller;

	@BeforeClass
	public void beforeClass() {
		controller = new HasAllScoresTest();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 1)
	public void hasAllScoresSmokePositiveTrue() {
		String[] args = { "1", "2", "3" };
		Assert.assertTrue(controller.hasAllScores(args));
	}

	@Test(priority = 2)
	public void hasAllScoresSmokePositiveFalse() {
		String[] args = { "1", "2", };
		Assert.assertFalse(controller.hasAllScores(args));
	}

	@Test(priority = 3)
	public void hasAllScoresSmokePositiveOverLengthTrue() {
		String[] args = { "1", "2", "3", "4" };
		Assert.assertFalse(controller.hasAllScores(args));
	}

	@Test(priority = 4)
	public void hasAllScoresSmokePositiveEmptyArray() {
		String[] args = {};
		Assert.assertFalse(controller.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number of our array is 8.
	// Checking quantity of digits in number
	@Test(priority = 5)
	public void hasAllScoresSizePositiveMaxNumber() {
		String[] args = { "11442233", "12324247", "222" };
		Assert.assertTrue(controller.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number of our array is 8.
	// Checking quantity of digits in number
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresSizeNegativeMaxNumber() {
		String[] args = { "11442233", "12324247", "222" };
		controller.hasAllScores(args);
	}

	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresNull() {
		controller.hasAllScores(null);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresEmptyString() {
		String[] args = { "", "1", "222" };
		controller.hasAllScores(args);
	}

	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresSpecialSymbols() {
		String[] args = { "1**%", "1232", "222" };
		controller.hasAllScores(args);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresLetters() {
		String[] args = { "123d4", "123", "44" };
		controller.hasAllScores(args);
	}
	
	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresUTF16() {
		String[] args = { "123", "\uD835\uDD0A", "44" };
		controller.hasAllScores(args);
	}
}
