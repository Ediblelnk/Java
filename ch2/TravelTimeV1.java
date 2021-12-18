package ch2;
/**
 * TravelTimeV1.java
 * 
 * Code Description: Given a speed and distance traveled, determines the time 
 * 		and then prints the amount
 * 
 * @author peters
 * @version 10/4/20  10/5/20
 * @contact 1009734@palisadessd.net
 */

public class TravelTimeV1
{
  /**
   * main method - Given a speed and distance traveled, determines the time 
   * 	and then prints the amount
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // initializes a distanceand a velocity
	float fDistance = 11f; // in meters
	float fVelocity = 5f; // in meters/second
	
	// declares a variable for time
	float fTime; // in seconds
	
	// calculates the amount of time based on distance and velocity,
	// 	then assigns value to fTime
	fTime = fDistance / fVelocity;
	
	// prints the distance, velocity, and then the calculated time
	System.out.println("Distance:\t " + fDistance + " meters"
			+ "\nVelocity:\t " + fVelocity + " m/s"
			+ "\n\nCalculated Time: " + fTime + " seconds");
	
  }
}