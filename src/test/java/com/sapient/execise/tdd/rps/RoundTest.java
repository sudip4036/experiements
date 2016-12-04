package com.sapient.execise.tdd.rps;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


/**
 * This test class helps to identify the winner of a game based on the move
 * @author sdas14
 *
 */

@RunWith(Parameterized.class)
public class RoundTest {

	
	   @Parameters
	   public static Iterable<Object[]> testData() {
	    	return Arrays.asList(new Object[][] {
	             { Move.ROCK, Move.SCISSORS, "A" },{ Move.PAPER, Move.ROCK, "A" }, { Move.SCISSORS, Move.PAPER, "A" },
	             { Move.ROCK, Move.PAPER, "B"},{ Move.PAPER, Move.SCISSORS, "B" },{ Move.SCISSORS, Move.ROCK, "B"},});
	   }
	   
	   @Parameter(0)
	    public Move     moveA;

	    @Parameter(1)
	    public Move     moveB;

	    @Parameter(2)
	    public String   expectedResult;
	    	
	   @Test
	   public void testGetWinner() throws Exception {
		   Round round = new Round(moveA, moveB);
		   String player = round.getWinner();
		   assertEquals(player, expectedResult);
	   }


}
