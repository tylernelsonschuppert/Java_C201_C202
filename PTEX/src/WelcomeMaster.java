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
public class WelcomeMaster
{
	//Attributes
	int x;
	String lastName;
	
	//Constructors
	public WelcomeMaster()
	{
		Scanner in;
		in = new Scanner(System.in);
		System.out.print("Enter your gender number (0(m)/1(f)): ");
		x = in.nextInt();
		System.out.print("Enter your last name: ");
		lastName = in.next();
	}
	
	//Methods
	public String getInitial(String s)
	{
		return s.substring(0,1);
	}
	
	public void welcome()
	{
		if (x == 0)
		{
			System.out.println("Welcome Master, Sir " + getInitial(lastName));
		}
		if (x == 1)
		{
			System.out.println("Welcome Master, Ma'am " + getInitial(lastName));
		}
	}
	
	public static void main(String[] args)
	{
		boolean cont;
		cont = true;
		while (cont == true)
		{
			Scanner in;
			in = new Scanner(System.in);
			WelcomeMaster welcomeMaster;
			welcomeMaster = new WelcomeMaster();
			welcomeMaster.welcome();
			System.out.print("Continue? (y/n): ");
			if ("n".equals(in.next()))
			{
				cont = false;
			}
		}
	}
}