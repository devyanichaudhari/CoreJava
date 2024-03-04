package com.edubridge.designpattern.creational.factorydesignpattern;
class BOI implements Plan
{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		System.out.println("The Rate of Interest BOI: "+rate);
	}
	
}
class SBI implements Plan
{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		System.out.println("The Rate of Interest SBI: "+rate);
	}
	
}
class BOB implements Plan
{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		System.out.println("The Rate of Interest BOB: "+rate);
	}
	
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOI b1 = new BOI();
		SBI s1 = new SBI();
		BOB b2 = new BOB();
		b1.getRoi(7.0);
		s1.getRoi(7.5);
		b2.getRoi(6.5);
	}

}
