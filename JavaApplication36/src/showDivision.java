/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class showDivision
{
		public void showDivision()
			{
			boolean done = false;
			while (!done)
			{
				try
				{
					Scanner input = new Scanner(System.in);

					System.out.println("Enter two numbers:");
					int num = input.nextInt();
					int den = input.nextInt();

					//if (den == 14) throw new CuzICan(" here is this part");

					int solution = num/den;
					System.out.println("Solution is " + solution);

					done = true;
				}
			catch(ArithmeticException e)
			{
				System.out.println("not zero!!");
				System.out.println("error is: " + e);
			}

			catch (InputMismatchException e)
			{
				System.out.println("need an integer number!!");
				System.out.println("error is: " + e);
			} //catch

			catch (Exception e)
			{
				System.out.println("Come on...can not do that!");
				System.out.println("error is: " + e);
			}//exm	
		}//while		
	}//div
}