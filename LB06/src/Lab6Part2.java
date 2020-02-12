/*
 * Author: Tyler Nelson
 * Date:
 * Program: Lab6Part2.java
 * This program computes and outputs the monthly payments for a home loan.
 * Purpose: The program prompts the user to input loan amount,interest rate, loan length, 
 *          and future value of the loan, and outputs the monthly payments.
 */

import java.util.Scanner;

public class Lab6Part2 {
    
	
	/*
	 the following is a method that computes the monthly payments for a home loan, 
	 based on the amount of the loan, the interest rate, and
	 the length of the loan (the number of months),
	 */
	
    public static double computePayment(double loanAmt,
								 double rate,
								 int numPeriods) {
		double monthlyRate = rate / 1200.0;
		double partial = Math.pow((1 + monthlyRate), numPeriods) - 1 ;
		double denominator = monthlyRate * Math.pow((1 + monthlyRate), numPeriods);
		double answer =  loanAmt / (partial / denominator);
		return answer;
	}
	
    public static void main(String[] args) {
		/* Prompts the user to input amount of the loan, the interest rate, and
		 the length of the loan (in months).
		 Then invoke the computePayment method and output the answer.
		*/
		Scanner in;
		double loanAmt;
		double rate;
		int numPeriods;
		double answer;
		in = new Scanner(System.in);
		//Prompts the user to input amount of the loan
		System.out.print("Please input the amount of the loan: ");
        loanAmt = in.nextDouble();
		//the interest rate
		System.out.print("Please input the interest rate: ");
		rate = in.nextDouble();
		//and the length of the loan (in months)
		System.out.print("Please input the length of the loan (in months): ");
		numPeriods = in.nextInt();
		//Then invoke the computePayment method
		answer = computePayment(loanAmt, rate, numPeriods);
		//and output the answer.
		System.out.println("The answer is: " + answer);
    }
}