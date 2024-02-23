package com.edubridge.lambdaexpression;

@FunctionalInterface
public interface Product {
	
	// abstract method
	void displayProductPrice(int price);
	
	// default method
	default String displayProductName() {
		return "Perfume";
	}
	
	// static method
	static String displayProductBrand() {
		return "Zara";
	}
}
