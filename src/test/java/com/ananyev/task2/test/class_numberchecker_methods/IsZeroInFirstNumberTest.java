package com.ananyev.task2.test.class_numberchecker_methods;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ananyev.task2.NumberChecker;

/*
 * Unit tests for isZeroInFirstNumber()
 * this method checks is line equals to "0"
 */

public class IsZeroInFirstNumberTest extends NumberChecker {
	IsZeroInFirstNumberTest checker;
	String line;

	@BeforeClass
	public void beforeClass() {
		checker = new IsZeroInFirstNumberTest();
	}

	@AfterClass
	public void afterClass() {
		checker = null;
	}
	
	@Test(priority = 1)
	public void isZeroInFirstNumberSmokePositiveTrue() {
		line = "7777";
		Assert.assertTrue(checker.isZeroInFirstNumber(line));
	}

	@Test(priority = 2)
	public void isZeroInFirstNumberSmokePositiveFalse() {
		line = "0";
		Assert.assertFalse(checker.isZeroInFirstNumber(line));
	}

	@Test(priority = 3, expectedExceptions = IllegalArgumentException.class)
	public void isZeroInFirstNumberNull() {
		checker.isZeroInFirstNumber(null);
	}
	
	@Test(priority = 4, expectedExceptions = IllegalArgumentException.class)
	public void isZeroInFirstNumberEmptyString() {
		String line = "";
		checker.isZeroInFirstNumber(line);
	}
	
	@Test(priority = 5, expectedExceptions = IllegalArgumentException.class)
	public void isZeroInFirstNumberSpecialSymbols() {
		line = "1^&*!2";
		checker.isZeroInFirstNumber(line);
	}

	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void isZeroInFirstNumberUTF16String() {
		line =  "\uD835\uDD0A";
		checker.isZeroInFirstNumber(line);
	}
}
