/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
        /*
         * Write Java code to execute the following fraction,
         * if a = 3 , b = 5, c = 6, d = 4 (declare these as int type variables).
         * numerator  = a * b / (d + c)
         * denominator = c % d - b + a
         * results = numerator/denominator.
         * output 'results'
        
        answer:
        */
        import java.util.Scanner;
        public class NewClass {
            public static void main(String[] args){
                int a;
                int b;
                int c;
                int d;
                int numerator;
                int denominator;
                int results;
        
                a = 3;
                b = 5;
                c = 6;
                d = 4;
                numerator = a * b / (d + c);
                denominator = c % d - b + a;
                results = numerator/denominator;

                System.out.println("The numerator is " + numerator);
                System.out.println("The denominator is " + denominator);
                System.out.println("The result is " + results);
        }
    }