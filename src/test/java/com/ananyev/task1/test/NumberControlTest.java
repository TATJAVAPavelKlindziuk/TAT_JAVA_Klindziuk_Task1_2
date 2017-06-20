package com.ananyev.task1.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ananyev.task1.NumberControl;

public class NumberControlTest extends NumberControl {
	NumberControlTest control;
	String line;

	@BeforeClass
	public void beforeClass() {
		control = new NumberControlTest();
	}

	@AfterClass
	public void afterClass() {
		control = null;
	}

	/*
	 * Unit tests for checkNumber()
	 */

	@Test(priority = 1)
	public void checkArgumentsSizeSmoke() {
		String[] args = { "1432" };
		Assert.assertEquals(control.checkNumber(args), true);
	}

	@Test(priority = 2)
	public void checkArgumentsSizeSmokeWithZero() {
		String[] args = { "0" };
		Assert.assertEquals(control.checkNumber(args), false);
	}

	@Test(priority = 3)
	public void checkArgumentsSizeSmokeWithMoreArgs() {
		String[] args = { "22", "22", "22" };
		Assert.assertEquals(control.checkNumber(args), false);
	}

	// Let's imagine that, MAX digits number of our array is 8
	@Test(priority = 4)
	public void checkArgumentsSizePositiveMaxNumber() {
		String[] args = { "11442233" };
		Assert.assertEquals(control.checkNumber(args), true);
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 5)
	public void checkArgumentsSizePositiveMinNumber() {
		String[] args = { "11" };
		Assert.assertEquals(control.checkNumber(args), true);
	}

	// Let's imagine that, MAX digits number of our array is 8
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void checkArgumentsSizeNegativeMaxNumber() {
		String[] args = { "11223344121212" };
		control.checkNumber(args);
	}

	// Let's imagine that, MIN digits number of our array is 2
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void checkArgumentsSizeNegativeMinNumber() {
		String[] args = { "1" };
		control.checkNumber(args);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void checkArgumentsSizeWithNull() {
		control.checkNumber(null);
	}

	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void checkArgumentsSizeWithMinus() {
		String[] args = { "-1" };
		control.checkNumber(args);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void checkArgumentsSizeWithLetters() {
		String[] args = { "12Dxc" };
		control.checkNumber(args);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void checkArgumentsSizeWithSpecialSymbols() {
		String[] args = { "1^&*!2" };
		control.checkNumber(args);
	}

	/*
	 * Unit tests for isEvenNumber()
	 */

	@Test(priority = 12)
	public void isEvenNumberSmokePositiveTrue() {
		String line = "4444";
		Assert.assertTrue(control.isEvenNumber(line));
	}

	@Test(priority = 13)
	public void isEvenNumberSmokePositiveFalse() {
		String line = "123";
		Assert.assertFalse(control.isEvenNumber(line));
	}

	@Test(priority = 14)
	public void isEvenNumberSmokePositiveZero() {
		String line = "0";
		Assert.assertFalse(control.isEvenNumber(line));
	}

	// Let's imagine that, MAX digits number in our line is 8
	@Test(priority = 15)
	public void isEvenNumberSizePositiveMaxNumber() {
		String line = "11442233";
		Assert.assertTrue(control.isEvenNumber(line));
	}

	// Let's imagine that, MIN digits number in our line is 2
	@Test(priority = 16)
	public void isEvenNumberSizePositiveMinNumber() {
		String line =  "12";
		Assert.assertTrue(control.isEvenNumber(line));
	}

	// Let's imagine that, MAX digits number in our line is 8
	@Test(priority = 17, expectedExceptions = IllegalArgumentException.class)
	public void isEvenNumberSizeNegativeMaxNumber() {
		line = "11223344121212";
		control.isEvenNumber(line);
	}

	// Let's imagine that, MIN digits number in our line is 2
	@Test(priority = 18, expectedExceptions = IllegalArgumentException.class)
	public void isEvenNumberSizeNegativeMinNumber() {
		line = "1";
		control.isEvenNumber(line);
	}
	
	@Test(priority = 19, expectedExceptions = IllegalArgumentException.class)
	public void isEvenNumberNull() {
		control.checkNumber(null);
	}
	
	@Test(priority = 20, expectedExceptions = IllegalArgumentException.class)
	public void isEvenNumberMinus() {
		line = "-66444";
		control.isEvenNumber(line);
	}
	
	@Test(priority = 21, expectedExceptions = IllegalArgumentException.class)
	public void isEvenNumberWithLetters() {
		line = "12Dxc";
		control.isEvenNumber(line);
	}

	@Test(priority = 22, expectedExceptions = IllegalArgumentException.class)
	public void isEvenNumberWithSpecialSymbols() {
		line = "1^&*!2";
		control.isEvenNumber(line);
	}
	
	/*
	 * Unit tests for isNumberConsistsOfSymbols()
	 */
	
	@Test(priority = 23)
	public void isNumberConsistsOfSymbolsSmokePositiveTrue() {
		line = "7777";
		Assert.assertTrue(control.isNumberConsistsOfSymbols(line));
	}

	@Test(priority = 24)
	public void isNumberConsistsOfSymbolsPositiveFalse() {
		line = "12a";
		Assert.assertFalse(control.isNumberConsistsOfSymbols(line));
	}

	@Test(priority = 25)
	public void isNumberConsistsOfSymbolsSmokePositiveZero() {
		line = "0";
		Assert.assertFalse(control.isNumberConsistsOfSymbols(line));
	}
	
	// Let's imagine that, MAX digits number in our line is 8
		@Test(priority = 26)
		public void isNumberConsistsOfSymbolsSizePositiveMaxNumber() {
			String line = "11442233";
			Assert.assertTrue(control.isNumberConsistsOfSymbols(line));
		}

		// Let's imagine that, MIN digits number in our line is 2
		@Test(priority = 27)
		public void isNumberConsistsOfSymbolsSizePositiveMinNumber() {
			String line =  "12";
			Assert.assertTrue(control.isNumberConsistsOfSymbols(line));
		}

		// Let's imagine that, MAX digits number in our line is 8
		@Test(priority = 28, expectedExceptions = IllegalArgumentException.class)
		public void isNumberConsistsOfSymbolsSizeNegativeMaxNumber() {
			line = "11223344121212";
			control.isNumberConsistsOfSymbols(line);
		}

		// Let's imagine that, MIN digits number in our line is 2
		@Test(priority = 29, expectedExceptions = IllegalArgumentException.class)
		public void isNumberConsistsOfSymbolsSizeNegativeMinNumber() {
			line = "1";
			control.isNumberConsistsOfSymbols(line);
		}
		
		@Test(priority = 30, expectedExceptions = IllegalArgumentException.class)
		public void isNumberConsistsOfSymbolsNull() {
			control.isNumberConsistsOfSymbols(null);
		}
}
