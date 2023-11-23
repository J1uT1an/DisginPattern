package com.luxintong.behavioralPattern.command;

// 接收者类 - 电灯
public class Light {
	public void turnOn() {
		System.out.println("电灯已打开");
	}
	
	public void turnOff() {
		System.out.println("电灯已关闭");
	}
}
