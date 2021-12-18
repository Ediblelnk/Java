package ch5;
/**
 * LeapYear.java
 * 
 * Code Description: Determines whether a year is a leap year or not
 * 
 * @author peters
 * @version 12/15/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import scanner class

public class LeapYear
{
	/**
	 * main method - Determines whether a year is a leap year or not
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//set the program to continue running until told not to
		boolean bRunning = true;
		
		//declare variables for year and condition
		String sRequest;
		Integer iwYear = 0;
		boolean bLeapYear;
		
		Scanner kb = new Scanner(System.in); //create scanner object
		
		//print welcome message
		System.out.println("Welcome to the Leap Year Calculator!");
		
		while(bRunning)
		{
			while(iwYear < 1582)
			{
				//prompt for a year request
				System.out.print("Please input a year, or 'exit' to exit: ");
				sRequest = kb.next();
				
				//exit the program if the user types 'exit'
				if(sRequest.toLowerCase().startsWith("ex"))
				{
					bRunning = false;
					break;
				}
					
				try //try to assign the request to a year
				{
					iwYear = Integer.valueOf(sRequest);
					if(iwYear < 1582)
						System.out.println("\nLeap years did not exist before 1582.\n");
				}
				catch(Exception e) //if unsuccessful display error message
				{
					System.out.println("\nPlease input an actual year or 'exit'!\n");
				}
			}
			
			if(!bRunning)
				break;
			
			//calculate whether the year is a leap year
			if(iwYear%4 == 0) //leap year if divisible by 4
			{
				if(iwYear%100 == 0) //not a leap year if divisible by 100
				{
					if(iwYear%400 == 0)
						bLeapYear = true; //leap year if divisible by 400
					else
						bLeapYear = false;
				}
				else
					bLeapYear = true;
			}
			else
				bLeapYear = false;
			
			//print output
			if(bLeapYear)
			{
				System.out.println(iwYear + " is a leap year.");
			}
			else
			{
				System.out.println(iwYear + " is not a leap year.");
			}
			
			//reset year to 0
			iwYear = 0;
		}
		
		kb.close(); //close scanner
	}
}