package dmst.seip.giorgosmav21.unit_testing;

/**
* MyMath contains divide method, which divides two integers
* andreverseNumber method, which finds an integer's opposite.
* 
* @author  Mavroeidis Giorgos
* @version 1.0
* @since   2018-04-17 
*/

public class MyMath {
	
	public MyMath() {
	}
	
	/** 
	 * Receives two numbers and returns their quotient 
	 * @param num the integer numerator
	 * @param denom the integer denominator
	 * @exception IllegalArgumentException when denominator input is 0
	 * @return
	 * A double quotient of these numerator and denominator
	 */
	public double divide(int num, int denom) {
		// declaration of quotient
		double quotient;
		
		//handle the IllegalArgumentException if denom is equal to 0
		if (denom == 0) {
			throw new IllegalArgumentException("denominator cannot be zero");
		}
		//count the quotient of the two numbers
		else {
			quotient = num/denom;
			
		}
			
		return quotient;
		
	}
	
	/** 
	 * Receives a number and returns its opposite
	 * @param number the input number
	 * @return
	 * The opposite number of the input number
	 */
	
	public int reverseNumber(int number) {
		
		if(number == 0) {
			
			return 0;
			
		} else {
			
			return -number;
		}
	}
}
