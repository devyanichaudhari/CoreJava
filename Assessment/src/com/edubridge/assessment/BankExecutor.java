package com.edubridge.assessment;

public class BankExecutor {

	public static void main(String[] args) {
		Bank b1;
		b1=new BankA();
		b1=new BankB();
		b1=new BankC();
		System.out.println("Rate of Interest for Bank A: "+b1.getROI(7.5));
		System.out.println("Rate of Interest for Bank B: "+b1.getROI(7));
		System.out.println("Rate of Interest for Bank C: "+b1.getROI(6.5));
	}

}
