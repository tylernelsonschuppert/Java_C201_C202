/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
import java.util.*;
public class Grade
{
	//Attributes
	private double [][] scores;
	
	//Constructors
	public Grade()
	{
		Scanner in;
		in = new Scanner(System.in);
		System.out.print("Please input the number of courses: ");
		int courseCount = in.nextInt();
		System.out.print("Please input the number of students: ");
		int studentCount = in.nextInt();
		scores = new double[studentCount][courseCount];
	
		for(int i = 0; i < scores.length; i++)
		{
			for (int j = 0; j < scores[i].length; j++)
			{
				System.out.print("Please input the score: ");
				scores[i][j] = in.nextDouble();
			}
		}
	}
	
	public Grade(int row, int column)
	{
		scores = new double[row][column];
		
		for(int i = 0; i < scores.length; i++)
		{
			for (int j = 0; j < scores[0].length; j++)
			{
				scores[i][j] = (int) (Math.random() * 101);
			}
		}
	}
	
	//Methods

	public void printScores(double[] allScores)
	{
		for(int i = 0; i < allScores.length; i++)
		{
			System.out.print(allScores[i] + " ");
		}
	}
	
	public double getAverage(double[] studentScores)
	{
		double sum;
		sum = 0.0;
		for(int i = 0; i < studentScores.length; i++)
		{
			sum = sum + studentScores[i];
		}
		return ((sum)/(studentScores.length));
	}
	
	/*public void display()
	{
		for(int i = 0; i < scores.length; i++)
		{
			for(int j = 0; j < scores[i].length; j++)
			{
				System.out.println("Scores: " + printScores(scores[i]) + " Average: " + getAverage(scores[i]));	
			}
		}
	}*/
	public void display()
	{
		double averageTotal;
		averageTotal = 0;
		
		for(int i = 0; i < scores.length; i++)
		{
			printScores(scores[i]);
			System.out.println("Average: " + getAverage(scores[i]));
			
			averageTotal += getAverage(scores[i]);
		}
		
		System.out.println("Class Average: " + (averageTotal / scores.length));
	}
	
	public static void main(String[] args)
	{
		Grade g1;
		g1 = new Grade(7, 9);
		g1.display();
		Grade g2;
		g2 = new Grade();
		g2.display();
	}
}