package com.sapient.execise.tdd.rps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class RPSMoveTest {

	   @Test
	   public void testRocksBeatsScissors() throws Exception {
		   Move move = Move.valueOf("ROCK");
		   boolean isWinner = move.beats(Move.valueOf("SCISSORS"));
		   assertEquals(isWinner, true);
		   
	   }
	   
	   @Test
	   public void testPaperBeatsRocks() throws Exception {
		   Move move = Move.valueOf("PAPER");
		   boolean isWinner = move.beats(Move.valueOf("ROCK"));
		   assertEquals(isWinner, true);
		   
	   }
	   
	   @Test
	   public void testScissorsBeatsPaper() throws Exception {
		   Move move = Move.valueOf("SCISSORS");
		   boolean isWinner = move.beats(Move.valueOf("PAPER"));
		   assertEquals(isWinner, true);
		   
	   }

	   @Test
	   public void testTieInput() throws Exception {
		   Move move = Move.valueOf("PAPER");
		   boolean isWinner = move.beats(Move.valueOf("PAPER"));
		   assertEquals(isWinner, false);
		   
	   }
}
