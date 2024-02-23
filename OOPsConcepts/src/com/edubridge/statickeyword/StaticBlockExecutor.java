package com.edubridge.statickeyword;

public class StaticBlockExecutor {
	
	int x;
	static String str;
	
	// static block is used to initialize static variable only
	static {
		// x = 12;
		str = "Static Block";
	}
	
	static void print() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		StaticBlockExecutor.print();
	}
}