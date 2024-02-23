package com.edubridge.abstraction;

abstract class BankDetails
{
	String bankName = "Bank of India";
	String accountHolderName = "Jhon Smith";
	String address = "Mumbai";
	String emailId = "jhon@gmail.com";
	long contact = 9658231456L;
	void disp() {
		System.out.println("Bank Name is: " + bankName + "\nAccount Holder Name: " + accountHolderName + "\nAddress: " + address + "\nEmail Id: " + emailId + "\nContact: " + contact);
	}
}

class Atm extends BankDetails{
	int pinNo = 8942;
	int amount = 1000;
	void disp1() {
		System.out.println("Pin No: " + pinNo + "\nAmount: " + amount);
	}
}

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm b1 = new Atm();
		
		b1.disp1();
	}

}
