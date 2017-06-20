package com.ananyev.task2;

public class Runner {
	public static final long serialVersionUID = 42L;
	
	public static void main(String[] args) {

		NumberChecker numberChecker = new NumberChecker();
		if (numberChecker.searchForMistakesInNumbers(args)) {
			Caunter counter = new Caunter();
			double result = counter.caltulate(args);
			System.out.println("result is " + result);
		} else {
			System.out.println("Try again");
		}
	}
}
