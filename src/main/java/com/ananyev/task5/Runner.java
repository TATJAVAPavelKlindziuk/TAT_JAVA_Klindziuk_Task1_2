package com.ananyev.task5;

public class Runner {
	public static final long serialVersionUID = 42L;

	public static void main(String[] args) {

		NumberController controller = new NumberController();
		if (controller.controlNumbers(args)) {
			CalculatorNums calc = new CalculatorNums();

			System.out.print("before changes");
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i] + " ");
			}
			double[] res = calc.calculate(args);
			System.out.println("");
			System.out.print("after changes");
			for (int i = 0; i < res.length; i++) {
				System.out.print(res[i] + " ");
			}
		} else {
			System.out.println("Please try again");
		}
	}
}
