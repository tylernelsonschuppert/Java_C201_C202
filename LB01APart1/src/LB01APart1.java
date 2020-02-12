/*
Name: Tyler Nelson
Date: 9/7/18
Course: FA18-SE-CSCI-C201-16702
Description: This program calculates the area, circumference, and diameter of a circle.
*/


// import java.swing.JoptionPane; This is incorrect to import because the name is not correct - missing X and Capital O
import javax.swing.JOptionPane;

public class LB01APart1{
    public static void main(String[] args){
//        double 2.3    = radius;  This is an error because there are extra spaces, and the assignment statement is backwards.
        double radius = 2.3;
//        double 3.1415926 = pi  This is also backwards with no semicolon. The variable name should be first, then assignment operator, then value.
        double pi = Math.PI;
//        double area   = pi * radius     There is no semicolon here
        double area = Math.PI * radius * radius;
        double diameter = 2 * radius;
        double circumference = diameter * pi;
//        System.println("The area of the circle is " + area);       This method is not correct. There is a missing ".out"
        System.out.println("The area of the circle is " + area);
//        System.printf("The area of the circle is \t = %3.4f", area);       This statement is not necessary
        
//      Print both diameter and circumference in console
        System.out.println("The circumference of the circle is " + circumference);
        System.out.println("The diameter of the circle is " + diameter);
        
        /*
         * Rest of the code shows how to output data using
         * JOptionPane GUI. 
        */
        
//      Print area, diameter, and circumference in window

        String areastring = "The area of the circle is " + area;
        String circumferencestring = "The circumference of the circle is " + circumference;
        String diameterstring = "The diameter of the circle is " + diameter;
//        JOptionPane.showMessageDialogBOX(null, s);         This is not correct because of the "BOX"
        JOptionPane.showMessageDialog(null, areastring);
        JOptionPane.showMessageDialog(null, circumferencestring);
        JOptionPane.showMessageDialog(null, diameterstring);
        
        /*
        First run
        The area of the circle is 16.619024853999996
        The circumference of the circle is 14.451325959999998
        The diameter of the circle is 4.6  
        
        Run after using Math.PI
        The area of the circle is 16.619025137490002
        The circumference of the circle is 14.451326206513047
        The diameter of the circle is 4.6
        */
        

    }
}
