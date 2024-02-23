package com.edubridge.assessment;
import java.util.Scanner;

public class ExceptionQuestion {
	static void even(int a)
{
	if(a%2==0)
	{
		throw new ArithmeticException("Even Number");
	}
	else
	{
		System.out.println("Odd Number");
	}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ExceptionQuestion.even(a);
		sc.close();
	}

}
