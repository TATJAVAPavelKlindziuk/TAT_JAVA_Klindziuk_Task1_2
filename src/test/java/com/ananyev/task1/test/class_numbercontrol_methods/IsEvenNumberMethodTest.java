package com.ananyev.task1.test.class_numbercontrol_methods;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ananyev.task1.NumberControl;

/*
 * Unit tests for isEvenNumber() of task1.NumberControl.class
 * checking quantity of arguments for odd or even
 */
public class IsEvenNumberMethodTest extends NumberControl {
	IsEvenNumberMethodTest even;
	String line;

	@BeforeClass
	public void beforeClass() {
		even = new IsEvenNumberMethodTest();
	}

	@AfterClass
	public void afterClass() {
		even = null;
	}
	
	@Test(priority = 1)
	public void isEvenNumberSmokePositiveTrue() {
		String line = "4444";
		Assert.assertTrue(even.isEvenNumber(line));
	}

	@Test(priority = 2)
	public void isEvenNumberSmokePositiveFalse() {
		String line = "123";
		Assert.assertFalse(even.isEvenNumber(line));
	}

	@Test(priority = 3)
	public void isEvenNumberSmokePositiveZero() {
		String line = "0";
		Assert.assertFalse(even.isEvenNumber(line));
	}

	// Let's imagine that, MAX digits number in our line is 8
	@Test(priority = 4)
	public void isEvenNumberSizePositiveMaxNumber() {
		String line = "11442233";
		Assert.assertTrue(even.isEvenNumber(line));
	}

	// Let's imagine that, MIN digits number in our line is 2
	@Test(priority = 5)
	public void isEvenNumberSizePositiveMinNumber() {
		String line = "12";
		Assert.assertTrue(even.isEvenNumber(line));
	}

	// Let's imagine that, MAX digits number in our line is 8
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void isEvenNumberSizeNegativeMaxNumber() {
		line = "11223344121212";
		even.isEvenNumber(line);
	}

	// Let's imagine that, MIN digits number in our line is 2
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void isEvenNumberSizeNegativeMinNumber() {
		line = "1";
		even.isEvenNumber(line);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void isEvenNumberNull() {
		even.checkNumber(null);
	}

	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void isEvenNumberMinus() {
		line = "-66444";
		even.isEvenNumber(line);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void isEvenNumberWithLetters() {
		line = "12Dxc";
		even.isEvenNumber(line);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void isEvenNumberWithSpecialSymbols() {
		line = "1^&*!2";
		even.isEvenNumber(line);
	}

	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void isEvenNumberWithEmptyString() {
		line = "";
		even.isEvenNumber(line);
	}
	
	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void checkNumberUTF16String() {
		line =  "\uD835\uDD0A";
		even.isEvenNumber(line);
	}
}
