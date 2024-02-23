package com.edubridge.interfacedemo;

public interface Cafe {
	// all the fields inside an interface are by default public static final
	String menu = "Pav Bhaji";
	int price = 90;
	
	// all the methods inside an interface are by default public abstract
	void showMenu();
	void displayPrice();
}