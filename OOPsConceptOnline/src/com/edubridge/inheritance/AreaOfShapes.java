package com.edubridge.inheritance;

class Shape{
	void draw() {
		System.out.println("Draw the shape");
	}
}

class Rectangle extends Shape{
	void area(int l,int b) {
		System.out.println("Area of rectangle :"+(l*b));
	}
}

class Square extends Rectangle{
	int a=10;
	void sarea() {
		System.out.println(a*a);
	}
}

public class AreaOfShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
		
		s.sarea();
		s.area(10, 20);
		s.draw();

	}

}
