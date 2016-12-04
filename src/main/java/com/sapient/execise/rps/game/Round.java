package com.sapient.execise.rps.game;

import java.util.Optional;

import com.sapient.execise.rps.player.Player;

/**
 * This class decides winner of one round
 * @author sdas14
 *
 */
final class Round {

    private final Move moveByA;
    private final Move moveByB;


	public Move getMoveByA() {
		return moveByA;
	}

	public Move getMoveByB() {
		return moveByB;
	}

	Round(Move moveByA, Move moveByB) {	
        this.moveByA = moveByA;
        this.moveByB = moveByB;
    }
	
	/**
	 * This method identifies who is the winner, in case both the player choose same entry then it decides Tie.
	 * 
	 * @return Player if there is winner otherwise empty to indicate it is a tie
	 */
    public Optional<Player> getWinner() {
        return moveByA == moveByB ? Optional.empty() :
            Optional.of(moveByA.beats(moveByB) ? Player.A : Player.B);
    }
}
