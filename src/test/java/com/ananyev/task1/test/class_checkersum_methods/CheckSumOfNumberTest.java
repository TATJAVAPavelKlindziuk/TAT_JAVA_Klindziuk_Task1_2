package com.ananyev.task1.test.class_checkersum_methods;

import org.testng.annotations.Test;

import com.ananyev.task1.CheckerSum;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/*
 * Unit tests for checkSumOfNumber() of task1.CheckerSum.class
 * method calculates lucky number(sum of first half == sum of second half
 */
public class CheckSumOfNumberTest {
	CheckerSum checker;

	@BeforeClass
	public void beforeClass() {
		checker = new CheckerSum();
	}

	@AfterClass
	public void afterClass() {
		checker = null;
	}

	@Test(priority = 1)
	public void calculateSumSmokeTrueWithEvenNumbers() {
		int[] actual = { 1, 4, 3, 2 };
		Assert.assertEquals(checker.checkSumOfNumber(actual), true);
	}

	@Test(priority = 2)
	public void calculateSumPositiveFalseWithEvenNumbers() {
		int[] actual = { 5, 4, 3, 1 };
		Assert.assertEquals(checker.checkSumOfNumber(actual), false);
	}

	@Test(priority = 3)
	public void calculateSumPositiveFalseWithOddNumbers() {
		int[] actual = { 1, 4, 3, 2, 5 };
		Assert.assertEquals(checker.checkSumOfNumber(actual), false);
	}

	// Let's imagine that, MAX digits number of our array is 8
	@Test(priority = 4)
	public void calculateSumPositiveMaxNumber() {
		int[] actual = { 1, 4, 3, 2 };
		Assert.assertEquals(checker.checkSumOfNumber(actual), true);
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 5)
	public void calculateSumPositiveMinNumber() {
		int[] actual = { 1, 4 };
		Assert.assertEquals(checker.checkSumOfNumber(actual), false);
	}

	// Let's imagine that, MAX digits number of our array is 8
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void calculateSumNegativeMaxNumber() {
		int[] actual = { 1, 4, 5, 2, 1, 2, 3, 6, 4, 6, 7, 5 };
		Assert.assertEquals(checker.checkSumOfNumber(actual), true);
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void calculateSumNegativeMinNumber() {
		int[] actual = { 1 };
		checker.checkSumOfNumber(actual);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void calculateMaxInteger() {
		int[] actual = { 1, 4, Integer.MAX_VALUE };
		checker.checkSumOfNumber(actual);
	}

	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinInteger() {
		int[] actual = {  2, Integer.MIN_VALUE, 3 };
		checker.checkSumOfNumber(actual);
	}
	
	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinIntegerBytes() {
		int[] actual = {  2, Integer.BYTES, 3 };
		checker.checkSumOfNumber(actual);
	}
	
	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void calculateMinIntegerByteSize() {
		int[] actual = { 1, 1, Integer.SIZE };
		checker.checkSumOfNumber(actual);
	}
	
}
