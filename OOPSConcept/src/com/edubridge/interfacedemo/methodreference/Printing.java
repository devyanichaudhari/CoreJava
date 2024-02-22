package com.edubridge.interfacedemo.methodreference;
/*Program to demonstrate on Referrence to a instance method*/
public class Printing {
	public void xerox()
	{
		System.out.println("Implementing Instance method");
	}
	public static void main(String[] args) {
		/*Referrence to a instance method*/
		Printing p = new Printing();
		Printer p1 = p::xerox;
		p1.print();
	}

}
