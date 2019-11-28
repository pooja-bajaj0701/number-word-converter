package com.virtusa.numbertowordconversion;
import java.io.*;

import com.virtusa.numbertowordconversion.servicelayer.NumberToWordConversion;
import com.virtusa.numbertowordconversion.validations.ValidNumber;
/**
 * Number to word conversion in British English
 *
 */
public class MainClass 
{
	public static void main( String[] args ) 
	{
		System.out.println("Enter number to convert  it into British English word");
		BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));

		try {
			String numberInput = readInput.readLine();
			if(numberInput != null) {
				ValidNumber validation = new ValidNumber();
				boolean validNumber = validation.validateIfNumber(numberInput);

				if(validNumber) {
					System.out.println("Validation Completed, it's a number");
					NumberToWordConversion numWord = new NumberToWordConversion();
					String word = numWord.numberToWordConversion(numberInput);
					System.out.println("British Word is "+ word.toLowerCase());
				} else {
					System.out.println("Please enter valid number, exiting");
				}
			}

		}
		catch(IOException ios) {
			System.out.println(ios.getMessage());
			try {
				if(readInput != null)
					readInput.close();
			} catch(IOException io) {
				io.printStackTrace();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
