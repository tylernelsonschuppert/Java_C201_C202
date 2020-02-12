/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 * @version 1.0
 * @since 9-6-18
 */

import java.util.Scanner;
public class validateCreditCard
{
	public static void main(String[] args)
	{
		Scanner in;
		long cardNumber;
		String cardNumberString;
		int cardNumberLength;
		int sumOfEvenDigits;
		int sumOfOddDigits;
		int sumOfEvenAndOddDigits;
		
		in = new Scanner(System.in);
		System.out.print("Enter a credit card number as a long integer: ");
		cardNumber = in.nextLong();
		cardNumberString = String.valueOf(cardNumber);
		cardNumberLength = cardNumberString.length();
		
		/*Credit card numbers follow certain patterns. A credit card number must
		have between 13 and 16 digits. */
		if (cardNumberLength >= 13 && cardNumberLength <= 16)
		{
			/*If card number is 13, 14, 15, or 16 digits - do nothing and continue on.
			The example in the lab problem shows that a 16 digit card number is valid
			so we know that the range is inclusive. */
		}
		else
		{
			// If the card number is not 13, 14, 15, or 16 digits - print "cardNumber is invalid" and return
			System.out.println(cardNumber + " is invalid");
			return;
		}
		
		/*It must start with:
		4 for Visa cards
		5 for Master cards
		37 for American Express cards
		6 for Discover cards

		Check if the cardNumber starts with the requirements. If it does, do nothing and continue on.
		
		Else - card does not meet number standard/requirements, print "cardNumber is invalid" and return*/

		if (cardNumberString.substring(0,1).equals("4") || cardNumberString.substring(0,1).equals("5") || cardNumberString.substring(0,2).equals("37") || cardNumberString.substring(0,1).equals("6"))
		{
		}
		else
		{
			System.out.println(cardNumber + " is invalid");
			return;
		}
		
		/*
		1. Double every second digit from right to left. If doubling of a digit
		results in a two-digit number, add up the two digits to get a single-digit number.
		
		2. Now add all single-digit numbers from Step 1. 
		*/
		sumOfEvenDigits = 0;
		for (int i = cardNumberLength - 2; i >= 0; i -= 2)
		{
			char c = cardNumberString.charAt(i);
			int x = Character.getNumericValue(c);
			int xDoubled = x * 2;
			if (xDoubled <= 8)
			{
				sumOfEvenDigits = sumOfEvenDigits + xDoubled;
			}
			else if (xDoubled >= 10)
			{
				int z = xDoubled / 10 + xDoubled % 10;
				sumOfEvenDigits = sumOfEvenDigits + z;
			}
		}
		
		/*3. Add all digits in the odd places from right to left in the card number.
		6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38*/

		sumOfOddDigits = 0;
		for (int i = cardNumberLength - 1; i >= 0; i -= 2)
		{
			char c = cardNumberString.charAt(i);
			int x = Character.getNumericValue(c);
			sumOfOddDigits = sumOfOddDigits + x;
		}

		/*4. Sum the results from Step 2 and Step 3.
		37 + 38 = 75*/
		
		sumOfEvenAndOddDigits = sumOfOddDigits + sumOfEvenDigits;
		
		/*5. If the result from Step 4 is divisible by 10, the card number is
		valid; otherwise, it is invalid. For example, the number 4388576018402626
		is invalid, but the number 4388576018410707 is valid.*/
		
		if (sumOfEvenAndOddDigits % 10 == 0) {
			System.out.println(cardNumber + " is valid");
		}
		else
		{
			System.out.println(cardNumber + " is invalid");
		}
	}
}