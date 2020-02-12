/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */

package readandwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadandWrite {
	int sum = 0;
	int count = 0;
	int low = 1000;
	int high = 0;
	double avg;
	
	public void makeFile(){
		try{
			System.out.println("Making file....");
			File outFile = new File("data.txt");
			PrintWriter out = new PrintWriter(outFile);
				int num = 0;
				for (int i = 0; i < 500; i++) {
					num = ((int)(1000*Math.random()+1));
					System.out.print(num + " "); //echo
					if (((i+1) % 20)== 0)System.out.println("");//skip line
					out.println(num);
				}//i
				out.close();
			}//try
		catch(Exception e){
			System.out.println(e);
		}//catch
	}//make
	public void readFile(){
		try {
			File inFile = new File("data.txt");
			Scanner input = new Scanner(inFile);
			
			while (input.hasNext()){
				int num = input.nextInt();
				if (num > high) high = num;
				if (num < low) low = num;
				sum += num;
				count++;
				System.out.print(num+" sum so far  : "+sum+"  //  ");
				if (((count+1) % 15)==0) System.out.println("");
			}//while
			input.close();
		}//try
		catch (Exception ex){
			System.out.println("File not found");
		}//catch
	}//read
	public void showDivision(){
		boolean done = false;
		while (!done) {
			try {
				Scanner input = new Scanner(System.in);

				System.out.println("Enter two numbers: ");
				int num = input.nextInt();
				int den = input.nextInt();

			//	if (den == 14) throw new CuzICan(" here is this part");

				int solution = num/den;
				System.out.print("Solution is " + solution);

				done = true;
			} //try

			catch(ArithmeticException e) {
				System.out.println("not zero!!");
				System.out.println("error is: " + e);
			} //catch

			catch (InputMismatchException e) {
				System.out.println("need an integer number!!");
				System.out.println("error is: " + e);
			} //catch

			catch (Exception e) {
				System.out.println("Come on...can not do that!");
				System.out.println("error is: " + e);
			} //catch	
		}//while
	}//Div
	public void writeFile() throws FileNotFoundException{
		try {
			File outFile = new File("dataOut.txt");
			PrintWriter output = new PrintWriter(outFile);
			
			output.println("==============");
			output.println("Sum   :"+ sum);
			output.println("Count :"+ count);
			output.printf("Avg   :%6.2f", avg);
			output.println("");
			output.println("==============");
			
			System.out.println("File Written");
			output.close();
		}//try
		
		catch(Exception Ex){
			
		}//catch
	}//writeFile
	
	public void display() throws FileNotFoundException{
			System.out.println("==============");
			System.out.println("Sum   :"+ sum);
			System.out.println("Count :"+ count);
			System.out.printf("Avg   :%6.2f", avg);
			System.out.println("");
			System.out.println("high :"+ high);
			System.out.println("Low :" + low);
			System.out.println("==============");
			
			writeFile(); // yikes!!!!
	}
		/**
		 * @param args the command line arguments
		 */
	public static void main(String[] args) throws FileNotFoundException {
		ReadandWrite ans = new ReadandWrite();
		
		ans.makeFile();
		ans.readFile();
		ans.writeFile();
		ans.avg = (double)ans.sum/ans.count;
		ans.display();
		ans.showDivision();
	}//main
}//class