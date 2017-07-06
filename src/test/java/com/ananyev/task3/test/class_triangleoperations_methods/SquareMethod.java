package com.ananyev.task3.test.class_triangleoperations_methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ananyev.task3.TriangleOperations;

/*
 * Unit tests for square() of TriangleOperation.class this method to
 * decide the is triangle right or not
 */

public class SquareMethod {
	
	@Test(priority = 1)
	public void squareValidSides() {
		double expected = 6d;
		Assert.assertEquals(TriangleOperations.square(3, 4, 5), expected);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 3(usually we should ask or look in spec
	@Test(priority = 2)
	public void perimeterSideValidSidesMinimum() {
		double expected = 0.3d;
		Assert.assertEquals(TriangleOperations.square(0.03, 0.02, 0.01), expected);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 4(usually we should ask or look in spec
	@Test(priority = 3)
	public void squareValidSidesMaximum() {
		double expected = 27772222.5d;
		Assert.assertEquals(TriangleOperations.square(9999, 5555, 1111), expected);
	}

	// we want to receive message with size of max quantity digit in side
	@Test(priority = 4, expectedExceptions = IllegalArgumentException.class)
	public void squareDoubleMaxValidSides() {
		TriangleOperations.square(Double.MAX_VALUE, 0.02, 0.03);
	}

	@Test(priority = 5, expectedExceptions = IllegalArgumentException.class)
	public void squareDoubleValidSideMaxValideSide() {
		TriangleOperations.square(0.01,Double.MAX_VALUE,0.03);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideMAXValidSide() {
		TriangleOperations.square(0.02,0.03,Double.MAX_VALUE);
	}
	
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void squareDoubleMaxExpValidSides() {
		TriangleOperations.square(Double.MAX_EXPONENT, 9999, 5555);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void squareDoubleValidSideMaxExpValideSide() {
		TriangleOperations.square(9999, Double.MAX_EXPONENT, 5555);
	}

	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideMAXExpValidSide() {
		TriangleOperations.square(9999, 5555, Double.MAX_EXPONENT);
	}
	
	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void squareDoubleMinValidSides() {
		TriangleOperations.square(Double.MIN_VALUE, 9999, 5555);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void squareDoubleValidSideMinxValideSide() {
		TriangleOperations.square(9999, Double.MIN_VALUE, 5555);
	}

	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideMinValidSide() {
		TriangleOperations.square(9999, 5555, Double.MIN_VALUE);
	}
	
	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void squareDoubleMinExpValidSides() {
		TriangleOperations.square(Double.MIN_EXPONENT, 9999, 5555);
	}

	@Test(priority = 14, expectedExceptions = IllegalArgumentException.class)
	public void squareDoubleValidSideMinExpValideSide() {
		TriangleOperations.square(9999, Double.MIN_EXPONENT, 5555);
	}

	@Test(priority = 15, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideMinExpValidSide() {
		TriangleOperations.square(9999, 5555, Double.MIN_EXPONENT);
	}
	
	@Test(priority = 16, expectedExceptions = IllegalArgumentException.class)
	public void squareDoubleMinNormalValidSides() {
		TriangleOperations.square(Double.MIN_NORMAL, 9999, 5555);
	}

	@Test(priority = 17, expectedExceptions = IllegalArgumentException.class)
	public void squareDoubleValidSideMinNormalValideSide() {
		TriangleOperations.square(9999, Double.MIN_NORMAL, 5555);
	}

	@Test(priority = 18, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideMinNormalExpValidSide() {
		TriangleOperations.square(9999, 5555, Double.MIN_NORMAL);
	}

	@Test(priority = 19, expectedExceptions = IllegalArgumentException.class)
	public void squareZeroValidSides() {
		TriangleOperations.square(0, 1, 4);
	}

	@Test(priority = 20, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideZeroValidSide() {
		TriangleOperations.square(1, 0, 3);
	}

	@Test(priority = 21, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSidesZero() {
		TriangleOperations.square(3, 4, 0);
	}

	@Test(priority = 22, expectedExceptions = IllegalArgumentException.class)
	public void squareNegativeSideValidSide() {
		TriangleOperations.square(-2, 4, 5);
	}

	@Test(priority = 23, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideNegativeSideValidSide() {
		TriangleOperations.square(2, -4, 5);
	}

	@Test(priority = 24, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSidesNegative() {
		TriangleOperations.square(2, 4, -5);
	}

	@Test(priority = 25, expectedExceptions = IllegalArgumentException.class)
	public void squareNaNValidSides() {
		TriangleOperations.square(Double.NaN, 4, 5);
	}

	@Test(priority = 27, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideNaNValidSide() {
		TriangleOperations.square(4, Double.NaN, 1);
	}

	@Test(priority = 28, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSidesNaN() {
		TriangleOperations.square(1, 4, Double.NaN);
	}

	@Test(priority = 29, expectedExceptions = IllegalArgumentException.class)
	public void squarePositiveInfinityValidSides() {
		TriangleOperations.square(Double.POSITIVE_INFINITY, 23, 11);
	}

	@Test(priority = 30, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSidePositiveInfinityValidSide() {
		TriangleOperations.square(33, Double.POSITIVE_INFINITY, 22);
	}

	@Test(priority = 31, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSidesPositiveInfinity() {
		TriangleOperations.square(4, 33, Double.POSITIVE_INFINITY);
	}

	@Test(priority = 32, expectedExceptions = IllegalArgumentException.class)
	public void squareNegativeInfinityValidSides() {
		TriangleOperations.square(Double.NEGATIVE_INFINITY, 3, 4);
	}

	@Test(priority = 33, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideNegativeInfinityValidSide() {
		TriangleOperations.square(2, Double.NEGATIVE_INFINITY, 23);
	}

	@Test(priority = 34, expectedExceptions = IllegalArgumentException.class)
	public void squareValidSidesNegativeInfinity() {
		TriangleOperations.square(Double.NEGATIVE_INFINITY, 23, 11);
	}
}
