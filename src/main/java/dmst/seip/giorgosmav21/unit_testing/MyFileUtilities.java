package dmst.seip.giorgosmav21.unit_testing;
/**
* MyFileUtilities contains the readFile method, which returns an array of grades
* @author  Mavroeidis Giorgos
* @version 1.0
* @since   2018-04-17 
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFileUtilities{
	
	
	public MyFileUtilities() {

/** 
 * Receives a file with grades and returns an array of these grades.
 * @param filepath A string of the file's path
 * @exception IllegalArgumentException when the file does not exist
 * @return
 * An array with the grades that exist in the file
 */}
	
	public int[] readFile(String filepath) {
		
		try {
		//creating filereader and buffereader objects
		FileReader fr = new FileReader(filepath);
		BufferedReader br = new BufferedReader(fr);
		//creating a list with the grades
		List<Integer> grades = new ArrayList<Integer>();
		String nextline;
		
		//reading the grades from the text.
		while ((nextline = br.readLine()) != null) {
			grades.add(Integer.parseInt(nextline.replaceAll("\\s+","")));
			
		}
		// converting the List to an array
		int[] final_grades = new int[grades.size()];
		
		for (int i = 0; i < grades.size(); i++) {
			final_grades[i] = grades.get(i);
		}
		
		fr.close();
		br.close();
		
		
		//return the int[] array
		return final_grades;
		
		//handle the IllegalArgumentException 
		} catch (IOException e) {
			throw new IllegalArgumentException("Error while reading the file");
		}
		
		
	}
}