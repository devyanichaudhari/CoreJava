package com.edubridge.selectionstatement;

import java.util.Scanner;

//program to demonstrate on Nested if statement
public class NestedIfStaementDemo {

	public static void main(String[] args) {
		//age>=12,weight<=45 & >=110  jumping
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value of Age: ");
		int age = s.nextInt();
		System.out.println("Enter Value of Weight: ");
		int weight = s.nextInt();
		if(age>=12)
		{
			if((weight>=45 && weight<=110) || weight>=110)
			{
				System.out.println("Eligible for Bunjee Jumping.If weight is greater than 110 then extra ropes will be added");
			}
			else
			{
				System.out.println("Not Eligible for Bunjee Jumping");
			}
		}
		else
		{
			System.out.println("Not Eligible for Bunjee Jumping");
		}
	}

}
