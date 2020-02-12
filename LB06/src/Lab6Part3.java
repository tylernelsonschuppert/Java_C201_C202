/*
 * Author: Tyler Nelson
 * Date: 10/6/18
 * Program: Lab6Part3.java
 * Find the Pentagonal number of a positive integer
 * Purpose: The program implements a method to find the Pentagonal number of a positive integer.
            The program prompts the user to input a positive integer and outputs the Pentagonal number of the integer.
 
 * You should Implement a method named findPentagonal that takes an integer number as its formal parameter and 
 * returns the pentagonal number. A Pentagonal number is defined as follows,
 *           N*(3*N – 1) / 2 where N > 0.
 */

import java.util.Scanner;

public class Lab6Part3 {
	public static int findPentagonal(int x)
	{
		int pentagonalNumber;
		pentagonalNumber = x*(3*x - 1) / 2;
		return pentagonalNumber;
	}
	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter an integer");
       int x = in.nextInt();

       // invoke the method to find Pentagonal number and output both the integer an its Pentagonal number.
 
	   if (x > 0)
	   {
		   System.out.println("The pentagonal number of the integer " + x + " is " + findPentagonal(x));
	   }
	   else
	   {
		   System.out.println("The integer has to be greater than 0.");
	   }
    }
}