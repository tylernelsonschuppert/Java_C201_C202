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
HW04A: Great Circle Distance
Problem Description:

The great circle distance is the distance between two points on the surface of a sphere. 
Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points. The great circle distance between the two points can be computed using the following formula:

d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2)  * cos(y1 – y2))

Write a program that prompts the user to enter the latitude and longitude of two points on the earth in degrees and display its great circle distance. The average earth radius is 6371.01 km. Note that you need to convert the degrees into radians using the Math.toRadians method since the Java trigonometric methods use radians. The latitude and longitude degrees in the formula are for north and west. Use negative to indicate south and east.   
Here is a sample run:

Sample 1:
Enter point 1 (latitude and longitude) in degrees: 39.55, -116.25
Enter point 2 (latitude and longitude) in degrees: 41.5, 87.37
The distance between the two points is 10691.7918 km

Note 4 digits after the decimal point in the distance.
*/
import java.util.Scanner;
public class GreatCircleDistance {
	    public static void main(String[] args) {
			Scanner in;
			String inputCoordinates;
			String xCoordinateOne;
			String yCoordinateOne;
			String xCoordinateTwo;
			String yCoordinateTwo;

			double xCoordinateOneDouble;
			double yCoordinateOneDouble;
			double xCoordinateTwoDouble;
			double yCoordinateTwoDouble;
			
			double x1Radians;
			double y1Radians;
			double x2Radians;
			double y2Radians;
			
			in = new Scanner(System.in);
			System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
			inputCoordinates = in.nextLine();
			inputCoordinates = inputCoordinates.replaceAll(",", "");
			xCoordinateOne = inputCoordinates.substring(0, inputCoordinates.indexOf(" "));
			yCoordinateOne = inputCoordinates.substring(inputCoordinates.indexOf(" ")+1, inputCoordinates.length());
			xCoordinateOneDouble = Double.parseDouble(xCoordinateOne);
			yCoordinateOneDouble = Double.parseDouble(yCoordinateOne);
			x1Radians = Math.toRadians(xCoordinateOneDouble);
			y1Radians = Math.toRadians(yCoordinateOneDouble);
			
			System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
			inputCoordinates = in.nextLine();
			inputCoordinates = inputCoordinates.replaceAll(",", "");
			xCoordinateTwo = inputCoordinates.substring(0, inputCoordinates.indexOf(" "));
			yCoordinateTwo = inputCoordinates.substring(inputCoordinates.indexOf(" ")+1, inputCoordinates.length());
			xCoordinateTwoDouble = Double.parseDouble(xCoordinateTwo);
			yCoordinateTwoDouble = Double.parseDouble(yCoordinateTwo);
			x2Radians = Math.toRadians(xCoordinateTwoDouble);
			y2Radians = Math.toRadians(yCoordinateTwoDouble);
			
			double radius = 6371.01;
			double angle = Math.acos(Math.sin(x1Radians) * Math.sin(x2Radians) + Math.cos(x1Radians) * Math.cos(x2Radians) * Math.cos(y1Radians - y2Radians));
			angle = Math.toDegrees(angle);
			double distance = radius * angle;
			
			System.out.print("The distance between the two points is " + distance + " kilometers.");
		}
}