package com.edubridge.stringdemo;

import java.util.Arrays;


public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//length
		String s1="Hello World";
		String s2 =" ";
		System.out.println(s1.length());
		char []arr = new char[11];
		s1.getChars(0, 11, arr, 0);
		System.out.println(Arrays.toString(arr));
		//System.out.println(str1.toChars());
		System.out.println(s1.compareTo("hello WoRld"));
		System.out.println(s1.compareTo("Hello World"));
		System.out.println(s1.compareToIgnoreCase("hello woRld"));
		System.out.println(s2.isEmpty());
		//System.out.println(s2.isBlank());  not used anymore
		System.out.println(s1.charAt(6));
		System.out.println(" Hey Guy's , you are awesome.".startsWith("He"));
		System.out.println(" Hey Guy's , you are awesome.".endsWith("some"));
		System.out.println(s1.toUpperCase());
		System.out.println("  The Karan Luthra ".trim());
		//System.out.println(s1.repeat(2));
		
	}

}
