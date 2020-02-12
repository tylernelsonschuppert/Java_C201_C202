/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 * @version 2.0
 * @since 9/19/18
 */
import java.util.Scanner;

public class CalculateFutureInvestment {

	public static void main(String[] Strings) {
		int investmentAmount;
		int numberOfYears;
		double annualInterestRate;
		double monthlyInterestRate;
		double futureInvestmentValue;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		investmentAmount = in.nextInt();

		System.out.print("Enter annual interest rate: ");
		annualInterestRate = in.nextDouble() / 100;
		monthlyInterestRate = annualInterestRate / 12;

		System.out.print("Enter number of years: ");
		numberOfYears = in.nextInt();

		futureInvestmentValue = investmentAmount * Math.pow((1 + (monthlyInterestRate)), (numberOfYears * 12));

		System.out.printf("Accumulated value is $%.2f\n", futureInvestmentValue);
	}
}