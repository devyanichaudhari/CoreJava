package com.edubridge.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

// Program to demonstrate on Dynamic Test
class ParameterizedTestDemo {
	@ParameterizedTest
	@ValueSource(strings = {"Atul", "Gaurang", "Aftab"})
	void displayStrings(String word) {
		System.out.println(word);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {55, 56, 58})
	void displayInts(int num) {
		System.out.println(num);
	}
}