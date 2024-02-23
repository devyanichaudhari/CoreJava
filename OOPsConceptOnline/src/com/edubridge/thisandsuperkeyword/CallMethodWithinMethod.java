package com.edubridge.thisandsuperkeyword;

class Account{
	void deposite() {
		int amount=1000;
		System.out.println(amount+"Rs Amount deposited");
	}
	
	void info() {
		this.deposite();
	}
}

public class CallMethodWithinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account();
		
		a1.info();
	}

}
