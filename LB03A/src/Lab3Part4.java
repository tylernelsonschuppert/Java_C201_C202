/*
 * Author: Tyler Nelson
 * Date: 9/16/18
 * Program: Lab3Part4.java
 *
 * Purpose: The program  prompts the user to input a single character
 * representing a day of the week, either M, T, W, R, or F. Your program
 * should display the full name of the day, such as “Monday” or “Friday”.
 * If the user enters an invalid character, inform user with the message
 * "Invalid character". Your code for this program must use a switch statement.
 *
 */

import java.util.Scanner;

public class Lab3Part4 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        // Write rest of the code here
        System.out.print("Please enter a character: ");
        char ch = input.next().charAt(0);
        
        switch(ch) {
            case 'm':
            case 'M': System.out.println("Monday"); break;
            case 't':
            case 'T': System.out.println("Tuesday"); break;
            case 'w':
            case 'W': System.out.println("Wednesday"); break;
            case 'h':
            case 'H': System.out.println("Thursday"); break;
            case 'f':
            case 'F': System.out.println("Friday"); break;
            default: System.out.println("Invalid Character");
        }
    }
}

/*
 * Copy and paste your program output here

run:
Please enter a character: M
Monday
BUILD SUCCESSFUL (total time: 1 second)

run:
Please enter a character: F
Friday
BUILD SUCCESSFUL (total time: 2 seconds)

run:
Please enter a character: X
Invalid Character
BUILD SUCCESSFUL (total time: 3 seconds)

 */