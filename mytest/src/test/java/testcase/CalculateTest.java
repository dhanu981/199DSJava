package testcase;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import testpack.Calculate;

public class CalculateTest {

	Calculate calc;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("@BeforeClass called !!!!!!!!!!");
	}
	
	@Before
	public void setUp()throws java.lang.Exception{
		calc = new Calculate();
		System.out.println("@Before called !!!!!!!!!!!!!!!!!! ");
	}
	
	@Test
	public void testAdd() {
		System.out.println("Add Test : ");
		assertEquals(50, calc.add(25,25));
		
	}
	
	@Test
	public void testMultiply() {
		System.out.println("Multiply Test");
		assertEquals(6, calc.multiply(2,3));
	}
	
	@After
	public  void tearDown() throws java.lang.Exception{
		calc= null;
		System.out.println("@After called............");
	}
	
	@AfterClass
	public static void tearDownAfterClass()
	{
		System.out.println("@AfterClass called............ ");
	}
}
