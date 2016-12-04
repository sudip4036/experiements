package com.sapient.execise.tdd.rps;

public class Move {
	
	private String move;
	 
	public Move(String move) {
		this.move = move;
	}

	public boolean beats(String anotherMove) {
		switch(move){
		case "ROCK":
            return anotherMove == "SCISSORS";
		}
		return false;
	}

}
