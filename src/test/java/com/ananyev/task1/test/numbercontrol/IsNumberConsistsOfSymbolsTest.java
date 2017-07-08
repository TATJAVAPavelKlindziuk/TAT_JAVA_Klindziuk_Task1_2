package com.ananyev.task1.test.numbercontrol;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ananyev.task1.NumberControl;

/*
 * Unit tests for isNumberConsistsOfSymbols() of task1.NumberControl.class
 * method checks for containing special symbols in argument line
 */
public class IsNumberConsistsOfSymbolsTest extends NumberControl {
	IsNumberConsistsOfSymbolsTest consist;
	String line;

	@BeforeClass
	public void beforeClass() {
		consist = new IsNumberConsistsOfSymbolsTest();
	}

	@AfterClass
	public void afterClass() {
		consist = null;
	}
	
	@Test(priority = 1)
	public void isNumberConsistsOfSymbolsSmokePositiveTrue() {
		line = "7777";
		Assert.assertTrue(consist.isNumberConsistsOfSymbols(line));
	}

	@Test(priority = 2)
	public void isNumberConsistsOfSymbolsPositiveFalse() {
		line = "12a";
		Assert.assertFalse(consist.isNumberConsistsOfSymbols(line));
	}

	@Test(priority = 3)
	public void isNumberConsistsOfSymbolsSmokePositiveZero() {
		line = "0";
		Assert.assertTrue(consist.isNumberConsistsOfSymbols(line));
	}

	// Let's imagine that, MAX digits number in our line is 8
	@Test(priority = 4)
	public void isNumberConsistsOfSymbolsSizePositiveMaxNumber() {
		String line = "11442233";
		Assert.assertTrue(consist.isNumberConsistsOfSymbols(line));
	}

	// Let's imagine that, MIN digits number in our line is 2
	@Test(priority = 5)
	public void isNumberConsistsOfSymbolsSizePositiveMinNumber() {
		String line = "12";
		Assert.assertTrue(consist.isNumberConsistsOfSymbols(line));
	}

	// Let's imagine that, MAX digits number in our line is 8
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void isNumberConsistsOfSymbolsSizeNegativeMaxNumber() {
		line = "11223344121212";
		consist.isNumberConsistsOfSymbols(line);
	}

	// Let's imagine that, MIN digits number in our line is 2
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void isNumberConsistsOfSymbolsSizeNegativeMinNumber() {
		line = "1";
		consist.isNumberConsistsOfSymbols(line);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void isNumberConsistsOfSymbolsNull() {
		consist.isNumberConsistsOfSymbols(null);
	}
	
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void isNumberConsistsOfEmptyString() {
		consist.isNumberConsistsOfSymbols("");
	}
	
	@Test(priority = 10)
	public void isNumberConsistsOfSymbolsWithSpecialSymbols() {
		line = "1^&*!2";
		Assert.assertFalse(consist.isNumberConsistsOfSymbols(line));
	}

	@Test(priority = 11)
	public void checkNumberUTF16String() {
		line =  "\uD835\uDD0A";
		Assert.assertFalse(consist.isNumberConsistsOfSymbols(line));
	}
	
	@Test(priority = 12)
	public void isNumberConsistsOfSymbolsWithMinus() {
		line = "-23";
		Assert.assertFalse(consist.isNumberConsistsOfSymbols(line));
	}
}
