package com.luxintong.creationalPatterns.factory.method;

public class ManFactory { // 造人工厂
	public static Person createMan() {
		return new Man();
	}
}
