package com.ananyev.task6.test.calculatornums;

import org.testng.annotations.Test;

import com.ananyev.task6.CalculatorNums;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * unit tests for calculate() of task8.CalculateNums
 * calculates sum of min and max elements of array
 */
public class ControlNumbersTest {

	CalculatorNums calculator;
	double actual;

	@BeforeClass
	public void beforeClass() {
		calculator = new CalculatorNums();
	}

	@AfterClass
	public void afterClass() {
		calculator = null;
	}

	@Test(priority = 1)
	public void calculateMinAndMaxSmokeTestPositive() {
		String[] args = { "22", "1", "4" };
		double expected = 23d;
		actual = calculator.calculate(args);
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void calculateMinAndMaxSmokeTestNegative() {
		String[] args = { "-5", "1", "-6" };
		double expected = -5;
		actual = calculator.calculate(args);
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void calculateMinAndMaxSmokeTestPositiveMixed() {
		String[] args = { "-22", "1", "4" };
		double expected = -18d;
		actual = calculator.calculate(args);
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 4)
	public void calculateMinAndMaxSmokeTestZeros() {
		String[] args = { "0", "0", "0" };
		double expected = 0;
		actual = calculator.calculate(args);
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 5)
	public void calculateMinAndMaxWithTwoArguments() {
		String[] args = { "1", "2", };
		double expected = 3d;
		actual = calculator.calculate(args);
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 6)
	public void calculateMinAndMaxWithOneArgument() {
		String[] args = { "8888", };
		double expected = 8888d;
		actual = calculator.calculate(args);
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void hasAllScoresSmokePositiveEmptyArray() {
		String[] args = {};
		actual = calculator.calculate(args);
	}

	// Let's imagine that, MAX digits number of our array is 4.
	// Checking quantity of digits in number
	@Test(priority = 8)
	public void calculateMinAndMaxSizePositiveMaxNumber() {
		String[] args = { "1000", "1000", "-10" };
		double expected = 990d;
		actual = calculator.calculate(args);
		Assert.assertEquals(actual, expected);
	}

	// Let's imagine that, MAX digits number of our array is 4.
	// Checking quantity of digits in number
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxSizeNegativeMaxNumber() {
		String[] args = { "16666", "22", "222" };
		actual = calculator.calculate(args);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxNull() {
		actual = calculator.calculate(null);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxEmptyStringValidArgs() {
		String[] args = { "", "1", "222" };
		actual = calculator.calculate(args);
	}

	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxValidEmptyStringValid() {
		String[] args = { "22", "", "222" };
		actual = calculator.calculate(args);
	}

	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxValidArgsEmptyString() {
		String[] args = { "2", "1", "" };
		actual = calculator.calculate(args);
	}

	@Test(priority = 14, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxSpecialSymbolsValidArgs() {
		String[] args = { "1**%", "132", "222" };
		actual = calculator.calculate(args);
	}

	@Test(priority = 15, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxValidSpecialSymbolsValid() {
		String[] args = { "1", "1&&*2", "222" };
		actual = calculator.calculate(args);
	}

	@Test(priority = 16, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxValidArgsSpecialSymbols() {
		String[] args = { "12", "123", "222&&^^^1*" };
		actual = calculator.calculate(args);
	}

	@Test(priority = 17, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxLetters() {
		String[] args = { "123d4", "123", "44" };
		actual = calculator.calculate(args);
	}

	@Test(priority = 18, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxLettersValid() {
		String[] args = { "123dsasa", "123", "44" };
		actual = calculator.calculate(args);
	}

	@Test(priority = 19, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxValidLettersValid() {
		String[] args = { "123", "123dasa", "44" };
		actual = calculator.calculate(args);
	}

	@Test(priority = 20, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxValidArgsLetters() {
		String[] args = { "123", "123", "44ddd" };
		actual = calculator.calculate(args);
	}

	@Test(priority = 21, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxUTF16Escape() {
		String[] args = { "\uD835\uDD0A", "123", "44" };
		actual = calculator.calculate(args);
	}

	@Test(priority = 22, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxValidUTF16EscapeValid() {
		String[] args = { "123", "\uD835\uDD0A", "44" };
		actual = calculator.calculate(args);
	}

	@Test(priority = 23, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinAndMaxValidArgsUTF16Escape() {
		String[] args = { "123", "44", "\uD835\uDD0A", };
		actual = calculator.calculate(args);
	}
}
