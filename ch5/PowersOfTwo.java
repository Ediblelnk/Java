package ch5;
/**
 * PowersOfTwo.java
 * 
 * Code Description: Prints a requested number of powers of two
 * 
 * @author peters
 * @version 12/14/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import scanner class

public class PowersOfTwo
{
	/**
	 * main method - Prints a requested number of powers of two
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//create variables for power request, power, and result
		int iRequest = 0;
		int iPower = 0;
		int iResult = 1;
		
		Scanner kb = new Scanner(System.in); //create scanner object
		
		//require an non-negative integer input from user
		while(iRequest <= 0)
		{
			System.out.print("Please input a positive integer: ");
			iRequest = kb.nextInt();
			
			if(iRequest <= 0)
				System.out.println("That's not positive!\n");
		}
		
		//print confirmation message
		System.out.println("\nHere are the first " + iRequest + " powers of 2:");
		
		//while loop printing the requested powers of two
		while(iPower <= iRequest)
		{
			System.out.println("2^" + iPower + " = " + iResult);
			iResult *= 2;
			iPower++;
		}
		
		kb.close(); //close scanner
	}
}