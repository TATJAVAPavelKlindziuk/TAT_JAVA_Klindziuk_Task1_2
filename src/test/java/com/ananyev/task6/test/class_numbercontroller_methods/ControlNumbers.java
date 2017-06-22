package com.ananyev.task6.test.class_numbercontroller_methods;

import org.testng.annotations.Test;

import com.ananyev.task6.NumberController;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * Unit tests for controlNumbers() of task6.NumberController.class
 */

public class ControlNumbers  {
	NumberController controller;	
	
	@BeforeClass
	public void beforeClass() {
		controller = new NumberController();
	}

	@AfterClass
	
	public void afterClass() {
        controller = null;
	}

	@Test
	public void controlNumberPositiveTrue() {
		String[] args = { "1", "1", "1" };
		Assert.assertTrue(controller.controlNumbers(args));
	}
	
	@Test
	public void controlNumberPositiveFalseTooMany() {
		String[] args = { "1", "1", "4" };
		Assert.assertFalse(controller.controlNumbers(args));
	}
	
	@Test
	public void controlNumberPositiveNotEnought() {
		String[] args = {"1", "2"};
		Assert.assertFalse(controller.controlNumbers(args));
	}
	
	@Test
	public void controlNumberPositiveSpecialSymbolValidArgsFalse() {
		String[] args = {"1&*", "2"};
		Assert.assertFalse(controller.controlNumbers(args));
	}
	@Test
	public void controlNumberPositiveValidSpecialSymbolsValidFalse() {
		String[] args = {"12", "2&*"};
		Assert.assertFalse(controller.controlNumbers(args));
	}
	
	
	@Test
	public void controlNumberPositiveLettersFalse() {
		String[] args = {"1ffsf", "2gg"};
		Assert.assertFalse(controller.controlNumbers(args));
	}
	
	@Test
	public void controlNumberPositiveLettersValidArgsFalse() {
		String[] args = {"2", "2hf1"};
		Assert.assertFalse(controller.controlNumbers(args));
	}
	
	@Test
	public void controlNumberPositiveEmptyStringValidArgFalse() {
		String[] args = {"1", ""};
		Assert.assertFalse(controller.controlNumbers(args));
	}
	
	@Test
	public void controlNumberPositiveValidEmptyStringFalse() {
		String[] args = {"", "2"};
		Assert.assertFalse(controller.controlNumbers(args));
	}
}
