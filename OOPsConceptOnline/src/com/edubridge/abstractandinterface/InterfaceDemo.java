package com.edubridge.abstractandinterface;

interface i1{
	void show1();
}

interface i2{
	void show2();
}

interface i3 extends i1, i2{
	void show3();
}

class i4 implements i3{
	public void show1() {
		System.out.println("This is show1 method");
	}
	
	public void show2() {
		System.out.println("This is show2 method");
	}
	
	public void show3() {
		System.out.println("This is show3 method");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		i4 i = new i4();
		
		i.show1();
		i.show2();
		i.show3();

	}

}
