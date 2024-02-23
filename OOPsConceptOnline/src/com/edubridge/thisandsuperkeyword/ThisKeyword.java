package com.edubridge.thisandsuperkeyword;

class Student{
	String name;
	
	Student(String name){
		this.name=name;
	}
	
	void disp() {
		System.out.println(name);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("jhon");
		s1.disp();
	}

}
