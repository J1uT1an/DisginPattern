package com.luxintong.creationalPatterns.factory.method;

public class Nvwa {
	public static void main(String[] args) {
		Person man = ManFactory.createMan();
		Person woman = WomanFactory.createWoman();
		Person robot = RobotFactory.createRobot();
		
		man.name();
		woman.name();
		robot.name();
	}
}