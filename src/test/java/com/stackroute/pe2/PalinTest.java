package com.stackroute.pe2;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class PalinTest {
	private static Palin p;

	@BeforeClass
	public static void setup()
	{
		p=new Palin();
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
    	int result=p.compute(23232);
    	assertEquals(23232,result);
	}
	public void test2() 
	{
    	int result=p.compute(1441);
    	assertEquals(1441,result);
    }
	public void test3() 
	{
		Palin p=new Palin();
    	int result=p.compute(238);
    	assertEquals(832,result);
    }
	public void test() {
		fail("Not yet implemented");
	}

}


