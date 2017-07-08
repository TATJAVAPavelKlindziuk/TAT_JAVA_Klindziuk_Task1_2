package com.ananyev.task3.test.triangleoperations;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ananyev.task3.TriangleOperations;


/*
 * Unit tests for isRightTriangle() of TriangleOperation.class this method
 * to decide the is triangle right or not
 */
public class IsRightTriangleMethod {
 
	@Test(priority = 1)
	public void isRightTriangleValidSides() {
		Assert.assertTrue(TriangleOperations.isRightTriangle(3, 4, 5));
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 3(usually we should ask or look in spec
	@Test(priority = 2)
	public void isRightTriangleSideValidSidesMinimum() {
		Assert.assertTrue(TriangleOperations.isRightTriangle(0.01, 0.02, 0.022360679774997897d));
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 4(usually we should ask or look in spec
	@Test(priority = 3)
	public void isRightTriangleValidSidesMaximum() {
		Assert.assertTrue(TriangleOperations.isRightTriangle(9999, 5555, 11438.445086636557d));
	}

	// we want to receive message with size of max quantity digit in side
	@Test(priority = 4, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleDoubleMaxExpValidSides() {
		TriangleOperations.isRightTriangle(Double.MAX_VALUE, 9999, 5555);
	}

	@Test(priority = 5, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleDoubleValidSideMaxValideSide() {
		TriangleOperations.isRightTriangle(9999, Double.MAX_VALUE, 5555);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideMAxValidSide() {
		TriangleOperations.isRightTriangle(9999, 5555, Double.MAX_VALUE);
	}
	
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleDoubleMaxValidSides() {
		TriangleOperations.isRightTriangle(Double.MAX_EXPONENT, 9999, 5555);
	}

	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleDoubleValidSideMaxExpValideSide() {
		TriangleOperations.isRightTriangle(9999, Double.MAX_EXPONENT, 5555);
	}

	
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideMAXValidSide() {
		TriangleOperations.isRightTriangle(9999, 5555, Double.MAX_EXPONENT);
	}
	
	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleDoubleMinValidSides() {
		TriangleOperations.isRightTriangle(Double.MIN_VALUE, 9999, 5555);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleDoubleValidSideMinxValideSide() {
		TriangleOperations.isRightTriangle(9999, Double.MIN_VALUE, 5555);
	}

	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideMinValidSide() {
		TriangleOperations.isRightTriangle(9999, 5555, Double.MIN_VALUE);
	}
	
	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleDoubleMinExpValidSides() {
		TriangleOperations.isRightTriangle(Double.MIN_EXPONENT, 9999, 5555);
	}

	@Test(priority = 14, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleDoubleValidSideMinExpValideSide() {
		TriangleOperations.isRightTriangle(9999, Double.MIN_EXPONENT, 5555);
	}

	
	@Test(priority = 15, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideMinExpValidSide() {
		TriangleOperations.isRightTriangle(9999, 5555, Double.MIN_EXPONENT);
	}
	
	@Test(priority = 16, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleDoubleMinNormalValidSides() {
		TriangleOperations.isRightTriangle(Double.MIN_NORMAL, 9999, 5555);
	}

	@Test(priority = 17, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleDoubleValidSideMinNormalValideSide() {
		TriangleOperations.isRightTriangle(9999, Double.MIN_NORMAL, 5555);
	}

	
	@Test(priority = 18, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideMinNormalExpValidSide() {
		TriangleOperations.isRightTriangle(9999, 5555, Double.MIN_NORMAL);
	}

	@Test(priority = 19, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleZeroValidSides() {
		TriangleOperations.isRightTriangle(0, 3, 4);
	}

	@Test(priority = 20, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideZeroValidSide() {
		TriangleOperations.isRightTriangle(3, 0, 5);
	}

	@Test(priority = 21, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSidesZero() {
		TriangleOperations.isRightTriangle(3, 4, 0);
	}

	@Test(priority = 22, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleNegativeSideValidSide() {
		TriangleOperations.isRightTriangle(-2, 4, 5);
	}

	@Test(priority = 23, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideNegativeSideValidSide() {
		TriangleOperations.isRightTriangle(4, -1, 3);
	}

	@Test(priority = 24, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSidesNegative() {
		TriangleOperations.isRightTriangle(4, 2, -1);
	}

	@Test(priority = 25, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleNaNValidSides() {
		TriangleOperations.isRightTriangle(Double.NaN, 2, 4);
	}

	@Test(priority = 26, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideNaNValidSide() {
		TriangleOperations.isRightTriangle(4, Double.NaN, 1);
	}

	@Test(priority = 27, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSidesNaN() {
		TriangleOperations.isRightTriangle(1, 4, Double.NaN);
	}

	@Test(priority = 28, expectedExceptions = IllegalArgumentException.class)
	public void isRightTrianglePositiveInfinityValidSides() {
		TriangleOperations.isRightTriangle(Double.POSITIVE_INFINITY, 23, 11);
	}

	@Test(priority = 29, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSidePositiveInfinityValidSide() {
		TriangleOperations.isRightTriangle(33, Double.POSITIVE_INFINITY, 22);
	}

	@Test(priority = 30, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSidesPositiveInfinity() {
		TriangleOperations.isRightTriangle(4, 33, Double.POSITIVE_INFINITY);
	}

	@Test(priority = 31, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleNegativeInfinityValidSides() {
		TriangleOperations.isRightTriangle(Double.NEGATIVE_INFINITY, 3, 4);
	}

	@Test(priority = 32, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSideNegativeInfinityValidSide() {
		TriangleOperations.isRightTriangle(2, Double.NEGATIVE_INFINITY, 23);
	}

	@Test(priority = 33, expectedExceptions = IllegalArgumentException.class)
	public void isRightTriangleValidSidesNegativeInfinity() {
		TriangleOperations.isRightTriangle(Double.NEGATIVE_INFINITY, 23, 11);
	}
}
