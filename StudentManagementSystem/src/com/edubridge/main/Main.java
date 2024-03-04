package com.edubridge.main;
import java.util.*;
import com.edubridge.dao.StudentDao;
import com.edubridge.pojo.Student;
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.next();
		System.out.println("Welcome to Student Management Portal "+name);
		int ch = 0;
		do
		{
			System.out.println("Press 1 to Add Student Details.");
			System.out.println("Press 2 to Update Student Details.");
			System.out.println("Press 3 to Delete Student Detail.");
			System.out.println("Press 4 to Display Student Details.");
			System.out.println("Press 5 to Exit");
			System.out.println("Please Enter your Choice:");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Student Name:");
				String sname = sc.next();
				System.out.println("Enter the Student Phone Number");
				String sphone = sc.next();
				System.out.println("Enter the Student City:");
				String scity = sc.next();
				Student st = new Student(sname,sphone,scity);
				@SuppressWarnings("unused") boolean ans = StudentDao.insertStudentData(st);
				System.out.println("Data Inserted Successfully");
			break;
			case 2:
				System.out.println("Press 1 to To Update Student Name.");
				System.out.println("Press 2 to To Update Student Phone Number.");
				System.out.println("Press 3 to To Update Student City.");
				int val = sc.nextInt();
				if(val==1)
				{
					System.out.println("Enter the Name you want to change");
					String n1 = sc.next();
					System.out.println("Enter the ID which name you want to change");
					int id1= sc.nextInt();
					Student st1 = new Student();
					st1.setStudentName(n1);
					@SuppressWarnings("unused")
					boolean ans1 = StudentDao.updateStudentData(val, n1, id1, st1);
					System.out.println("Data Updated Successfully");
				}
				else if(val==2)
				{
					System.out.println("Enter the Phone Number you want to change");
					String phno = sc.next();
					System.out.println("Enter the ID which Phone Number you want to change");
					int id1= sc.nextInt();
					Student st1 = new Student();
					st1.setStudentName(phno);
					@SuppressWarnings("unused")
					boolean ans1 = StudentDao.updateStudentData(val, phno, id1, st1);
					System.out.println("Data Updated Successfully");
				}
				else if(val==3)
				{
					System.out.println("Enter the City you want to change");
					String c1 = sc.next();
					System.out.println("Enter the ID which name you want to change");
					int id1= sc.nextInt();
					Student st1 = new Student();
					st1.setStudentName(c1);
					@SuppressWarnings("unused")
					boolean ans1 = StudentDao.updateStudentData(val, c1, id1, st1);
					System.out.println("Data Updated Successfully");
				}
				else
				{
					System.out.println("Data is not Updated");
				}
			break;
			case 3:
				System.out.println("Enter the ID which you want to delete");
				int id2 = sc.nextInt();
				StudentDao.deleteStudentData(id2);
				System.out.println("Data Deleted Successfully");
			break;
			case 4:
				StudentDao.showAllStudentData();
			break;
			case 5:
				System.out.println("Bye Bye :)");
			break;
			default:
				System.out.println("You have enetred wrong choice");
			}
		}
		while(ch!=5);
	}

}
