/*
 * Author: Tyler Nelson
 * Date: 9/16/18
 * Program: Lab3Part1.java
 * 
 * Purpose: The program prompts the user to input average score from the
 * keyboard, then outputs a statement "You Pass! Please sign up for C202"
 * if the average score is greater than or equal to 70, otherwise outputs
 * a statement "Sorry, you should retake C201"
 */

import java.util.Scanner;

public class Lab3Part1{
    public static void main(String[] args){   
        
        Scanner input = new Scanner(System.in);
        // Write rest of the code here
        
		int averageScore;
		
		System.out.print("Input average score: ");
		averageScore = input.nextInt();
		
		if (averageScore >= 70) {
			System.out.println("You pass! Please sign up for C202");
		}
		else {
			System.out.println("Sorry, you should retake C201");
		}
    }
}

/*
 * Copy and paste your program output here
run:
Input average score: 69
Sorry, you should retake C201
BUILD SUCCESSFUL (total time: 2 seconds)

run:
Input average score: 70
You pass! Please sign up for C202
BUILD SUCCESSFUL (total time: 2 seconds)

run:
Input average score: 71
You pass! Please sign up for C202
BUILD SUCCESSFUL (total time: 2 seconds)
 */