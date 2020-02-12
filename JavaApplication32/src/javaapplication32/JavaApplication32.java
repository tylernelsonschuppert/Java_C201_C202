/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

/**
 *
 * @author tylernelson
 */
public class JavaApplication32 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
	}
	
	
	public static double calcAvg(int[] array)
	{
		int sum = 0;
		for(int i=0; i<array.length; i++)
		{
			sum += array[i];
			System.out.println("sums of an array " + sum);
		}
		return (double) sum / (array.length);
	}
	
	
	
	
	int i = 5;
	int sum = 0;
	while(i <= 543)
	{
		if(i % 13 == 0)
		{
			sum +=i;
			System.out.println("Sum so far" + sum);
		}
		i++;
	}
	
	public boolean isFull() {
		return(size == list.length); //
	}
	
	public int getElementAt(int index)
	{
		if((index >= 0) && (index < size))
		{
			return list[index];
		}
		else
		{
			System.out.println("OOB");
			return -1;
		}
	}
	
}
