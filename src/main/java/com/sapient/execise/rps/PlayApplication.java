package com.sapient.execise.rps;

import java.util.Scanner;

import com.sapient.execise.rps.game.Game;
import com.sapient.execise.rps.game.Result;


public class PlayApplication {
	
	private static Scanner reader;
	
    public static void main(String[] args) {
    	System.out.println("Possible Inputs");
    	System.out.println("0.ROCK	1.PAPER 2. SCISSORS");
    	
    	reader = new Scanner(System.in);
    	System.out.println("Enter Player A's Input: ");
    	int aPlayerInput = reader.nextInt();
   
    	System.out.println("Enter Player B's Input: ");
    	int bPlayerInput = reader.nextInt();
    	
    	
    	Game game = new Game();
    	Result result = game.play(aPlayerInput, bPlayerInput);
    	result.displayResults();
    	
    }


}
