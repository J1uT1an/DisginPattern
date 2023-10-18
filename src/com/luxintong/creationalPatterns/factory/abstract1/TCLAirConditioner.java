package com.luxintong.creationalPatterns.factory.abstract1;

public class TCLAirConditioner implements IAirConditionerProduct {
	@Override
	public void start() {
		System.out.println("开启TCL空调");
	}
	
	@Override
	public void shutdown() {
		System.out.println("关闭TCL空调");
	}
	
	@Override
	public void refrigerate() {
		System.out.println("用TCL空调制冷");
	}
	
	@Override
	public void setting() {
		System.out.println("设置TCL空调");
	}
}
