package com.edubridge.interfacedemo.methodreference;
//Driver Class
public class ConstructorReferrenceDemo {

	public static void main(String[] args) 
	{
		Edubridge e=Trainer::new;
		e.getName("Shiwani Kumbhalkar");
	}

}
