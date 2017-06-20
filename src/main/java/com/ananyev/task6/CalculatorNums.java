package com.ananyev.task6;

import java.util.Arrays;

public class CalculatorNums {
	public static final long serialVersionUID = 42L;

	public double calculate(String[] args) {

		int[] massive = new int[args.length];
		int maxValue;
		for (int i = 0; i < args.length; i++) {
			massive[i] = Integer.parseInt((args[i]));
		}
		Arrays.sort(massive);
		maxValue = massive[0] + massive[massive.length - 1];
		return maxValue;
	}

}
