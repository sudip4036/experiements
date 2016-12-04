package com.sapient.execise.tdd.rps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class RPSMoveTest {

	   @Test
	   public void testRocksBeatsScissors() throws Exception {
		   Move move = new Move("ROCK");
		   boolean isWinner = move.beats("SCISSORS");
		   assertEquals(isWinner, true);
		   
	   }
	   
	   @Test
	   public void testPaperBeatsRocks() throws Exception {
		   Move move = new Move("PAPER");
		   boolean isWinner = move.beats("ROCK");
		   assertEquals(isWinner, true);
		   
	   }
	   
	   @Test
	   public void testScissorsBeatsPaper() throws Exception {
		   Move move = new Move("SCISSORS");
		   boolean isWinner = move.beats("PAPER");
		   assertEquals(isWinner, true);
		   
	   }
}
