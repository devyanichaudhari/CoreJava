package com.edubridge.compileinput;

import java.util.Scanner;

public class IntegerDataTypeDemo {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		byte num=s.nextByte();
		short x=s.nextShort();
		int y=s.nextInt();
		long z=s.nextLong();
		System.out.println("The byte num value is: " +num);
		System.out.println("The byte num value is: " +x);
		System.out.println("The byte num value is: " +y);
		System.out.println("The byte num value is: " +z);
		s.close();
		
	}

}
