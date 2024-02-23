package com.edubridge.operators;

import java.util.Scanner;

public final class LogicalOperator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Logical And Operator " + (a==b && b>a));
		System.out.println("Logical OR Operator " + (a>=b || b>a));
		System.out.println("Logical NOT Operator " + (!(b<a)));

	}

}
