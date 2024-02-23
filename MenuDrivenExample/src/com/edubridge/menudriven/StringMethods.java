package com.edubridge.menudriven;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) 
	{
		System.out.println("*** String Methods ****");
		int choice = 0;
		do
		{
			System.out.println("1.Return the Length of String");
			System.out.println("2.Return the Concatenation of String");
			System.out.println("3.Return the Comparision of String");
			System.out.println("4.Exit");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Your Choice: ");
			choice = s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the String: ");
				String str1 = s.next();
				System.out.println("The Lenth of String is "+str1.length());
			break;
			case 2:
				System.out.println("Enter the Strings: ");
				String str2 = s.next();
				String str3 = s.next();
				System.out.println("The Concatenation of String is "+str2+str3);
			break;
			case 3:
				System.out.println("Enter the Strings: ");
				String str4 = s.next();
				String str5 = s.next();
				System.out.println("The Comparision of String is "+str4.compareTo(str5));
			break;
			case 4:
				System.out.println("Exit");
			break;
			}
		}
		while(choice!=4);
	}
}
