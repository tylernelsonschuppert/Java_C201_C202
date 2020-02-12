/**
 * This is airplane seats assigning program.
 * 
 * @author (Tyler Nelson) 
 * @version (LB09)
 */

// import required libraries
import java.io.*;
import java.util.Scanner;
public class ASA
{

    /**
     * Constructor for objects of class ASA
     * declare and initialize the local variables.
     * Initialize the seats array with '*' character.
     * Until a user choose to stop the program, repeat the program.
     * First display the current seat assignment map.
     * Display the menus and instructions, then a user choose one 
     * from the menu then type in required seat number.  Next assign 
     * the user to the user's requested seat.  Then report the resulr.
     */
    public ASA() throws IOException
    {
        // declare and initialize the local variables
        Scanner scnr = new Scanner(System.in);
        int choice;
        char [][] seats = new char[13][6];
        String seatNo = "";
        int row = 0;
        int column = 0;
		char columnChar;
		String columnStr;

                
        // initialize the seats array with '*' character.
		for (int y = 0; y < seats.length; y++)
		{
			for (int x = 0; x < seats[0].length; x++)
			{
				seats[y][x] = '*';
			}
		}
		
		// Until a user choose to stop the program, repeat the program.
		choice = 1;
		while (choice != 4)
		{
			// First display the current seat assignment map.
			printSeats(seats);
			// Display the menus and instructions
			printMenu();
			// then a user choose one from the menu
			choice = scnr.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println();
					System.out.println("Enter the seat number you want: ");
					// then type in required seat number.
					seatNo = scnr.next();
					if (seatNo.length() == 3)
					{
						System.out.println();
						System.out.println("Your requested seat is not a first-class seat, try again.");
						System.out.println();
						seatNo = "";
						break;
					}
					row = Integer.parseInt(seatNo.substring(0, 1));
					
					if (row == 1 || row == 2)
					{
						columnStr = seatNo.substring(1,2);
						columnChar = columnStr.charAt(0);
						// Using single line if statements/brackets to clean up code
						if (columnChar == 'A') { column = 0; }
						if (columnChar == 'B') { column = 1; }
						if (columnChar == 'C') { column = 2; }
						if (columnChar == 'D') { column = 3; }
						if (columnChar == 'E') { column = 4; }
						if (columnChar == 'F') { column = 5; }
						First(seats, row - 1, column);
						break;
					}
					else
					{
						System.out.println();
						System.out.println("Your requested seat is not a first-class seat, try again.");
						System.out.println();
						break;
					}
				case 2:
					System.out.println();
					System.out.println("Enter the seat number you want: ");
					// then type in required seat number.
					seatNo = scnr.next();
					if (seatNo.length() == 3)
					{
						row = Integer.parseInt(seatNo.substring(0, 2));
					}
					else
					{
						row = Integer.parseInt(seatNo.substring(0, 1));
					}
					if (row >= 8 && row <= 13)
					{
						if (seatNo.length() == 3)
						{
							columnStr = seatNo.substring(2,3);
							columnChar = columnStr.charAt(0);
						}
						else
						{
							columnStr = seatNo.substring(1,2);
							columnChar = columnStr.charAt(0);
						}
						// Using single line if statements/brackets to clean up code
						if (columnChar == 'A') { column = 0; }
						if (columnChar == 'B') { column = 1; }
						if (columnChar == 'C') { column = 2; }
						if (columnChar == 'D') { column = 3; }
						if (columnChar == 'E') { column = 4; }
						if (columnChar == 'F') { column = 5; }
						EconomySmoking(seats, row - 1, column);
						break;
					}
					else
					{
						System.out.println("Your requested seat is not a Economy Smoking seat, try again.");
						break;
					}
				case 3:
					System.out.println();
					System.out.println("Enter the seat number you want: ");
					// then type in required seat number.
					seatNo = scnr.next();
					if (seatNo.length() == 3)
					{
						row = Integer.parseInt(seatNo.substring(0, 2));
					}
					else
					{
					row = Integer.parseInt(seatNo.substring(0, 1));
					}
					
					if (row >= 3 && row <= 7)
					{
						columnStr = seatNo.substring(1,2);
						columnChar = columnStr.charAt(0);
						// Using single line if statements/brackets to clean up code
						if (columnChar == 'A') { column = 0; }
						if (columnChar == 'B') { column = 1; }
						if (columnChar == 'C') { column = 2; }
						if (columnChar == 'D') { column = 3; }
						if (columnChar == 'E') { column = 4; }
						if (columnChar == 'F') { column = 5; }
						EconomyNonSmoking(seats, row - 1, column);
						break;
					}
					else
					{
						System.out.println("Your requested seat is not a Economy Non-Smoking seat, try again.");
						break;
					}
				case 4:
					System.out.println("You are now quitting the program, thank you.");
					break;
			}
		}
	}
    
    /**
     * printSeats method gets an array for seats 
     * then prints the current status of seats.
     * 
     * @param  seatStatus   a parameter for an seats array.
     * @return              no returns at all. 
     */
    public void printSeats(char [][] seatStatus)
    {
		System.out.println ("       A B C D E F");
		for (int x = 0; x < seatStatus.length; x++)
		{
			System.out.print("Row " + (x + 1));
			if (x < 9)
			{
				System.out.print(" ");
			}
			for (int y = 0; y < seatStatus[0].length; y++)
			{
				System.out.print(" " + seatStatus[x][y]);
			}
			System.out.println();
			
		}
    }

    /**
     * printMenu method prints the menu of this program's operations.
     * 
     * @param               no parameter.
     * @return              no returns at all. 
     */    
    public void printMenu()
    {
		System.out.println("MENU=======================================");
		System.out.println("1. First Class");
		System.out.println("2. Economy Class - Smoking");
		System.out.println("3. Economy Class - Non Smoking");
		System.out.println("4. Quit this program");
		System.out.println("===========================================");
		System.out.println();
		System.out.println("Enter your choice (1,2,3, or 4): ");
	}
	
    /**
     * First method gets an array for seats, and a seat number, 
     * then assign the requested seat. If already assigned by another user
     * or requested wrong seats, prints a warning message.
     * 
     * @param  seatStatus   a parameter for an seats array.
     * @param  row          row number of the requested seat
     * @param  col          column number of the requested seat
     * @return              no returns at all. 
     */    
    public void First(char [][] seatStatus, int row, int col)
    {
		char columnChar;
		columnChar = 'X';
		if (seatStatus[row][col] == '*')
		{
			// real seat assignment operation here.
			seatStatus[row][col] = 'X';
			// Add 1 to row for output
			row = row + 1;
			// Used to convert row/column back to seat number for output
			if (col == 0) { columnChar = 'A'; }
			if (col == 1) { columnChar = 'B'; }
			if (col == 2) { columnChar = 'C'; }
			if (col == 3) { columnChar = 'D'; }
			if (col == 4) { columnChar = 'E'; }
			if (col == 5) { columnChar = 'F'; }
			System.out.println();
			System.out.println("Your requested seat (" + row + columnChar + ") is reserved for you.");
			System.out.println();
		}
		else
		{
			System.out.println();
			System.out.println("Your requested seat has already assigned to another customer.");
			System.out.println();
		}
		// Check for invalid seat number and print of warning message already completed above after input before method call
		// (If the seat is in a valid First Class row, then call the First method)
    }
    
    /**
     * EconomySmoking method gets an array for seats, and a seat number, 
     * then assign the requested seat. If already assigned by another user
     * or requested wrong seats, prints a warning message.
     * 
     * @param  seatStatus   a parameter for an seats array.
     * @param  row          row number of the requested seat
     * @param  col          column number of the requested seat
     * @return              no returns at all. 
     */        
    public void EconomySmoking(char [][] seatStatus, int row, int col)
    {
		char columnChar;
		columnChar = 'X';
		if (seatStatus[row][col] == '*')
		{
			// real seat assignment operation here.
			seatStatus[row][col] = 'X';
			// Add 1 to row for output
			row = row + 1;
			// Used to convert row/column back to seat number for output
			if (col == 0) { columnChar = 'A'; }
			if (col == 1) { columnChar = 'B'; }
			if (col == 2) { columnChar = 'C'; }
			if (col == 3) { columnChar = 'D'; }
			if (col == 4) { columnChar = 'E'; }
			if (col == 5) { columnChar = 'F'; }
			System.out.println();
			System.out.println("Your requested seat (" + row + columnChar + ") is reserved for you.");
			System.out.println();
		}
		else
		{
			System.out.println();
			System.out.println("Your requested seat has already assigned to another customer.");
			System.out.println();
		}
		// Check for invalid seat number and print of warning message already completed above after input before method call
		// (If the seat is in a valid EconomySmoking row, then call the EconomySmoking method)
    }
    
    /**
     * EconomyNonSmoking method gets an array for seats, and a seat number, 
     * then assign the requested seat. If already assigned by another user
     * or requested wrong seats, prints a warning message.
     * 
     * @param  seatStatus   a parameter for an seats array.
     * @param  row          row number of the requested seat
     * @param  col          column number of the requested seat
     * @return              no returns at all. 
     */            
    public void EconomyNonSmoking(char [][] seatStatus, int row, int col)
    {
		char columnChar;
		columnChar = 'X';
		if (seatStatus[row][col] == '*')
		{
			// real seat assignment operation here.
			seatStatus[row][col] = 'X';
			// Add 1 to row for output
			row = row + 1;
			// Used to convert row/column back to seat number for output
			if (col == 0) { columnChar = 'A'; }
			if (col == 1) { columnChar = 'B'; }
			if (col == 2) { columnChar = 'C'; }
			if (col == 3) { columnChar = 'D'; }
			if (col == 4) { columnChar = 'E'; }
			if (col == 5) { columnChar = 'F'; }
			System.out.println();
			System.out.println("Your requested seat (" + row + columnChar + ") is reserved for you.");
			System.out.println();
		}
		else
		{
			System.out.println();
			System.out.println("Your requested seat has already assigned to another customer.");
			System.out.println();
		}
		// Check for invalid seat number and print of warning message already completed above after input before method call
		// (If the seat is in a valid EconomyNonSmoking row, then call the EconomyNonSmoking method)
    }
	public static void main(String args[]) throws IOException
	{ 
		ASA newasa;
		newasa = new ASA();
	}
}