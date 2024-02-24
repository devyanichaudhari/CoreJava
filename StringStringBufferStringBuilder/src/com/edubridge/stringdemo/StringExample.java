package com.edubridge.stringdemo;
//Example of String
public class StringExample {

	public static void main(String[] args) {
		//1. by using string Literal
		String str1="Edubridge";
		String str2="Edubridge";
		//2. by using new Keyword
		String str3=new String("Edubridge");
		String str4=new String("Edubridge");
		//comparing using ==
		System.out.println("Comparing Str1 and Str2: ");
		System.out.println(str1==str2); //true
		System.out.println("Comparing Str1 and Str4: ");
		System.out.println(str1==str4); //False
		System.out.println("Comparing Str2 and Str4: ");
		System.out.println(str3==str4); //False
		
		//comparing using string equals method
		
		System.out.println("Comparing Str1 with Str4 using Equals Method:" );
		System.out.println(str1.equals(str4));

	}

}
