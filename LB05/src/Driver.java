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
public class Driver
{
	public static void main(String[] args)
	{
		System.out.println("===================================================");
		System.out.println("Chris Lululala's Psychic Game for One Player");
		System.out.println("---------------------------------------------------");
		PsychicGame psychicGame;
		psychicGame = new PsychicGame();
		psychicGame.play();		
	}
}