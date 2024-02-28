package com.edubridge.assessment;

import java.util.*;

public class Employee 
{
	int empID;
	String empName;
	String empDesignation;
	
	public Employee(int empID, String empName, String empDesignation) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empDesignation = empDesignation;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public static void main(String[] args) {
		ArrayList<Employee> obj = new ArrayList<Employee>();
		obj.add(new Employee(101,"Devyani","Developer"));
		obj.add(new Employee(102,"Yukta","UI"));
		obj.add(new Employee(103,"Preeti","HR"));
		obj.add(new Employee(104,"Snehal","Developer"));
		
		for(Employee str:obj)
		{
			System.out.println("Employee ID : "+str.getEmpID()+"\tEmployee Name : "+str.getEmpName()+"\t\tEmployee Designation : "+str.getEmpDesignation());
		}
	}
}
