/*
 * Author:
 * Date:
 * Program: Lab4Part1.java
 * Finding distance between points.
 * Purpose: The program prompts the user to input four integers where first two
     integers are (x1,y1) of a point, and the second two integers are (x2,y2) of
     a point on Cartesian plain. Display the distance between the two points.
     distance  = squareRoot((x1 - x2) * (x1-x2) + (y1 - y2) * (y1 - y2))
     Out of the two points, which one is the closest to point (0,0) and which is
     the furthest from (0,0) ?
 
 */


import java.util.Scanner;
public class Lab4Part1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Write rest of the code here
		Scanner in;
		int x1;
		int y1;
		int x2;
		int y2;
		int x0;
		int y0;
		x0 = 0;
		y0 = 0;
		double distance;
		double distance0point1;
		double distance0point2;
		
		System.out.print("Please input coordinate x1: ");
		x1 = input.nextInt();
		System.out.print("Please input coordinate y1: ");
		y1 = input.nextInt();
		System.out.print("Please input coordinate x2: ");
		x2 = input.nextInt();
		System.out.print("Please input coordinate y2: ");
		y2 = input.nextInt();
		
		distance = Math.sqrt((x1 - x2) * (x1-x2) + (y1 - y2) * (y1 - y2));
		distance0point1 = Math.sqrt((x1 - 0) * (x1-0) + (y1 - 0) * (y1 - 0));
		distance0point2 = Math.sqrt((0 - x2) * (0-x2) + (0 - y2) * (0 - y2));
		
		System.out.println("The distance between point 1 and point 2 is " + distance);
		
		if (distance0point1 > distance0point2)
		{
			System.out.println("Point 1 is a greater distance from 0 than point 2.");
		}
		if (distance0point2 > distance0point1)
		{
			System.out.println("Point 2 is a greater distance from 0 than point 1.");
		}
    }
}