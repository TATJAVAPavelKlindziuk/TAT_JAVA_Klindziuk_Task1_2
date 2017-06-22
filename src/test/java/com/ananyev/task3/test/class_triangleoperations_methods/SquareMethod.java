package com.ananyev.task3.test.class_triangleoperations_methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ananyev.task3.TriangleOperations;

/*
 * Unit tests for square() of TriangleOperation.class this method to
 * decide the is triangle right or not
 */

public class SquareMethod {
	
	@Test
	public void squareValidSides() {
		double expected = 6d;
		Assert.assertEquals(TriangleOperations.square(3, 4, 5), expected);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 3(usually we should ask or look in spec
	@Test
	public void perimeterSideValidSidesMinimum() {
		double expected = 0.3d;
		Assert.assertEquals(TriangleOperations.square(0.03, 0.02, 0.01), expected);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 4(usually we should ask or look in spec
	@Test
	public void squareValidSidesMaximum() {
		double expected = 27772222.5d;
		Assert.assertEquals(TriangleOperations.square(9999, 5555, 1111), expected);
	}

	// we want to receive message with size of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareDoubleMaxValidSides() {
		TriangleOperations.square(Double.MAX_VALUE, 0.02, 0.03);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareDoubleValidSideMaxValideSide() {
		TriangleOperations.square(0.01,Double.MAX_VALUE,0.03);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideMAXValidSide() {
		TriangleOperations.square(0.02,0.03,Double.MAX_VALUE);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareZeroValidSides() {
		TriangleOperations.square(0, 1, 4);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideZeroValidSide() {
		TriangleOperations.square(1, 0, 3);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareValidSidesZero() {
		TriangleOperations.square(3, 4, 0);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareNegativeSideValidSide() {
		TriangleOperations.square(-2, 4, 5);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideNegativeSideValidSide() {
		TriangleOperations.square(2, -4, 5);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareValidSidesNegative() {
		TriangleOperations.square(2, 4, -5);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareNaNValidSides() {
		TriangleOperations.square(Double.NaN, 4, 5);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideNaNValidSide() {
		TriangleOperations.square(4, Double.NaN, 1);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareValidSidesNaN() {
		TriangleOperations.square(1, 4, Double.NaN);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squarePositiveInfinityValidSides() {
		TriangleOperations.square(Double.POSITIVE_INFINITY, 23, 11);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareValidSidePositiveInfinityValidSide() {
		TriangleOperations.square(33, Double.POSITIVE_INFINITY, 22);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareValidSidesPositiveInfinity() {
		TriangleOperations.square(4, 33, Double.POSITIVE_INFINITY);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareNegativeInfinityValidSides() {
		TriangleOperations.square(Double.NEGATIVE_INFINITY, 3, 4);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareValidSideNegativeInfinityValidSide() {
		TriangleOperations.square(2, Double.NEGATIVE_INFINITY, 23);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void squareValidSidesNegativeInfinity() {
		TriangleOperations.square(Double.NEGATIVE_INFINITY, 23, 11);
	}
}
