package com.edubridge.uncheckedexception;
/*Program to demonstrate on Arithmetic Exception*/
import java.util.Scanner;
public class ArithmeticExceptionDemo {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = 20;
		System.out.println("Enter the value of Y: ");
		int y = s.nextInt();
		try 
		{
			System.out.println(x/y);
			/*1.When we use System.exit(0); inside a try block after an Exception is thrown 
			 * and also in catch block after a printing statement the finally block is not executed*/
			//System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured "+e);
			//System.exit(0);
		}
		finally 
		{
			//System.exit(0);
			/*2. When we throw an Exception in an finally block before printing statement*/
			//System.out.println(12/0);
			System.out.println("Finally Block");
		}
		s.close();
	}
}
