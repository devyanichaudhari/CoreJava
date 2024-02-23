package com.edubridge.operators;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println("Addition of two numbers is " + (a+b));
		System.out.println("Subtraction of two numbers is " + (a-b));
		System.out.println("Multiplication of two numbers is " + (a*b));
		System.out.println("Division of two numbers is " + (a/b));
		System.out.println("Modulo of two numbers is " + (a%b));
	}

}
