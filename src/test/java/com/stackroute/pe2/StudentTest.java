package com.stackroute.pe2;

	import static org.junit.Assert.*;
	import org.junit.AfterClass;
	import org.junit.BeforeClass;
	import org.junit.Test;
		public class StudentTest {
		private static Student obj;
		@BeforeClass
		public static void  setup() {
			 obj = new Student();

		}
		@AfterClass
		public static void teardown() {
			obj= null;

		}
		
		@Test
		public void testmax() {
			int arr[]= {89,79,82,67,74};
			int  res=obj.max(5,arr);
			assertEquals(89,res);
		}
		@Test
		public void testmin() {
			int arr[]= {82,79,82,67,74,45,79};
			int  res=obj.min(7,arr);
			assertEquals(67,res);
		}
		@Test
		public void testavg() {
			int arr[]= {84,69,82,60,45};
			int res=obj.avg(5,arr);
			assertEquals(68,res);
			//assertEquals(68,res);
		}

}
