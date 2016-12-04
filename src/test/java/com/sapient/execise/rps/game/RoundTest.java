package com.sapient.execise.rps.game;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.sapient.execise.rps.player.Player;

import junit.framework.Assert;


@RunWith(Parameterized.class)
public class RoundTest {

	@Parameters
	   public static Iterable<Object[]> testData() {
	    	return Arrays.asList(new Object[][] {
	             { Move.ROCK, Move.PAPER, Player.B }, { Move.ROCK, Move.SCISSORS, Player.A },
	             { Move.PAPER, Move.ROCK, Player.A },{ Move.PAPER, Move.SCISSORS, Player.B }, 
	             { Move.SCISSORS, Move.ROCK, Player.B }, { Move.SCISSORS, Move.PAPER, Player.A }, });
	    }
    @Parameter(0)
    public Move     moveA;

    @Parameter(1)
    public Move     moveB;

    @Parameter(2)
    public Player   expectedResult;

    /**
     * Test method for
     * {@link Game#evaluateMoves(Move, Move)}
     * .
     */
   @Test
   public void testRoundObject() throws Exception {
	   Round round = new Round(moveA, moveB);
	   Assert.assertNotNull(round);
   }
    /**
     * Test method for
     * {@link Game#evaluateMoves(Move, Move)}
     * .
     */
   @Test
   public void testNonTieScenarios() throws Exception {
	   assertEquals(new Round(moveA, moveB).getWinner().get(), 
			   expectedResult);
   }
   
}

