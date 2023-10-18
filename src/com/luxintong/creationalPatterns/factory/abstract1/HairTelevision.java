package com.luxintong.creationalPatterns.factory.abstract1;

public class HairTelevision implements ITelevisionProduct {
	@Override
	public void start() {
		System.out.println("开启海尔电视");
	}
	
	@Override
	public void shutdown() {
		System.out.println("关闭海尔电视");
	}
	
	@Override
	public void show() {
		System.out.println("播放海尔电视");
	}
	
	@Override
	public void setting() {
		System.out.println("设置海尔电视");
	}
}
