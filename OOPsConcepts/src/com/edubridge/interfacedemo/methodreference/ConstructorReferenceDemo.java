package com.edubridge.interfacedemo.methodreference;

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		Edubridge e = Trainer::new;
		e.getname("Shiwani");
	}
}