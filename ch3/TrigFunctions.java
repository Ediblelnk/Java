package ch3;
/**
 * TrigFunctions.java
 * 
 * Code Description: Generates a random integer between 20-40 and 
 * 		displays the sine, cosine, and tangent of that value
 * 
 * @author peters
 * @version 11/10/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Random; // import Random class

public class TrigFunctions
{
  /**
   * main method - Generates a random integer between 20-40 and 
   * 	displays the sine, cosine, and tangent of that value
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// declare the variables for the generated number
	int iValue;
	double dSin, dCos, dTan;
	
	// starts the number generator
    Random gen = new Random();
    
    // finds a random number between 20-40
    iValue = gen.nextInt(21) + 20;
    
    // calculates the sine, cosine, and tangent of the integer
    dSin = Math.sin(iValue);
    dCos = Math.cos(iValue);
    dTan = Math.tan(iValue);
    
    // prints the random number along with the sine, cosine, and tangent
    System.out.println("Generated Number: " + iValue
    		+ "\n\nSine Value:\t" + dSin
    		+ "\nCosine Value:\t" + dCos
    		+ "\nTangent Value:\t" + dTan);
  }
}