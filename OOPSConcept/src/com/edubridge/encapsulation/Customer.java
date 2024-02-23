package com.edubridge.encapsulation;

// child class

public class Customer extends HDFC{
	// private data members
	private String custname;
	private long custId;
	private int pinno;
	
	// getters and setters
	public String getCustname() {
		return custname;
	}
	
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	public long getCustId() {
		return custId;
	}
	
	public void setCustId(long custId) {
		this.custId = custId;
	}
	
	public int getPinno() {
		return pinno;
	}
	
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}
	
	@Override
	public String toString() {
		return "Customer [custname=" + custname + ", custId=" + custId + ", pinno=" + pinno + ", toString()="
				+ super.toString() + "]";
	}
	
	
}