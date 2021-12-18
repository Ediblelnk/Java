package ch2;
/**
 * TravelTimeV2.java
 * 
 * Code Description: Prompts for a speed and distance traveled, determines the time 
 * 		and then prints the amount
 * 
 * @author peters
 * @version 10/15/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class TravelTimeV2
{
  /**
   * main method - Prompts for a speed and distance traveled, determines the time 
   * 	and then prints the amount
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // declares a variable a distance, velocity, and time
	float fDistance; // in meters
	float fVelocity; // in meters/second
	float fTime; // in seconds
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // prompts for a inputed distance
    System.out.println("Please input a distance in meters: ");
    fDistance = kb.nextFloat();
    
    // prompts for a inputed velocity
    System.out.println("Please input a velocity in meters per seconds: ");
    fVelocity = kb.nextFloat();
	
	// calculates the amount of time based on distance and velocity,
	// 	then assigns value to fTime
	fTime = fDistance / fVelocity;
	
	// prints the distance, velocity, and then the calculated time
	System.out.println("\nDistance:\t " + fDistance + " meters"
			+ "\nVelocity:\t " + fVelocity + " m/s"
			+ "\n\nCalculated Time: " + fTime + " seconds");
	
	kb.close(); // closing the Scanner object
  }
}