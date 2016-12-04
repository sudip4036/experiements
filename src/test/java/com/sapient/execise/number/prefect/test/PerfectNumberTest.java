package com.sapient.execise.number.prefect.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.sapient.execise.number.prefect.PerfectNumber;

@RunWith(Parameterized.class)
public class PerfectNumberTest {
	
	@Parameters
	   public static Iterable<Object[]> testData() {
	    	return Arrays.asList(new Object[][] {
	             {6,true}, {28,true}, {496,true}, {8128,true},
	             {1,false}, {29,false}, {42,false}, {8000,false},{365,false}, });
	    }
	   

 @Parameter(0)
 public int     number;
 @Parameter(1)
 public boolean     expectedResult;
 
	@Test
	public void testPerfectNumber() throws Exception {
		PerfectNumber perfectNumber = new PerfectNumber();
		boolean isPerfect = perfectNumber.isValidPerfectNumber(number);
		assertEquals(isPerfect,expectedResult);
	}
	
}
