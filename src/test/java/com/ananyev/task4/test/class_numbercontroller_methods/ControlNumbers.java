package com.ananyev.task4.test.class_numbercontroller_methods;

import org.testng.annotations.Test;

import com.ananyev.task4.NumberController;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * Unit tests for controlNumbers() of task4.NumberController.class
 */

public class ControlNumbers extends NumberController {
	       ControlNumbers control;	
	
	@BeforeClass
	public void beforeClass() {
		control = new ControlNumbers();
	}

	@AfterClass
	public void afterClass() {
        control = null;
	}

	@Test
	public void controlNumberPositiveTrue() {
		String[] args = { "1", "1", };
		Assert.assertTrue(control.controlNumbers(args));
	}
	
	@Test
	public void controlNumberPositiveFalseTooMany() {
		String[] args = { "1", "1", "4" };
		Assert.assertFalse(control.controlNumbers(args));
	}
	
	@Test
	public void controlNumberPositiveNotEnought() {
		String[] args = {"1"};
		Assert.assertFalse(control.controlNumbers(args));
	}
	
	@Test
	public void controlNumberPositiveSpecialSymbolsFalse() {
		String[] args = {"1&*", ""};
		Assert.assertFalse(control.controlNumbers(args));
	}
	
	@Test
	public void controlNumberPositiveLettersFalse() {
		String[] args = {"1", "2gg"};
		Assert.assertFalse(control.controlNumbers(args));
	}
	
	@Test
	public void controlNumberPositiveEmptyStringFalse() {
		String[] args = {"", ""};
		Assert.assertFalse(control.controlNumbers(args));
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void controlNumberNull() {
		String[] args = null;
		Assert.assertFalse(control.controlNumbers(args));
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void controlNumberUTF16() {
		String[] args = {"\uD835\uDD0A", "12"};
		Assert.assertFalse(control.controlNumbers(args));
	}
}
