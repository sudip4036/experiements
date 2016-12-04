package com.sapient.execise.number.prefect.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.sapient.execise.number.prefect.PerfectNumber;
import com.sapient.execise.rps.game.Move;

@RunWith(Parameterized.class)
public class PerfectNumberTest {
	
	@Parameters
	   public static Iterable<Object[]> testData() {
	    	return Arrays.asList(new Object[][] {
	             {6}, {28}, {496}, {8128}, });
	    }
	   
 @Parameter(0)
 public int     number;
 
	@Test
	public void testPerfectNumber() throws Exception {
		PerfectNumber perfectNumber = new PerfectNumber();
		boolean isPerfect = perfectNumber.isValidPerfectNumber(number);
		assertEquals(isPerfect,true);
	}
	
	@Test
	public void testNotPerfectNumber() throws Exception {
		PerfectNumber perfectNumber = new PerfectNumber();
		boolean isPerfect = perfectNumber.isValidPerfectNumber(7);
		assertEquals(isPerfect,false);
	}

}
