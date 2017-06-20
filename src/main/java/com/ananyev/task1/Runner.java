package com.ananyev.task1;

public class Runner {
	public static final long serialVersionUID = 42L;

	public static void main(String[] args) {

		NumberControl control = new NumberControl();
		boolean isNumberOK = control.checkNumber(args);

		if (isNumberOK) {
			Massive massive = new Massive();
			int[] numberMassive = massive.createMassive(args[0]);
			CheckerSum checker = new CheckerSum();
			if (checker.checkSumOfNumber(numberMassive)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			System.out.println("Try again");
		}
	}
}
