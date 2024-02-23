package com.edubridge.thisandsuperkeyword;

class A{
	A(){
		System.out.println("This is default constructor of class A");
	}
	
	A(int i){
		this();
		System.out.println(i);
	}
}

public class CallConstructorWithinConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A(10);
	}
}