package com.edubridge.interfacedemo.methodreference;

// Program to demonstrate on Reference to a Instance Method
public class LearnerImplementation {
	
	public void learnMockito() {
		System.out.println("Mockito with JUnit 5");
	}

	public static void main(String[] args) {
		
		// Reference to a Instance Method
		LearnerImplementation li = new LearnerImplementation();
		Learner l = li::learnMockito;
		l.learn();
	}
}