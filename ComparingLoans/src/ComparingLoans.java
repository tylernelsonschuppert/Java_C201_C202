/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 * @since 9/30/18
 * @version Comparing Loans v1.0
 */

/*

Problem Description:
Write a program that lets the user enter the loan amount and loan period in
number of years and displays the monthly and total payments for each interest
rate starting from 5% to 8%, with an increment of 1/8. Here is a sample run:

<Output>
Loan Amount: 10000
Number of Years: 5
Interest Rate	Monthly Payment	Total Payment
5%			188.71			11322.74
5.125%		189.28			11357.13
5.25%		189.85			11391.59
...
7.875%		202.17			12129.97
8.0%			202.76			12165.83
<End output>
*/

import java.util.Scanner;
public class ComparingLoans
{
	//Attributes
	int loanAmount;
	int numberOfYears;
	int numberOfMonths;
	double annualInterestRate;
	double monthlyInterestRate;
	double friendlyInterestRate;
	String friendlyInterestRateStr;
	String monthlyPaymentStr;
	String totalPaymentStr;
	double numerator;
	double denominator;
	double monthlyPayment;
	double totalPayment;

	private void getInput()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		loanAmount = input.nextInt();
		System.out.print("Number of Years: ");
		numberOfYears = input.nextInt();
		numberOfMonths = numberOfYears * 12;
	}
	private void printHeader()
	{
		System.out.println(String.format("%-16s %-16s %-16s", "Interest Rate", "Monthly Payment", "Total Payment"));
	}
	private void printTable()
	{
		for (annualInterestRate = .05; annualInterestRate <= .08125; annualInterestRate += .00125)
		{
			friendlyInterestRateStr = String.format("%.3f%%", calculateFriendlyInterestRate(annualInterestRate));
			monthlyPaymentStr = String.format("%.2f", calculateMonthlyPayment(annualInterestRate));
			totalPaymentStr = String.format("%.2f", calculateTotalPayment(monthlyPayment));
			System.out.println(String.format("%-16s %-16s %-16s", friendlyInterestRateStr, monthlyPaymentStr, totalPaymentStr));
		}
    }
	private double calculateFriendlyInterestRate(double annualInterestRate)
	{
		friendlyInterestRate = annualInterestRate * 100;
		return friendlyInterestRate;
	}
	private double calculateMonthlyPayment(double annualInterestRate)
	{
		monthlyInterestRate = annualInterestRate / 12;
		numerator = (double) loanAmount * (monthlyInterestRate);
		denominator = Math.pow(1 + (monthlyInterestRate), (double) - numberOfMonths);
		denominator = 1 - denominator;
		monthlyPayment = (numerator / denominator);
		return monthlyPayment;
    }
	private double calculateTotalPayment(double monthlyPayment)
	{
		totalPayment = monthlyPayment * numberOfMonths;
		return totalPayment;
	}
	public static void main(String args[])
	{
		ComparingLoans loanCalc;
		loanCalc = new ComparingLoans();
		loanCalc.getInput();
		loanCalc.printHeader();
		loanCalc.printTable();
	}
}