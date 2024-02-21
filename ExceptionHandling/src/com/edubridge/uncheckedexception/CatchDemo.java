package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class CatchDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 45;
		System.out.println("Enter the Value of Y: ");
		int y = s.nextInt();
		s.close();
		int arr[] = {12,46,35};
		try
		{
			System.out.println(x/y);
			try
			{
				System.out.println(arr[3]);
			}
			catch( ArithmeticException | ArrayIndexOutOfBoundsException ex)
			{
				if(ex instanceof ArithmeticException)
					System.out.println(ex);
				else
					System.out.println(ex);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}	
	}

}
