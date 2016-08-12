package com.tiy.rockPaperScissor;

public class RandomOpponentThree extends Player {

	protected int oppChoice = 0;

	public RandomOpponentThree(int oppChoice) {
		this.oppChoice = oppChoice;
	}

	public RandomOpponentThree() {
	}

	public int getOppChoice() {
		return oppChoice;
	}

	public void setOppChoice(int oppChoice) {
		this.oppChoice = oppChoice;
	}

	@Override
	public void storeChoice() {
		// TODO Auto-generated method stub
		oppChoice = (int) (Math.random() * 2);

		switch (oppChoice) {
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
