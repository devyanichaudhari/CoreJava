package com.edubridge.packone;

// Program to demonstrate on public, private and default access specifiers

public class AccessSpecifierDemo {
	
	private int atm_pinNo;
	public String emailId;
	float percentage;
	
	private void displayPinNo() {
		System.out.println(atm_pinNo);
	}
	
	public void displayEmailId() {
		System.out.println(emailId);
	}
	
	void displayPercentage() {
		System.out.println(percentage);
	}

}