package com.luxintong.creationalPatterns.factory.abstract1;

public class TCLTelevision implements ITelevisionProduct {
	@Override
	public void start() {
		System.out.println("开启TCL电视");
	}
	
	@Override
	public void shutdown() {
		System.out.println("关闭TCL电视");
	}
	
	@Override
	public void show() {
		System.out.println("播放TCL电视");
	}
	
	@Override
	public void setting() {
		System.out.println("设置TCL电视");
	}
}
