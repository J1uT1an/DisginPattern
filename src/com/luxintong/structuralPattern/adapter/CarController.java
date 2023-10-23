package com.luxintong.structuralPattern.adapter;

public abstract class CarController {
	void move() {
		System.out.println("玩具汽车移动！");
	}
	
	public abstract void phonate(); // 发出声音
	
	public abstract void twinkle(); //灯光闪烁
}
