package ch2;
/**
 * SecondsV2.java
 * 
 * Code Description: Prompts for and converts a time in hours, minutes, and seconds into total seconds
 * 
 * @author peters
 * @version 10/15/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class SecondsV2
{
  /**
   * main method - Prompts for and converts a time in hours, minutes, and seconds into total seconds
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // initializes finals for conversions of hour and minutes into seconds
	final int iHOURS_TO_SEC = 3600;
	final int iMINUTES_TO_SEC = 60;
	
	// declares a variable for the amount of time to be converted and total seconds
	int iHours;
	int iMinutes;
	int iSeconds;
	int iTotalSeconds;
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // prompts for the number of hours to be converted
    System.out.println("Please input the number of hours: ");
    iHours = kb.nextInt();
    
    // prompts for the number of minutes to be converted
    System.out.println("Please input the number of minutes: ");
    iMinutes = kb.nextInt();
    
    // prompts for the amount of secodns to be converted
    System.out.println("Please input the number of seconds: ");
    iSeconds = kb.nextInt();
	
	// calculates the total number of seconds
	iTotalSeconds = (iHours * iHOURS_TO_SEC) + (iMinutes * iMINUTES_TO_SEC) + iSeconds;
	
	// prints the time in hours, minutes, and seconds and then converted to seconds only
	System.out.println(iHours + " Hours, " + iMinutes + " Minutes, and "
			+ iSeconds + " seconds is equal to " + iTotalSeconds + " seconds.");
	
	kb.close(); // closing the Scanner object
  }
}