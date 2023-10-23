package com.luxintong.behavioralPattern.command;

// 接收者类 - 电风扇
public class Fan {
	public void turnOn() {
		System.out.println("电风扇已打开");
	}
	
	public void turnOff() {
		System.out.println("电风扇已关闭");
	}
}
