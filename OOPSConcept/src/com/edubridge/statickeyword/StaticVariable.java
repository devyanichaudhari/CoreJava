package com.edubridge.statickeyword;

public class StaticVariable {
	// static keyword with variable
	// 1. when any variable name is non-static and we are trying to access that variable
	// inside the main method, then we will get error, so that we have to use static 
	// keyword with variable name
	static float percentage = 89.78f;

	public static void main(String[] args) {
//		StaticVariable d = new StaticVariable();
//		System.out.println(d.percentage);
		
		System.out.println(percentage);
	}
}