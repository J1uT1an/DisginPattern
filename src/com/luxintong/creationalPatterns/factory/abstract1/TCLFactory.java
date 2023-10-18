package com.luxintong.creationalPatterns.factory.abstract1;

/*
 * Description: TCL 电器工厂
 * */
public class TCLFactory implements IProductFactory {
	@Override
	public IAirConditionerProduct AirConditionerProduct() {
		return new TCLAirConditioner();
	}
	
	@Override
	public ITelevisionProduct TelevisionProduct() {
		return new TCLTelevision();
	}
}
