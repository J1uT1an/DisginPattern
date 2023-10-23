package com.luxintong.behavioralPattern.observer;

/**
 * @author Luxintong
 * @Description 主人类，具体观察者
 */
public class Master implements Observer {
	private String name;

	public Master(String name, Subject subject) {
		this.name = name;
		subject.addObserver(this);
	}

	@Override
	public void response() {
		System.out.println(this.name + "从美梦中惊醒！");
	}
}
