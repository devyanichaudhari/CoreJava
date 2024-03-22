package com.eb;

public class Course 
{
	private int cusId;
	private String cusName;
	public int getCusId() {
		System.out.println(cusId);
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		System.out.println(cusName);
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	
}
