package com.edubridge.operators;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value of A: ");
		int a = s.nextInt();
		System.out.println("Enter Value of B: ");
		int b = s.nextInt();
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);

	}

}
