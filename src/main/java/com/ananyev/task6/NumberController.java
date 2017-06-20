package com.ananyev.task6;

public class NumberController {

	public boolean controlNumbers(String[] args) {
		return (hasAllScores(args) && checkForSpecialSymbols(args));
	}

	private boolean hasAllScores(String[] args) {
		if (args.length == 0) {
			System.out.println("Enter values");
			return false;
		}
		if ((args.length > 3) || (args.length < 3)) {
			System.out.println("Enter only 3 values");
			return false;
		} else
			return true;
	}

	private boolean checkForSpecialSymbols(String[] args) {
		boolean returned = false;
		String regex = "[0-9-]+";
		for (String line : args) {
			if (!line.matches(regex)) {
				System.out.println("Only numbers allowed.Please try again.");
				returned = false;
			} else {
				returned = true;
			}
		}
		return returned;
	}
}