package com.edubridge.selectionstatement;

import java.util.Scanner;

public class SwitchStatementDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value of Map Number: ");
		int Map_Number = s.nextInt();
		switch(Map_Number) 
		{
			case 1:
				System.out.println("Welcome to Erangle");
				break;
			case 2:
				System.out.println("Welcome to Miramar");
				break;
			case 3:
				System.out.println("Welcome to Sanhok");
				break;
			case 4:
				System.out.println("Welcome to Vikendi");
				break;
			default:
				System.out.println("Invalid Map Number,Please check and Correct.");
		}
	}

}
