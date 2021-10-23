package testcase;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import testpack.Calculate;

@RunWith(Parameterized.class)
public class MyParamTest {
	private int x;
	private int y;
	private int result;
	Calculate calc;
	public MyParamTest(int x, int y, int result) {
		super();
		this.x = x;
		this.y = y;
		this.result = result;
		
	}
	
	@Before
	public void setUp()throws java.lang.Exception{
		calc = new Calculate();
		System.out.println("@ Before......");

	}
	
	@Parameters
	public static Collection dataResult() {
		return Arrays.asList(new Object [] [] {{15,15,30},{5,15,20},{50,5,55}});
	}
	
	@Test
	public void testSum()
	{
		System.out.println("Sum :" + result);
		assertEquals(result, calc.sum(x,y));
	}
	
	
}
