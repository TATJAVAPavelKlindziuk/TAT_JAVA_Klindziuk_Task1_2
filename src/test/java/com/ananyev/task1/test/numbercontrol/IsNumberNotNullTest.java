package com.ananyev.task1.test.numbercontrol;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ananyev.task1.NumberControl;

/*
 * Unit tests for isNumberNotNull()
 * this method checks line size
 */
public class IsNumberNotNullTest extends NumberControl {
	IsNumberNotNullTest nullController;
	String line;

	@BeforeClass
	public void beforeClass() {
		nullController = new IsNumberNotNullTest();
	}

	@AfterClass
	public void afterClass() {
		nullController = null;
	}

	@Test(priority = 1)
	public void isNumberNotNullSmoke() {
		String[] args = { "1432" };
		Assert.assertTrue(nullController.isNumberNotNull(args));
	}

	@Test(priority = 2)
	public void isNumberNotNullSmokeWithZero() {
		String[] args = { "0" };
		Assert.assertTrue(nullController.isNumberNotNull(args));
	}

	@Test(priority = 3)
	public void isNumberNotNullSmokeWithMoreArgs() {
		String[] args = { "22", "22", "22" };
		Assert.assertTrue(nullController.isNumberNotNull(args));
	}

	// Let's imagine that, MAX digits number of our array is 8
	@Test(priority = 4)
	public void isNumberNotNullPositiveMaxNumber() {
		String[] args = { "11442233" };
		Assert.assertTrue(nullController.isNumberNotNull(args));
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 5)
	public void isNumberNotNullPositiveMinNumber() {
		String[] args = { "11" };
		Assert.assertTrue(nullController.isNumberNotNull(args));
	}

	// Let's imagine that, MAX digits number of our array is 8
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void isNumberNotNullNegativeMaxNumber() {
		String[] args = { "11223344121212" };
		nullController.isNumberNotNull(args);
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void isNumberNotNullNegativeMinNumber() {
		String[] args = { "1" };
		nullController.isNumberNotNull(args);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void isNumberNotNullWithNull() {
		nullController.isNumberNotNull(null);
	}

	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void isNumberNotNullWithMinus() {
		String[] args = { "-1" };
		nullController.isNumberNotNull(args);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void isNumberNotNullWithLetters() {
		String[] args = { "12Dxc" };
		nullController.isNumberNotNull(args);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void isNumberNotNullWithSpecialSymbols() {
		String[] args = { "1^&*!2" };
		nullController.isNumberNotNull(args);
	}

	@Test(priority = 12)
	public void isNumberNotNullWithEmptyString() {
		String[] args = { "" };
		Assert.assertFalse(nullController.isNumberNotNull(args));
	}

	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void isNumberNotNullUTF16String() {
		String[] args = { "\uD835\uDD0A" };
		nullController.isNumberNotNull(args);
	}
}
