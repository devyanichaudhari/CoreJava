package com.edubridge.selectionstatement;
//program to demonstrate on if ....else statement
import java.util.Scanner;

public class IfElseStatementDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value of A: ");
		int a = s.nextInt();
		System.out.println("Enter Value of B: ");
		int b = s.nextInt();
		if(a!=b) 
		{
			System.out.println("A is not equal to B");
		}
		else
		{
			System.out.println("A is equal to B");
		}
	}

}
