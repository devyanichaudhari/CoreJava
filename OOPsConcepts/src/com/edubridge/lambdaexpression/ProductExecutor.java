package com.edubridge.lambdaexpression;

// Program to demonstrate on Lambda Expression

// Implemented Functional Interface method with the help of Lambda Expression
public class ProductExecutor {

	public static void main(String[] args) {
		Product p = (price) -> {
			System.out.println("Price is " + price);
		};
		
		System.out.println(p.displayProductName());
		System.out.println(Product.displayProductBrand());
		p.displayProductPrice(1500);
	}
}