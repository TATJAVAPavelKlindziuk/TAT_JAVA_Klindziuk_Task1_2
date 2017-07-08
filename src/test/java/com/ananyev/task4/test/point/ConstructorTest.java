package com.ananyev.task4.test.point;

import org.testng.annotations.Test;

import com.ananyev.task4.Point;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

/*
 * Unit tests for constructor() of Point.class
 */

public class ConstructorTest {
	Point point;

	@AfterMethod
	public void tearDown() {
		point = null;
	}

	private boolean testConstructorsforEqualObjects(int X1, int Y1, int X2, int Y2) {
		Point point1 = new Point(X1, Y1);
		Point point2 = new Point(X2, Y2);
		return point1.equals(point2);
	}

	@Test(priority  = 1)
	public void constructorValidPlusCoordinates() {
		point = new Point(2, 3);
		Assert.assertTrue(null != point);
	}

	@Test(priority  = 2)
	public void constructorsEqualPositive() {
		Assert.assertTrue(testConstructorsforEqualObjects(3, 4, 3, 4));
	}

	@Test(priority  = 3)
	public void constructorsNotEqualPositive() {
		Assert.assertFalse(testConstructorsforEqualObjects(4, 4, 4, 5));
	}

	@Test(priority  = 4)
	public void constructorsEqualZero() {
		Assert.assertTrue(testConstructorsforEqualObjects(0, 0, 0, 0));
	}

	@Test(priority  = 5)
	public void constructorsEqualNegative() {
		Assert.assertFalse(testConstructorsforEqualObjects(-1, 2, -2, -5));
	}

	@Test(priority  = 6)
	public void constructorValidMinusCoordinates() {
		point = new Point(-1, -13);
		Assert.assertTrue(null != point);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 5(usually we should ask or look in spec
	@Test(priority  = 7)
	public void constructorValidCoordinatesMinimum() {
		point = new Point(1, 3);
		Assert.assertTrue(null != point);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 5(usually we should ask or look in spec
	@Test(priority  = 8)
	public void constructorTestValidCoordinatesMaximum() {
		point = new Point(99999, 99999);
		Assert.assertTrue(null != point);
	}

	// we want to receive message with size of max quantity digit in side
	@Test(priority  = 8, expectedExceptions = IllegalArgumentException.class)
	public void constructorIntegerMaxValidCoordinates() {
		point = new Point(Integer.MAX_VALUE, 6);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority  = 9, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSideMAXValidSide() {
		point = new Point(6, Integer.MAX_VALUE);
	}

	// we want to receive message with size of max quantity digit in side
	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void checkSecondAreaIntegerMinValidCoordinates() {
		point = new Point(Integer.MIN_VALUE, 6);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSideMinValidSide() {
		point = new Point(6, Integer.MIN_VALUE);
	}

	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void constructorIntegerBytesValidCoordinates() {
		point = new Point(Integer.BYTES, 6);
	}

	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSideBytesValidSide() {
		point = new Point(6, Integer.BYTES);
	}
}
