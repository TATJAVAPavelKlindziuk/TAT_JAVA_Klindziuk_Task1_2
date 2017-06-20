package com.ananyev.task1.test;

import org.testng.annotations.Test;

import com.ananyev.task1.Massive;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class MassiveTest {
	Massive massive;
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
		String line = "3456";
		int[] expected = {3,4,5,6};
		actual = massive.createMassive(line);
		Assert.assertEquals(actual, expected);
	}
	
	// Let's imagine that, MAX digits number of our array is 10
	@Test(priority = 2)
	public void createArrayFromLinePositiveWithMaxDigits() {
		String line = "3456123452";
		int[] expected = {3,4,5,6,1,2,3,4,5,2};
		actual = massive.createMassive(line);
		Assert.assertEquals(actual, expected);
	}
	
	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 3)
	public void createArrayFromLinePositiveWithMinDigits() {
		String line = "34";
		int[] expected = {3,4};
		actual = massive.createMassive(line);
		Assert.assertEquals(actual, expected);
	}
	
	// Let's imagine that, MAX digits number of our array is 10
	@Test(priority = 4, expectedExceptions = IllegalArgumentException.class)
	public void createArrayFromLineNegativeWithMoreThanMaxDigits() {
		String line = "3456123452111";
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
		actual = massive.createMassive("-1");
	}

	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void createArrayFromLineWithNULL() {
		actual = massive.createMassive(null);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void createArrayFromLineWithLetters() {
		actual = massive.createMassive("34asd");
	}
	
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void createArrayFromLineWithSpecialSymbols() {
		actual = massive.createMassive("^&112");
	}
	
	}
