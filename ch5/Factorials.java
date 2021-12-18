package ch5;
/**
 * Factorials.java
 * 
 * Code Description: Program that calculates the factorial of the inputted integer
 * 
 * @author peters
 * @version 12/14/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import the scanner class

public class Factorials
{
	/**
	 * main method - Program that calculates the factorial of the inputted integer
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//create variables for the while loop and input
		int iInput = -1;
		int iCount = 1;
		long lFactorial = 1;
		
		//create Scanner object
		Scanner kb = new Scanner(System.in);
		
		//prompt user for the integer input, continues when input
		//is a non-negative integer
		while(iInput < 0)
		{
			System.out.print("Please input a non-negative integer: ");
			iInput = kb.nextInt();
			
			if(iInput < 0)
				System.out.println("That is a negative!\n");
		}
		
		//while loop to calculate the factorial of iInput
		while(iCount <= iInput)
		{
			lFactorial *= iCount;
			iCount++;
		}
		
		//output calculated number
		System.out.println(iInput + " factorial is " + lFactorial);
		
		kb.close(); //close scanner
	}
}