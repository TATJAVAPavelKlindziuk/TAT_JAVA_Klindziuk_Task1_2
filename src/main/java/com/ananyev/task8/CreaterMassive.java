package com.ananyev.task8;

public class CreaterMassive {

	public static int[] createMassiveFromString(String args) {
		int length = Integer.parseInt(args);
		if (0 > length) {
			throw new IllegalArgumentException("Please enter length of Your massive");
		}
		int[] massive = new int[length];

		for (int i = 0; i < length; i++) {
			massive[i] = (int) (Math.random() * 9);
		}
		return massive;
	}

}
