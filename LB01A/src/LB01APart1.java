/*/
Name: Tyler Nelson 
Date: 9/22/18 
Course Number: INFO-I210
Description: This program calculates the area, diameter, and circumference of a
circle and outputs these values in both standard and non-standard output.
*/

import javax.swing.JOptionPane; 

public class LB01APart1 { 
    public static void main(String[] args){
        double radius = 2.3;
        double area   = Math.PI * radius;
        double diameter = 2 * radius;
        double circumference = diameter * Math.PI;
        System.out.println("The area of the circle is " + area);
        System.out.printf("The area of the circle is \t = %3.4f\n", area);
        System.out.println("The diameter of the circle is " + diameter); // Console output of diameter
        System.out.println("The circumference of the circle is " + circumference); // Console output of circumference
	
        /*
         * Rest of the code shows how to output data using
         * JOptionPane GUI. 
        */
        String s = "The area of the circle is " + area;
        JOptionPane.showMessageDialog(null, s);
        s = "The diameter of the circle is " + diameter; // initalize String s again to contain the diameter of the circle
        JOptionPane.showMessageDialog(null, s); // display current value of String s
        s = "The circumference of the circle is " + circumference; // intialize String s again to contain the circumference of the circle
        JOptionPane.showMessageDialog(null, s); // display current value of String s
	}
}

/*
run:
The area of the circle is 7.225662979999999
The area of the circle is 	 = 7.2257
The diameter of the circle is 4.6
The circumference of the circle is 14.451325959999998
BUILD SUCCESSFUL (total time: 58 seconds)

run:
The area of the circle is 7.225663103256523
The area of the circle is 	 = 7.2257
The diameter of the circle is 4.6
The circumference of the circle is 14.451326206513047
BUILD SUCCESSFUL (total time: 4 seconds)
*/