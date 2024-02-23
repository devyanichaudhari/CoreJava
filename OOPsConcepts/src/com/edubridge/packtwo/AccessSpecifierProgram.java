package com.edubridge.packtwo;

//import com.edubridge.packone.AccessSpecifierDemo;
import com.edubridge.packone.*;

public class AccessSpecifierProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessSpecifierDemo obj = new AccessSpecifierDemo();
		
		// atm_pinNo is private and we can't access into another class
		// obj.atm_pinNo = 1234;
		
		
		// displayPinNo() is private and we can't access into another class
		// obj.displayPinNo();
		
		obj.emailId = "atul@gmail.com";
		obj.displayEmailId();
		
		// percentage is a default and we can access only inside the same package
		// obj.percentage = 98.06f;
		// obj.displayPercentage();
	}

}
