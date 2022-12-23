package ch2;
/**
 * MilesToKilometersV1.java
 * 
 * Code Description: Converts miles to kilometers and prints the result
 * 
 * @author peters
 * @version 10/4/20  10/5/20
 * @contact 1009734@palisadessd.net
 */

public class MilesToKilometersV1
{
  /**
   * main method - Converts miles to kilometers and prints the result
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // initializes a final float "fCONVERSION_FACTOR"
	final float fCONVERSION_FACTOR = 1.60935f;
	
	// declares variables for miles and kilometers
	float fMiles;
	float fKilometers;
	
	// initializes a value for miles
	fMiles = 182f;
	
	// calculates the amount of kilometers based on the input amount of miles
	fKilometers = fMiles * fCONVERSION_FACTOR;
	
	// prints the input amount of miles and then the resulting kilometers
	System.out.println(fMiles + " Miles is equal to " + fKilometers + " Kilometers.");
	
  }
}