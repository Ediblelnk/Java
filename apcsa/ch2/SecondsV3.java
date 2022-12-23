package ch2;
/**
 * SecondsV3.java
 * 
 * Code Description: Prompts for and converts a time in hours, minutes, and seconds into total seconds
 * 
 * @author peters
 * @version 10/15/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class SecondsV3
{
  /**
   * main method - Prompts for and converts a time in hours, minutes, and seconds into total seconds
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // initializes finals for conversions of hour and minutes into seconds
	final int iSEC_TO_HOURS = 3600;
	final int iSEC_TO_MIN = 60;
	
	// declares a variable for the amount of time to be converted and total seconds
	int iHours;
	int iMinutes;
	int iSeconds;
	int iTotalSeconds;
	int iOriginalSeconds;
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // prompts for the number of hours to be converted
    System.out.println("Please input the total number of seconds: ");
    iOriginalSeconds = kb.nextInt();
    iTotalSeconds = iOriginalSeconds;
	
	// calculates the total number of hours and remaining seconds
    iHours = iTotalSeconds / iSEC_TO_HOURS;
    iTotalSeconds %= iSEC_TO_HOURS;
    
    // calculates the total number of minutes and remaining seconds
    iMinutes = iTotalSeconds / iSEC_TO_MIN;
    iTotalSeconds %= iSEC_TO_MIN;
    
    // calculates the remaining seconds
    iSeconds = iTotalSeconds;
	
	// prints the time in hours, minutes, and seconds and then converted to seconds only
	System.out.println("\n" + iOriginalSeconds + " seconds is equal to "
			+ iHours + " hours, " + iMinutes + " minutes, and " + iSeconds + " seconds.");
	
	kb.close(); // closing the Scanner object
  }
}