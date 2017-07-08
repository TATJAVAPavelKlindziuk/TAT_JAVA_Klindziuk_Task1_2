package com.ananyev.task1.test.massive;

import org.testng.annotations.Test;

import com.ananyev.task1.Massive;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/*
 * Unit tests for checkSumOfNumber() of task1.CheckerSum.class
 * method creates an array of int from array of strings
 */
public class CreateMassiveTest {
	Massive massive;
	String line;
	int[] actual;

	@BeforeClass
	public void beforeClass() {
		massive = new Massive();
	}

	@AfterClass
	public void afterClass() {
		massive = null;
	}

	@Test(priority = 1)
	public void createArrayFromLineSmoke() {
		line = "3456";
		int[] expected = { 3, 4, 5, 6 };
		actual = massive.createMassive(line);
		Assert.assertEquals(actual, expected);
	}

	// Let's imagine that, MAX digits number of our array is 10
	@Test(priority = 2)
	public void createArrayFromLinePositiveWithMaxDigits() {
		line = "3456123452";
		int[] expected = { 3, 4, 5, 6, 1, 2, 3, 4, 5, 2 };
		actual = massive.createMassive(line);
		Assert.assertEquals(actual, expected);
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 3)
	public void createArrayFromLinePositiveWithMinDigits() {
		line = "34";
		int[] expected = { 3, 4 };
		actual = massive.createMassive(line);
		Assert.assertEquals(actual, expected);
	}

	// Let's imagine that, MAX digits number of our array is 10
	@Test(priority = 4, expectedExceptions = IllegalArgumentException.class)
	public void createArrayFromLineNegativeWithMoreThanMaxDigits() {
		line = "3456123452111";
		actual = massive.createMassive(line);
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 5, expectedExceptions = IllegalArgumentException.class)
	public void createArrayFromLineNegativeWithLessThanMinDigits() {
		String line = "1";
		actual = massive.createMassive(line);
	}

	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void createArrayFromLineWithMinusSymbols() {
		line = "-1";
		actual = massive.createMassive(line);
	}

	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void createArrayFromLineWithNULL() {
		line = null;
		actual = massive.createMassive(line);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void createArrayFromLineWithLetters() {
		line = "232fs";
		actual = massive.createMassive(line);
	}

	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void createArrayFromLineWithSpecialSymbols() {
		line = "&6d";
		actual = massive.createMassive(line);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void createArrayFromLineWithEmptyString() {
		line = "";
		actual = massive.createMassive(line);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void createArrayFromLineWithUTF16String() {
		line = "\uD835\uDD0A";
		actual = massive.createMassive(line);
	}
}
