package com.edubridge.classandobject;

// WAP to print the area of two rectangles having sides 4, 5 & 5, 8 respectively, 
// by creating a class named as Rectangle with a method name area which returns 
// the area and length and breadth passed as parameter to its constructor.

class Rectangle{
	int length;
	int breadth;
	
	Rectangle(int l, int b){
		System.out.println("Area of Rectangle having length " + l + " and breadth " + b + " is " + area(l, b));
		System.out.println("Perimeter of Rectangle having length " + l + " and breadth " + b + " is " + perimeter(l, b));
	}
	
	int area(int l, int b) {
		this.length = l;
		this.breadth = b;
		
		return length*breadth;
	}
	
	int perimeter(int l, int b) {
		this.length = l;
		this.breadth = b;
		
		return ((2*length)+(2*breadth));
	}
}

public class AreaAndPerimeterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle(4, 5);
		Rectangle r2 = new Rectangle(5, 8);

	}

}
