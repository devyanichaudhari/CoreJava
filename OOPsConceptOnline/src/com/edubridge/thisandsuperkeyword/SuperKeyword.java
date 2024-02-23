package com.edubridge.thisandsuperkeyword;

class A11{
	int x=100;
}

class B extends A11{	
	int x=200;

	void show() {
		System.out.println(super.x);
	}
}


public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		System.out.println(b1.x);
		b1.show();
	}

}
