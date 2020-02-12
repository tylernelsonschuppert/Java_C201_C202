/*
 * Author:
 * Date:
 * Program: Lab5Part1.java
 * Computing the sum of ten numbers.
 * Purpose: The program prompts the user to input exactly 10 numbers, and output
   the sum of ten numbers. This program contains syntax/logic errors. You are
   required to fix errors to get accurate answers.
 */

import java.util.Scanner;
public class Lab5Part1{
    public static void main(String[] args){   
        
        Scanner input = new Scanner(System.in);
        int newNumber;      //a number entered by the user
        int loopCount;      //used as the loop control variable
        int sum;            //accumulates the total of the numbers entered
                
      
        loopCount = 1;
		sum = 0;
        while (loopCount <= 10) {
            System.out.println("Please enter number " + loopCount + ":");
            newNumber = input.nextInt();
            sum = sum + newNumber;
            loopCount++;
        }
        
        System.out.println("The sum of your 10 numbers is: " + sum);
    }
}
/* Answer the following questions about this code:
 * 1. What is the loop control variable?

	Declared on line 17.
	The loop control variable is the integer variable "loopCount".

 * 2. What statement initializes the loop control variable?

	Line 21.
	loopCount = 1;

 * 3. What is the loop condition?

	Line 23.
	while (loopCount <= 10) {}

	In friendly terms, the condition is: 
	While the loop control variable "loopCount" is less than
	or equal to 10, perform actions in the curly brackets. {}

 * 4. What statement updates the loop control variable?
 *
	
	Line 27.
	loopCount++;

	This statement updates the loop control variable by incrementing the value
	by 1 for each iteration.
*/
/*
 * Copy and paste your program output here
 */

/*

run:
Please enter number 1:
100
Please enter number 2:
10
Please enter number 3:
10
Please enter number 4:
10
Please enter number 5:
10
Please enter number 6:
10
Please enter number 7:
10
Please enter number 8:
10
Please enter number 9:
10
Please enter number 10:
10
The sum of your 10 numbers is: 190
BUILD SUCCESSFUL (total time: 8 seconds)

*/