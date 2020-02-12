/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Problem Description:
Suppose you save $100 each month into a savings account with annual interest rate 5%.
Thus, the monthly interest rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes 
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month.
(Do not use loops, it is perfectly fine if you do not know what it is). 
Here is a sample run:
Sample 1:
Enter the monthly saving amount: 100
After the sixth month, the account value is $608.81
*/

/**
 *
 * @author tylernelson
 */
import java.util.Scanner;

public class savingsInterest {
    public static void main(String[] Strings){
        double monthlySavingsAmount; 
        double annualInterestRate;
        double monthlyInterestRate;
        double firstMonthBalance;
        double secondMonthBalance;
        double thirdMonthBalance;
        double fourthMonthBalance;
        double fifthMonthBalance;
        double sixthMonthBalance;
        double finalBalance;
        
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Enter a monthly savings amount: ");
        monthlySavingsAmount = in.nextDouble();
        System.out.printf("Enter an annual interest rate: ");
        annualInterestRate = in.nextDouble() / 100;
        monthlyInterestRate = annualInterestRate / 12;
        
        // First months balance
        firstMonthBalance = monthlySavingsAmount * (1 + monthlyInterestRate);
        System.out.printf("After the first month, the account value is " + firstMonthBalance + "\n");
        // Second months balance
        secondMonthBalance = (firstMonthBalance + monthlySavingsAmount) * (1 + monthlyInterestRate);
        System.out.printf("After the second month, the account value is " + secondMonthBalance + "\n");
        // Third months balance
        thirdMonthBalance = (secondMonthBalance + monthlySavingsAmount) * (1 + monthlyInterestRate);
        System.out.printf("After the third month, the account value is " + thirdMonthBalance + "\n");
        // Fourth months balance
        fourthMonthBalance = (thirdMonthBalance + monthlySavingsAmount) * (1 + monthlyInterestRate);
        System.out.printf("After the fourth month, the account value is " + fourthMonthBalance + "\n");
        // Fifth months balance
        fifthMonthBalance = (fourthMonthBalance + monthlySavingsAmount) * (1 + monthlyInterestRate);
        System.out.printf("After the fifth month, the account value is " + fifthMonthBalance + "\n");
        // Sixth months balance
        sixthMonthBalance = (fifthMonthBalance + monthlySavingsAmount) * (1 + monthlyInterestRate);
        System.out.printf("After the sixth month, the account value is " + sixthMonthBalance + "\n");
        // Final balance
        finalBalance = sixthMonthBalance;
        
        System.out.printf("The final account value is " + finalBalance + "\n");
    }
}