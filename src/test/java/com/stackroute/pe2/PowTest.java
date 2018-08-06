package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.pe2.NumPow;

public class PowTest {
	private static NumPow p;

	@BeforeClass
	public static void setup()
	{
		p=new NumPow();
	}
	@AfterClass
	public static void teardown()
	{
		p=null;
	}
	
	//@SuppressWarnings("deprecation")

	@Test
	public void test1()
	{
		boolean r=p.checkpow(64);
		assertEquals(true,r);
	}
	
	@Test
	public void test2()
	{
		boolean r=p.checkpow(35);
		assertEquals(false,r);
	}
	
	//@Test
	//public void test() {
		//fail("Not yet implemented");
	//}

}

