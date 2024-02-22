package com.edubridge.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertionDemo {

	@Test
	@DisplayName("Assert True")
	void AssertTrue() {
		// If expression is true then it passed else fails
		assertTrue(13>=4);
	}
	
	@Test
	@DisplayName("Assert False")
	void AssertFalse() {
		// If expression is false then it passed else fails
		assertFalse(13<=4);
	}
	
	@Test
	@DisplayName("Assert Equals")
	void AssertEquals() {
		// If expected and actual value are same or equal then it will pass else fails
		assertEquals(5,5);
	}
	
	@Test
	@DisplayName("Assert Not Equals")
	void AssertNotEquals() {
		// If expected and actual value are not same or not equal then it will pass else fails
		assertNotEquals(12,5);
	}
	
	@Test
	@DisplayName("Assert Not Null")
	void AssertNotNull() {
		// If it is not null then passed else fails 
		assertNotNull(55);
	}
	
	@Test
	@DisplayName("Assert Null")
	void AssertNull() {
		// If it is null then passed else fails
		assertNull(null);
	}

}
