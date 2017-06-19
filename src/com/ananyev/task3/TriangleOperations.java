package src.com.ananyev.task3;

public class TriangleOperations {

	public double getSideCByTwoSides(double a, double b) {
		double sideC;
		sideC = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return sideC;
	}

	public static boolean isRightTriangle(double sideA, double sideB, double sideC) {
		return (Math.pow(sideC, 2) == (Math.pow(sideA, 2) + Math.pow(sideB, 2)));
	}

	public static boolean isTriangle(double sideA, double sideB, double sideC) {
		return ((sideA > 0) && (sideB > 0) && (sideC > 0));
	}

	public static double perimiter(double sideA, double sideB, double sideC) {

		return sideA + sideB + sideC;
	}

	public static double square(double sideA, double sideB, double sideC) {

		return (sideA * sideB) / 2;
	}
}
