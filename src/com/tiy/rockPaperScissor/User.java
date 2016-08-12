package com.tiy.rockPaperScissor;

public class User extends Player {
	
	protected String userName = null;
	protected int userChoice = 0;
	
	public User(String userName, int userChoice) {
		this.userName = userName;
		this.userChoice = userChoice;
	}

	public User() {
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserChoice() {
		return userChoice;
	}

	public void setUserChoice(int userChoice) {
		this.userChoice = userChoice;
	}

	@Override
	public void storeChoice() {

		switch(userChoice){
		case 1:
			userChoice = 1;
			System.out.println("User = Paper!");
			break;
		case 2:
			userChoice = 2;
			System.out.println("User = Rock!");
			break;
		case 3:
			userChoice = 3;
			System.out.println("User = Scissors!");
			break;
			default:
				
		}
	}
}
