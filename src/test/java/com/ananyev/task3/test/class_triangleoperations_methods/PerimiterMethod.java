package com.ananyev.task3.test.class_triangleoperations_methods;

import org.testng.annotations.Test;

import com.ananyev.task3.TriangleOperations;

import org.testng.Assert;

/*
 * Unit tests for perimeter() of TriangleOperation.class this method to
 * decide the is triangle right or not
 */

public class PerimiterMethod {
	
	double expected;

	@Test
	public void perimeterValidSides() {
		double expected = 12d;
		Assert.assertEquals(TriangleOperations.perimiter(3, 4, 5), expected);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 3(usually we should ask or look in spec
	@Test
	public void perimeterSideValidSidesMinimum() {
		double expected = 0.6d;
		Assert.assertEquals(TriangleOperations.perimiter(0.01, 0.02, 0.03), expected);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 4(usually we should ask or look in spec
	@Test
	public void perimeterValidSidesMaximum() {
		double expected = 16665;
		Assert.assertEquals(TriangleOperations.perimiter(9999, 5555, 1111), expected);
	}

	// we want to receive message with size of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterDoubleMaxValidSides() {
		TriangleOperations.perimiter(Double.MAX_VALUE, 0.02, 0.03);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterDoubleValidSideMaxValideSide() {
		TriangleOperations.perimiter(0.01,Double.MAX_VALUE,0.03);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideMAXValidSide() {
		TriangleOperations.perimiter(0.02,0.03,Double.MAX_VALUE);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterZeroValidSides() {
		TriangleOperations.perimiter(0, 1, 4);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideZeroValidSide() {
		TriangleOperations.perimiter(1, 0, 3);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidesZero() {
		TriangleOperations.perimiter(3, 4, 0);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterNegativeSideValidSide() {
		TriangleOperations.perimiter(-2, 4, 5);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideNegativeSideValidSide() {
		TriangleOperations.perimiter(2, -4, 5);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidesNegative() {
		TriangleOperations.perimiter(2, 4, -5);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterNaNValidSides() {
		TriangleOperations.perimiter(Double.NaN, 4, 5);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideNaNValidSide() {
		TriangleOperations.perimiter(4, Double.NaN, 1);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidesNaN() {
		TriangleOperations.perimiter(1, 4, Double.NaN);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterPositiveInfinityValidSides() {
		TriangleOperations.perimiter(Double.POSITIVE_INFINITY, 23, 11);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidePositiveInfinityValidSide() {
		TriangleOperations.perimiter(33, Double.POSITIVE_INFINITY, 22);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidesPositiveInfinity() {
		TriangleOperations.perimiter(4, 33, Double.POSITIVE_INFINITY);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterNegativeInfinityValidSides() {
		TriangleOperations.perimiter(Double.NEGATIVE_INFINITY, 3, 4);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideNegativeInfinityValidSide() {
		TriangleOperations.perimiter(2, Double.NEGATIVE_INFINITY, 23);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidesNegativeInfinity() {
		TriangleOperations.perimiter(Double.NEGATIVE_INFINITY, 23, 11);
	}
}
