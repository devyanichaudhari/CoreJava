package com.edubridge.interfacedemo;


// Program to demonstrate on Cloneable built-in Marker Interface

// If we are not implementating cloneable interface and if we are invoking the clone
// method in the driver class, we will get an exception ad "ClassNotSupportedException"

public class Employee implements Cloneable {
	public int empId;
	public String empName;
	public long salary;
	
	public Employee(int empId, String empName, long salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	void display() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + salary);
	}
	
	
}