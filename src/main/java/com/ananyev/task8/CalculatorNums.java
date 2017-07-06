package com.ananyev.task8;

public class CalculatorNums {

	public int calculate(int[] args, String k) {

		int sum = 0;
		int K = Integer.parseInt(k);
		for (int i = 0; i < args.length; i++) {

			if (args[i] % K == 0) {
				sum = sum + args[i];
			}
		}

		return sum;
	}
}
