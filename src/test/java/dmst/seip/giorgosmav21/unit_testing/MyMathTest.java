package dmst.seip.giorgosmav21.unit_testing;

import org.junit.Test;
import org.junit.Assert;
/**
* MyMathTest class contains the tests for the divide method of
* MyMath class.
* 
* @author  Mavroeidis Giorgos
* @version 1.0
* @since   2018-04-17
*/

public class MyMathTest {
	
	public MyMathTest() {
	}
	
	MyMath mm = new MyMath();
	
	/*
	 * Test method that checks if a division between two
	 * positives works correctly
	 */
	@Test
	public void check_posotive_result() {
		Assert.assertEquals(2, mm.divide(10, 5), 0.1);
	}
	
	/*
	 * Test method that checks if a division between a negative
	 * and a positive number works correctly
	 */
	
	@Test
	public void check_negative_result() {
		Assert.assertEquals(-2, mm.divide(10, -5), 0.1);
	}
	
	/*
	 * Test method that checks if a division between two negative
	 * numbers works correctly
	 */
	
	@Test
	public void check_positive_result_with_negatives() {
		Assert.assertEquals(2, mm.divide(-10, -5), 0.1);
	}
	
	/*
	 * Test method that checks if a division with 0 as numerator
	 * works correctly
	 */
	@Test
	public void check_result_zero_numerator() {
		Assert.assertEquals(0, mm.divide(0, 5), 0.1);
	}
	
	/*
	 * Test method that checks if the error expected is thrown correctly
	 */
	@Test(expected = IllegalArgumentException.class)
	public void check_zero_denominator() {
		mm.divide(5, 0);
	}
	
	
}
