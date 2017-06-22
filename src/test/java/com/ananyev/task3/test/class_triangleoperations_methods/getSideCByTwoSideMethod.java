package com.ananyev.task3.test.class_triangleoperations_methods;

import org.testng.annotations.Test;

import com.ananyev.task3.TriangleOperations;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

/*
 * Unit tests for getSideCByTwoSide() of TriangleOperation.class this method
 * finding third side of triangle by other two
 */

public class getSideCByTwoSideMethod {
	TriangleOperations operations;
	double expected;

	@BeforeClass
	public void beforeClass() {
		operations = new TriangleOperations();
	}

	@AfterClass
	public void afterClass() {
		operations = null;
	}

	@Test
	public void getSideCByTwoSideValidSides() {
		double expected = 5d;
		Assert.assertEquals(operations.getSideCByTwoSides(3, 4), expected);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 3(usually we should ask or look in spec
	@Test
	public void getSideCByTwoSideValidSidesMinimum() {
		double expected = 0.022360679774997897;
		Assert.assertEquals(operations.getSideCByTwoSides(0.01, 0.02), expected);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 4(usually we should ask or look in spec
	@Test
	public void getSideCByTwoSideValidSidesMaximum() {
		double expected = 11438.445086636557d;
		Assert.assertEquals(operations.getSideCByTwoSides(9999, 5555), expected);
	}

	// we want to receive message with size of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getSideCByTwoSideDoubleMaxValidSides() {
		expected = operations.getSideCByTwoSides(9999, Double.MAX_VALUE);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getSideCByTwoSideValidSideMAXValidSide() {
		expected = operations.getSideCByTwoSides(Double.MAX_VALUE, 56);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getSideCByTwoSideZeroValidSides() {
		expected = operations.getSideCByTwoSides(0, 29);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getSideCByTwoSideValidSideZeroValidSide() {
		expected = operations.getSideCByTwoSides(1, 0);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getSideCByTwoSideNegativeSideValidSide() {
		expected = operations.getSideCByTwoSides(-2, 4);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getSideCByTwoSideValidSideNegativeSideValidSide() {
		expected = operations.getSideCByTwoSides(4, -1);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getSideCByTwoSideNaNValidSides() {
		expected = operations.getSideCByTwoSides(Double.NaN, 2);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getSideCByTwoSideValidSideNaNValidSide() {
		expected = operations.getSideCByTwoSides(4, Double.NaN);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getSideCByTwoSidePositiveInfinityValidSides() {
		expected = operations.getSideCByTwoSides(Double.POSITIVE_INFINITY, 23);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getSideCByTwoSideValidSidePositiveInfinity_ValidSide() {
		expected = operations.getSideCByTwoSides(33, Double.POSITIVE_INFINITY);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getSideCByTwoSideValidSidesNegativeInfinity() {
		expected = operations.getSideCByTwoSides(55, Double.NEGATIVE_INFINITY);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getSideCByTwoSideValidSideNegativeInfinityValidSide() {
		expected = operations.getSideCByTwoSides(Double.NEGATIVE_INFINITY, 23);
	}

	

	
}
