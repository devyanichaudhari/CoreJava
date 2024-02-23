package com.edubridge.constructor;

import java.util.Scanner;

// Write a program to print the area of a rectangle by 
// creating a class named 'Area' taking the values of its length 
// and breadth as parameters of its constructor and having 
// a method named 'returnArea' which returns the area of the rectangle. 
// Length and breadth of rectangle are entered through keyboard.

class Area{
	int length;
	int breadth;
	
	public Area(int l, int b) {
		length = l;
		breadth = b;
	}
	
	public int returnArea() {
		return length*breadth;
	}
}

public class AreaOfRectange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int l, b;
		
		System.out.print("Enter length: ");
		l = scanner.nextInt();
		
		System.out.print("Enter breadth: ");
		b = scanner.nextInt();
		
		Area area = new Area(l, b);
		System.out.println("Area of Rectange: " + area.returnArea());
	}

}
