package com.ananyev.task6.test.class_numbercontroller_methods;

import org.testng.annotations.Test;

import com.ananyev.task6.NumberController;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * Unit tests for hasAllScores() task6.NumberController
 *  this method checks quantity elements of
 * array ( == 3)
 */

public class HasAllScores extends NumberController {
	HasAllScores controller;

	@BeforeClass
	public void beforeClass() {
		controller = new HasAllScores();
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

	// Let's imagine that, MAX digits number of our array is 4.
	// Checking quantity of digits in number
	@Test
	public void hasAllScoresSizePositiveMaxNumber() {
		String[] args = { "1144", "123", "222" };
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
}
