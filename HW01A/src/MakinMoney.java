/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */

import java.util.Scanner;

public class MakinMoney {
    public static void main(String[] Strings){
       double investmentAmount;
       double numberOfYears;
       double annualInterestRate;
       
       Scanner in = new Scanner(System.in);
       System.out.printf("Enter investment amount: ");
       investmentAmount = in.nextDouble();

       System.out.printf("Enter monthly interest rate: ");
       annualInterestRate = in.nextDouble() / 100;

       System.out.printf("Enter number of years: ");
       numberOfYears = in.nextDouble();
       
       double futureInvestmentValue = calculateFutureInvestment(investmentAmount, annualInterestRate, numberOfYears);
       
       System.out.printf("Accumulated value is $" + futureInvestmentValue + "\n");
    }
    private static double calculateFutureInvestment(double investmentAmount, double annualInterestRate, double numberOfYears) {
        double futureInvestmentValue = investmentAmount * Math.pow((1 + (annualInterestRate / 12)), (numberOfYears * 12));
        return futureInvestmentValue;
    }
}