package com.ananyev.task3.test.class_triangle_methods;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.ananyev.task3.Triangle;

/*
 * Unit tests for constructor() of Triangle.class
 */
public class ConstructorTest {
Triangle triangle;
	
	@AfterMethod
	public void tearDown() {
	triangle = null;
	}
	
	private boolean testConstructorsforEqualObjects(double sideA, double sideB, double sideC, double sideX,
			double sideY, double sideZ) {
		Triangle triangle1 = new Triangle(sideA, sideB, sideC);
		Triangle triangle2 = new Triangle(sideX, sideY, sideZ);
		return triangle1.equals(triangle2);
	}
	
	@Test(priority = 1)
	public void constructorSmokeValidSides() {
		Triangle triangle = new Triangle(2, 3, 4);
		Assert.assertTrue(null != triangle);
	}
	
	@Test(priority = 2)
	public void constructorsEqualPositive() {
		Assert.assertTrue(testConstructorsforEqualObjects(3, 4, 5, 3, 4, 5));
	}

	@Test(priority = 3)
	public void constructorsEqualNegative() {
		Assert.assertFalse(testConstructorsforEqualObjects(4, 4, 5, 3, 4, 5));
	}

	@Test(priority = 4)
	public void constructorsEqualZero() {
		Assert.assertTrue(testConstructorsforEqualObjects(0, 0, 0, 0, 0, 0));
	}
	
	// we can suppose that maximum quantity of digits in size of side is
	// 5(usually we should ask or look in spec
	@Test(priority = 5)
	public void constructorValidSidesMinimum() {
		triangle = new Triangle(0.0001, 0.0001, 0.0001);
		Assert.assertTrue(null != triangle);
	}

	// we can suppose that maximum quantity of digits in size of side is
	// 5(usually we should ask or look in spec
	@Test(priority = 6)
	public void constructorTestValidSidesMaximum() {
		triangle = new Triangle(99999, 99999, 99999);
		Assert.assertTrue(null != triangle);
	}

	// we want to receive message with size of max quantity digit in side
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void constructorDoubleMaxValidSides() {
		triangle = new Triangle(4, 6, Double.MAX_VALUE);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSideMAXValidSide() {
		triangle = new Triangle(4, Double.MAX_VALUE, 6);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSidesMAX() {
		triangle = new Triangle(4, 6, Double.MAX_VALUE);
	}

	@Test(priority = 10, expectedExceptions = IllegalArgumentException.class)
	public void constructorZeroValidSides() {
		triangle = new Triangle(0, 3, 4);
	}

	@Test(priority = 11, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSideZeroValidSide() {
		triangle = new Triangle(3, 0, 4);
	}

	@Test(priority = 12, expectedExceptions = IllegalArgumentException.class)
	public void constructorNegativeSideValidSide() {
		triangle = new Triangle(-1, 3, 4);
	}

	@Test(priority = 13, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSideNegativeSideValidSide() {
		triangle = new Triangle(3, -3, 4);
	}

	@Test(priority = 14, expectedExceptions = IllegalArgumentException.class)
	public void constructorNaNValidSides() {
		triangle = new Triangle(Double.NaN, 3, 4);
	}

	@Test(priority = 15, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSideNaNValidSide() {
		triangle = new Triangle(3, Double.NaN, 4);
	}

	@Test(priority = 16, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSidesNaN() {
		triangle = new Triangle(3, 4, Double.NaN);
	}

	@Test(priority = 17, expectedExceptions = IllegalArgumentException.class)
	public void constructorPositiveInfinityValidSides() {
		triangle = new Triangle(Double.POSITIVE_INFINITY, 4, 6);
	}

	@Test(priority = 18, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSidePositiveInfinity_ValidSide() {
		triangle = new Triangle(5, Double.POSITIVE_INFINITY, 6);
	}

	@Test(priority = 19, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSidesPositiveInfinity() {
		triangle = new Triangle(5, 6, Double.POSITIVE_INFINITY);
	}

	@Test(priority = 20, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSidesNegativeInfinity() {
		triangle = new Triangle(Double.NEGATIVE_INFINITY, 4, 6);
	}

	@Test(priority = 21, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSideNegativeInfinityValidSide() {
		triangle = new Triangle(5, Double.NEGATIVE_INFINITY, 6);
	}

	@Test(priority = 22, expectedExceptions = IllegalArgumentException.class)
	public void constructorNegativeInfinityValidSides() {
		triangle = new Triangle(5, 7, Double.NEGATIVE_INFINITY);
	}
	
	@Test(priority = 23, expectedExceptions = IllegalArgumentException.class)
	public void constructorDoubleMinValidSides() {
		triangle = new Triangle(4, 6, Double.MIN_VALUE);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 24, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSideMinValidSide() {
		triangle = new Triangle(4, Double.MIN_VALUE, 6);
	}

	// we want to receive message with number of max quantity digit in side
	@Test(priority = 25, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSidesMin() {
		triangle = new Triangle(4, 6, Double.MIN_VALUE);
	}
	
	@Test(priority = 26, expectedExceptions = IllegalArgumentException.class)
	public void constructorDoubleMinNormalValidSides() {
		triangle = new Triangle(4, 6, Double.MIN_NORMAL);
	}

	
	@Test(priority = 27, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSideMinNormalValidSide() {
		triangle = new Triangle(4, Double.MIN_NORMAL, 6);
	}

	@Test(priority = 28, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSidesMinNormal() {
		triangle = new Triangle(4, 6, Double.MIN_NORMAL);
	}
	
	@Test(priority = 29, expectedExceptions = IllegalArgumentException.class)
	public void constructorDoubleMinExponentValidSides() {
		triangle = new Triangle(4, 6, Double.MIN_EXPONENT);
	}

		@Test(priority = 30, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSideMinExponentValidSide() {
		triangle = new Triangle(4, Double.MIN_EXPONENT, 6);
	}

		@Test(priority = 31, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSidesMinExponent() {
		triangle = new Triangle(4, 6, Double.MIN_EXPONENT);
	}
	
	@Test(priority = 32, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSideMaxExponentValidSide() {
		triangle = new Triangle(4, Double.MAX_EXPONENT, 6);
	}
	
	@Test(priority = 32, expectedExceptions = IllegalArgumentException.class)
	public void constructorValidSidesMaxExponent() {
		triangle = new Triangle(4, 6, Double.MAX_EXPONENT);
	}
}
