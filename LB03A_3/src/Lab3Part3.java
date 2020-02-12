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
        
		int a;
		int b;
		int c;
		int swap;
		
		System.out.print("Input integer a: ");
		a = input.nextInt();
		System.out.print("Input integer b: ");
		b = input.nextInt();
		System.out.print("Input integer c: ");
		c = input.nextInt();
		
		if (a > b) {
			swap = a;
			a = b;
			b = swap;
		}
		if (b > c) {
			swap = b;
			b = c;
			c = swap;
		}
		if (a > b) {
			swap = a;
			a = b;
			b = swap;
		}
		
		System.out.println("Sorted integer a: " + a);
		System.out.println("Sorted integer b: " + b);
		System.out.println("Sorted integer c: " + c);
    }
}

/*
 * Copy and paste your program output here
run:
Input integer a: 56
Input integer b: -10
Input integer c: 430
Sorted integer a: -10
Sorted integer b: 56
Sorted integer c: 430
BUILD SUCCESSFUL (total time: 8 seconds)

run:
Input integer a: 1
Input integer b: 5
Input integer c: 9
Sorted integer a: 1
Sorted integer b: 5
Sorted integer c: 9
BUILD SUCCESSFUL (total time: 4 seconds)

run:
Input integer a: 56
Input integer b: 13
Input integer c: 25
Sorted integer a: 13
Sorted integer b: 25
Sorted integer c: 56
BUILD SUCCESSFUL (total time: 5 seconds)
 */