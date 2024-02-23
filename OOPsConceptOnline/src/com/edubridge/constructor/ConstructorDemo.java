package com.edubridge.constructor;

class Employee{
	String empName;
	int empAge;
	
	// Constructor Overloading
	
	Employee(){
		System.out.println("This is default constructor.");
	}
	
	Employee(String empName, int empAge){
		empName = empName;
		empAge = empAge;
		
		System.out.println("This is parameterized constructor.");
		System.out.println("Employee Name: " + empName + "\tEmployee Age: " + empAge);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		Employee e2 = new Employee("John", 22);
	}

}
