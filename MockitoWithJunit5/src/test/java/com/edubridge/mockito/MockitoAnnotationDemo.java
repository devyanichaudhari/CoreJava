package com.edubridge.mockito;
/*Program to demonstrate on @Mock Annotation*/
import static org.mockito.Mockito.when;
import java.util.*;
import org.junit.jupiter.api.*;
import org.mockito.*;

class MockitoAnnotationDemo {
	@Mock
	List<String> m1;
	/*If You are not adding this block of the method,
	 * you will get a null pointer exception*/
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setData()
	{
		MockitoAnnotations.initMocks(this);
	}
	@Test
	void accept() 
	{
		when(m1.get(0)).thenReturn("Devyani");
		Assertions.assertEquals(m1.get(0), "Devyani");
	}

}
