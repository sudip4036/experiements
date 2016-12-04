package com.sapient.execise.tdd.rps;

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
	 * 
	 * @param another
	 * @return
	 */
	public boolean beats(Move anotherMove) {
		switch(this){
			case ROCK:
				return anotherMove == SCISSORS;
			case PAPER:
				return anotherMove == ROCK;
			case SCISSORS:
				return anotherMove == PAPER;
		}
		return false;
	}

}
