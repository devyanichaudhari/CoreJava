package com.edubridge.loopingstatement;
/* Count How many digits in the given number

input format 1: 5, 3, 6
input format 2: 9*/

import java.util.Scanner;

public class DigitCountQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Value N :");
		int n=s.nextInt();

		int num1=0;
		while (n!=0)
		{
			
			num1++;
			n= n/10;
			
		}
		
		System.out.println("Number of digits entered are : " +num1);
		s.close();
	}

}
