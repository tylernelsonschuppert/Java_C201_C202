/*
 * Author: Tyler Nelson
 * Date: 9/16/18
 * Program: Lab3Part2.java
 *
 * Purpose: The program randomly generates 3 integers between 0 and 20
 * inclusive, then prompts the user to input the sum of three integers.
 * Finally, display a statement "You are correct" if the user input is
 * the same as actual sum, otherwise display "Your answer is wrong."
 *
 */

import java.util.Scanner;

public class Lab3Part2 {
	public static int rand(int min, int max) {
		double rand;
		
		rand = Math.random();
		
		if (min > max) {
			throw new IllegalArgumentException("Invalid range");
		}
		return (int) (rand * ((max-min) +1)) + min;
	}
    public static void main(String[] args){
        int firstRandomInt;
		int secondRandomInt;
		int thirdRandomInt;
		int sumOfRandomInts;
		int enteredSum;

        Scanner input = new Scanner(System.in);

		firstRandomInt = rand(0,20);
		secondRandomInt = rand(0,20);
		thirdRandomInt = rand(0,20);
		sumOfRandomInts = firstRandomInt + secondRandomInt + thirdRandomInt;
		
		System.out.println("First random integer: " + firstRandomInt);
		System.out.println("Second random integer: " + secondRandomInt);
		System.out.println("Third random integer: " + thirdRandomInt);
		
		System.out.print("Please input the sum of all three random integers: ");
		
		enteredSum = input.nextInt();
		
		if (enteredSum == sumOfRandomInts) {
			System.out.println("You are correct");
		}
		else {
			System.out.println("Your answer is wrong.");
		}
    }
}


/*
 * Copy and paste your program output here

run:
First random integer: 16
Second random integer: 17
Third random integer: 5
Please input the sum of all three random integers: 38
You are correct
BUILD SUCCESSFUL (total time: 10 seconds)

run:
First random integer: 13
Second random integer: 18
Third random integer: 7
Please input the sum of all three random integers: 39
Your answer is wrong.
BUILD SUCCESSFUL (total time: 20 seconds)

run:
First random integer: 0
Second random integer: 20
Third random integer: 6
Please input the sum of all three random integers: 26
You are correct
BUILD SUCCESSFUL (total time: 4 seconds)

run:
First random integer: 19
Second random integer: 6
Third random integer: 5
Please input the sum of all three random integers: 31
Your answer is wrong.
BUILD SUCCESSFUL (total time: 5 seconds)
 */