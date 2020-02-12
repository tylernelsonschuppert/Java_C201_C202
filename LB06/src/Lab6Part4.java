/*
 * Author: Tyler Nelson
 * Date: 10/6/18
 * Program: Lab6Part4.java
 * Compute the area of a regular pentagon.
 * Purpose:  The program prompts the user to input a positive integer for pentagon's edge 
 *           and outputs the area of the pentagon. 
 * You should Implement a method named  pentagonArea that takes a double type number as its formal parameter and 
 * returns pentagon's area. A pentagon's area is defined as follows,
 *      (5 * edge * edge) / (4 * tan (pi/5))
 */

import java.util.Scanner;

public class Lab6Part4 {
	//You should Implement a method named  pentagonArea that takes a double type number as its formal parameter
	public static double pentagonArea(double edge)
	{
		double pentagonArea;
		//A pentagon's area is defined as follows, (5 * edge * edge) / (4 * tan (pi/5))
		pentagonArea = (5 * edge * edge) / (4 * Math.tan(Math.PI/5));
		//returns pentagon's area.
		return pentagonArea;
	}
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double edge;
		//The program prompts the user to input a positive integer for pentagon's edge
		System.out.print("Please input a positive integer for the pentagon's edge: ");
		edge = in.nextDouble();
		//and outputs the area of the pentagon. 
		System.out.println("The area of the pentagon is: " + pentagonArea(edge));
	}
}
