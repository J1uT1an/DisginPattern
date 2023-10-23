package com.luxintong.behavioralPattern.command;

// 调用者类 - 开关
public class RemoteControl {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButtonOn() {
		command.executeOn();
	}
	
	public void pressButtonOff() {
		command.executeOff();
	}
}
