package com.edubridge.designpattern.structural.facadedesignpattern;

public class McDonalds implements Franchise
{

	@Override
	public void option() {
		System.out.println("McDonalds");
		
	}

	@Override
	public void cost() {
		System.out.println("4500000RS");
		
	}

}
