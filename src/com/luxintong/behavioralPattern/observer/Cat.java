package com.luxintong.behavioralPattern.observer;

import java.util.ArrayList;

/**
 * @author Luxintong
 * @Description 具体主题
 */
public class Cat implements Subject {
	private ArrayList<Observer> list;

	public Cat() {
		list = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer obs) {
		list.add(obs);
	}

	@Override
	public void cry() {
		for (Object obj : list) {
			((Observer) obj).response();
		}
	}
}
