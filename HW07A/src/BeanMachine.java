/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 * @version HW07A
 * @since 10/14/18
 */
import java.util.Scanner;
public class BeanMachine {
	
	//Attributes
	Scanner in;
	int numberOfBalls;
	int numberOfSlots;
	int numberOfNails;
	int [] array;
	
	//Constructors
	public void BeanMachine()
	{
		in = new Scanner(System.in);
		numberOfBalls = 0;
		numberOfSlots = 0;
		numberOfNails = 0;
		System.out.print("Please input the number of balls: ");
		numberOfBalls = in.nextInt();
		System.out.println();
		System.out.print("Please input the number of slots: ");
		numberOfSlots = in.nextInt();
		System.out.println();
		numberOfNails = numberOfSlots - 1;	
		array = new int[numberOfNails]; 
		
		for (int i = 0; i < numberOfBalls; i++)
		{
			int ballNumber = 0;
			ballNumber = i;
			for (int j = 0; j < numberOfNails; j++)
			{
				if (getRandomNumber() >= 0.5)
				{
					array[j]++;
				}
			}
			System.out.print("Here is that path for ball number " + (ballNumber + 1) + ": ");
			outputPath(array);
			clearArray(array);
		}
	}

	//Methods
	public static double getRandomNumber()
	{
		double x = Math.random();
		return x;
	}
	public static void outputPath(int[] array)
	{
		char leftOrRight;
		leftOrRight = 'X';
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == 0)
			{
				leftOrRight = 'L';
			}
			if (array[i] == 1)
			{
				leftOrRight = 'R';
			}
			System.out.print(leftOrRight);
		}
		System.out.println();
	}
	public static void clearArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			array[i] = 0;
		}
	}
	public static void main(String args[])
	{
		BeanMachine beanMachine;
		beanMachine = new BeanMachine();
		beanMachine.BeanMachine();
	}
}