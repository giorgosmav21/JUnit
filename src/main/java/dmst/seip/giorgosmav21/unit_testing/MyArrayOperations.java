package dmst.seip.giorgosmav21.unit_testing;
/**
* MyArrayOperations contains the gradesFrequencies method, which returns the frequencies of
* a given array, using the readFile method of MyFileUtilities class
* @author  Mavroeidis Giorgos
* @version 1.0
* @since   2018-04-17 
*/
public class MyArrayOperations {
	
	public MyArrayOperations (){	
	}

/** 
 * Receives a file's path and calculates the frequency of the grade's
 * appearance on the file. The grades are passed in an int[] array from the 
 * readFile method of MyFileUtilities class.
 * @param filepath A string of the file's path
 * @param utils A MyFileUtilities object in order to call readFile method.
 * @exception Exception when the file does not exist
 * @return
 * An array with the frequencies of each grade that exist in the file
 */
	public int[] gradesFrequencies(String filepath, MyFileUtilities utils) throws Exception {
		//creating an array frequencies
		int[] frequencies = new int[11];
		//getting the grades from the readFile method
		int[] grades = utils.readFile(filepath);
		//loop in order to get the frequency for each grade		
	    for(int s : grades) {
	    	for (int j=0; j < grades.length; j++) {
	        	if (s == j) {
	        	frequencies[j]++;
	        	}
			 }
		}
        //return the frequencies
		return frequencies;
	}
}
