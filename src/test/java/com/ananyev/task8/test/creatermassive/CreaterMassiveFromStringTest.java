package com.ananyev.task8.test.creatermassive;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ananyev.task8.CreaterMassive;

/*
 * Unit tests for createrMassiveFromString() of task8.CreaterMassive.class
 * creates random filled array with received from arguments size
 */
public class CreaterMassiveFromStringTest {
	int[] expected = { 1, 2, 4, 6, 9 };
	int[] actual;
	String line;

	@Test(priority = 1)
	public void createrMassiveFromString() {
		line = "5";
		actual = CreaterMassive.createMassiveFromString(line);
		Assert.assertEquals(actual.length, expected.length);
	}

	@Test(priority = 2)
	public void createrMassiveFromStringZero() {
		line = "0";
		actual = CreaterMassive.createMassiveFromString(line);
		Assert.assertEquals(actual.length, 0);
	}

	// Let's imagine that, MAX digits number in our line is 4
	@Test(priority = 3)
	public void createrMassiveFromStringMaxSizeOfLIne() {
		line = "5555";
		actual = CreaterMassive.createMassiveFromString(line);
		Assert.assertEquals(actual.length, 5555);
	}

	// Let's imagine that, MAX digits number in our line is 4
	@Test(priority = 4, expectedExceptions = IllegalArgumentException.class)
	public void createrMassiveFromStringMaxOverSizeOfLIne() {
		line = "555566";
		actual = CreaterMassive.createMassiveFromString(line);
		Assert.assertEquals(actual.length, 555566);
	}
	
	@Test(priority = 5, expectedExceptions = IllegalArgumentException.class)
	public void createrMassiveFromStringNullString() {
		line = null;
		actual = CreaterMassive.createMassiveFromString(line);
	}
	
	@Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
	public void createrMassiveFromStringEmptyString() {
		line = "";
		actual = CreaterMassive.createMassiveFromString(line);
	}
	
	@Test(priority = 7, expectedExceptions = IllegalArgumentException.class)
	public void createrMassiveFromStringLetters() {
		line = "2ss";
		actual = CreaterMassive.createMassiveFromString(line);
	}
	
	@Test(priority = 8, expectedExceptions = IllegalArgumentException.class)
	public void createrMassiveFromStringSpecialSymbols() {
		line = "&12";
		actual = CreaterMassive.createMassiveFromString(line);
	}
	
	@Test(priority = 9, expectedExceptions = IllegalArgumentException.class)
	public void createrMassiveFromStringUTF() {
		line = "\uD835\uDD0A";
		actual = CreaterMassive.createMassiveFromString(line);
	}
}
