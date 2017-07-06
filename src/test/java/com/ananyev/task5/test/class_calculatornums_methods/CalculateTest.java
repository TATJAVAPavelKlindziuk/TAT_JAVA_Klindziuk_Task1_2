package com.ananyev.task5.test.class_calculatornums_methods;

import org.testng.annotations.Test;

import com.ananyev.task5.CalculatorNums;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * Unit tests for calculate() of task5.CalculateNums.class
 */
public class CalculateTest {
	CalculatorNums calculator;
	double[] actual;

	@BeforeClass
	public void beforeClass() {
		calculator = new CalculatorNums();
	}

	@AfterClass
	public void afterClass() {
		calculator = null;
	}

	@Test(priority = 2)
	public void controlNumberSmokeTest() {
		String[] args = { "-2", "-2", "4" };
		double[] expected = { 16d, 16d, 16d };
		actual = calculator.calculate(args);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 3)
	public void controlNumberZerosTest() {
		String[] args = { "0", "0", "0" };
		double[] expected = { 0, 0, 0 };
		actual = calculator.calculate(args);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 4, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberSmokePositiveFalse() {
		String[] args = { "1", "2", };
		actual = calculator.calculate(args);
		}

	@Test(priority = 5, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberSmokePositiveOverLengthTrue() {
		String[] args = { "1", "2", "3", "4" };
		actual = calculator.calculate(args);
	}
	
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberSmokePositiveEmptyArray() {
		String[] args = {};
		actual = calculator.calculate(args);
	}

	// Let's imagine that, MAX digits number of our array is 3.
	// Checking quantity of digits in number 
	@Test(priority = 7)
	public void controlNumberSizePositiveMaxNumber() {
		String[] args = { "100", "100", "-10" };
		double[] expected = { 10000d,1000d,100d };
		actual = calculator.calculate(args);
		Assert.assertEquals(actual, expected);
		}
	
	// Let's imagine that, MAX digits number of our array is 8.
	// Checking quantity of digits in number 
	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberSizeNegativeMaxNumber() {
		String[] args = { "11442233", "12324247", "222" };
		actual = calculator.calculate(args);
	}
	
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberNull() {
		actual = calculator.calculate(null);
	}
	
	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberEmptyString() {
		String[] args = { "", "1", "222" };
		actual = calculator.calculate(args);
	}
	
	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberSpecialSymbolsValidArgs() {
		String[] args = { "1**%", "132", "222" };
		actual = calculator.calculate(args);
	}
	
	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberValidSpecialSymbolsValid() {
		String[] args = { "1", "1&&*2", "222" };
		actual = calculator.calculate(args);
	}
	
	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberValidArgsSpecialSymbols() {
		String[] args = { "12", "123", "222&&^^^1*" };
		actual = calculator.calculate(args);
	}
	
	@Test(priority = 14, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberLetters() {
		String[] args = { "123d4", "123", "44" };
		actual = calculator.calculate(args);
	}
	
	@Test(priority = 15, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberLettersValid() {
		String[] args = { "123dsasa", "123", "44" };
		actual = calculator.calculate(args);
	}
	
	@Test(priority = 16, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberValidLettersValid() {
		String[] args = { "123", "123dasa", "44" };
		actual = calculator.calculate(args);
	}
	
	@Test(priority = 17, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberValidArgsLetters() {
		String[] args = { "123", "123", "44ddd" };
		actual = calculator.calculate(args);
	}
	
	@Test(priority = 18, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberUTF16Escape() {
		String[] args = { "\uD835\uDD0A", "123", "44" };
		actual = calculator.calculate(args);
	}
	
	@Test(priority = 19, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberValidUTF16EscapeValid() {
		String[] args = {"123", "\uD835\uDD0A", "44" };
		actual = calculator.calculate(args);
	}
	
	@Test(priority = 20, expectedExceptions = IllegalArgumentException.class)
	public void controlNumberValidArgsUTF16Escape() {
		String[] args = {"123", "44", "\uD835\uDD0A",  };
		actual = calculator.calculate(args);
	}
}
