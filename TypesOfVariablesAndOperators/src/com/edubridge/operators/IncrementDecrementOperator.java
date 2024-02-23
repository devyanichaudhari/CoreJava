package com.edubridge.operators;

import java.util.Scanner;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value of A: ");
		int a = s.nextInt();
		System.out.println("Enter Value of B: ");
		int b = s.nextInt();
		int res= a++ - ++b; //3
		int res1= --a + b--; //11
		System.out.println(a);
		System.out.println(b);

	}

}
