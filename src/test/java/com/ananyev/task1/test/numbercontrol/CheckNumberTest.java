package com.ananyev.task1.test.numbercontrol;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ananyev.task1.NumberControl;

/*
 * Unit tests for checkNumber() of task1.NumberControl.class
 * method include all checking methods in class 
 */
public class CheckNumberTest {
	
	NumberControl control;
	String line;

	@BeforeClass
	public void beforeClass() {
		control = new NumberControl();
	}

	@AfterClass
	public void afterClass() {
		control = null;
	}

	@Test(priority = 1)
	public void checkNumberSmoke() {
		String[] args = { "1432" };
		Assert.assertTrue(control.checkNumber(args));
	}

	@Test(priority = 2)
	public void checkNumberSmokeWithZero() {
		String[] args = { "0" };
		Assert.assertFalse(control.checkNumber(args));
	}

	@Test(priority = 3, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberSmokeWithMoreArgs() {
		String[] args = { "22", "22", "22" };
		control.checkNumber(args);
	}

	// Let's imagine that, MAX digits number of our array is 8
	@Test(priority = 4)
	public void checkNumberPositiveMaxNumber() {
		String[] args = { "11442233" };
		Assert.assertTrue(control.checkNumber(args));
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 5)
	public void checkNumberPositiveMinNumber() {
		String[] args = { "11" };
		Assert.assertTrue(control.checkNumber(args));
	}

	// Let's imagine that, MAX digits number of our array is 8
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberNegativeMaxNumber() {
		String[] args = { "11223344121212" };
		control.checkNumber(args);
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberNegativeMinNumber() {
		String[] args = { "1" };
		control.checkNumber(args);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberWithNull() {
		control.checkNumber(null);
	}

	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberWithMinus() {
		String[] args = { "-1" };
		control.checkNumber(args);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberWithLetters() {
		String[] args = { "12Dxc" };
		control.checkNumber(args);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberWithSpecialSymbols() {
		String[] args = { "1^&*!2" };
		control.checkNumber(args);
	}

	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberWithEmptyString() {
		String[] args = { "" };
		control.checkNumber(args);
	}
	
	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberUTF16String() {
		String[] args = { "\uD835\uDD0A" };
		control.checkNumber(args);
	}
}
