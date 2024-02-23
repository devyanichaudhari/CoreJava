package com.edubridge.classobject;

public class Employee {
	
	int empId = 101;
	
	String empName = "John Smith";
	
	int empAge = 21;
	
	void Testing() {
		System.out.println("Testing is in progress...");
	}

	public static void main(String[] args) {
		
		// object creation using new keyword
		Employee e1 = new Employee();
		
		System.out.println("Employee ID: " + e1.empId + "\nEmployee Name: " + e1.empName + "\nEmployee Age: " + e1.empAge);
		
		e1.Testing();
	}

}
