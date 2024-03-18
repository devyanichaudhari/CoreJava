package com.eb.main;

import java.util.Scanner;

import com.eb.dao.EmployeeDao;
import com.eb.entity.Employee;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao emp = new EmployeeDao();
		System.out.println("welcome to Hibernate CRUD Functions");
		int ch = 0;
		do
		{
			System.out.println("Press 1 to Insert Details.");
			System.out.println("Press 2 to Update Details.");
			System.out.println("Press 3 to Delete Details.");
			System.out.println("Press 4 to Display Details.");
			System.out.println("Press 5 to Exit");
			System.out.println("Please Enter your Choice:");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1 :
				System.out.println("Enter Employee First name:");
				String fname = sc.next();
				System.out.println("Enter Employee First name:");
				String lname = sc.next();
				System.out.println("Enter Employee Salary:");
				int salary = sc.nextInt();
				emp.addEmployee(fname, lname, salary);
				System.out.println("Data Inserted Successfully");
			break;
			case 2:
				System.out.println("Enter the Employee Id which you want to update ");
				int id = sc.nextInt();
				Employee e = emp.getEmployeeById(id);
				if(e==null)
				{
					System.out.println("Id does not exist");
				}
				System.out.println("Enter Employee First name:");
				String fname1 = sc.next();
				e.setFirstName(fname1);
				System.out.println("Enter Employee Last name:");
				String lname1 = sc.next();
				e.setLastName(lname1);
				System.out.println("Enter Employee Salary:");
				int salary1 = sc.nextInt();
				e.setSalary(salary1);
				System.out.println("Updating the User......");
				emp.updateEmployee(e);
				System.out.println("User Updated Successfully");
			break;
			case 3:
				System.out.println("Enter the Employee Id which you want to update ");
				int id1 = sc.nextInt();
				emp.deleteEmployee(id1);
				System.out.println("Data Deleted Successfully");
			break;
			case 4:
				emp.getEmployeeList().forEach( u -> System.out.println(u));
			break;
			case 5:
				System.out.println("Bye Bye :)");
			break;
			default:
				System.out.println("You have Entered Wrong Choice");
			break;
			}
		}
		while(ch!=5);
	}

}
