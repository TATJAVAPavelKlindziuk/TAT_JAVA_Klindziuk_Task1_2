package com.ananyev.task4.test.class_point_methods;

import org.testng.annotations.Test;

import com.ananyev.task4.Point;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

/*
 * Unit tests for constructor() of Point.class
 */

public class Constructor {
	Point point;

	@AfterMethod
	public void tearDown() {
		point = null;
	}

	private boolean testConstructorsforEqualObjects(int X1, int Y1, int X2, int Y2) {
		Point point1 = new Point(X1,Y1);
		Point point2 = new Point(X2,Y2);
		return point1.equals(point2);
	}

	@Test
	public void constructorValidPlusCoordinates() {
		point = new Point(2, 3);
		Assert.assertTrue(null != point);
	}
	
	@Test
	public void constructorValidMinusCoordinates() {
		point = new Point(-1, -13);
		Assert.assertTrue(null != point);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 5(usually we should ask or look in spec
	@Test
	public void constructorValidCoordinatesMinimum() {
		point = new Point(1, 3);
		Assert.assertTrue(null != point);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 5(usually we should ask or look in spec
	@Test
	public void constructorTestValidCoordinatesMaximum() {
		point = new Point(99999, 99999);
		Assert.assertTrue(null != point);
	}

	// we want to receive message with size of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void constructorIntegerMaxValidCoordinates() {
		point = new Point(Integer.MAX_VALUE,6);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSideMAXValidSide() {
		point = new Point(6, Integer.MAX_VALUE);
	}
	
	@Test
	public void constructorsEqualPositive() {
		Assert.assertTrue(testConstructorsforEqualObjects(3, 4, 3, 4));
	}

	@Test
	public void constructorsNotEqualPositive() {
		Assert.assertFalse(testConstructorsforEqualObjects(4, 4, 4, 5));
	}

	@Test
	public void constructorsEqualZero() {
		Assert.assertTrue(testConstructorsforEqualObjects(0, 0,  0, 0));
	}
	
	@Test
	public void constructorsEqualNegative() {
		Assert.assertFalse(testConstructorsforEqualObjects(-1, 2, -2, -5));
	}
}
