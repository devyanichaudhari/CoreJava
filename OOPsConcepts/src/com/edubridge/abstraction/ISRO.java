package com.edubridge.abstraction;

// implementable class or child class

public class ISRO extends GovernmentAgency{

	// implement all the abstract methods of the parent class
	
	@Override
	void displayDetails() {
		System.out.println("Indian Space Research Organization");
	}

	@Override
	void displayDetails(String agencyName, long budget) {
		System.out.println("Agency Name and Budget is " + agencyName + " and " + budget);
	}
}