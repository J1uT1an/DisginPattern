package com.luxintong.structuralPattern.bridge;

public class MediumBrush extends Brush {
	public MediumBrush(Color color) {
		super(color);
	}
	
	@Override
	public void draw() {
		System.out.print("用中号毛笔");
		super.draw();
	}
}
