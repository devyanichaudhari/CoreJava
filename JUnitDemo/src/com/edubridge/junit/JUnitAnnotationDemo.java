package com.edubridge.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JUnitAnnotationDemo {

	@Test
	// @Tag is used to tag for filtering tests
	@Tag("TagDemo")
	void test() {
		System.out.println("Test Method");
	}
	
	// @BeforeEach is executed first before each test method.
	@BeforeEach
	void accept() {
		System.out.println("BeforeEach Method");
	}
	
	@Test
	// @Disabled is used to hide or disable the method and it will not be executed
	@Disabled
	void display() {
		System.out.println("New Test Method");
	}
	
	// @AfterEach is executed after each test method.
	@AfterEach
	void print() {
		System.out.println("AfterEach Method");
	}
	
	// @AfterAll is used to execute a statement after all test methods only once at the end.
	@AfterAll
	static void play() {
		System.out.println("AfterAll Method");
	}
	
	// @BeforeAll is used to execute a statement before all test methods only once at the start. 
	@BeforeAll
	static void pause() {
		System.out.println("BeforeAll Method");
	}
}