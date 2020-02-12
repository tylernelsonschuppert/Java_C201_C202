/*
 * Author: Tyler Nelson
 * Date: 9/16/18
 * Program: Lab3Part3.java
 *
 * Purpose: The program prompts the user to input three integers, and display
 * them in the sorted order. If the three numbers are a,b, c, we can do it as follows,
       if (a > b)
           swap(a,b)
       if (b > c)
          swap(b,c)
       if (a > b)
          swap(a,b)
 *
 */

import java.util.Scanner;

public class Lab3Part3 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        // Write rest of the code here
        
		int integerOne;
		int integerTwo;
		int integerThree;
		int swap;
		
		System.out.print("Input the first integer: ");
		integerOne = input.nextInt();
		System.out.print("Input the second integer: ");
		integerTwo = input.nextInt();
		System.out.print("Input the third integer: ");
		integerThree = input.nextInt();
		
		if (integerOne > integerTwo) {
			swap = integerOne;
			integerOne = integerTwo;
			integerTwo = swap;
		}
		if (integerTwo > integerThree) {
			swap = integerTwo;
			integerTwo = integerThree;
			integerThree = swap;
		}
		if (integerOne > integerTwo) {
			swap = integerOne;
			integerOne = integerTwo;
			integerTwo = swap;
		}
		
		System.out.println("Sorted first integer " + integerOne);
		System.out.println("Sorted second integer " + integerTwo);
		System.out.println("Sorted third integer " + integerThree);
    }
}

/*
 * Copy and paste your program output here
run:
Input the first integer: 56
Input the second integer: -10
Input the third integer: 430
Sorted first integer -10
Sorted second integer 56
Sorted third integer 430
BUILD SUCCESSFUL (total time: 11 seconds)

run:
Input the first integer: 1
Input the second integer: 5
Input the third integer: 9
Sorted first integer 1
Sorted second integer 5
Sorted third integer 9
BUILD SUCCESSFUL (total time: 13 seconds)

run:
Input the first integer: 56
Input the second integer: 13
Input the third integer: 25
Sorted first integer 13
Sorted second integer 25
Sorted third integer 56
BUILD SUCCESSFUL (total time: 11 seconds)
 */