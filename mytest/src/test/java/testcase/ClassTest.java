package testcase;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClassTest {
	
	@Test
	public void testAllAssertMethods() {
		String str1 = new String("Dhanashree");
		String str2 = new String("Dhanashree");
		String str3 =null;
		
		String st="Dhanu";
		String st1="Dhanu";
		
		 assertEquals(st,st1);
	    //  assertSame(st, st1);
			//	assertNotSame(str1, str2);
			//	assertTrue(val1<val2);
			//	assertFalse(val1<val2);
		//	assertNotNull(str3);
				//assertArrayEquals(arr1, arr2);

	}
	
	@Test
	public void testAllAraayMethods() {

		String[] arr1={"aa","bb","cc"};
		String[] arr2={"aa","bb","cc"};

		assertArrayEquals(arr1, arr2);

	}
	
	@Test
	public void testAllNumberMethods() {
		
		int val1=15;
		int val2=20;
		assertTrue(val1<val2);
		 //assertFalse(val1<val2);
		

	}
}
