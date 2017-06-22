package com.ananyev.task3.test.class_triangleoperations_methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ananyev.task3.TriangleOperations;

/*
 * Unit tests for isTriangle() of TriangleOperation.class
 * this method checks for arguments greater than zero.
 */
public class IsTriagleMethod {
  
	@Test
	public void isTriangleValidSides() {
		Assert.assertTrue(TriangleOperations.isTriangle(3, 4, 5));
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 3(usually we should ask or look in spec
	@Test
	public void perimeterSideValidSidesMinimum() {
		Assert.assertTrue(TriangleOperations.isTriangle(0.01, 0.02, 0.03));
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 4(usually we should ask or look in spec
	@Test
	public void isTriangleValidSidesMaximum() {
		Assert.assertTrue(TriangleOperations.isTriangle(9999, 5555, 1111));
	}
	
	@Test
	public void isTriangleZeroValidSides() {
		Assert.assertTrue(TriangleOperations.isTriangle(0, 1, 4));
	}

	@Test
	public void isTriangleValidSideZeroValidSide() {
		Assert.assertFalse(TriangleOperations.isTriangle(1, 0, 3));
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSidesZero() {
		Assert.assertFalse(TriangleOperations.isTriangle(3, 4, 0));
	}

	@Test
	public void isTriangleNegativeSideValidSide() {
		Assert.assertFalse(TriangleOperations.isTriangle(-2, 4, 5));
	}

	@Test
	public void isTriangleValidSideNegativeSideValidSide() {
		Assert.assertFalse(TriangleOperations.isTriangle(2, -4, 5));
	}

	@Test
	public void isTriangleValidSidesNegative() {
		Assert.assertFalse(TriangleOperations.isTriangle(2, 4, -5));
	}

	// we want to receive message with size of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isTriangleDoubleMaxValidSides() {
		TriangleOperations.isTriangle(Double.MAX_VALUE, 0.02, 0.03);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isTriangleDoubleValidSideMaxValideSide() {
		TriangleOperations.isTriangle(0.01,Double.MAX_VALUE,0.03);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSideMAXValidSide() {
		TriangleOperations.isTriangle(0.02,0.03,Double.MAX_VALUE);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isTriangleNaNValidSides() {
		TriangleOperations.isTriangle(Double.NaN, 4, 5);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSideNaNValidSide() {
		TriangleOperations.isTriangle(4, Double.NaN, 1);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSidesNaN() {
		TriangleOperations.isTriangle(1, 4, Double.NaN);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isTrianglePositiveInfinityValidSides() {
		TriangleOperations.isTriangle(Double.POSITIVE_INFINITY, 23, 11);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSidePositiveInfinityValidSide() {
		TriangleOperations.isTriangle(33, Double.POSITIVE_INFINITY, 22);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSidesPositiveInfinity() {
		TriangleOperations.isTriangle(4, 33, Double.POSITIVE_INFINITY);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isTriangleNegativeInfinityValidSides() {
		TriangleOperations.isTriangle(Double.NEGATIVE_INFINITY, 3, 4);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSideNegativeInfinityValidSide() {
		TriangleOperations.isTriangle(2, Double.NEGATIVE_INFINITY, 23);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidesNegativeInfinity() {
		TriangleOperations.isTriangle(Double.NEGATIVE_INFINITY, 23, 11);
	}
}
