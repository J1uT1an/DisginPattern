package com.luxintong.creationalPatterns.factory.method;

public class WomanFactory { // 造人工厂
	public static Person createWoman() {
		return new Woman();
	}
}
