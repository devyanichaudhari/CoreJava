package com.edubridge.loopingstatement;

import java.util.Scanner;

//program to demonstrate Simple if else statement
public class WhileLoopDemo {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Value of N:");
		int a=s.nextInt();
		int i=1;
		System.out.println("From 1 to N");
		while(i <= a) {
			System.out.println(i);
			i++;
		}	
		System.out.println("From N to 1");
		int b=a;
		while(b >= 1) {
			System.out.println(b);
			b--;
		}
		
		s.close();

	}

}
