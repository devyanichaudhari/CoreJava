package com.edubridge.encapsulation;

// program to demonstrate on encapsulation

public class EncapsulationDemo {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setBranch("Thane");
		c.setIfscCode("HDFC120078");
		c.setCustname("Atul");
		c.setCustId(101);
		c.setPinno(1234);
		System.out.println(c.getBranch());
		System.out.println(c);
	}
}