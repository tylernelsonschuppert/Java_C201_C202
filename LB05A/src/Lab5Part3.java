/*
 * Author:
 * Date:
 * Program: Lab5Part3.java
 * Testing if a number is a prime number.
 * Purpose: The program prompts the user to input an integer. Try to find a 
   divisor for this integer, if there are no divisors the integer is a prime 
   number, otherwise it is not a prime number.
 */

import java.util.Scanner;
public class Lab5Part3 {
 /*   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int divisor;

        System.out.println("Enter an integer greater than 1");
        num = input.nextInt();

        divisor = num / 2;
        while (num % divisor != 0) {
            System.out.println("Trying factor " + divisor);
            divisor--;
        }
        if (divisor == 1) {
            System.out.print("The input integer " + num + " is a prime number");
        } else {
            System.out.print("The input integer " + num + " is divisible by " + divisor);
        }

    }
	*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int num;
        int divisor;
		
		System.out.println("Enter an integer greater than 1: ");
        num = input.nextInt();
		
		for (divisor = num / 2; num % divisor != 0; divisor--) {
			System.out.println("Trying factor " + divisor);
		}
		if (divisor == 1) {
            System.out.print("The input integer " + num + " is a prime number");
        } else {
            System.out.print("The input integer " + num + " is divisible by " + divisor + "\n");
        }
	}

    /* Answer the following questions about this code:
     * 1. What is the loop control variable?
	
	The loop control variable is divisor.
	
     * 2. What statement initializes the loop control variable?
	
	Line 21.
	Divisor = num / 2;
	
     * 3. What is the loop condition?
	
	Line 22.
	while (num % divisor != 0) { ... }
	"While the remainder of num/divisor isn't equal to 0, perform action in curly braces {}.

	
     * 4. What statement updates the loop control variable?
	
	Line 24.
	divisor--;
	
     *
     * After you answer above questions, comment out the main method given and
       write your own main method. In your main method use a "for" loop
       instead of the while loop.
     */
}

/*
 * Copy and paste your program output here
 */

/*
run:
Enter an integer greater than 1: 
10
The input integer 10 is divisible by 5
BUILD SUCCESSFUL (total time: 2 seconds)

run:
Enter an integer greater than 1: 
3
The input integer 3 is a prime numberBUILD SUCCESSFUL (total time: 1 second)
*/