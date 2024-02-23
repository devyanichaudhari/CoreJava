package com.edubridge.inheritance;

class Bank{
	String bankName="Bank of India";
	String address="Mumbai";
	String emailId="boi@gmail.com";
}

class Facility extends Bank{
	float roi=8.5f;
	void show() {
		System.out.println("Bank Name is: " + bankName + "\tRate of Intrest: " + roi);
	}
}

class Info extends Bank{
	void show1() {
		System.out.println("Bank Name is: " + bankName + "\tBank Address is: " + address + "\tEmail Id is: " + emailId);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facility f1=new Facility();
		
		Info i1=new Info();
		
		f1.show();
		i1.show1();
		
//		Bank b1;
//		
//		b1=new Facility();
//		b1=new Info();

	}

}
