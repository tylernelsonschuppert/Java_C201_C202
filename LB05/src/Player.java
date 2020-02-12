/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
import java.util.Scanner;
import java.util.Random;
public class Player
{
	//Attributes
	private String nickName;
	private int guessedNumber;
	
	//Constructors
	public void Player()
	{
		//asks a user player’s nickName using standard input
		Scanner input = new Scanner(System.in);
		System.out.println("Please type in your nick name of one word for the game: ");
		nickName = input.next();
		
		//and initialize guessedNumber by 0
		guessedNumber = 0;
	}
	
	//Methods
	public String getNickname()
	{
		//returns nickname.
		return nickName;
	}
	
	public int getGuessedNumber()
	{
		//returns guessedNumber.
		return guessedNumber;
	}
	
	public void play()
	{
		// get a computer-generated random number among 1 through 6, then
		guessedNumber = (int)(Math.random()*6)+1;
		
		// display the message, “nickname has picked the number guessedNumber” using standard output.
		System.out.println(nickName + " has picked the number " + guessedNumber);
	}
}