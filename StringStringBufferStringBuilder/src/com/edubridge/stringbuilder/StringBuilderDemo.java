package com.edubridge.stringbuilder;

public class StringBuilderDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Devyani");
		System.out.println(sb);
		System.out.println(sb.capacity());
		StringBuilder sb1 = new StringBuilder("Devyani Dinkar Chaudhari" + " is a Student");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println(sb.append(" Chaudhari "));  //string
		System.out.println(sb.charAt(6));
		System.out.println(sb.append(false +" ")); //boolean
		System.out.println(sb.append('T')); //char

		
	}

}
