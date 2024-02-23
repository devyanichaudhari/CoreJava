package com.edubridge.thiskeyword;

// this keyword can be used to refer instance variable of current class

class Account {
	
	// instance variable - instance variable are the variable that is inside the class but outside the method
	public String accType;
	public long accno;
	
	public void setData(String accType, long accno) {
		this.accType = accType;
		this.accno = accno;
	}
	
	public void display() {
		System.out.println(accType + "\t" + accno);
	}
}

public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setData("Savings", 23456);
		
		acc.display();
	}

}
