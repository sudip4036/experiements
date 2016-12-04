package com.sapient.execise.number.prefect;


/**
 * Class which identifies Perfect Number
 * 
 * @author sdas14
 *
 */
public class PerfectNumber {

	/**
	 * This method identifies if it a number is perfect number
	 * @param number
	 * @return true if number is perfect, otherwise false
	 */
	public boolean isValidPerfectNumber(int number) {
		int sum = 1;
        //Calculate Sum for all its divisors
		for (int divisors = 2; divisors <= number / 2; divisors++) {
            if (number % divisors == 0) {
                sum += divisors;
            }
        }
		//Verify if sum of all its divisors is equal to the number
        if((sum !=1) && (number == sum)) 
			return true;
		
			return false;
				
	}

}
