package com.sapient.execise.rps.game;

import java.util.Optional;

import com.sapient.execise.rps.player.Player;


/**
 * A Game of rock-scissor-paper. As of now, it has been developed as per one round game.
 * 
 * It can be extended to support Multiple rounds
 * 
 * @author sdas14
 *
 */
public class Game {
	
	/**
	 * This method take the player's input and play one round
	 * 
	 * @param aPlayerInput, Player A's Choice
	 * @param bPlayerInput, Player B's Choice
	 * @return result
	 */
	public Result play(int aPlayerInput, int bPlayerInput) { 
		
		Move moveByA = Move.values()[aPlayerInput];
		Move moveByB = Move.values()[bPlayerInput];
        
		Round round = new Round(moveByA, moveByB);
    	Optional<Player> winner = round.getWinner();
    
    	Result result = new Result(round, winner); 	
    	return result;
    }


}