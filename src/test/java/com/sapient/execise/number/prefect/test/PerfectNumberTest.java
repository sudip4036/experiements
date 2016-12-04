package com.sapient.execise.number.prefect.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sapient.execise.number.prefect.PerfectNumber;

public class PerfectNumberTest {
	
	@Test
	public void testPerfectNumber() throws Exception {
		PerfectNumber perfectNumber = new PerfectNumber();
		boolean isPerfect = perfectNumber.isValidPerfectNumber(6);
		assertEquals(isPerfect,true);
	}
	
	@Test
	public void testNotPerfectNumber() throws Exception {
		PerfectNumber perfectNumber = new PerfectNumber();
		boolean isPerfect = perfectNumber.isValidPerfectNumber(7);
		assertEquals(isPerfect,false);
	}

}
