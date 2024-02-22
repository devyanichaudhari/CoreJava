package com.edubridge.compileinput;

import java.util.Scanner;

public class CharDataTypeDemo {
	public static void main (String[] args){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char x=s.next().charAt(0);
		boolean res =false;
		
		System.out.println(str);
		System.out.println(x);
		System.out.println(res);
	}

}
