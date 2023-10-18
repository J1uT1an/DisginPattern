package com.luxintong.creationalPatterns.factory.abstract1;

/*
 * Description: 抽象产品工厂
 * */
public interface IProductFactory {
	// 生产空调机
	IAirConditionerProduct AirConditionerProduct();
	
	// 生产电视机
	ITelevisionProduct TelevisionProduct();
}
