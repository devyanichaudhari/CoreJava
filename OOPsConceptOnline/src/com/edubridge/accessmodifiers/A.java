package com.edubridge.accessmodifiers;

public class A {
	protected String name = "John";
	private int age = 21;
	public void hello() {
		System.out.println("Hello from class A");
	}
}

class C extends A{
	
}
