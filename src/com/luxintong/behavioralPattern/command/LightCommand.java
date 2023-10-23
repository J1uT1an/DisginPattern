package com.luxintong.behavioralPattern.command;

// 具体命令类 - 关闭电灯
public class LightCommand implements Command {
	private final Light light;
	
	public LightCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void executeOn() {
		light.turnOn();
	}
	
	@Override
	public void executeOff() {
		light.turnOff();
	}
}
