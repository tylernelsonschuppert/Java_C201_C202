/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Project:  Compute Weekly Hours for Each Employee
Problem Description:

Suppose the weekly hours for all employees are stored in a two-dimensional array.
Each row records an employee’s seven-day work hours with seven columns. For
example, the following array stores the work hours for eight employees. Write a
program that displays employee and their hours in decreasing order of the
total hours.
*/

/**
 *
 * @author tylernelson
 * @version HW08A
 * @since 10/28/18
 */

import java.util.Scanner;
import java.io.*;
public class WeeklyHours
{
	//Attributes
	//Total number of employees, from user input
	private int numberOfEmployees;
	
	//Temporary variables assigned by user input then cleared
	private int mondayHours, tuesdayHours, wednesdayHours, thursdayHours, fridayHours,
	saturdayHours, sundayHours;
	
	/*Temporary variable, calculated by sum of all above user input
	variables then cleared*/
	private int totalWeeklyHours;
	
	//For second-dimension array position values, friendly referencing
	private int monday, tuesday, wednesday, thursday, friday, saturday, sunday;
	private int originalEmployeeNumber, total;
	
	//Define the array and input Scanner
	private static int [][] employeeHours;
	private Scanner in;
	
	//Constructors
	public WeeklyHours() throws IOException
	{		
		//Input number of employees
		in = new Scanner(System.in);
		System.out.print("[PLEASE INPUT TOTAL NUMBER OF EMPLOYEES]: ");
		numberOfEmployees = in.nextInt();
		System.out.println();
		
		//Initialize variables for friendly referencing the array
		originalEmployeeNumber = 0;
		monday = 1; tuesday = 2; wednesday = 3; thursday = 4; friday = 5;
		saturday = 6; sunday = 7;
		total = 8;
		
		//Initialize the multi-dimensional array with the correct size and values of 0
		employeeHours = new int [numberOfEmployees][9];
		
		for (int y = 0; y < employeeHours.length; y++)
		{
			for (int x = 0; x < employeeHours[0].length; x++)
			{
				employeeHours[y][x] = 0;
			}
		}
	}
	
	//Methods
	/*Write a method for getting and assigning the value of each element to
	the array, for each employee - hours per day and total weekly hours, then 
	initialize all temporary variables back to 0*/
	public void assignHours()
	{
		System.out.println("[PLEASE INPUT HOURS WORKED]:");
		System.out.println();
		for(int i = 0; i <= numberOfEmployees - 1; i++)
		{
			employeeHours[i][originalEmployeeNumber] = i + 1;  // sets the original employee number
			
			//sets the number of hours worked per week day to the respective 
			System.out.print("[Employee " + (i + 1) + "] [Monday]: ");
			mondayHours = in.nextInt();
			employeeHours[i][monday] = mondayHours;
			System.out.print("[Employee " + (i + 1) + "] [Tuesday]: ");
			tuesdayHours = in.nextInt();
			employeeHours[i][tuesday] = tuesdayHours;
			System.out.print("[Employee " + (i + 1) + "] [Wednesday]: ");
			wednesdayHours = in.nextInt();
			employeeHours[i][wednesday] = wednesdayHours;
			System.out.print("[Employee " + (i + 1) + "] [Thursday]: ");
			thursdayHours = in.nextInt();
			employeeHours[i][thursday] = thursdayHours;
			System.out.print("[Employee " + (i + 1) + "] [Friday]: ");
			fridayHours = in.nextInt();
			employeeHours[i][friday] = fridayHours;
			System.out.print("[Employee " + (i + 1) + "] [Saturday]: ");
			saturdayHours = in.nextInt();
			employeeHours[i][saturday] = saturdayHours;
			System.out.print("[Employee " + (i + 1) + "] [Sunday]: ");
			sundayHours = in.nextInt();
			employeeHours[i][sunday] = sundayHours;
			System.out.println();
			
			/*calls getTotalWeeklyHours() method which returns the number of hours worked in the week
			for the given employee*/
			employeeHours[i][total] = getTotalWeeklyHours(i);
			
			//clears all of the MondayHours-SundayHours variables for reuse
			clearVariables();
		}
	}
	
	//Write a method for getting total number of hours for a given employee
	public int getTotalWeeklyHours(int employeeNumber)
	{
		totalWeeklyHours =
				employeeHours[employeeNumber][monday] + 
				employeeHours[employeeNumber][tuesday] + 
				employeeHours[employeeNumber][wednesday] + 
				employeeHours[employeeNumber][thursday] + 
				employeeHours[employeeNumber][friday] + 
				employeeHours[employeeNumber][saturday] + 
				employeeHours[employeeNumber][sunday];
		return totalWeeklyHours;
	}
	
	//Write a method for initializing the value of all hour related variables to 0
	public void clearVariables()
	{
		mondayHours = 0; tuesdayHours = 0; wednesdayHours = 0; thursdayHours = 0;
		fridayHours = 0; saturdayHours = 0; sundayHours = 0; totalWeeklyHours = 0;
	}
	
	// Write a method for printing the header for the table
	public void printHeader()
	{
		System.out.format("%1$-8s%2$-4s%3$-4s%4$-4s%5$-4s%6$-4s%7$-4s%8$-4s%9$-4s",
				"", "Su", "M", "T", "W", "Th", "F", "S", "Total");
		System.out.println("");
	}
	
	/*Write a method for outputting a table containing hours per day and total
	weekly hours, per employee*/
	public void printTable()
	{
		for (int i = 0; i <= numberOfEmployees - 1; i++) // for each employee in the array
		{
			System.out.format("%1$-8s%2$-4s%3$-4s%4$-4s%5$-4s%6$-4s%7$-4s%8$-4s%9$-4s",
					"Emp " + employeeHours[i][originalEmployeeNumber],
					employeeHours[i][monday], employeeHours[i][tuesday],
					employeeHours[i][wednesday], employeeHours[i][thursday],
					employeeHours[i][friday], employeeHours[i][saturday], 
					employeeHours[i][sunday], employeeHours[i][total]);
			System.out.println("");
		}
	}
	
	//Write a method to bubble sort the array by total work hours - descending
	public void bubbleSort(int[][] array)
	{
		int [] temp;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 1; j < (array.length - i); j++)
			{
				if (array[j - 1][total] < array[j][total])
				{
				//swap the elements!
				temp = array[j - 1];
				array[j - 1] = array[j];
				array[j] = temp;
				}
			}
		}
	}
	
	//Write main method: create new object, call necessary methods
	public static void main(String args[]) throws IOException
	{
		WeeklyHours weeklyHours;
		weeklyHours = new WeeklyHours();
		weeklyHours.assignHours();
		weeklyHours.printHeader();
		weeklyHours.bubbleSort(employeeHours);
		weeklyHours.printTable();
	}
}