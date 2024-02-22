package com.edubridge.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	// @RepeatedTest annotation is used to repeat a test for a given times
	@RepeatedTest(2)
	void test() {
		for(int i = 1; i <= 3; i++) {
			System.out.println("EduBridge");
		}
	}
}
