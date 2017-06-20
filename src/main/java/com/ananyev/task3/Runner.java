package com.ananyev.task3;

public class Runner {
	public static final long serialVersionUID = 42L;
	public static void main(String[] args) {

		boolean areSidesOK = new NumberController().controlNumbers(args);
		if (areSidesOK) {

			double sideA = Double.parseDouble(args[0]);
			double sideB = Double.parseDouble(args[1]);
			double sideC = new TriangleOperations().getSideCByTwoSides(sideA, sideB);

			if ((TriangleOperations.isRightTriangle(sideA, sideB, sideC)
					&& TriangleOperations.isTriangle(sideA, sideB, sideC))) {
				Triangle triangle = new Triangle(sideA, sideB, sideC);
				triangle.setSideA(sideA);
				triangle.setSideB(sideB);
				triangle.setSideC(sideC);

				System.out.println("perimiter = " + TriangleOperations.perimiter(sideA, sideB, sideC));
				System.out.println("square = " + TriangleOperations.square(sideA, sideB, sideC));
			} else {
				System.out.println("Its not a triangle!");
			}

		}
	}
}
