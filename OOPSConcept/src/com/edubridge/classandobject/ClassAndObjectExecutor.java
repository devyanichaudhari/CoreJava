package com.edubridge.classandobject;

// Program to demonstrate on class and objects

class Vegetables{
	// variables or fields
	String vegetableName;
	int price;
	
	// methods
	void print() {
		System.out.println("Vegetable Name: " + vegetableName + "\tPrice: " + price);
	}
}

// Driver class
public class ClassAndObjectExecutor {

	public static void main(String[] args) {
		// object creation
		Vegetables v = new Vegetables();
		v.vegetableName = "Jack Fruit";
		v.price = 80;
		v.print();
	}
}