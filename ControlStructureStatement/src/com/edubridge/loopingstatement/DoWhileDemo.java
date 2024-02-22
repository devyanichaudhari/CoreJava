package com.edubridge.loopingstatement;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s =new Scanner(System.in);
			System.out.println("Enter the Value of N:");
			int a=s.nextInt();
			int i=1;
			System.out.println("From 1 to N");
			do
			{
				System.out.println(i);
				i++;
			}
			while(i<=a);
			{
				
			}	
			System.out.println("From N to 1");
			i=a;
			do
			{
				System.out.println(i);
				i--;
			}
			while(i>=1);
			{
				
			}	
			
			s.close();
				
	}

}
