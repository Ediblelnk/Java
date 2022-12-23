package ch2;
/**
 * SecondsV1.java
 * 
 * Code Description: Converts a time in hours, minutes, and seconds into total seconds
 * 
 * @author peters
 * @version 10/4/20  10/5/20
 * @contact 1009734@palisadessd.net
 */

public class SecondsV1
{
  /**
   * main method - Converts a time in hours, minutes, and seconds into total seconds
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // initializes finals for conversions of hour and minutes into seconds
	final int iHOURS_TO_SEC = 3600;
	final int iMINUTES_TO_SEC = 60;
	
	// initializes a variable for the amount of time to be converted
	int iHours = 22;
	int iMinutes = 33;
	int iSeconds = 44;
	
	// declares a variable for total seconds
	int iTotalSeconds;
	
	// calculates the total number of seconds
	iTotalSeconds = (iHours * iHOURS_TO_SEC) + (iMinutes * iMINUTES_TO_SEC) + iSeconds;
	
	// prints the time in hours, minutes, and seconds and then converted to seconds only
	System.out.println(iHours + " Hours, " + iMinutes + " Minutes, and "
			+ iSeconds + " seconds is equal to " + iTotalSeconds + " seconds.");
  }
}