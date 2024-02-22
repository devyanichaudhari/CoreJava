package com.edubridge.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Program to demonstrate on Simple Test Case using JUnit 5
class SimpleJUnitTestDemo {
	
	// @Test annotation ensures that to perform unit testing on the given block of code

	@Test
	// @DisplayName annotation is used to show a new name of the method
	@DisplayName("Addition Test")
	void test() {
		int a = 10, b = 14;
		System.out.println("Addition is " + (a+b));
	}
}