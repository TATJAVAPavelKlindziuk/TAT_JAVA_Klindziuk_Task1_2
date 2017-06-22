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

public class CheckFirstArea extends CheckerPointPosition {
	CheckFirstArea check;
	Point point;

	@BeforeClass
	public void beforeClass() {
		check = new CheckFirstArea();
	}

	@AfterMethod
	public void tearDown() {
		point = null;
	}

	@AfterClass
	public void afterClass() {
		check = null;
	}

	@Test
	public void checkFirstAreaValidPlusCoordinates() {
		point = new Point(2, -2);
		Assert.assertTrue(check.checkFirstArea(point));
	}
	
	@Test
	public void checkFirstAreaValidPlusCoordinatesFalse() {
		point = new Point(2, -15);
		Assert.assertFalse(check.checkFirstArea(point));
	}
	
	@Test
	public void checkFirstAreaValidMinusCoordinatesTrue() {
		point = new Point(-1, -1);
		Assert.assertFalse(check.checkFirstArea(point));
	}

	@Test
	public void checkFirstAreaValidMinusCoordinatesFalse() {
		point = new Point(-1, -13);
		Assert.assertFalse(check.checkFirstArea(point));
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 2(usually we should ask or look in spec
	@Test
	public void checkFirstAreaTestValidCoordinatesMaximum() {
		point = new Point(22,22);
		Assert.assertFalse(check.checkFirstArea(point));
	}

	// we want to receive message with size of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkFirstAreaIntegerMaxValidCoordinates() {
		point = new Point(Integer.MAX_VALUE, 6);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkFirstAreaValidSideMAXValidSide() {
		point = new Point(6, Integer.MAX_VALUE);
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkFirstAreaNull() {
		check.checkFirstArea(null);
		Assert.assertFalse(check.checkFirstArea(point));
	}
}
