package com.sapient.execise.tdd.rps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This test class helps to identify the winner of a game based on the move
 * @author sdas14
 *
 */
public class RoundTest {
	
	   @Test
	   public void testPlayerAWinner() throws Exception {
		   Move moveByPlayerA = Move.SCISSORS;
		   Move moveByPlayerB = Move.PAPER;
		   Round round = new Round(moveByPlayerA, moveByPlayerB);
		   String player = round.getWinner();
		   assertEquals(player, "A");
	   }

}
