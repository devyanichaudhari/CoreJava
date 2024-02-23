package com.edubridge.constructor;

// WAP to print the area of two rectangles having sides 4, 5 & 5, 8 respectively, 
// by creating a class named as Rectangle with a method name area which returns 
// the area and length and breadth passed as parameter to its constructor.

class Rectangle{
	// instance variable
	int length;
	int breadth;
	
	// parameterised constructor
	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	// default constructor
	Rectangle() {
		System.out.println("Rectangle");
	}
	
	void displayAreaAndPerimeter() {
		System.out.println("Area of Rectangle is " + length*breadth);
		System.out.println("Perimeter of Rectangle is " + 2*(length+breadth));
	}
	
}

public class ConstructorExecutor {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle(4, 5);
		Rectangle r2 = new Rectangle(5, 8);
		
		r1.displayAreaAndPerimeter();
		r2.displayAreaAndPerimeter();
	}

}
