package ch5;
/**
 * LoveCS.java
 * 
 * Code Description: Prints "I love Computer Science!!" a requested amount of times
 * 
 * @author peters
 * @version 12/14/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import scanner class

public class LoveCS
{
	/**
	 * main method - Prints "I love Computer Science!!" a requested amount of times
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		//declare/instantiate number of prints
		int iLimit;
		int iCount = 1;
		int iSum = 0;
		
		Scanner kb = new Scanner(System.in); //create scanner object
		
		//prompt the user for a print amount
		System.out.print("Please input an integer: ");
		iLimit = kb.nextInt();
		System.out.println("");
		
		//print loop for the requested amount
		while (iCount <= iLimit)
		{
			System.out.println(iCount + " I love Computer Science!!");
			iSum += iCount; //create sum of weighted print messages
			iCount++;
		}
		
		//print final message
		System.out.println("Printed this message " + iLimit + " times."
				+ " The sum of the numbers from 1 to " + iLimit + " is " + iSum + ".");
		
		kb.close(); //close scanner
	}
}
