package dmst.seip.giorgosmav21.unit_testing;

/**
* The MyMathTest_ReverseNumber_Parameterized
* class uses parameterized tests to execute reverseNumber 
* method of MyMath class.
* 
* @author Mavroeidis Giorgos
* @version 1.0
* @since   2018-04-14 
*/

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class MyMathTest_ReverseNumber_Parameterized {

	//First parameter's value
	@Parameter (value = 0)
	public int number;
	
	//Second parameter's value
	@Parameter (value = 1)
	public int opposite;
	
	//Creating MyMath object
	MyMath mm = new MyMath();
	
	/*
	 * Collection contains couples, which are the input
	 * and the expected output value.
	 */
	@Parameters 
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {{1, -1}, {-2, 2}, {0, 0}, {Integer.MAX_VALUE, -Integer.MAX_VALUE}};
		
		return Arrays.asList(data);
	}
	
	// Test_ReverseNumber method tests reverseNumber method

	@Test
	public void test_reverseNumber() {
		
		Assert.assertEquals(opposite, mm.reverseNumber(number));
		
	}
	
}
