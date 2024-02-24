package com.edubridge.assessment;

public class BankB implements Bank{
	double rateOfInterest;
	@Override
	public double getROI(double i) {
		this.rateOfInterest = i;
		return i;
	}

}
