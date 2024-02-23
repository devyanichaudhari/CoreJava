package com.edubridge.classobject;

public class Product {
	
	String pname;
	int pprice;
	
	void display(String pn, int pp) {
		pname = pn;
		pprice = pp;
		
		System.out.println("Product Name: " + pname + "\tProduct Price: " + pprice);
	}

	public static void main(String[] args) {
		Product p1 = new Product();
		
		p1.display("Laptop", 35000);
		p1.display("Keyboard", 850);
		p1.display("Mouse", 400);
		p1.display("Speakers", 2000);
	}

}
