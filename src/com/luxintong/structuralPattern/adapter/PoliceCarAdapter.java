package com.luxintong.structuralPattern.adapter;

public class PoliceCarAdapter extends CarController {
	private final PoliceSound sound; // 定义适配者 PoliceSound 对象
	private final PoliceLamp lamp; // 定义适配者 PoliceLamp 对象
	
	public PoliceCarAdapter() {
		sound = new PoliceSound();
		lamp = new PoliceLamp();
	}
	
	public void phonate() {
		sound.alarmSound(); // 调用适配者类 PoliceSound 的方法
	}
	
	public void twinkle() {
		lamp.alarmLamp(); // 调用适配者类 PoliceLamp 的方法
	}
}
