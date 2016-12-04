package com.sapient.execise.tdd.rps;

import org.junit.Test;



public class RPSMoveTest {

	   @Test
	   public void testRocksBeatsScissors() throws Exception {
		   Move move = new Move("ROCK");
		   boolean isWinner = move.beats("SCISSORS");
		   assertEquals(isWinner, true);
		   
	   }
}
