package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.*;

public class MemVarTest {
	private static MemVarTest obj;
	
	@BeforeClass
	public static void setup() {
		obj = new MemVarTest();
	}
	
	@AfterClass
	public static void teardown() {
		obj = null;
	}
	@Test
	public void getMemVarTest() {
		MemberVariable ob = new MemberVariable();
		assertArrayEquals(new Object[] {"Harry Potter", 30 ,2500.3}, ob.getMemVar("Harry Potter", 30 ,2500.3));
	    
		assertNotNull(ob.getMemVar("Harry Potter", 30 ,2500.3));

		assertNull(null, ob.getMemVar(null, 0, 0));
	}
}
	