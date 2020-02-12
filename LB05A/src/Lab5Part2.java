/*
 * Author:
 * Date:
 * Program: Lab5Part2.java
 * Computing the sum of N numbers.
 * Purpose: The program prompts the user to input N integers, and output
   the sum of those N integers. You must write a sentinal controlled while loop
   because user decides what N is.
 */

import java.util.Scanner;
public class Lab5Part2{
    public static void main(String[] args){   
        
        Scanner input = new Scanner(System.in);
        int newNumber;      //a number entered by the user
        int count = 0;          //used to count how many numbers are entered
        int sum = 0;            //accumulates the total of the numbers entered
        final int sentinelValue = -1;   //used as the stop value
        
         // Write rest of the code here
        
		int loopCount;
		loopCount = 0;
		System.out.print("Enter the total number of integers you would like to calculate the sum for: ");
		count = input.nextInt() - 1;
		while (count > sentinelValue) {
			System.out.println("Enter number " + loopCount + ": ");
			newNumber = input.nextInt();
			sum += newNumber;
			loopCount++;
			count--;
		}
        System.out.println("The sum of your " + loopCount + " numbers is: " + sum);
    }
}

/*
 * Copy and paste your program output here
 *
 */
/*
run:
Enter the total number of integers you would like to calculate the sum for: 5
Enter number 0: 
100
Enter number 1: 
10
Enter number 2: 
10
Enter number 3: 
10
Enter number 4: 
20
The sum of your 5 numbers is: 150
BUILD SUCCESSFUL (total time: 7 seconds)
*/