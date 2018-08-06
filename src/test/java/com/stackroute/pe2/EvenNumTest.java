package com.stackroute.pe2;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class EvenNumTest {
	private static EvenNum obj;
	@BeforeClass
	public static  void setup() {
		 obj = new EvenNum();
	}
	@AfterClass
	public static void teardown() {
		obj= null;

	}
	@Test
	public void testeven() {
		boolean res=obj.isEven(10);
		assertEquals("true",res);
	}
	@Test
	public void testevenFailure() {
		boolean res=obj.isEven(10);
		assertNotEquals("false",res);
	}
	@Test
	public void testodd() {
		boolean res=obj.isEven(7);
		assertEquals("false",res);
	}

		
}
