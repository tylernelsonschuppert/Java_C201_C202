/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Problem Description:

Suppose you save $100 each month into a savings account with annual interest rate 5%.
Thus, the monthly interest rate is 0.05/12 = 0.00417. After the first month, the
value in the account becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes 
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.

Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month. (Do not use loops, it is
perfectly fine if you do not know what it is). 

Here is a sample run:
Sample 1:
Enter the monthly saving amount: 100
After the sixth month, the account value is $608.81
*/

/**
 *
 * @author tylernelson
 * @version HW02A
 * @since 9/8/18
 */

import java.util.Scanner;

public class Driver { //beginning of class
    public static void main(String[] Strings){  //Beginning of main method

		//Preparation of Scanner object in
		Scanner in; //Declaration of Scanner object in
		in = new Scanner(System.in); //Initialization of Scanner object in
        
		//Preparation of a double input data monthlySavingsAmount
		double monthlySavingsAmount;
		monthlySavingsAmount = 0; //Initialization of input data monthlySavingsAmount
		//Preparation of a double input data annualInterestRate
        double annualInterestRate; //Declaration of input data annualInterestRate
		annualInterestRate = 0; //Initialization of input data annualInterestRate
		//Preparation of a double intermediate data monthlyInterestRate
        double monthlyInterestRate; //Declaration of intermediate data monthlyInterestRate
		monthlyInterestRate = 0; //Initialization of intermediate data monthlyInterestRate
		//Preparation of a double intermediate data firstMonthBalance
		double firstMonthBalance; //Declaration of intermediate data firstMonthBalance
		firstMonthBalance = 0; //Initialization of intermediate data firstMonthBalance
		//Preparation of a double intermediate data secondMonthBalance
		double secondMonthBalance; //Declaration of intermediate data secondMonthBalance
        secondMonthBalance = 0; //Initialization of intermediate data secondMonthBalance
		//Preparation of a double intermediate data thirdMonthBalance
		double thirdMonthBalance; //Declaration of intermediate data thirdMonthBalance
        thirdMonthBalance = 0; //Initialization of intermediate data thirdMonthBalance
		//Preparation of a double intermediate data fourthMonthBalance
		double fourthMonthBalance; //Declaration of intermediate data fourthMonthBalance
        fourthMonthBalance = 0; //Initialization of intermediate data fourthMonthBalance
		//Preparation of a double intermediate data fifthMonthBalance
		double fifthMonthBalance; //Declaration of intermediate data fifthMonthBalance
        fifthMonthBalance = 0; //Initialization of intermediate data fifthMonthBalance
		//Preparation of a double intermediate data sixthMonthBalance
		double sixthMonthBalance; //Declaration of intermediate data sixthMonthBalance
        sixthMonthBalance = 0; //Initialization of intermediate data sixthMonthBalance
		
        System.out.print("Enter a monthly savings amount: "); // Instruction for input
        monthlySavingsAmount = in.nextDouble(); // Use of in, monthlySavingsAmount
        System.out.print("Enter an annual interest rate: "); // Instruction for input
        annualInterestRate = in.nextDouble(); // Use of in, annualInterestRate
		annualInterestRate /= 100; // Use of annualInterestRate
        monthlyInterestRate = annualInterestRate / 12; // use of monthlyInterestRate, annualInterestRate
        
        firstMonthBalance = monthlySavingsAmount * (1 + monthlyInterestRate); // Use of firstMonthBalance, monthlySavingsAmount, monthlyInterestRate
        secondMonthBalance = (firstMonthBalance + monthlySavingsAmount) * (1 + monthlyInterestRate); // Use of secondMonthBalance, firstMonthBalance, monthlySavingsAmount, monthlyInterestRate
        thirdMonthBalance = (secondMonthBalance + monthlySavingsAmount) * (1 + monthlyInterestRate); // Use of thirdMonthBalance, secondMonthBalance, monthlySavingsAmount, monhtlyInterestRate
        fourthMonthBalance = (thirdMonthBalance + monthlySavingsAmount) * (1 + monthlyInterestRate); // Use of fourthMonthBalance, thirdMonthBalance, monthlySavingsAmount, monthlyInterestRate
        fifthMonthBalance = (fourthMonthBalance + monthlySavingsAmount) * (1 + monthlyInterestRate); // Use of fifthMonthBalance, fourthMonthBalance, monthlySavingsAmount, monthlyInterestRate
        sixthMonthBalance = (fifthMonthBalance + monthlySavingsAmount) * (1 + monthlyInterestRate); // USe of sixthMonthBalance, fifthMonthBalance, monthlySavingsAmount, monthlyInterestRate
		
        System.out.printf("The final account value is $%.2f\n", sixthMonthBalance); //Use of sixthMonthBalance
    } //End of main method
} //End of class