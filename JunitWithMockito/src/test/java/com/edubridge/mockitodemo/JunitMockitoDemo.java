package com.edubridge.mockitodemo;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
class MockitoWithJunitDemo {
	/*Dependency Injection in the form of Objects*/
	private Calculator cal;
	/*For checking the condition in the main 
	 * Testing Class using mock method*/
	@BeforeEach
	void setDemo()
	{
		cal=mock(Calculator.class);
		when(cal.addition(1, 1)).thenReturn(2);
		when(cal.subtraction(1, 1)).thenReturn(0);
	}
	@Test
	void testaddition() {
		Assertions.assertEquals(2, cal.addition(1, 1));
		verify(cal).addition(1, 1);
	}
	@Test
	void testsubtraction() {
		Assertions.assertEquals(0, cal.subtraction(1, 1));
		verify(cal).subtraction(1, 1);
	}

}
