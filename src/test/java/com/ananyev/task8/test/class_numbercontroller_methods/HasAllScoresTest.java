package com.ananyev.task8.test.class_numbercontroller_methods;

import org.testng.annotations.Test;

import com.ananyev.task8.NumberController;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * Unit tests for hasAllScores() task8.NumberController
 *  this method checks quantity elements of
 * array ( == 2)
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
		String[] args = { "1", "2" };
		Assert.assertTrue(controller.hasAllScores(args));
	}

	@Test(priority = 2)
	public void hasAllScoresSmokePositiveFalse() {
		String[] args = { "1" };
		Assert.assertFalse(controller.hasAllScores(args));
	}

	@Test(priority = 3)
	public void hasAllScoresPositiveOverLengthTrue() {
		String[] args = { "1", "2", "3" };
		Assert.assertFalse(controller.hasAllScores(args));
	}

	@Test(priority = 4)
	public void hasAllScoresSmokePositiveEmptyArray() {
		String[] args = {};
		Assert.assertFalse(controller.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number of our array is 4.
	// Checking quantity of digits in number
	@Test(priority = 5)
	public void hasAllScoresSizePositiveMaxNumber() {
		String[] args = { "1144", "123" };
		Assert.assertTrue(controller.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number of our array is 8.
	// Checking quantity of digits in number
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresSizeNegativeMaxNumber() {
		String[] args = { "11442233", "222" };
		controller.hasAllScores(args);
	}

	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresNull() {
		controller.hasAllScores(null);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresEmptyString() {
		String[] args = { "", "1" };
		controller.hasAllScores(args);
	}

	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresSpecialSymbols() {
		String[] args = { "1**%", "1232" };
		controller.hasAllScores(args);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresLetters() {
		String[] args = { "123d4", "123" };
		controller.hasAllScores(args);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresUTF16() {
		String[] args = { "23", "\uD835\uDD0A" };
		controller.hasAllScores(args);
	}
	
	@Test(priority = 12)
	public void hasAllScoresNegativeTrue() {
		String[] args = { "10", "-1" };
		Assert.assertTrue(controller.hasAllScores(args));
	}
}
