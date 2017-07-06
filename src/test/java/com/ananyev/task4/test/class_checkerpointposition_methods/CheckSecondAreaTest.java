package com.ananyev.task4.test.class_checkerpointposition_methods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.ananyev.task4.CheckerPointPosition;
import com.ananyev.task4.Point;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

/*
 * Unit tests for checkSecondArea() of Point.class
 * method decide containing for point
 */
public class CheckSecondAreaTest extends CheckerPointPosition {
	CheckSecondAreaTest check;
	Point point;

	@BeforeClass
	public void beforeClass() {
		check = new CheckSecondAreaTest();
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
	public void checkSecondAreaAreaValidPlusCoordinates() {
		point = new Point(2, -2);
		Assert.assertTrue(check.checkSecondArea(point));
	}

	@Test(priority = 2)
	public void checkSecondAreaAreaValidPlusCoordinatesFalse() {
		point = new Point(2, 15);
		Assert.assertFalse(check.checkSecondArea(point));
	}

	@Test(priority = 3)
	public void checkSecondAreaAreaValidMinusCoordinatesTrue() {
		point = new Point(-1, -1);
		Assert.assertTrue(check.checkSecondArea(point));
	}

	@Test(priority = 4)
	public void checkSecondAreaValidMinusCoordinatesFalse() {
		point = new Point(-1, -13);
		Assert.assertFalse(check.checkSecondArea(point));
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 5(usually we should ask or look in spec
	@Test(priority = 5)
	public void checkSecondAreaTestValidCoordinatesMaximum() {
		point = new Point(22, 22);
		Assert.assertFalse(check.checkSecondArea(point));
	}

	// we want to receive message with size of max quantity digit in side
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void checkSecondAreaIntegerMaxValidCoordinates() {
		point = new Point(Integer.MAX_VALUE, 6);
		Assert.assertFalse(check.checkSecondArea(point));
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void checkSecondAreaValidSideMAXValidSide() {
		point = new Point(6, Integer.MAX_VALUE);
		Assert.assertFalse(check.checkSecondArea(point));
	}

	// we want to receive message with size of max quantity digit in side
	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void checkSecondAreaIntegerMinValidCoordinates() {
		point = new Point(Integer.MIN_VALUE, 6);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void checkSecondAreaValidSideMinValidSide() {
		point = new Point(6, Integer.MIN_VALUE);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void checkSecondAreaIntegerBytesValidCoordinates() {
		point = new Point(Integer.BYTES, 6);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void checkSecondAreaValidSideBytesValidSide() {
		point = new Point(6, Integer.BYTES);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void checkSecondAreaNull() {
		check.checkSecondArea(null);
		Assert.assertFalse(check.checkSecondArea(point));
	}
}
