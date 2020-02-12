/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 * @version LB10B
 * @since 2018/12/6
 */
import java.io.*;
import java.util.*;
public class LB10B
{
	//Attributes

	//Constructors
	
	//Methods
	public static void main(String[] args) throws IOException
	{
		File f;
		Scanner in;
		char s;
		double g;
		double mt;
		double ft;
		double ma, fa;
		int mc, fc;
	
		f = new File("/Users/tylernelson/NetBeansProjects/LB10B/src/genderGrade.txt");
		in = new Scanner(f);
		mt = 0;
		ft = 0;
		mc = 0;
		fc = 0;
		ma = 0;
		fa = 0;
		
		do 
		{
			s = in.next().charAt(0);
			g = in.nextDouble();
			if (s == 'M')
			{
				mc = mc +1;
				mt = mt + g;
			}
			if (s == 'F')
			{
				fc = fc +1;
				ft = ft + g;
			}
		} while (s != 'X');
		
		in.close();
		
		ma = mt/mc;
		fa = ft/fc;
	
		System.out.println("The average male GPA is " + ma);
		System.out.println("The average female GPA is " + fa);
		
	}
}