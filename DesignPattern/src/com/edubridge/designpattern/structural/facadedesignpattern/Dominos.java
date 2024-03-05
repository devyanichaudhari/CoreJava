package com.edubridge.designpattern.structural.facadedesignpattern;

public class Dominos implements Franchise
{

	@Override
	public void option() {
		System.out.println("Dominos");
		
	}

	@Override
	public void cost() {
		System.out.println("5200000RS");
		
	}

}
