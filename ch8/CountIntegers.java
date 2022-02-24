package ch8;
/**
 * CountIntegers.java
 * 
 * Code Description: reads an arbitrary number of integers that are in the range -25 to 25 
 * 		inclusive and counts how many occurrences of each are entered
 * 
 * @author peters
 * @version 3/10/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class CountIntegers
{
	/**
	 * main method - reads an arbitrary number of integers that are in the range -25 to 25 
	 * 	inclusive and counts how many occurrences of each are entered
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//create finals for the upper and lower bounds of the numbers
		final int iUPPER_BOUND = 25;
		final int iLOWER_BOUND = -25;
		
		//create array for number storage
		int[] iStorage = new int[iUPPER_BOUND - iLOWER_BOUND + 1];
		int iInput = 0;
		int iIndex;
		
		Scanner kb = new Scanner(System.in); //instantiate scanner class
		
		//while loop
		while(iInput >= iLOWER_BOUND && iInput <= iUPPER_BOUND)
		{
			//prompt
			System.out.print("Input an integer between " + iLOWER_BOUND + " and " + iUPPER_BOUND + ","
					+ " or a number outside that to end: ");
			iInput = kb.nextInt();
			
			//store
			if(iInput >= iLOWER_BOUND && iInput <= iUPPER_BOUND)
				iStorage[iInput - iLOWER_BOUND]++;
		}
		
		//print out the number of numbers input into the system
		System.out.println();
		for(iIndex = 0; iIndex <= iUPPER_BOUND - iLOWER_BOUND; iIndex++)
		{
			if(iStorage[iIndex] != 0)
			{
				System.out.println((iIndex + iLOWER_BOUND) + ":\t" + iStorage[iIndex] + " " + (iStorage[iIndex] == 1? "time" : "times"));
			}
		}
		
		kb.close(); //close Scanner
	}
}