package com.tiy.rockPaperScissor;

public class BasicOpponent extends Player{

	protected int oppChoice = 0;
	
	
	public BasicOpponent(int oppChoice) {
		this.oppChoice = oppChoice;
	}


	public BasicOpponent() {
	}


	public int getOppChoice() {
		return oppChoice;
	}


	public void setOppChoice(int oppChoice) {
		this.oppChoice = oppChoice;
	}


	@Override
	public void storeChoice() {

		oppChoice = 1;
		System.out.println("Opponent = Paper!");
		
	}
	
	

	
	
}
