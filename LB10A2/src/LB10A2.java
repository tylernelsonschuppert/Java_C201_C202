/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 * @since 2018/12/6
 * @version LB10A2
 */

import java.io.*;
import java.util.*;
import java.math.*;
public class LB10A2 {
	public static void main(String[] args) throws IOException
	{
		File file;
		Scanner in;
		
		int count;
		int countover90;
		double totalsalarydbl;
		BigDecimal totalsalarybigd;
		BigDecimal averagesalarybigd;
		BigDecimal percentover90bigd;
		
		String line;
		double currentsalarydbl;
		String currentsalarystr;
		
		file = new File("/Users/tylernelson/NetBeansProjects/LB10A2/src/POLICE.txt");
		in = new Scanner(file);
		
		count = 0;
		countover90 = 0;
		totalsalarydbl = 0.0;
		currentsalarydbl = 0.0;
		line = "";

		
		while (in.hasNext())
		{
			line = in.next();
			if (line.contains("$"))
			{
				String[] split = line.split("\\$");
				currentsalarystr = split[1];
				currentsalarystr = currentsalarystr.replace(",","");
				currentsalarydbl = Double.parseDouble(currentsalarystr);
				totalsalarydbl = totalsalarydbl + currentsalarydbl;
				count = count + 1;
				if (currentsalarydbl > 90000.0)
				{
					countover90 = countover90 + 1;
				}
			}
		}
		
		totalsalarybigd = new BigDecimal(totalsalarydbl).setScale(2, RoundingMode.CEILING);
		averagesalarybigd = new BigDecimal(totalsalarydbl / count).setScale(2, RoundingMode.CEILING);
		percentover90bigd = new BigDecimal((countover90 / (double) count) * 100).setScale(2, RoundingMode.CEILING);

		in.close();

		System.out.println("Count: " + count);
		System.out.println("Total Salaries: " + totalsalarybigd);
		System.out.println("Average Salary: " + averagesalarybigd);
		System.out.println("Salaries over $90,000: " + countover90);
		System.out.println("Percent of Salaries over $90,000: " + percentover90bigd + " percent");
	}
}