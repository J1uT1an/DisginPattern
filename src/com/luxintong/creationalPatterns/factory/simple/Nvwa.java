package com.luxintong.creationalPatterns.factory.simple;

public class Nvwa {
	public static void main(String[] args) {
		Person woman = PersonFactory.createPerson("W");
		Person man = PersonFactory.createPerson("M");
		Person robot = PersonFactory.createPerson("R");
		
		woman.name();
		man.name();
		robot.name();
	}
}