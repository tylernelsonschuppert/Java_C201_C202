/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
/*
3.	Driver class
This is the driver class which runs this application by the main method. 
However, at the very beginning, please display a header mentioning whose psychic game is by standard output.
*/
import java.util.Scanner;
public class Driver
{
		//Attributes
		
		//Constructors
		
		//Methods
	public static void main(String[] args)
	{
		System.out.println("===================================================");
		System.out.println("Psychic Game Choices");
		System.out.println("1: Psychic choices for 1 player.");
		System.out.println("2: Psychic choices for 2 players.");
		System.out.println("3: Psychic choices for 3 players.");
		System.out.println("4: Psychic choices for any number of players.");
		System.out.println("---------------------------------------------------");
		System.out.println("Please type in your choice (1,2,3,4)");
	
		Scanner s;
		s = new Scanner(System.in);
		int choice = s.nextInt();
		
		System.out.println("===================================================");
		
		switch (choice)
		{
			case 1: 
				PsychicGame z1;
				z1 = new PsychicGame();
				z1.play();
				break;
			case 2: 
				PsychicGame2 z2;
				z2 = new PsychicGame2();
				z2.play();
				break;
			case 3:
				PsychicGame3 z3;
				z3 = new PsychicGame3();
				z3.play();
				break;
			case 4:
				PsychicGameMore z4;
				z4 = new PsychicGameMore();
				z4.play();
				break;
		}
	}
/*		System.out.println("===================================================");
		System.out.println("Chris Lululala's Psychic Game for One Player");
		System.out.println("---------------------------------------------------");
		PsychicGame psychicGame;
		psychicGame = new PsychicGame();
		psychicGame.play();		*/
}