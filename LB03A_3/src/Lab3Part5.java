/*
 * Author: Tyler Nelson
 * Date: 9/16/18
 * Program: Lab3Part5.java
 *
 * Purpose: The program prompts the user to enter an integer and determines
 * whether it is divisible by 5 and 6 (use &&), whether it is divisible
 * by 5 or 6 (use ||), and whether it is divisible by 5 or 6, but not both
 * (use ^). Each test should display a statement stating what you are testing
 * and the outcome of the test.
 */

import java.util.Scanner;

public class Lab3Part5
{
    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        // Write rest of the code here

		int integerInput;
		int remainderDividedBy5;
		int remainderDividedBy6;
		boolean isDivisibleBy5;
		boolean isDivisibleBy6;
		boolean isDivisibleBy5Or6amp;
		boolean isDivisibleBy5Or6xor;
		boolean isDivisibleBy5And6;
		
		System.out.print("Please input an integer: ");
		integerInput = input.nextInt();
		
		remainderDividedBy5 = integerInput % 5;
		remainderDividedBy6 = integerInput % 6;

		if (remainderDividedBy5 == 0)
		{
			isDivisibleBy5 = true;
		}
		else
		{
			isDivisibleBy5 = false;
		}
		
		if (remainderDividedBy6 == 0)
		{
			isDivisibleBy6 = true;
		}
		else
		{
			isDivisibleBy6 = false;
		}
		
		// First Check using && (AND)
		
		if (isDivisibleBy5 == true && isDivisibleBy6 == true)
		{
			isDivisibleBy5And6 = true;
		}
		else
		{
			isDivisibleBy5And6 = false;
		}
		System.out.println("Testing if integer is divisible by 5 AND 6 using &&: " + isDivisibleBy5And6);

		// Second Check using || (OR)

		if (isDivisibleBy5 == true || isDivisibleBy6 == true)
		{
			isDivisibleBy5Or6amp = true;
		}
		else
		{
			isDivisibleBy5Or6amp = false;
		}
		System.out.println("Testing if integer is divisible by 5 OR 6 using ||: " + isDivisibleBy5Or6amp);
		
		// Third check using ^ (XOR)

		if (isDivisibleBy5 == true ^ isDivisibleBy6 == true)
		{
			isDivisibleBy5Or6xor = true;
		}
		else {
			isDivisibleBy5Or6xor = false;
		}
		System.out.println("Testing if integer is divisible by 5 OR 6, BUT NOT BOTH using ^: " + isDivisibleBy5Or6xor);
    }
}

/*
 * Copy and paste your program output here

run:
Please input an integer: 8
Testing if integer is divisible by 5 AND 6 using &&: false
Testing if integer is divisible by 5 OR 6 using ||: false
Testing if integer is divisible by 5 OR 6, BUT NOT BOTH using ^: false
BUILD SUCCESSFUL (total time: 12 seconds)

run:
Please input an integer: 30
Testing if integer is divisible by 5 AND 6 using &&: true
Testing if integer is divisible by 5 OR 6 using ||: true
Testing if integer is divisible by 5 OR 6, BUT NOT BOTH using ^: false
BUILD SUCCESSFUL (total time: 2 seconds)

run:
Please input an integer: 10
Testing if integer is divisible by 5 AND 6 using &&: false
Testing if integer is divisible by 5 OR 6 using ||: true
Testing if integer is divisible by 5 OR 6, BUT NOT BOTH using ^: true
BUILD SUCCESSFUL (total time: 3 seconds)

run:
Please input an integer: 18
Testing if integer is divisible by 5 AND 6 using &&: false
Testing if integer is divisible by 5 OR 6 using ||: true
Testing if integer is divisible by 5 OR 6, BUT NOT BOTH using ^: true
BUILD SUCCESSFUL (total time: 1 second)
 */