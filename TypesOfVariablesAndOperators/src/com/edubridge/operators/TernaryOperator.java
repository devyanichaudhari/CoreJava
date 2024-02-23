package com.edubridge.operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Ternary Operator " + ((a<=b)? "A is Less than B" : "A is Greater than B"));

	}

}
