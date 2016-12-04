package com.sapient.execise.rps.game;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TieScenarioTest {

		@Parameters
		   public static Iterable<Object[]> testData() {
		    	return Arrays.asList(new Object[][] { { Move.ROCK, Move.ROCK },		             
		             { Move.PAPER, Move.PAPER },{ Move.SCISSORS, Move.SCISSORS}, });
		    }
	    @Parameter(0)
	    public Move     moveA;

	    @Parameter(1)
	    public Move     moveB;

	    /**
	     * Test method for
	     * {@link Game#evaluateMoves(Move, Move)}
	     * .
	     */
	   @Test
	   public void testNonTieScenarios() throws Exception {
		   assertEquals(new Round(moveA, moveB).getWinner().isPresent(), 
				   false);
	   }
}
