package com.luxintong.creationalPatterns.factory.abstract1;

/*
 * Description: 一个电器工厂可以产生多种类型的电器，如海尔工厂可以生产海尔电视机、海尔空调等，TCL工厂可以生产TCL电视机、TCL空调等，
 * 相同品牌的电器构成一个产品族，而相同类型的电器构成了一个产品等级结构，现使用抽象工厂模式模拟该场景。
 * */
public class Client {
	public static void main(String[] args) {
		System.out.println("=======================Hair系列产品=========================");
		// Hari工厂
		System.out.println("=======================创建Hair工厂=========================");
		HairFactory hairFactory = new HairFactory();
		System.out.println("=======================生产Hair空调机=========================");
		IAirConditionerProduct iAirConditionerProduct = hairFactory.AirConditionerProduct();
		System.out.println("=======================使用Hair空调机=========================");
		iAirConditionerProduct.start();
		iAirConditionerProduct.refrigerate();
		iAirConditionerProduct.setting();
		iAirConditionerProduct.shutdown();
		System.out.println("=======================生产Hair电视机=========================");
		ITelevisionProduct iTelevisionProduct = hairFactory.TelevisionProduct();
		System.out.println("=======================使用Hair电视机=========================");
		iTelevisionProduct.start();
		iTelevisionProduct.show();
		iTelevisionProduct.setting();
		iTelevisionProduct.shutdown();
		System.out.println("-----------------------分割线--------------------------------");
		System.out.println("=======================TCL系列产品=========================");
		// TCL工厂
		System.out.println("=======================创建TCL工厂=========================");
		TCLFactory tclFactory = new TCLFactory();
		System.out.println("=======================生产TCL空调机=========================");
		iAirConditionerProduct = tclFactory.AirConditionerProduct();
		System.out.println("=======================使用TCL空调机=========================");
		iAirConditionerProduct.start();
		iAirConditionerProduct.refrigerate();
		iAirConditionerProduct.setting();
		iAirConditionerProduct.shutdown();
		System.out.println("=======================生产TCL电视机=========================");
		iTelevisionProduct = tclFactory.TelevisionProduct();
		System.out.println("=======================使用TCL电视机=========================");
		iTelevisionProduct.start();
		iTelevisionProduct.show();
		iTelevisionProduct.setting();
		iTelevisionProduct.shutdown();
	}
}
