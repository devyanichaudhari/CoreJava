package com.edubridge.thiskeyword;

// this keyword can be passed as an argument in the method call

public class ThisKeywordDemoTwo {
	
	void printOne(ThisKeywordDemoTwo d) {
		System.out.println("Welcome to " + "Edubridge");
	}
	
	void printTwo() {
		
		// method call
		printOne(this);
	}

	public static void main(String[] args) {
		ThisKeywordDemoTwo d = new ThisKeywordDemoTwo();
		d.printTwo();
	}

}
