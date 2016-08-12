package com.tiy.Roshambo;

import java.util.Scanner;

import com.tiy.rockPaperScissor.BasicOpponent;
import com.tiy.rockPaperScissor.KeyboardInputOpponent;
import com.tiy.rockPaperScissor.RandomOpponentThree;
import com.tiy.rockPaperScissor.RandomOpponentTwo;
import com.tiy.rockPaperScissor.RandomThrowOpponent;
import com.tiy.rockPaperScissor.User;

public class Roshambo {

	static Scanner keyboard = new Scanner(System.in);

	static String userInput = null;

	static User currentPlayer = new User();

	static RandomThrowOpponent ranOpp = new RandomThrowOpponent();
	static RandomOpponentTwo ranOpp2 = new RandomOpponentTwo();
	static RandomOpponentThree ranOpp3 = new RandomOpponentThree();
	static BasicOpponent baseOpp = new BasicOpponent();
	static KeyboardInputOpponent keyInputOpp = new KeyboardInputOpponent();

	static int didIWin = currentPlayer.getUserChoice();
	
	static boolean playAgain = false;

	public static void main(String[] args) {

		gamePlayer();

//		playGame();
//		getOpponent();
//		seeWhoWon();
		
	}

	public static void playGame() {

		System.out.println("What is your name? ");

		userInput = keyboard.nextLine();

		currentPlayer.setUserName(userInput);

		do{
			
			System.out.println("Enter your throw choice:\n" + "1 = Paper, 2 = rock or 3 = scissors?");

			userInput = keyboard.nextLine();
		
		}while(!((Integer.parseInt(userInput) > 0) && (Integer.parseInt(userInput) < 4)));
		
		currentPlayer.setUserChoice(Integer.parseInt(userInput));

		currentPlayer.storeChoice();

		didIWin = currentPlayer.getUserChoice();
	}

	public static void getOpponent() {

		do{
		
			System.out.println("Which type of opponent do you want to play against?\n" + "Type: Basic, Random1, Random2, or Random3");

			userInput = keyboard.nextLine();
		
		}while(!((userInput.equalsIgnoreCase("basic")) 
				|| (userInput.equalsIgnoreCase("random1")) 
				|| (userInput.equalsIgnoreCase("random2")) 
				|| (userInput.equalsIgnoreCase("random3"))));
		
		if (userInput.equalsIgnoreCase("basic")) {
			baseOpp.storeChoice();
		} else if (userInput.equalsIgnoreCase("random1")) {
			ranOpp.storeChoice();
		} else if (userInput.equalsIgnoreCase("input")) {
			keyInputOpp.storeChoice();
		}else if (userInput.equalsIgnoreCase("random2")) {
			ranOpp2.storeChoice();
		}else if (userInput.equalsIgnoreCase("random3")) {
			ranOpp3.storeChoice();
		}

	}

	public static void seeWhoWon() {

		if ((didIWin == baseOpp.getOppChoice()) || (didIWin == ranOpp.getOppChoice()) 
				|| (didIWin == ranOpp2.getOppChoice()) || (didIWin == ranOpp3.getOppChoice())) {

			System.out.println("You both tied!!!");

		} else if (((didIWin == 1) && (baseOpp.getOppChoice() == 3)) 
				|| ((didIWin == 2) && (baseOpp.getOppChoice() == 1))
				|| ((didIWin == 1) && (ranOpp.getOppChoice() == 3))
				|| ((didIWin == 2) && (ranOpp.getOppChoice() == 1))
				|| ((didIWin == 3) && (ranOpp.getOppChoice() == 2))
				|| ((didIWin == 1) && (ranOpp2.getOppChoice() == 3))
				|| ((didIWin == 2) && (ranOpp2.getOppChoice() == 1))
				|| ((didIWin == 3) && (ranOpp2.getOppChoice() == 2))
				|| ((didIWin == 1) && (ranOpp3.getOppChoice() == 3))
				|| ((didIWin == 2) && (ranOpp3.getOppChoice() == 1))
				|| ((didIWin == 3) && (ranOpp3.getOppChoice() == 2))) 
		{

			System.out.println(currentPlayer.getUserName() + " Loses!!!");
		
		} else if (((didIWin == 3) && (baseOpp.getOppChoice() == 1)) 
				|| ((didIWin == 2) && (ranOpp.getOppChoice() == 3))
				|| ((didIWin == 3) && (ranOpp.getOppChoice() == 1))
				|| ((didIWin == 1) && (ranOpp.getOppChoice() == 2))
				|| ((didIWin == 2) && (ranOpp2.getOppChoice() == 3))
				|| ((didIWin == 3) && (ranOpp2.getOppChoice() == 1))
				|| ((didIWin == 1) && (ranOpp2.getOppChoice() == 2))
				|| ((didIWin == 2) && (ranOpp3.getOppChoice() == 3))
				|| ((didIWin == 3) && (ranOpp3.getOppChoice() == 1))
				|| ((didIWin == 1) && (ranOpp3.getOppChoice() == 2))) 
		{

			System.out.println(currentPlayer.getUserName() + " Wins!!!");
		}

	}
	
	public static void gamePlayer() {
		
		do{
			
			playGame();
			getOpponent();
			seeWhoWon();
			
			System.out.println("Enter y for yes and n for no:\n" + "Do you want to play again?");
			userInput = keyboard.nextLine();
			
			if (userInput.equalsIgnoreCase("y")){
				playAgain = true;
			}else if (userInput.equalsIgnoreCase("n"))
			{
				playAgain = false;
			}
			
		}while(playAgain == true);
		
	}

}
