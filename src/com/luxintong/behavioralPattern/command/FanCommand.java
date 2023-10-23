package com.luxintong.behavioralPattern.command;

// 具体命令类 - 关闭电风扇
public class FanCommand implements Command {
	private final Fan fan;
	
	public FanCommand(Fan fan) {
		this.fan = fan;
	}
	
	@Override
	public void executeOn() {
		fan.turnOn();
	}
	
	@Override
	public void executeOff() {
		fan.turnOff();
	}
}
