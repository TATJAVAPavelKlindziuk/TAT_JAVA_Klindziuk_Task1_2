package com.ananyev.task4.test.class_numbercontroller_methods;

import org.testng.annotations.Test;

import com.ananyev.task4.NumberController;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * Unit tests for checkForSpecialSymbols() of task4.NumberController.class
 *  this method checks arguments of
 * array for containing special symbols or letters
 */
public class CheckForSpecialSymbols extends NumberController {
   CheckForSpecialSymbols checker;
	
  @BeforeClass
  public void beforeClass() {
	  checker = new CheckForSpecialSymbols();
  }

  @AfterClass
  public void afterClass() {
	  
  }
  
  @Test
	public void checkForSpecialSymbolsSmokePositiveTrue() {
		String[] args = { "1", "1", "4" };
		Assert.assertTrue(checker.hasAllScores(args));
	}

	@Test
	public void checkForSpecialSymbolsPositiveFalseLetters() {
		String[] args = { "123d4", "123", "44" };
		Assert.assertFalse(checker.hasAllScores(args));
	}

	@Test
	public void checkForSpecialSymbolsPositiveFalse() {
		String[] args = { "555", "12&*3", "442" };
		Assert.assertTrue(checker.hasAllScores(args));
	}

	@Test
	public void checkForSpecialSymbolsSmokePositiveZero() {
		String[] args = { "0", "0", "0" };
		Assert.assertTrue(checker.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number in our line is 8
	@Test
	public void checkForSpecialSymbolssSizePositiveMaxNumber() {
		String[] args = { "55555555", "122", "44" };
		Assert.assertTrue(checker.hasAllScores(args));
	}

	// Let's imagine that, MAX digits number in our line is 8
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsSizeNegativeMaxNumber() {
		String[] args = { "11442233", "12324247", "222" };
		checker.hasAllScores(args);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsNull() {
		checker.hasAllScores(null);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkForSpecialSymbolsEmptyString() {
		String[] args = { "", "12324247", "222" };
		checker.hasAllScores(args);
	}
}
