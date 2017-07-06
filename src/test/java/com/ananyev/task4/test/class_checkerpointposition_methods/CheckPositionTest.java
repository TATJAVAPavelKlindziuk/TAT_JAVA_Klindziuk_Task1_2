package com.ananyev.task4.test.class_checkerpointposition_methods;

import org.testng.annotations.Test;

import com.ananyev.task4.CheckerPointPosition;
import com.ananyev.task4.Point;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * Unit tests for checkPosition() of Point.class
 * method decide containing for point 
 */
public class CheckPositionTest extends CheckerPointPosition {
	CheckPositionTest position;
	Point point;

	@BeforeClass
	public void beforeClass() {
		position = new CheckPositionTest();
	}

	@AfterClass
	public void afterClass() {
		position = null;
	}

	@Test(priority = 1)
	public void checkPointPositionForLowerTrue() {
		point = new Point(2, -2);
		Assert.assertTrue(position.checkPosition(point));
	}

	@Test(priority = 2)
	public void checkPointPositionForLowerFalse() {
		point = new Point(2, -5);
		Assert.assertFalse(position.checkPosition(point));
	}

	@Test(priority = 3)
	public void checkPointPositionForZeros() {
		point = new Point(0, 0);
		Assert.assertTrue(position.checkPosition(point));
	}

	@Test(priority = 4)
	public void checkPointPositionForUpperTrue() {
		point = new Point(1, 1);
		Assert.assertTrue(position.checkPosition(point));
	}

	@Test(priority = 5)
	public void checkPointPositionForUpperFalse() {
		point = new Point(3, 1);
		Assert.assertFalse(position.checkPosition(point));
	}

	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void checkPointPositionForNull() {
		point = null;
		Assert.assertFalse(position.checkPosition(point));
	}

	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void checkSecondAreaIntegerMaxValidCoordinates() {
		point = new Point(Integer.MAX_VALUE, 6);
		Assert.assertFalse(position.checkPosition(point));
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void checkPointPositionValidCoordinatesIntegerMax() {
		point = new Point(7, Integer.MAX_VALUE);
		Assert.assertFalse(position.checkPosition(point));
	}

	// we want to receive message with size of max quantity digit in side
	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void checkPointPositionIntegerMinValidCoordinates() {
		point = new Point(Integer.MIN_VALUE, 6);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void checkPointPositionValidSideMinValidSide() {
		point = new Point(6, Integer.MIN_VALUE);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void checkPointPositionIntegerBytesValidCoordinates() {
		point = new Point(Integer.BYTES, 6);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void checkPointPositionValidSideBytesValidSide() {
		point = new Point(6, Integer.BYTES);
	}
}
