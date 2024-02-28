package com.edubridge.selectionstatement;

import java.util.Scanner;

//program to demonstrate on cascaded if ....else statement
public class CascadedIfElseStatementDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value of A: ");
		int a = s.nextInt();
		System.out.println("Enter Value of B: ");
		int b = s.nextInt();
		System.out.println("Enter Value of C: ");
		int c = s.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is Heavier");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is Heavier");
		}
		else
		{
			System.out.println("C is Heavier");
		}
	}

}
