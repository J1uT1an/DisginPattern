package com.luxintong.structuralPattern.adapter;

public class AmbulanceCarAdapter extends CarController {
	private final AmbulanceSound sound; // 定义适配者 AmbulanceSound 对象
	private final AmbulanceLamp light; // 定义适配者 PoliceLamp 对象
	
	public AmbulanceCarAdapter() {
		sound = new AmbulanceSound();
		light = new AmbulanceLamp();
	}
	
	public void phonate() {
		sound.sounding(); // 调用适配者类 AmbulanceSound 的方法
	}
	
	public void twinkle() {
		light.lighting(); // 调用适配者类 AmbulanceLamp 的方法
	}
}
