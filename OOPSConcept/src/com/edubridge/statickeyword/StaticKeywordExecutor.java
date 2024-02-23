package com.edubridge.statickeyword;

class LearnerDetails{
	static String name;
	static int rollno;
	
	// 2. institute name for all the learners are common so, 
	// we can declare instituteName as static
	static String instituteName = "EduBridge";
	
	// 3. if any  method is non-static and we want to access inside main method,
	// then make that method as static
	static public void print() {
		System.out.println(name + " " + rollno + " " + instituteName);
	}
}

public class StaticKeywordExecutor {

	public static void main(String[] args) {
		// LearnerDetails l = new LearnerDetails("Atul", 101, instituteName);
		
		LearnerDetails.rollno = 101;
		LearnerDetails.name = "Atul";
		LearnerDetails.print();
		
		LearnerDetails.rollno = 102;
		LearnerDetails.name = "Shreyash";
		LearnerDetails.print();
	}

}
