package com.ananyev.task8.test.calculatornums;

import org.testng.annotations.Test;

import com.ananyev.task8.CalculatorNums;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * unit tests of calculate() of CalculatorNums.class
 * this method calculate the sum of the elements is a multiple of the number
 */
public class CalculateTest {
	CalculatorNums calculator;
	int[] validArray = { 1, 2, 4, 6, 9 };
	String validLine = "2";

	@BeforeClass
	public void beforeClass() {
		calculator = new CalculatorNums();
	}

	@AfterClass
	public void afterClass() {
		calculator = null;
	}

	@Test(priority = 1)
	public void calculateSmokeTest() {
		int expected = 12;
		Assert.assertEquals(calculator.calculate(validArray, validLine), expected);
	}

	@Test(priority = 2)
	public void calculateSmokeTestWithNegative() {
		int expected = -12;
		int[] array = { 1, -2, -4, -6, 9 };
		String line = "-2";
		Assert.assertEquals(calculator.calculate(array, line), expected);
	}

	@Test(priority = 3)
	public void calculateSmokeTestWithZeroArray() {
		int expected = 0;
		int[] array = { 0, 0, 0 };
		String line = "2";
		Assert.assertEquals(calculator.calculate(array, line), expected);
	}

	// Let's imagine that, MAX digits number in our line is 4
	@Test(priority = 4)
	public void calculateSizePositiveMaxNumber() {
		int expected = 4444;
		int[] array = { 4444, 1, 5, 27 };
		String line = "2";
		Assert.assertEquals(calculator.calculate(array, line), expected);
	}

	// Let's imagine that, MAX digits number in our line is 4
	@Test(priority = 5, expectedExceptions = IllegalArgumentException.class)
	public void calculateSizePositiveMaxNumberInvalidArgs() {
		int expected = 666666;
		int[] array = { 666666, 1, 5, 27 };
		String line = "2";
		Assert.assertEquals(calculator.calculate(array, line), expected);
	}

	// we receive Arithmetic exception, but we cannot starting performing
	// with arguments equals to zero
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void calculateWithZeroLine() {
		int expected = -12;
		int[] array = { 1, -2, -4, -6, 9 };
		String line = "0";
		Assert.assertEquals(calculator.calculate(array, line), expected);
	}
	
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void calculateWithMaxInteger() {
		int expected = -12;
		int[] array = { 1, 2, Integer.MAX_VALUE };
		Assert.assertEquals(calculator.calculate(array, validLine), expected);
	}
	
	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void calculateTestWithMinInteger() {
		int expected = 2;
		int[] array = {Integer.MIN_VALUE, 1, 2,  };
		Assert.assertEquals(calculator.calculate(array, validLine), expected);
	}
	
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void calculateWithMinInteger() {
		int expected = 22;
		int[] array = {Integer.MIN_VALUE, 1, 2,  };
		Assert.assertEquals(calculator.calculate(array, validLine), expected);
	}
	
	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void calculateSmokeTestWithMinInteger() {
		int expected = 0;
		int[] array = {Integer.MIN_VALUE, 1, 2,  };
		Assert.assertEquals(calculator.calculate(array, validLine), expected);
	}
	
	@Test(priority = 11,expectedExceptions = IllegalArgumentException.class)
	public void calculateWithNullArrayValidString() {
		int expected = 0;
		int[] array = null;
		Assert.assertEquals(calculator.calculate(array, validLine), expected);
	}
	
	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void calculateWithValidArrayLettersString() {
		int expected = 0;
		String line = "1faF2";
		Assert.assertEquals(calculator.calculate(validArray, line), expected);
	}
	
	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void calculateWithValidArraySpecialSymbolsString() {
		int expected = 0;
		String line = "1*&2";
		Assert.assertEquals(calculator.calculate(validArray, line), expected);
	}

	@Test(priority = 14, expectedExceptions = IllegalArgumentException.class)
	public void calculateWithValidArrayNullString() {
		int expected = 0;
		String line = null;
		Assert.assertEquals(calculator.calculate(validArray, line), expected);
	}
	
	@Test(priority = 15, expectedExceptions = IllegalArgumentException.class)
	public void calculateWithValidArrayEmptyString() {
		int expected = 0;
		String line = "";
		Assert.assertEquals(calculator.calculate(validArray, line), expected);
	}
	
	@Test(priority = 16, expectedExceptions = IllegalArgumentException.class)
	public void calculateWithValidArrayUTF16String() {
		int expected = 0;
		String line = "\uD835\uDD0A";
		Assert.assertEquals(calculator.calculate(validArray, line), expected);
	}
	
	@Test(priority = 17, expectedExceptions = IllegalArgumentException.class)
	public void calculateTestWithByteInteger() {
		int expected = 6;
		int[] array = {Integer.BYTES, 1, 2,  };
		Assert.assertEquals(calculator.calculate(array, validLine), expected);
	}
	
	@Test(priority = 18, expectedExceptions = IllegalArgumentException.class)
	public void calculateWithByteInteger() {
		int expected = 22;
		int[] array = {Integer.BYTES, 1, 2,  };
		Assert.assertEquals(calculator.calculate(array, validLine), expected);
	}
	
	@Test(priority = 19, expectedExceptions = IllegalArgumentException.class)
	public void calculateSmokeTestWithByteInteger() {
		int expected = 0;
		int[] array = {Integer.BYTES, 1, 2,  };
		Assert.assertEquals(calculator.calculate(array, validLine), expected);
	}
}
