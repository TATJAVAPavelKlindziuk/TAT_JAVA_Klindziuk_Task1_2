package com.ananyev.task3.test.class_triangleoperations_methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ananyev.task3.TriangleOperations;

/*
 * Unit tests for isTriangle() of TriangleOperation.class
 * this method checks for arguments greater than zero.
 */
public class IsTriagleMethod {
  
	@Test(priority = 1)
	public void isTriangleValidSides() {
		Assert.assertTrue(TriangleOperations.isTriangle(3, 4, 5));
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 3(usually we should ask or look in spec
	@Test(priority = 2)
	public void perimeterSideValidSidesMinimum() {
		Assert.assertTrue(TriangleOperations.isTriangle(0.01, 0.02, 0.03));
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 4(usually we should ask or look in spec
	@Test(priority = 3)
	public void isTriangleValidSidesMaximum() {
		Assert.assertTrue(TriangleOperations.isTriangle(9999, 5555, 1111));
	}
	
	@Test(priority = 4)
	public void isTriangleZeroValidSides() {
		Assert.assertTrue(TriangleOperations.isTriangle(0, 1, 4));
	}

	@Test(priority = 5)
	public void isTriangleValidSideZeroValidSide() {
		Assert.assertFalse(TriangleOperations.isTriangle(1, 0, 3));
	}

	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSidesZero() {
		Assert.assertFalse(TriangleOperations.isTriangle(3, 4, 0));
	}

	@Test(priority = 7)
	public void isTriangleNegativeSideValidSide() {
		Assert.assertFalse(TriangleOperations.isTriangle(-2, 4, 5));
	}

	@Test(priority = 8)
	public void isTriangleValidSideNegativeSideValidSide() {
		Assert.assertFalse(TriangleOperations.isTriangle(2, -4, 5));
	}

	@Test(priority = 9)
	public void isTriangleValidSidesNegative() {
		Assert.assertFalse(TriangleOperations.isTriangle(2, 4, -5));
	}

	// we want to receive message with size of max quantity digit in side
	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleDoubleMaxValidSides() {
		TriangleOperations.isTriangle(Double.MAX_VALUE, 0.02, 0.03);
	}

	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleDoubleValidSideMaxValideSide() {
		TriangleOperations.isTriangle(0.01,Double.MAX_VALUE,0.03);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSideMAXValidSide() {
		TriangleOperations.isTriangle(0.02,0.03,Double.MAX_VALUE);
	}
	
	@Test(priority = 14, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleDoubleMaxExpValidSides() {
		TriangleOperations.isTriangle(Double.MAX_EXPONENT, 9999, 5555);
	}

	@Test(priority = 15, expectedExceptions = IllegalArgumentException.class)
	public void isDoubleValidSideMaxExpValideSide() {
		TriangleOperations.isTriangle(9999, Double.MAX_EXPONENT, 5555);
	}

	@Test(priority = 16, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSideMAXExpValidSide() {
		TriangleOperations.isTriangle(9999, 5555, Double.MAX_EXPONENT);
	}
	
	@Test(priority = 17, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleDoubleMinValidSides() {
		TriangleOperations.isTriangle(Double.MIN_VALUE, 9999, 5555);
	}

	@Test(priority = 18, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleDoubleValidSideMinxValideSide() {
		TriangleOperations.isTriangle(9999, Double.MIN_VALUE, 5555);
	}

	@Test(priority = 19, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSideMinValidSide() {
		TriangleOperations.isTriangle(9999, 5555, Double.MIN_VALUE);
	}
	
	@Test(priority = 20, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleDoubleMinExpValidSides() {
		TriangleOperations.isTriangle(Double.MIN_EXPONENT, 9999, 5555);
	}

	@Test(priority = 21, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleDoubleValidSideMinExpValideSide() {
		TriangleOperations.isTriangle(9999, Double.MIN_EXPONENT, 5555);
	}

	@Test(priority = 22, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSideMinExpValidSide() {
		TriangleOperations.isTriangle(9999, 5555, Double.MIN_EXPONENT);
	}
	
	@Test(priority = 23, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleDoubleMinNormalValidSides() {
		TriangleOperations.isTriangle(Double.MIN_NORMAL, 9999, 5555);
	}

	@Test(priority = 24, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleDoubleValidSideMinNormalValideSide() {
		TriangleOperations.isTriangle(9999, Double.MIN_NORMAL, 5555);
	}

	@Test(priority = 25, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSideMinNormalExpValidSide() {
		TriangleOperations.isTriangle(9999, 5555, Double.MIN_NORMAL);
	}

	@Test(priority = 26, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleNaNValidSides() {
		TriangleOperations.isTriangle(Double.NaN, 4, 5);
	}

	@Test(priority = 27, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSideNaNValidSide() {
		TriangleOperations.isTriangle(4, Double.NaN, 1);
	}

	@Test(priority = 28, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSidesNaN() {
		TriangleOperations.isTriangle(1, 4, Double.NaN);
	}

	@Test(priority = 29, expectedExceptions = IllegalArgumentException.class)
	public void isTrianglePositiveInfinityValidSides() {
		TriangleOperations.isTriangle(Double.POSITIVE_INFINITY, 23, 11);
	}

	@Test(priority = 30, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSidePositiveInfinityValidSide() {
		TriangleOperations.isTriangle(33, Double.POSITIVE_INFINITY, 22);
	}

	@Test(priority = 31, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSidesPositiveInfinity() {
		TriangleOperations.isTriangle(4, 33, Double.POSITIVE_INFINITY);
	}

	@Test(priority = 32, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleNegativeInfinityValidSides() {
		TriangleOperations.isTriangle(Double.NEGATIVE_INFINITY, 3, 4);
	}

	@Test(priority = 33, expectedExceptions = IllegalArgumentException.class)
	public void isTriangleValidSideNegativeInfinityValidSide() {
		TriangleOperations.isTriangle(2, Double.NEGATIVE_INFINITY, 23);
	}

	@Test(priority = 34, expectedExceptions = IllegalArgumentException.class)
	public void perimeterValidSidesNegativeInfinity() {
		TriangleOperations.isTriangle(Double.NEGATIVE_INFINITY, 23, 11);
	}
}
