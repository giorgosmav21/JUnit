package dmst.seip.giorgosmav21.unit_testing;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Before;

/**
* MyFileUtilitiesTest tests the readFile method of MyFileUtilities class
* 
* @author  Mavroeidis Giorgos
* @version 1.0
* @since   2018-04-17
*/


public class MyFileUtilitiesTest {
	
	public MyFileUtilitiesTest() {
		}

	MyFileUtilities mfu = new MyFileUtilities();
	int[] array;
	
	//initializing and expected array
	@Before
	public void initializeArray() {
		
	array = new int[] {3, 4, 5, 7, 0, 9, 6, 2, 0, 0, 2, 8, 0, 0, 4, 10};
		
	}
	/*
	 * Test method that checks if the correct array is returned, when
	 * calling the readFile method
	 */
	
	@Test
	public void check_grades() throws Exception{
		Assert.assertArrayEquals(array, mfu.readFile("src/test/resources/grades.txt"));	
	}
	
	//creating a rule
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/*
	 * Test method that checks if the error expected is thrown correctly
	 */
	@Test
	public void check_path() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		mfu.readFile("incorrect_path");
	}
	@Test
	public void no_path() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		mfu.readFile("");
	}
}
