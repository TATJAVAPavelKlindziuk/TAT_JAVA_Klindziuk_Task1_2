package com.ananyev.task3.test.class_triangleoperations_methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ananyev.task3.TriangleOperations;


/*
 * Unit tests for isRightTriangle() of TriangleOperation.class this method
 * to decide the is triangle right or not
 */

public class IsRightTriangleMethod {
 
	@Test
	public void isRightTriangleValidSides() {
		Assert.assertTrue(TriangleOperations.isRightTriangle(3, 4, 5));
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 3(usually we should ask or look in spec
	@Test
	public void isRightTriangleSideValidSidesMinimum() {
		Assert.assertTrue(TriangleOperations.isRightTriangle(0.01, 0.02, 0.022360679774997897d));
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 4(usually we should ask or look in spec
	@Test
	public void isRightTriangleValidSidesMaximum() {
		Assert.assertTrue(TriangleOperations.isRightTriangle(9999, 5555, 11438.445086636557d));
	}

	// we want to receive message with size of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleDoubleMaxValidSides() {
		TriangleOperations.isRightTriangle(Double.MAX_VALUE, 9999, 5555);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleDoubleValidSideMaxValideSide() {
		TriangleOperations.isRightTriangle(9999, Double.MAX_VALUE, 5555);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideMAXValidSide() {
		TriangleOperations.isRightTriangle(9999, 5555, Double.MAX_VALUE);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleZeroValidSides() {
		TriangleOperations.isRightTriangle(0, 3, 4);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideZeroValidSide() {
		TriangleOperations.isRightTriangle(3, 0, 5);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSidesZero() {
		TriangleOperations.isRightTriangle(3, 4, 0);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleNegativeSideValidSide() {
		TriangleOperations.isRightTriangle(-2, 4, 5);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideNegativeSideValidSide() {
		TriangleOperations.isRightTriangle(4, -1, 3);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSidesNegative() {
		TriangleOperations.isRightTriangle(4, 2, -1);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleNaNValidSides() {
		TriangleOperations.isRightTriangle(Double.NaN, 2, 4);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideNaNValidSide() {
		TriangleOperations.isRightTriangle(4, Double.NaN, 1);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSidesNaN() {
		TriangleOperations.isRightTriangle(1, 4, Double.NaN);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTrianglePositiveInfinityValidSides() {
		TriangleOperations.isRightTriangle(Double.POSITIVE_INFINITY, 23, 11);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSidePositiveInfinityValidSide() {
		TriangleOperations.isRightTriangle(33, Double.POSITIVE_INFINITY, 22);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSidesPositiveInfinity() {
		TriangleOperations.isRightTriangle(4, 33, Double.POSITIVE_INFINITY);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleNegativeInfinityValidSides() {
		TriangleOperations.isRightTriangle(Double.NEGATIVE_INFINITY, 3, 4);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideNegativeInfinityValidSide() {
		TriangleOperations.isRightTriangle(2, Double.NEGATIVE_INFINITY, 23);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSidesNegativeInfinity() {
		TriangleOperations.isRightTriangle(Double.NEGATIVE_INFINITY, 23, 11);
	}
}
