package com.edubridge.stringdemo;
//String Concatenate by + Operator and equals method
import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=new String(s.next());
		//concat using concat method
		System.out.println(str1.concat(str2));
		//concatenate using + operator
		System.out.println(20+50+"Hello"+80+60);
		System.out.println(20+"Hello"+80);
		
		/*String a=s.nextLine();
		a=a.replaceAll("the", "");
		a=a.substring(0,a.length());
		System.out.println(a);*/

		s.close();
	}

}
