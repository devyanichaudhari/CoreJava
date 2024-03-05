package com.edubridge.designpattern.structural.facadedesignpattern;

public class KFC implements Franchise
{

	@Override
	public void option() 
	{
		System.out.println("KFC");
		
	}
	@Override
	public void cost() 
	{
		System.out.println("2000000RS");
		
	}

}
