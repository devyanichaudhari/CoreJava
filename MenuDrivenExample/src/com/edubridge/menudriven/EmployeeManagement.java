package com.edubridge.menudriven;

import java.util.Scanner;

public class EmployeeManagement {
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Management System");
		int choice =0;
	do
	{
		System.out.println("1.Employee has to Enter the Name: ");
		System.out.println("2.Employee has to Enter the Designation: ");
		System.out.println("3.Employee has to Enter the Specialization: ");
		System.out.println("4.Exit");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your choice: ");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Name: ");
			String name=sc.next();
			System.out.println("Enter Name: "+name);
		break;
		case 2:
			System.out.println("Enter Employee Designation: ");
			String designation=sc.next();
			System.out.println("Employee Designation: "+designation);
		break;
		case 3:
			System.out.println("Enter Employee Specialization: ");
			String specialization=sc.next();
			System.out.println("Employee Specialization: "+specialization);
		break;
		case 4:
			System.out.println("Exit");
		break;
		}
	}
	while(choice!=4);
}
}
