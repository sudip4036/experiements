package com.sapient.execise.tdd.rps;


import com.sapient.execise.tdd.rps.Move;

/**
 * This class identify the winner of a game based on the move by two player
 * @author sdas14
 *
 */
public class Round {

    private final Move moveByPlayerA;
    private final Move moveByPlayerB;
    
	public Round(Move moveByPlayerA, Move moveByPlayerB) {
		this.moveByPlayerA = moveByPlayerA;
		this.moveByPlayerB = moveByPlayerB;
	}

	/**
	 * This method identifies who is the winner. If both the player choose same entry then it decides Tie.
	 * 
	 * @return Player if there is winner otherwise "Tie"
	 */
	public String getWinner() {
		return moveByPlayerA == moveByPlayerB ? "Tie" : 
			moveByPlayerA.beats(moveByPlayerB) ? "A" : "B";
	}

}
