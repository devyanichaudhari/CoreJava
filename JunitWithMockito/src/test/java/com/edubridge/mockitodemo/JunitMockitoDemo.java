package com.edubridge.mockitodemo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitMockitoDemo {
	private Calculator cal;
	
	@BeforeEach
	void show()
	{
		cal=mock(Calculator.class);
		when(cal.addition(1, 1)).thenReturn(2);
		when(cal.subtraction(1, 1)).thenReturn(0);

	}

	@Test
	void testAddition() {
		Assertions.assertEquals(2, cal.addition(1, 1));
		verify(cal).addition(1, 1);
	}

	@Test
	void testSubtraction() {
		Assertions.assertEquals(0, cal.subtraction(1, 1));
		verify(cal).addition(1, 1);
	}
}
