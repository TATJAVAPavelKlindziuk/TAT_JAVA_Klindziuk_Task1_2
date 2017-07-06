package com.ananyev.task8;

public class NumberController {

	public boolean controlNumbers(String[] args) {
		return (hasAllScores(args) && checkForSpecialSymbols(args) && checkNumberForMaxValue(args));
	}

	protected boolean hasAllScores(String[] args) {
		boolean returned = false;
		if ((args.length == 0) || (args.length < 2) || (args.length > 2)) {
			System.out.println("Enter 2 numbers");
			return false;
		} else {
			returned = true;
		}
		return returned;
	}

	protected boolean checkNumberForMaxValue(String[] args) {
		if ((Integer.parseInt(args[0]) > 100) && (Integer.parseInt(args[1]) > 100)) {
			System.out.println("It's too big number");
			return false;
		} else
			return true;
	}

	protected boolean checkForSpecialSymbols(String[] args) {
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
