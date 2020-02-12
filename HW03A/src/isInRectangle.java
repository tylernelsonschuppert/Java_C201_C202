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
Write a program that prompts the user to enter a point (x, y) and checks whether
the point is within the rectangle centered at (0, 0) with width 10 and height 5.
For example, (2, 2) is inside the rectangle and (6, 4) is outside the rectangle,
as shown in the Figure. 

(Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less
than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or
equal to 5 / 2.) 

Sample 1:
Enter a point with two coordinates: 2 2
Point (2.0, 2.0) is in the rectangle

Sample 2:
Enter a point with two coordinates: 6 4
Point (6.0, 4.0) is not in the rectangle
*/

import java.util.Scanner;
public class isInRectangle {
    public static void main(String[] args) {
		double xLimitCalcLeft;
		double xLimitCalcRight;
		double yLimitCalcLeft;
		double yLimitCalcRight;
		double xLimit;
		double yLimit;
		double xCoordinateAbsolute;
		double yCoordinateAbsolute;
		double xCoordinate;
		double yCoordinate;

		xLimitCalcLeft = 2;
		xLimitCalcRight = 10;
		yLimitCalcLeft = 2;
		yLimitCalcRight = 5;
		xLimit = xLimitCalcRight / xLimitCalcLeft;
		yLimit = yLimitCalcRight / yLimitCalcLeft;
		
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
		xCoordinate=Double.parseDouble(in.next());
		yCoordinate=Double.parseDouble(in.next());
		xCoordinateAbsolute = Math.abs(xCoordinate);
		yCoordinateAbsolute = Math.abs(yCoordinate);
		
		if (xCoordinateAbsolute <= xLimit && yCoordinateAbsolute <= yLimit) {
			System.out.println("Point " + "(" + xCoordinate + ", " + yCoordinate + ") is in the rectangle");
		}
		else { 
			System.out.println("Point " + "(" + xCoordinate + ", " + yCoordinate + ") is not in the rectangle");
		}
    }
}





















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
Write a program that prompts the user to enter a point (x, y) and checks whether
the point is within the rectangle centered at (0, 0) with width 10 and height 5.
For example, (2, 2) is inside the rectangle and (6, 4) is outside the rectangle,
as shown in the Figure. 

(Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less
than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or
equal to 5 / 2.) 

Sample 1:
Enter a point with two coordinates: 2 2
Point (2.0, 2.0) is in the rectangle

Sample 2:
Enter a point with two coordinates: 6 4
Point (6.0, 4.0) is not in the rectangle
*/
/*
import java.util.Scanner;
import java.lang.String;

public class isInRectangle {
    public static void main(String[] args) {
        String coordinates;
        char xCoordinateChar;
        char yCoordinateChar;
		float xLimit;
		float yLimit;
		
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        coordinates = in.nextLine();
        xCoordinateChar = coordinates.charAt(0);
        yCoordinateChar = coordinates.charAt(2);
        float xCoordinateInt = Character.getNumericValue(xCoordinateChar);
        float yCoordinateInt = Character.getNumericValue(yCoordinateChar);
		xLimit = (10 / 2);
		yLimit = (5 / 2);
		
		if (xCoordinateInt <= xLimit && yCoordinateInt <= yLimit) {
			System.out.println("Point " + "(" + xCoordinateInt + ", " + yCoordinateInt + ") is in the rectangle");
		}
		else { 
			System.out.println("Point " + "(" + xCoordinateInt + ", " + yCoordinateInt + ") is not in the rectangle");
		}
    }
}
*/