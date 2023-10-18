package com.luxintong.creationalPatterns.factory.abstract1;

/*
 * Description: 海尔空调
 * */
public class HairAirConditioner implements IAirConditionerProduct {
	@Override
	public void start() {
		System.out.println("开启海尔空调");
	}
	
	@Override
	public void shutdown() {
		System.out.println("关闭海尔空调");
	}
	
	@Override
	public void refrigerate() {
		System.out.println("用海尔空调制冷");
	}
	
	@Override
	public void setting() {
		System.out.println("设置海尔空调");
	}
}
