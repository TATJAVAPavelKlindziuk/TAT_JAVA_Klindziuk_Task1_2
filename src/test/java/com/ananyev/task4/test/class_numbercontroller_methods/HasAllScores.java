package com.ananyev.task4.test.class_numbercontroller_methods;

import org.testng.annotations.Test;

import com.ananyev.task4.NumberController;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * Unit tests for hasAllScores() task4.NumberController
 *  this method checks quantity elements of
 * array ( == 2)
 */

public class HasAllScores extends NumberController {
	 HasAllScores scores;
	
  @BeforeClass
  public void beforeClass() {
	  scores = new HasAllScores();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test
	public void hasAllScoresSmokePositiveTrue() {
		String[] args = { "1", "2" };
		Assert.assertTrue(scores.hasAllScores(args));
	}

	@Test
	public void hasAllScoresSmokePositiveFalse() {
		String[] args = { "1" };
		Assert.assertFalse(scores.hasAllScores(args));
	}

	@Test
	public void hasAllScoresSmokePositiveOverLengthTrue() {
		String[] args = { "1", "2", "3", "4" };
		Assert.assertFalse(scores.hasAllScores(args));
	}

	@Test
	public void hasAllScoresSmokePositiveEmptyArray() {
		String[] args = {};
		Assert.assertFalse(scores.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number of our array is 8.
	// Checking quantity of digits in number
	@Test
	public void hasAllScoresSizePositiveMaxNumber() {
		String[] args = { "11442233", "12324247" };
		Assert.assertTrue(scores.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number of our array is 8.
	// Checking quantity of digits in number
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresSizeNegativeMaxNumber() {
		String[] args = { "11442233", "12324247" };
		scores.hasAllScores(args);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresNull() {
		scores.hasAllScores(null);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresEmptyString() {
		String[] args = { "", "1", };
		scores.hasAllScores(args);
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresEmptyStringSecondNumber() {
		String[] args = { "1", "", };
		scores.hasAllScores(args);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresSpecialSymbolsFirst() {
		String[] args = { "1**%", "1232" };
		scores.hasAllScores(args);
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresSpecialSymbolsSecond() {
		String[] args = { "1", "123&7"};
		scores.hasAllScores(args);
	}
		
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresLettersFirst() {
		String[] args = { "123d4", "123" };
		scores.hasAllScores(args);
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresLettersSecond() {
		String[] args = { "12", "12dsds3" };
		scores.hasAllScores(args);
	}

}
