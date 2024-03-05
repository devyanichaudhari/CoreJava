package com.edubridge.designpattern.structural.facadedesignpattern;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args) {
		System.out.println("Welcome to Registration Service ");
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do
		{
			System.out.println("Press 1 for KFC");
			System.out.println("Press 2 for Dominos");
			System.out.println("Press 3 for McDonalds");
			System.out.println("Press 4 to Exit");
			System.out.println("Please Enter your Choice:");
			ch = sc.nextInt();
			FranchiseRegistration f = new FranchiseRegistration();
			switch(ch)
			{
			case 1:
				f.BuyKFC();
			break;
			case 2:
				f.BuyDominos();
			break;
			case 3:
				f.BuyMcDonalds();
			break;
			case 4:
				System.out.println("Bye Bye :)");
			break;
			default:
				System.out.println("You have Entered wrong choice");
			}
	}
		while(ch!=4);
	}
}
