/*
 * Author: Tyler Nelson
 * Date:
 * Program: Lab6Part1.java
 * Computing the cubed value of a given number.
 * Purpose: The program prompts the user to input a number, and outputs
 * the cubed value of the number. Then program computes and outputs the sum of following 
 * sequence, 1 + 8 + 27 + 64 + 125 + 216 + 343.
 */

import java.util.Scanner;

public class Lab6Part1 {

    /**
     * Returns an integer whose value is a^3 (a cubed).
     * @param any integer to be cubed
     * @return a^3 (a cubed)
     * @throws none.
     */
    public static int cubed(int a){
        int cube = a * a * a;
        return cube;
    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter an integer"); // * Purpose: The program prompts the user to input a number
       int x = in.nextInt();

       // invoking the cubed method
       System.out.println("The cubed value of "+ x + " is "
               + Lab6Part1.cubed(x)+"."); // and outputs the cubed value of the number.

       /*  Invoke the cubed method to find the sum of 
		*  1 + 8 + 27 + 64 + 125 + 216 + 343
        */
	   
	   //"Then program computes and outputs the sum of following sequence, 1 + 8 + 27 + 64 + 125 + 216 + 343."
	   System.out.println("The sum of the sequence 1 + 8 + 27 + 64 + 125 + 216 + 343 is equal to " + (1+8+27+64+125+216+343));
    }
}

/*Identify the following of the method cubed, 
 *1) return type of the method : int
 *2) type of the formal parameter : int
 *3) identifier of the formal parameter: a
 *4) signature of the method: cubed(int)
 *5) all local variables of the method: int cube, int a
 *6) Identify the statement that invokes cubed method: Line 32/33.
       System.out.println("The cubed value of "+ x + " is " + Lab6Part1.cubed(x)+".");
 *7) identifier of the actual parameter (or argument): x
 */