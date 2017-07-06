package com.ananyev.task4.test.class_checkerpointposition_methods;

import org.testng.annotations.Test;

import com.ananyev.task4.CheckerPointPosition;
import com.ananyev.task4.Point;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

/*
 * Unit tests for checkFirstArea() of Point.class
 * method decide containing for point
 */
public class CheckFirstAreaTest extends CheckerPointPosition {
	CheckFirstAreaTest check;
	Point point;

	@BeforeClass
	public void beforeClass() {
		check = new CheckFirstAreaTest();
	}

	@AfterMethod
	public void tearDown() {
		point = null;
	}

	@AfterClass
	public void afterClass() {
		check = null;
	}

	@Test(priority = 1)
	public void checkFirstAreaValidPlusCoordinates() {
		point = new Point(2, -2);
		Assert.assertTrue(check.checkFirstArea(point));
	}

	@Test(priority = 2)
	public void checkFirstAreaValidPlusCoordinatesFalse() {
		point = new Point(2, -15);
		Assert.assertFalse(check.checkFirstArea(point));
	}

	@Test(priority = 3)
	public void checkFirstAreaValidMinusCoordinatesTrue() {
		point = new Point(-1, -1);
		Assert.assertFalse(check.checkFirstArea(point));
	}

	@Test(priority = 4)
	public void checkFirstAreaValidMinusCoordinatesFalse() {
		point = new Point(-1, -13);
		Assert.assertFalse(check.checkFirstArea(point));
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 2(usually we should ask or look in spec
	@Test(priority = 5)
	public void checkFirstAreaTestValidCoordinatesMaximum() {
		point = new Point(22, 22);
		Assert.assertFalse(check.checkFirstArea(point));
	}

	// we want to receive message with size of max quantity digit in side
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void checkFirstAreaIntegerMaxValidCoordinates() {
		point = new Point(Integer.MAX_VALUE, 6);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void checkFirstAreaValidSideMAXValidSide() {
		point = new Point(6, Integer.MAX_VALUE);
	}

	// we want to receive message with size of max quantity digit in side
	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void checkFirstAreaIntegerMinValidCoordinates() {
		point = new Point(Integer.MIN_VALUE, 6);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void checkFirstAreaValidSideMinValidSide() {
		point = new Point(6, Integer.MIN_VALUE);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void checkFirstAreaIntegerBytesValidCoordinates() {
		point = new Point(Integer.BYTES, 6);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void checkFirstAreaValidSideBytesValidSide() {
		point = new Point(6, Integer.BYTES);
	}

	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void checkFirstAreaNull() {
		check.checkFirstArea(null);
		Assert.assertFalse(check.checkFirstArea(point));
	}

	@Test(priority = 13)
	public void checkFirstAreaZeros() {
		point = new Point(0, 0);
		Assert.assertTrue(check.checkFirstArea(point));
	}
}
