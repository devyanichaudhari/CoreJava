package com.edubridge.uncheckedexception;

import java.util.Scanner;

/*Program to demonstrate on Multiple Catch Block*/
public class MultipleCatchBlockDemo 
{
	public static void displayArray(int arr[])
	{
		try
		{
			System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = 45;
		System.out.println("Enter the Value of Y: ");
		int y = s.nextInt();
		try
		{
		System.out.println(x/y);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		int arr[] = {12,46,35};
		MultipleCatchBlockDemo.displayArray(arr);
		s.close();
	}
}
