package com.edubridge.loopingstatement;
//program to demonstrate on to print 1 to N numbers using For Loop
import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Value N :");
		int n=s.nextInt();
		System.out.println("From 1 to N");
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		System.out.println("From N to 1");
		for(int i=n;i>=1;i--) {
			
			System.out.println(i);
		}
		s.close();

	}

}
