package com.luxintong.behavioralPattern.observer;

/**
 * @author Luxintong
 * @Description 抽象观察者
 */
public interface Subject {
	public void addObserver(Observer obs);

	public void cry();
}
