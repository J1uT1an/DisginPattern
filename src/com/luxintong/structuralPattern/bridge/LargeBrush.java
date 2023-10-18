package com.luxintong.structuralPattern.bridge;

public class LargeBrush extends Brush {
	public LargeBrush(Color color) {
		super(color);
	}
	
	@Override
	public void draw() {
		System.out.print("用大号毛笔");
		super.draw();
	}
}
