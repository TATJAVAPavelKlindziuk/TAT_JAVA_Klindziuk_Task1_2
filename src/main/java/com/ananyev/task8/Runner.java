package com.ananyev.task8;

import com.ananyev.task8.CalculatorNums;
import com.ananyev.task8.NumberController;

public class Runner {
	public static void main(String[] args) {

		NumberController controller = new NumberController();
		if (controller.controlNumbers(args)) {
			int[] massive = CreaterMassive.createMassiveFromString(args[0]);
			CalculatorNums calc = new CalculatorNums();

			System.out.print("Base array:");
			for (int i = 0; i < massive.length; i++) {
				System.out.print(massive[i] + " ");
			}

			System.out.println("Result =  " + calc.calculate(massive, args[1]));
		} else {
			System.out.println("Please try again");
		}
	}

}
