package com.ggl.testing;

import java.text.NumberFormat;
import java.util.Scanner;

public class InterestRateCalculator implements Runnable {

    private static final NumberFormat CF = NumberFormat.getCurrencyInstance();
    private static final NumberFormat NF = NumberFormat.getNumberInstance();

    private double interestRate;

    private int loanAmount;
    private int months;

    @Override
    public void run() {
        getInputs();
        produceOutputs();
    }

    public void getInputs() {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount ");
        loanAmount = input.nextInt();
        System.out.print("Number of Months ");
        months = input.nextInt();
        System.out.print("Yearly Interest Rate ");
        interestRate = input.nextDouble();
        input.close();
    }

    public void produceOutputs() {
        double[] interestRates = new double[17];

        double interestRate = this.interestRate - 2.0D;
        for (int i = 0; i < interestRates.length; i++) {
            interestRates[i] = interestRate / 100D;
            interestRate += 0.25D;
        }

        String header = displayHeader();
        System.out.println(" ");
        System.out.println(header);

        System.out.print(leftPad(" ", 10, ' '));
        System.out.print(leftPad("Monthly Payment", 15, ' '));
        System.out.println(leftPad("Total Payment", 15, ' '));

        for (int i = 0; i < interestRates.length; i++) {
            String s = displayInterestRate(interestRates[i]) + "   ";
            System.out.print(leftPad(s, 10, ' '));
            double monthlyPayment = calculateMonthlyPayment(interestRates[i]);
            System.out.print(leftPad(CF.format(monthlyPayment), 15, ' '));
            double totalPayment = monthlyPayment * months;
            System.out.print(leftPad(CF.format(totalPayment), 15, ' '));
            System.out.println("");
        }
    }

    private double calculateMonthlyPayment(double interestRate) {
        double monthlyInterestRate = interestRate / 12D;
        double numerator = (double) loanAmount * (monthlyInterestRate);
        double denominator = Math.pow(1 + (monthlyInterestRate), (double) -months);
        denominator = 1D - denominator;
        return numerator / denominator;
    }

    private String displayHeader() {
        StringBuilder builder = new StringBuilder();

        builder.append("Payments on a ");
        builder.append(CF.format(loanAmount));
        builder.append(" loan for ");
        builder.append(NF.format(months));
        builder.append(" months");
        builder.append(System.getProperty("line.separator"));

        return builder.toString();
    }

    private String displayInterestRate(double interestRate) {
        return String.format("%.3f", interestRate * 100D) + "%";
    }

    private String leftPad(String s, int length, char padChar) {
        if (s.length() > length) {
            return s.substring(0, length);
        } else if (s.length() == length) {
            return s;
        } else {
            int padding = length - s.length();
            StringBuilder builder = new StringBuilder(padding);

            for (int i = 0; i < padding; i++) {
                builder.append(padChar);
            }
            builder.append(s);

            return builder.toString();
        }
    }

    public static void main(String[] args) {
        new InterestRateCalculator().run();
    }

}