package com.edubridge.abstraction;

import java.util.Scanner;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		// we cannot create the object for abstract class.
		// GovernmentAgency ga = new GovernmentAgency();
		ISRO i = new ISRO();
		Scanner s = new Scanner(System.in);
		
		System.out.println(i.display());
		i.displayDetails();
		i.setAgencyName("ISRO");
		i.setBudget(56789);
		System.out.println("Enter the Input: ");
		i.displayDetails(s.next(), s.nextLong());
	}

}
