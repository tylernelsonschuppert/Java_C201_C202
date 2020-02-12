/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */

public void showDivision(){
	boolean done = false;
	while (!done)
	{
		try
		{
			Scanner input = new Scanner(System.in);
		
			System.out.println("Enter two numbers: ");
			int num = input.nextInt();
			int den = input.nextInt();
		
			if (den ==14) throw new CuzICan(" here is this part");
		
			int solution = num/den;
			System.out.print("Solution is " + solution);
		
			done = true;
		} //try
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("not zero!!");
		System.out.println("error is: " + e);
	} //catch
	
	catch (InputMismatchException e)
	{
		System.out.println("need an integer number!!");
		System.out.println("error is: " + e);
	} //catch

	catch (Exception e)
	{
		System.out.println("Come on...can not do that!");
		System.out.println("error is: " + e);
	}
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Class3New = new showDivision();
		
	}
	
}
