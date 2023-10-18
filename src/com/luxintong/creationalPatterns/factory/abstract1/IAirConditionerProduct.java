package com.luxintong.creationalPatterns.factory.abstract1;

/*
 * Description: 空调机接口
 * */
public interface IAirConditionerProduct {
	void start();
	
	void shutdown();
	
	void refrigerate();
	
	void setting();
}
