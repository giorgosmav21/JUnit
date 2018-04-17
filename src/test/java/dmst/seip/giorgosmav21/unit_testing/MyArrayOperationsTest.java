package dmst.seip.giorgosmav21.unit_testing;
/**
* MyArrayOperationsTest the gradesFrequencies method of MyArrayOperations class
* 
* @author  Mavroeidis Giorgos
* @version 1.0
* @since   2018-04-17
*/

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class MyArrayOperationsTest {
	
	public MyArrayOperationsTest() {
		
	}
	
	MyArrayOperations mao = new MyArrayOperations();
	/*
	 * Test method that checks if the correct array of frequencies is 
	 * returned, by mocking the MyFileUtilities class
	 */
	@Test
	public void test_frequencies_Mocking() throws Exception {
		//mock the MyFileUtilities dependency
		MyFileUtilities mfu = mock(MyFileUtilities.class);
		
		//setting the array
		int[] array = {3,4,5,7,0,9,6,2,0,0,2,8,0,0,4,10};
		
		when(mfu.readFile("src/test/resources/grades.txt")).thenReturn(array);
		
		Assert.assertArrayEquals(array, mao.gradesFrequencies("src/test/recourses/grades", mfu));
	}
}
