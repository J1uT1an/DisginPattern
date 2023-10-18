package com.luxintong.structuralPattern.bridge;

public class SmallBrush extends Brush {
	public SmallBrush(Color color) {
		super(color);
	}
	
	@Override
	public void draw() {
		System.out.print("用小号毛笔");
		super.draw();
	}
}
