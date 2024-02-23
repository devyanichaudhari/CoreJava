package com.edubridge.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		// We cannot create an object for an interface
		// Cafe c = new Cafe();
		
		TheVibe tv = new TheVibe();
		
		tv.showMenu();
		tv.displayPrice();
	}
}