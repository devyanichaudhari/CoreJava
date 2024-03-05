package com.edubridge.designpattern.creational.singletonedesignpattern;

import java.sql.SQLException;
import java.util.Scanner;
public class MainExecutor {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Singletone Design Creational Design Pattern");
		JDBCSingletone s1 = JDBCSingletone.getInstance();
		int ch = 0;
		do
		{
			System.out.println("Press 1 to Insert Employee Details.");
			System.out.println("Press 2 to View Employee Details.");
			System.out.println("Press 3 to Update Employee Detail.");
			System.out.println("Press 4 to Delete Employee Details.");
			System.out.println("Press 5 to Exit");
			System.out.println("Please Enter your Choice:");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Employee Id: ");
				int emid = sc.nextInt();
				System.out.println("Enter the Employee Name: ");
				String ename = sc.next();
				System.out.println("Enter the Employee Password:");
				String epass = sc.next();
				int i = s1.insert(ename, epass, emid);
				System.out.println(i+" Data Inserted Successfully");
			break;
			case 2:
				s1.view();
			break;
			case 3:
				System.out.println("Enter the ID you want to change:");
				int id = sc.nextInt();
				System.out.println("Enter the Employee Name you want to change:");
				String name =  sc.next();
				System.out.println("Enter the Employee Password you want to change:");
				String pass =  sc.next();
				int i1 = s1.update(id, pass, name);
				System.out.println(i1+" Data Updated Successfully");
			break;
			case 4:
				System.out.println("Enter the id of the record you want to delete:");
				int id1 = sc.nextInt();
				int i2 = s1.delete(id1);
				System.out.println(i2+" Data Deleted Successfully");
			break;
			case 5:
				System.out.println("Bye Bye :)");
			break;
			default:
				System.out.println("You have Entered wrong choice");
			}
		}
		while(ch!=5);
	}

}
