package com.ananyev.task3.test.class_numbercontroller_methods;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ananyev.task3.NumberController;


/*
 * Unit tests for controlNumbers() of task3.NumberController.class
 * method include all checking methods in class 
 */
public class ControlNumbersTest {
	
	NumberController controller;
	String line;

	@BeforeClass
	public void beforeClass() {
		controller = new NumberController();
	}

	@AfterClass
	public void afterClass() {
		controller = null;
	}
	
	@Test(priority = 1)
	public void searchForMistakesInNumbersSmoke() {
		String[] args = { "1432", "11", "2" };
		Assert.assertTrue(controller.controlNumbers(args));
	}

	@Test(priority = 2)
	public void searchForMistakesInNumbersSmokeWithZero() {
		String[] args = { "0", "1", "2" };
		Assert.assertFalse(controller.controlNumbers(args));
	}

	@Test(priority = 3)
	public void searchForMistakesInNumbersMoreArgs() {
		String[] args = { "22", "22", "22", "11111" };
		Assert.assertTrue(controller.controlNumbers(args));
	}

	// Let's imagine that, MAX digits number of our array is 8
	@Test(priority = 4)
	public void searchForMistakesInNumbersPositiveMaxNumber() {
		String[] args = { "11442233", "13", "233" };
		Assert.assertTrue(controller.controlNumbers(args));
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 5)
	public void searchForMistakesInNumbersMinNumber() {
		String[] args = { "11", "144", "23" };
		Assert.assertTrue(controller.controlNumbers(args));
	}

	// Let's imagine that, MAX digits number of our array is 8
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void searchForMistakesInNumbersMaxNumber() {
		String[] args = { "11223344121212", "1", "23" };
		controller.controlNumbers(args);
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void searchForMistakesInNumbersNegativeMinNumber() {
		String[] args = { "1", "44", "444" };
		controller.controlNumbers(args);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void searchForMistakesInNumbersNull() {
		controller.controlNumbers(null);
	}

	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void searchForMistakesInNumbersWithMinus() {
		String[] args = { "-21", "23", "231" };
		controller.controlNumbers(args);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void searchForMistakesInNumbersLetters() {
		String[] args = { "12Dxc", "23", "222" };
		controller.controlNumbers(args);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void searchForMistakesInNumbersSpecialSymbols() {
		String[] args = { "1^&*", "2", "23" };
		controller.controlNumbers(args);
	}

	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void searchForMistakesInNumbersEmptyString() {
		String[] args = { "", "23", "45" };
		controller.controlNumbers(args);
	}
	
	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void searchForMistakesInNumbersUTF16String() {
		String[] args = { "\uD835\uDD0A", "232", "23" };
		controller.controlNumbers(args);
	}

}
