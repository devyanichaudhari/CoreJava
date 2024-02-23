package com.edubridge.interfacedemo;

// Implementable Class

public class Fusion implements Company {

	@Override
	public void displayDetails() {
		System.out.println("YOE: " + YOE + "\tHeadwuarter: " + headquarter);
	}
}