package com.edubridge.interfacedemo;

import java.util.Scanner;

public class EmployeeCloneableInterfaceExecutor {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Employee ID: ");
		int empId = s.nextInt();
		
		System.out.println("Enter the Employee Name: ");
		String empName = s.next();
		
		System.out.println("Enter the Employee Salary: ");
		long empSalary = s.nextLong();
		
		Employee e1 = new Employee(empId, empName, empSalary);
		Employee e2 = (Employee) e1.clone();
		e2.display();
	}
}
