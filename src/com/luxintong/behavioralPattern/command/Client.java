package com.luxintong.behavioralPattern.command;

/*
 * 房间中的开关就是命令模式的一个实现，现用命令模式来模拟开关的功能，可控制对象包括电灯和电风扇，绘制相应的类图并使用Java语言编程模拟。
 * 人 -> 开关 -> **命令** -> 电灯/电风扇
 * */
public class Client {
	public static void main(String[] args) {
		// 创建电灯和电风扇对象
		Light light = new Light();
		Fan fan = new Fan();
		
		// 创建具体命令对象
		Command lightCommand = new LightCommand(light);
		Command fanCommand = new FanCommand(fan);
		
		// 创建开关
		RemoteControl remote = new RemoteControl();
		
		// 开关控制电灯
		remote.setCommand(lightCommand);
		remote.pressButtonOn();
		remote.pressButtonOff();
		
		// 开关控制电风扇
		remote.setCommand(fanCommand);
		remote.pressButtonOn();
		remote.pressButtonOff();
	}
}

