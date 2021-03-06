/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */

public class PsychicGame
{
	//Attributes
	
	//a.	Input
	//- p1: an object from Player class.
	private Player p1;
	
	//- originalNumber: a number generated randomly by a computer will be compared to
	// a guessedNumber generated by a player. */
	private int originalNumber;
	
	//Constructors
	public PsychicGame()
	{
		//initialize an object of Player class
		p1 = new Player();
		//then initialize the originalNumber as 0.
		originalNumber = 0;
	}
	
	//Methods
	public void play()
	{
		//assign a computer-generated random number from 1 to 6 to the originalNumber
		originalNumber = (int)(Math.random()*6)+1;
		
		//display a message, “ The computer has chosen the number originalNumber”
		System.out.println("The computer has chosen the number " + originalNumber);

		//lets the Player class object pick its number,
		p1.play();
		
		//then compare these two numbers. If the numbers are matched, then
		if (p1.getGuessedNumber() == originalNumber)
		{
			//display a message, “player’s nickname has won.”
			System.out.println(p1.getNickname() + " has won.");
		}
		//or “No one has won this time.”
		else 
		{
			System.out.println("No one has won this time.");
		}
	}
}