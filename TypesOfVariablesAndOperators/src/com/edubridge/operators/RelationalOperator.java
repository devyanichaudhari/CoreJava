package com.edubridge.operators;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Greater than " + (a>b) );
		System.out.println("less than " + (a<b) );
		System.out.println("Greater than equal to " + (a>=b) );
		System.out.println("Less than equal to " + (a<=b) );
		System.out.println("Not equal to " + (a!=b) );
		System.out.println("Equal to Equal to" + (a==b) );

	}

}
