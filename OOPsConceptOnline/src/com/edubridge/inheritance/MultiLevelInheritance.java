package com.edubridge.inheritance;

class A{
	void methodA(){
		System.out.println("This is method of class A");
	}
}

class B extends A{
	void methodB(){
		System.out.println("This is method of class B");
	}
}

class C extends B{
	void methodC(){
		System.out.println("This is method of class C");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		
		c.methodA();
		c.methodB();
		c.methodC();
	}

}
