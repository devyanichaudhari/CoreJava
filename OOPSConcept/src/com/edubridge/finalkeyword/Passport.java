package com.edubridge.finalkeyword;

public class Passport extends Card{
	private final String passportno = "IND66787899";
	private String dateOfExpiry;
	
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	
	public String getPassportno() {
		return passportno;
	}
	
	@Override
	public String toString() {
		return "Passport [passportno=" + passportno + ", dateOfExpiry=" + dateOfExpiry + ", toString()="
				+ super.toString() + "]";
	}
	
	// we cannot override final method
	/*
	final void accept() {
		System.out.println("Final Method");
	}
	*/
}