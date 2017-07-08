package com.ananyev.task8.test.numbercontroller;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ananyev.task8.NumberController;

/*
 * Unit tests for checkNumberForMaxValue() of task8.NumbeController.class
 * checking size of arguments of array (max = 1000)
 */

public class CheckNumberForMaxValueTest extends NumberController {
	CheckNumberForMaxValueTest maxValueChecker;


	@BeforeClass
	public void beforeClass() {
		maxValueChecker = new CheckNumberForMaxValueTest();
	}

	@AfterClass
	public void afterClass() {
		maxValueChecker = null;
	}

	@Test(priority = 1)
	public void checkNumberForMaxValueSmokePositiveTrue() {
		String[] args = { "1", "2" };
		Assert.assertTrue(maxValueChecker.checkNumberForMaxValue(args));
	}
	
	@Test(priority = 2)
	public void checkNumberForMaxValueSmokeNegativeTrue() {
		String[] args = { "-5", "2" };
		Assert.assertTrue(maxValueChecker.checkNumberForMaxValue(args));
	}
	
	@Test(priority = 3)
	public void checkNumberForMaxValueSmokePositiveMaxNumberTrue() {
		String[] args = { "999", "212" };
		Assert.assertTrue(maxValueChecker.checkNumberForMaxValue(args));
	}
	
	@Test(priority = 4)
	public void checkNumberForMaxValuePositiveMaxNumberFalse() {
		String[] args = { "1200", "212" };
		Assert.assertTrue(maxValueChecker.checkNumberForMaxValue(args));
	}

	@Test(priority = 5)
	public void checkNumberForMaxValueOverLengthTrue() {
		String[] args = { "1", "2", "3", "4" };
		Assert.assertFalse(maxValueChecker.checkNumberForMaxValue(args));
	}

	@Test(priority = 6)
	public void checkNumberForMaxValueEmptyArray() {
		String[] args = {};
		Assert.assertFalse(maxValueChecker.checkNumberForMaxValue(args));
	}

	// MAX digits number of our array is 4.
	// Checking quantity of digits in number
	@Test(priority = 7)
	public void checkNumberForMaxValueSizePositiveMaxDigitNumber() {
		String[] args = { "1000", "1000" };
		Assert.assertFalse(maxValueChecker.checkNumberForMaxValue(args));
	}

	// MAX digits number of our array is 4.
	// Checking quantity of digits in number
	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberForMaxValueSizeNegativeMaxNumber() {
		String[] args = { "11111", "11111" };
		maxValueChecker.checkNumberForMaxValue(args);
	}
	
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberForMaxValueSmokePositiveFalse() {
		String[] args = { "1" };
		Assert.assertFalse(maxValueChecker.checkNumberForMaxValue(args));
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberForMaxValueNull() {
		maxValueChecker.checkNumberForMaxValue(null);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberForMaxValueEmptyString() {
		String[] args = { "", "1", };
		maxValueChecker.checkNumberForMaxValue(args);
	}

	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberForMaxValueEmptyStringSecondNumber() {
		String[] args = { "1", "", };
		maxValueChecker.checkNumberForMaxValue(args);
	}

	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberForMaxValueSpecialSymbolsFirst() {
		String[] args = { "1**%", "1232" };
		maxValueChecker.checkNumberForMaxValue(args);
	}

	@Test(priority = 14, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberForMaxValueSpecialSymbolsSecond() {
		String[] args = { "1", "123&7" };
		maxValueChecker.checkNumberForMaxValue(args);
	}

	@Test(priority = 15, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberForMaxValueLettersFirst() {
		String[] args = { "123d4", "123" };
		maxValueChecker.checkNumberForMaxValue(args);
	}

	@Test(priority = 16, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberForMaxValueLettersSecond() {
		String[] args = { "12", "12dsds3" };
		maxValueChecker.checkNumberForMaxValue(args);
	}

	@Test(priority = 17, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberForMaxValueUTF16() {
		String[] args = { "\uD835\uDD0A", "12" };
		maxValueChecker.checkNumberForMaxValue(args);
	}
}
