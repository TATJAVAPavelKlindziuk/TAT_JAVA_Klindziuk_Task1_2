package com.ananyev.task4.test.class_checkerpointposition_methods;

import org.testng.annotations.Test;

import com.ananyev.task4.CheckerPointPosition;
import com.ananyev.task4.Point;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CheckPosition extends CheckerPointPosition {
	CheckPosition position;
	Point point;

	@BeforeClass
	public void beforeClass() {
		position = new CheckPosition();
	}

	@AfterClass
	public void afterClass() {
		position = null;
	}

	@Test
	public void checkPointPositionForLowerTrue() {
		point = new Point(2, -2);
		Assert.assertTrue(position.checkPosition(point));
	}
	
	@Test
	public void checkPointPositionForLowerFalse() {
		point = new Point(2, -5);
		Assert.assertFalse(position.checkPosition(point));
	}
	
	@Test
	public void checkPointPositionForZeros() {
		point = new Point(0, 0);
		Assert.assertTrue(position.checkPosition(point));
	}
	
	@Test
	public void checkPointPositionForUpperTrue() {
		point = new Point(1, 1);
		Assert.assertTrue(position.checkPosition(point));
	}
	
	@Test
	public void checkPointPositionForUpperFalse() {
		point = new Point(3, 1);
		Assert.assertFalse(position.checkPosition(point));
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkPointPositionForNull() {
		point = null;
		Assert.assertFalse(position.checkPosition(point));
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void checkSecondAreaIntegerMaxValidCoordinates() {
		point = new Point(Integer.MAX_VALUE, 6);
		Assert.assertFalse(position.checkPosition(point));
	}

}
