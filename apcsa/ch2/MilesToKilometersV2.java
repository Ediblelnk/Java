package ch2;
/**
 * MilesToKilometersV2.java
 * 
 * Code Description: Converts user inputed miles to kilometers and prints the result
 * 
 * @author peters
 * @version 10/15/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class MilesToKilometersV2
{
  /**
   * main method - Converts user inputed miles to kilometers and prints the result
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
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // prompts the user for a value of miles to be converted
    System.out.println("Please input a number of miles: ");
    fMiles = kb.nextFloat();
	
	// calculates the amount of kilometers based on the input amount of miles
	fKilometers = fMiles * fCONVERSION_FACTOR;
	
	// prints the input amount of miles and then the resulting kilometers
	System.out.println(fMiles + " Miles is equal to " + fKilometers + " Kilometers.");
	
	kb.close(); // closing the Scanner object
  }
}