package com.edubridge.operators;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		//System.out.println(a+=b);
		System.out.println("Assignment Operator += is " + (a+=b));
		//System.out.println(a-=b);
		System.out.println("Assignment Operator += is " + (a-=b));
		System.out.println("The Value of a is " + a);
	}

}
