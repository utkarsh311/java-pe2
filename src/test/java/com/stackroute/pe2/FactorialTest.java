package com.stackroute.pe2;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class FactorialTest {
	private static Factorial obj;
	@BeforeClass
	public void setup() {
		 obj = new Factorial();
	}
	@AfterClass
	public static void teardown() {
		obj= null;

	}
	@Test
	public void testfact() {
		int res=obj.fact(8);
		assertEquals(40320,res);
	}
	@Test
	public void tesfactfailure() {
		int res=obj.fact(2);
		assertNotEquals(2,res);
	}
}
