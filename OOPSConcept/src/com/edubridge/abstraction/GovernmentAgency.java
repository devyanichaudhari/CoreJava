package com.edubridge.abstraction;

// if any class have atleast ine abstract method then that class must be declared abstract

public abstract class GovernmentAgency {
	private String agencyName;
	private long budget;
	
	public String getAgencyName() {
		return agencyName;
	}
	
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	
	public long getBudget() {
		return budget;
	}
	
	public void setBudget(long budget) {
		this.budget = budget;
	}
	
	// abstract method
	abstract void displayDetails();
	abstract void displayDetails(String agencyName, long budget);
	
	// concrete method
	String display() {
		return "Concrete Method";
	}
}
