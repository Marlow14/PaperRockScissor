package com.tiy.rockPaperScissor;

public class RandomThrowOpponent extends Player{
	
	protected int oppChoice = 0;
	
	public RandomThrowOpponent(int oppChoice) {
		this.oppChoice = oppChoice;
	}

	public RandomThrowOpponent() {
	}

	public int getOppChoice() {
		return oppChoice;
	}

	public void setOppChoice(int oppChoice) {
		this.oppChoice = oppChoice;
	}

	@Override
	public void storeChoice() {

		oppChoice = (int)(Math.random()* 3);
		
		switch(oppChoice){
		case 1:
			oppChoice = 1;
			System.out.println("Opponent = Paper!");
			break;
		case 2:
			oppChoice = 2;
			System.out.println("Opponent = Rock!");
			break;
		case 3:
			oppChoice = 3;
			System.out.println("Opponent = Scissors!");
			break;
			default:
				
		}
		
	}

}
