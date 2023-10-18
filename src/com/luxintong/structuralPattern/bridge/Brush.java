package com.luxintong.structuralPattern.bridge;

/*
 * Description: 毛笔
 * */
public abstract class Brush {
	protected Color color;
	
	public Brush(Color color) {
		this.color = color;
	}
	
	public void draw() {
		color.putColor();
	}
}
