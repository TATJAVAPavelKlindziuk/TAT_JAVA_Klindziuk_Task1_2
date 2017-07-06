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
	public void controlNumbersSmoke() {
		String[] args = { "143", "11", "2" };
		Assert.assertTrue(controller.controlNumbers(args));
	}

	@Test(priority = 2)
	public void controlNumbersSmokeWithZero() {
		String[] args = { "0", "1", "2" };
		Assert.assertFalse(controller.controlNumbers(args));
	}

	@Test(priority = 3, expectedExceptions = IllegalArgumentException.class)
	public void controlNumbersMoreArgs() {
		String[] args = { "22", "22", "22", "11111" };
		Assert.assertTrue(controller.controlNumbers(args));
	}

	// Let's imagine that, MAX digits number of our array is 8
	@Test(priority = 4)
	public void controlNumbersPositiveMaxNumber() {
		String[] args = { "11442233", "13", "233" };
		Assert.assertTrue(controller.controlNumbers(args));
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 5)
	public void controlNumbersMinNumber() {
		String[] args = { "11", "144", "23" };
		Assert.assertTrue(controller.controlNumbers(args));
	}

	// Let's imagine that, MAX digits number of our array is 8
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void controlNumbersMaxNumber() {
		String[] args = { "11223344121212", "1", "23" };
		controller.controlNumbers(args);
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void controlNumbersNegativeMinNumber() {
		String[] args = { "1", "44", "444" };
		controller.controlNumbers(args);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void controlNumbersNull() {
		controller.controlNumbers(null);
	}

	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void controlNumbersWithMinus() {
		String[] args = { "-21", "23", "231" };
		controller.controlNumbers(args);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void controlNumbersLetters() {
		String[] args = { "12Dxc", "23", "222" };
		controller.controlNumbers(args);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void controlNumbersSpecialSymbols() {
		String[] args = { "1^&*", "2", "23" };
		controller.controlNumbers(args);
	}

	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void controlNumbersEmptyString() {
		String[] args = { "", "23", "45" };
		controller.controlNumbers(args);
	}
	
	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void controlNumbersInNumbersUTF16String() {
		String[] args = { "\uD835\uDD0A", "232", "23" };
		controller.controlNumbers(args);
	}
}
