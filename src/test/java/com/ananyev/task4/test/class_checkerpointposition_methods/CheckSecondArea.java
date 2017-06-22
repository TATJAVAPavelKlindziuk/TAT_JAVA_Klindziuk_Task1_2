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

public class CheckSecondArea extends CheckerPointPosition {
	CheckSecondArea check;
	Point point;

	@BeforeClass
	public void beforeClass() {
		check = new CheckSecondArea();
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
	public void checkSecondAreaAreaValidPlusCoordinates() {
		point = new Point(2, -2);
		Assert.assertTrue(check.checkSecondArea(point));
	}
	
	@Test
	public void checkSecondAreaAreaValidPlusCoordinatesFalse() {
		point = new Point(2, 15);
		Assert.assertFalse(check.checkSecondArea(point));
	}
	
	@Test
	public void checkSecondAreaAreaValidMinusCoordinatesTrue() {
		point = new Point(-1, -1);
		Assert.assertTrue(check.checkSecondArea(point));
	}

	@Test
	public void checkSecondAreaValidMinusCoordinatesFalse() {
		point = new Point(-1, -13);
		Assert.assertFalse(check.checkSecondArea(point));
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 5(usually we should ask or look in spec
	@Test
	public void checkSecondAreaTestValidCoordinatesMaximum() {
		point = new Point(22, 22);
		Assert.assertFalse(check.checkSecondArea(point));
	}

	// we want to receive message with size of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkSecondAreaIntegerMaxValidCoordinates() {
		point = new Point(Integer.MAX_VALUE, 6);
		Assert.assertFalse(check.checkSecondArea(point));
	}

	// we want to receive message with number of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkSecondAreaValidSideMAXValidSide() {
		point = new Point(6, Integer.MAX_VALUE);
		Assert.assertFalse(check.checkSecondArea(point));
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkSecondAreaNull() {
		check.checkSecondArea(null);
		Assert.assertFalse(check.checkSecondArea(point));
	}
}

