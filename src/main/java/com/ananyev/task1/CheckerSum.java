package com.ananyev.task1;

public class CheckerSum {
	public static final long serialVersionUID = 42L;
	public boolean checkSumOfNumber(int[] args) {
		int firstSum = 0;
		int secondSum = 0;
		for (int i = 0; i < args.length / 2; i++) {
			firstSum = firstSum + args[i];
			secondSum = secondSum + args[args.length - 1 - i];
		}
		return (firstSum == secondSum);
	}
}
