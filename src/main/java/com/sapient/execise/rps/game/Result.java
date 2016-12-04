package com.sapient.execise.rps.game;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.execise.rps.player.Player;

/**
 * This class holds the Result of one Round
 * @author sdas14
 *
 */
public class Result {
	
	private Round moveByPlayers;
	private Optional<Player> winner;
	
	
	private static final Logger logger = LoggerFactory.getLogger(Result.class);
	
	
	Result(Round moveByPlayers, Optional<Player> winner ){
		this.moveByPlayers = moveByPlayers;
		this.winner = winner;
	}
	
	/**
	 * Display's result of one round
	 */
	public void displayResults(){
		logger.info("Player A's move : {}, Player  B's move : {} ", moveByPlayers.getMoveByA(), moveByPlayers.getMoveByB());
		if(winner.isPresent()){
			logger.info("Winner is Player {}", winner.get().name());
		}else{
			logger.info("Its a Tie!!!");
		}
		
	}
	

}
