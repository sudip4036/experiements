package com.sapient.execise.rps.game;

/**
 * This class defines moves of the Game and identify if one player's moove beats another player's move
 * 
 * @author sdas14
 *
 */
public enum Move {

	ROCK, PAPER, SCISSORS;
	
	/**
	 * This function define a Move  beats another Move
	 * @param another
	 * @return
	 */
	boolean beats(Move another) {
        switch (this) {
        case ROCK:
            return another == SCISSORS;
        case PAPER:
            return another == ROCK;
        case SCISSORS:
            return another == PAPER;
        default:
            throw new IllegalStateException();
        }
    }

}
