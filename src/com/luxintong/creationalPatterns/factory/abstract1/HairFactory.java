package com.luxintong.creationalPatterns.factory.abstract1;

/*
 * Description: Hair 电器工厂
 * */
public class HairFactory implements IProductFactory {
	@Override
	public IAirConditionerProduct AirConditionerProduct() {
		return new HairAirConditioner();
	}
	
	@Override
	public ITelevisionProduct TelevisionProduct() {
		return new HairTelevision();
	}
}
