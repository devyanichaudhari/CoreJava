package com.edubridge.junit;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class JUnitAssumptionDemo {

	@Test
	void test() {
		System.setProperty("Atul", "Atul");
		Assumptions.assumeTrue("Atul".equals(System.getProperty("Athul")));
	}
	
	@Test
	void testOne() {
		System.setProperty("Atul", "Atul");
		Assumptions.assumeFalse("Atul".equals(System.getProperty("Atul")));
	}
	@Test
	void testTwo()
	{
		int x=10,y=10;
		Assumptions.assumingThat(x==y,() -> {
		System.out.println();});
		System.out.println("This method will not skip");
	}
}
