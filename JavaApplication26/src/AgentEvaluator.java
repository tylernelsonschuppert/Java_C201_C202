/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
import java.util.Scanner;
public class AgentEvaluator
{
	//Attributes
	Scanner in;
	double [] agentScores;

	//Constructors
	public AgentEvaluator()
	{
		in = new Scanner(System.in);
		System.out.print("How many scores? ");
		agentScores = new double [in.nextInt()];
		System.out.print("Enter scores: ");
		for(int i = 0; i < agentScores.length; i++)
		{
			agentScores[i] = in.nextDouble();
		}
		
		for(int i = 0; i < agentScores.length; i++)
		{
			if (agentScores[i] < 0.0)
			{
				System.out.println("Warning: negative scores(s) entered.");
				break;
			}
		}	
	}
	
	//Methods
	public double getTotal(double[] scores)
	{
		double total;
		total = 0;
		int i = 0;
		while (i < scores.length)
		{
			total = total + scores[i];
			i = i + 1;
		}
		return total;
	}
	
	public double getAverage()
	{
		double average;
		average = 0;
		average = getTotal(agentScores) / agentScores.length;
		return average;
	}
	
	public void displayScores()
	{
		System.out.print(agentScores.length + " scores: ");
		for (int i = 0; i <agentScores.length; i++)
		{
			System.out.print(" " + agentScores[i]);
		}
		System.out.println();
		System.out.println("Total: " + getTotal(agentScores) + "  Average: " + getAverage());
	}
}