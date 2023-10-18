package com.luxintong.creationalPatterns.factory.method;

public class RobotFactory { // 造人工厂
	public static Person createRobot() {
		return new Robot();
	}
}
