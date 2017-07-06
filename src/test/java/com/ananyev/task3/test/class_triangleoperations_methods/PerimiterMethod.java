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

	@Test(priority = 1)
	public void perimeterValidSides() {
		double expected = 12d;
		Assert.assertEquals(TriangleOperations.perimiter(3, 4, 5), expected);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 3(usually we should ask or look in spec
	@Test(priority = 2)
	public void perimeterSideValidSidesMinimum() {
		double expected = 0.6d;
		Assert.assertEquals(TriangleOperations.perimiter(0.01, 0.02, 0.03), expected);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 4(usually we should ask or look in spec
	@Test(priority = 3)
	public void perimeterValidSidesMaximum() {
		double expected = 16665;
		Assert.assertEquals(TriangleOperations.perimiter(9999, 5555, 1111), expected);
	}

	// we want to receive message with size of max quantity digit in side
	@Test(priority = 4, expectedExceptions = IllegalArgumentException.class)
	public void perimeterDoubleMaxValidSides() {
		TriangleOperations.perimiter(Double.MAX_VALUE, 0.02, 0.03);
	}

	@Test(priority = 5, expectedExceptions = IllegalArgumentException.class)
	public void perimeterDoubleValidSideMaxValideSide() {
		TriangleOperations.perimiter(0.01,Double.MAX_VALUE,0.03);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideMAXValidSide() {
		TriangleOperations.perimiter(0.02,0.03,Double.MAX_VALUE);
	}
	
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void perimeterDoubleMaxExpValidSides() {
		TriangleOperations.perimiter(Double.MAX_EXPONENT, 9999, 5555);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void perimeterDoubleValidSideMaxExpValideSide() {
		TriangleOperations.perimiter(9999, Double.MAX_EXPONENT, 5555);
	}

	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideMAXExpValidSide() {
		TriangleOperations.perimiter(9999, 5555, Double.MAX_EXPONENT);
	}
	
	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void perimeterDoubleMinValidSides() {
		TriangleOperations.perimiter(Double.MIN_VALUE, 9999, 5555);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void perimeterDoubleValidSideMinxValideSide() {
		TriangleOperations.perimiter(9999, Double.MIN_VALUE, 5555);
	}

	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideMinValidSide() {
		TriangleOperations.perimiter(9999, 5555, Double.MIN_VALUE);
	}
	
	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void perimeterDoubleMinExpValidSides() {
		TriangleOperations.perimiter(Double.MIN_EXPONENT, 9999, 5555);
	}

	@Test(priority = 14, expectedExceptions = IllegalArgumentException.class)
	public void perimeterDoubleValidSideMinExpValideSide() {
		TriangleOperations.perimiter(9999, Double.MIN_EXPONENT, 5555);
	}

	@Test(priority = 15, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideMinExpValidSide() {
		TriangleOperations.perimiter(9999, 5555, Double.MIN_EXPONENT);
	}
	
	@Test(priority = 16, expectedExceptions = IllegalArgumentException.class)
	public void perimeterDoubleMinNormalValidSides() {
		TriangleOperations.perimiter(Double.MIN_NORMAL, 9999, 5555);
	}

	@Test(priority = 17, expectedExceptions = IllegalArgumentException.class)
	public void perimeterDoubleValidSideMinNormalValideSide() {
		TriangleOperations.perimiter(9999, Double.MIN_NORMAL, 5555);
	}

	@Test(priority = 18, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideMinNormalExpValidSide() {
		TriangleOperations.perimiter(9999, 5555, Double.MIN_NORMAL);
	}

	@Test(priority = 19, expectedExceptions = IllegalArgumentException.class)
	public void perimeterZeroValidSides() {
		TriangleOperations.perimiter(0, 1, 4);
	}

	@Test(priority = 20, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideZeroValidSide() {
		TriangleOperations.perimiter(1, 0, 3);
	}

	@Test(priority = 21, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidesZero() {
		TriangleOperations.perimiter(3, 4, 0);
	}

	@Test(priority = 22, expectedExceptions = IllegalArgumentException.class)
	public void perimeterNegativeSideValidSide() {
		TriangleOperations.perimiter(-2, 4, 5);
	}

	@Test(priority = 23, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideNegativeSideValidSide() {
		TriangleOperations.perimiter(2, -4, 5);
	}

	@Test(priority = 24, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidesNegative() {
		TriangleOperations.perimiter(2, 4, -5);
	}

	@Test(priority = 25, expectedExceptions = IllegalArgumentException.class)
	public void perimeterNaNValidSides() {
		TriangleOperations.perimiter(Double.NaN, 4, 5);
	}

	@Test(priority = 26, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideNaNValidSide() {
		TriangleOperations.perimiter(4, Double.NaN, 1);
	}

	@Test(priority = 27, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidesNaN() {
		TriangleOperations.perimiter(1, 4, Double.NaN);
	}

	@Test(priority = 28, expectedExceptions = IllegalArgumentException.class)
	public void perimeterPositiveInfinityValidSides() {
		TriangleOperations.perimiter(Double.POSITIVE_INFINITY, 23, 11);
	}

	@Test(priority = 29, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidePositiveInfinityValidSide() {
		TriangleOperations.perimiter(33, Double.POSITIVE_INFINITY, 22);
	}

	@Test(priority = 30, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidesPositiveInfinity() {
		TriangleOperations.perimiter(4, 33, Double.POSITIVE_INFINITY);
	}

	@Test(priority = 31, expectedExceptions = IllegalArgumentException.class)
	public void perimeterNegativeInfinityValidSides() {
		TriangleOperations.perimiter(Double.NEGATIVE_INFINITY, 3, 4);
	}

	@Test(priority = 32, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSideNegativeInfinityValidSide() {
		TriangleOperations.perimiter(2, Double.NEGATIVE_INFINITY, 23);
	}

	@Test(priority = 33, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidesNegativeInfinity() {
		TriangleOperations.perimiter(Double.NEGATIVE_INFINITY, 23, 11);
	}
}
