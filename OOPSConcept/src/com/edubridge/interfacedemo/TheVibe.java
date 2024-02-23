package com.edubridge.interfacedemo;

// Implementable class
// A class can implements an interface
public class TheVibe implements Cafe{

	@Override
	public void showMenu() {
		System.out.println("Menu: " + menu);
	}

	@Override
	public void displayPrice() {
		System.out.println("The price for " + menu + " is " + price);
	}
}