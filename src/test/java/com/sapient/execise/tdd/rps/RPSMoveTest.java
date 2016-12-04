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
		   Move move = new Move("PAPER");
		   boolean isWinner = move.beats("ROCK");
		   assertEquals(isWinner, true);
		   
	   }
	   
	   @Test
	   public void testScissorsBeatsPaper() throws Exception {
		   Move move = Move.valueOf("SCISSORS");
		   boolean isWinner = move.beats(Move.valueOf("PAPER"));
		   assertEquals(isWinner, true);
		   
	   }
	   
	   @Test
	   public void testInvalidInput() throws Exception {
		   Move move = Move.valueOf("ABC");
		   boolean isWinner = move.beats(Move.valueOf("XYZ"));
		   assertEquals(isWinner, false);
		   
	   }
	   
	   @Test
	   public void testTieInput() throws Exception {
		   Move move = Move.valueOf("PAPER");
		   boolean isWinner = move.beats(Move.valueOf("PAPER"));
		   assertEquals(isWinner, false);
		   
	   }
}
