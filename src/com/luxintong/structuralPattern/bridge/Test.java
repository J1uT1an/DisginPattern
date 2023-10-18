package com.luxintong.structuralPattern.bridge;

public class Test {
	public static void main(String[] args) {
		// 大号毛笔着红色
		Brush large = new LargeBrush(new RedColor());
		large.draw();
		// 中号毛笔着绿色
		Brush medium = new MediumBrush(new BlueColor());
		medium.draw();
		// 小号毛笔着蓝色
		Brush small = new SmallBrush(new GreenColor());
		small.draw();
	}
}
