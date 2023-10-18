package com.luxintong.creationalPatterns.factory.simple;

public class PersonFactory { // 造人工厂
	public static Person createPerson(String person) {
		switch (person) {
			case "W":
				return new Woman();
			case "M":
				return new Man();
			case "R":
				return new Robot();
			default:
				return null;
		}
	}
}
