/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */

import java.util.*;
public class PsychicGameMore
{
	//Attributes
	
	//a.	Input
	//- p1: an object from Player class.
	private ArrayList<Player> players;
	
	//- originalNumber: a number generated randomly by a computer will be compared to
	// a guessedNumber generated by a player. */
	private int originalNumber;
	
	//Constructors
	public PsychicGameMore()
	{
		//initialize an object of Player class
		players = new ArrayList<Player>();
		//then initialize the originalNumber as 0.
		originalNumber = 0;
		
		Scanner s;
		s = new Scanner(System.in);
		
		System.out.println("Please enter how many players want to play: ");
		
		int numbers = s.nextInt();
		
		for(int i = 0; i < numbers; i++)
		{
			System.out.println("For the player # " + (i + 1));
			Player p;
			p = new Player();
			players.add(p);
		}
		
		
	}
	
	//Methods
	public void play()
	{
		boolean hasWinner;
		hasWinner = false;
		do
		{
			//assign a computer-generated random number from 1 to 6 to the originalNumber
			originalNumber = (int)(Math.random()*6)+1;
		
			//display a message, “ The computer has chosen the number originalNumber”
			System.out.println("The computer has chosen the number " + originalNumber);

			//lets the Player class object pick its number,
			for(int i = 0; i < players.size(); i++)
			{
				Player p;
				p = players.get(i);
				
				p.play();
		
				//then compare these two numbers. If the numbers are matched, then
				if (p.getGuessedNumber() == originalNumber)
				{
					//display a message, “player’s nickname has won.”
					System.out.println(p.getNickName() + " has won.");
					hasWinner = true;
				}
			}
			if (!hasWinner)
			{
					//or “No one has won this time.”
					System.out.println("No one has won this time.");
			}
		} while (!hasWinner);
	}
}