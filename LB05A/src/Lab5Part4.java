/*
 * Author:
 * Date:
 * Program: Lab5Part4.java
 * Finding the sum of digits of an integer.
 * Purpose: The program prompts the user to input an integer. Then repeatedly do
   the following; take the last digit of the integer and add it to sum, then   change the num to retain all digits but the last digit.
.
 */

import java.util.Scanner;
public class Lab5Part4 {
	private static int num;
	private static String numString;
	int sum;
	int numberOfDigits;
	String lastDigitStr;
	int lastDigitInt;
	private static Scanner input = new Scanner(System.in);
		
	public void getInteger() {
		System.out.println("Input an integer: ");
		num = input.nextInt();
		numString = Integer.toString(num);
	}
	
	public int getSumOfDigits(String numString) {
		sum = 0;
		numberOfDigits = 0;
		numberOfDigits = numString.length();
		if (numberOfDigits > 0) {
			while (numberOfDigits > 1) {
				lastDigitStr = numString.substring(numString.length() - 1);
				lastDigitInt = Integer.parseInt(lastDigitStr);
				sum += lastDigitInt;
				numString = numString.substring(0, numString.length()-1);
				num = Integer.parseInt(numString);
				numberOfDigits = numString.length();
			}
		}
		if (numberOfDigits == 1) {
			sum = num + sum;
		}
		return sum;
	}
    public static void main(String args[]) {
		Lab5Part4 sumOfDigits;
		sumOfDigits = new Lab5Part4();
		sumOfDigits.getInteger();
		System.out.print("The total sum of all digits is: "  + sumOfDigits.getSumOfDigits(numString) + "\n");
	}
}

/*
 * Copy and paste your program output here
 */

/*

run:
Input an integer: 
10101
The total sum of all digits is: 3
BUILD SUCCESSFUL (total time: 7 seconds)

run:
Input an integer: 
999
The total sum of all digits is: 27
BUILD SUCCESSFUL (total time: 2 seconds)

run:
Input an integer: 
0001009000
The total sum of all digits is: 10
BUILD SUCCESSFUL (total time: 5 seconds)

run:
Input an integer: 
999001
The total sum of all digits is: 28
BUILD SUCCESSFUL (total time: 4 seconds)
*/