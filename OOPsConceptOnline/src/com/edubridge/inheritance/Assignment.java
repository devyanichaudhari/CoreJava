package com.edubridge.inheritance;

/*
 * Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' 
and 'Manager' classes have data members 'specialization' and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an employee and a manager by making 
an object of both of these classes and print the same.
 * */

class Member{
	String Name;
	int Age;
	String phoneNumber;
	String Address;
	int Salary;
	
	void printSalary() {
		System.out.println("The salary of " + Name + " is " + Salary);
	}
}

class Employee extends Member{
	String specialization;
}

class Manager extends Member{
	String department;
}

public class Assignment {

	public static void main(String[] args) {
		// object creation
		
		Employee e1 = new Employee();
		Manager m1 = new Manager();
		
		e1.Name = "Tom";
		e1.Age = 21;
		e1.phoneNumber = "2314567895";
		e1.Address = "Bandra";
		e1.Salary = 30000;
		e1.specialization = "Java";
		e1.printSalary();
		
		System.out.println("Age: " + e1.Age + "\tPhone Number: " + e1.phoneNumber + "\tAddress: " + e1.Address + "\tSpecialization: " + e1.specialization);
		
		m1.Name = "Jerry";
		m1.Age = 34;
		m1.phoneNumber = "7894561235";
		m1.Address = "Thane";
		m1.Salary = 46000;
		m1.department = "Operations";
		m1.printSalary();
		
		System.out.println("Age: " + m1.Age + "\tPhone Number: " + m1.phoneNumber + "\tAddress: " + m1.Address + "\tDepartment: " + m1.department);

	}

}
