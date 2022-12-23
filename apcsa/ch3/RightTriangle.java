package ch3;
/**
 * RightTriangle.java
 * 
 * Code Description: Reads for the two legs of a right triangle 
 * 		and prints the hypotenuse
 * 
 * @author peters
 * @version 11/10/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class RightTriangle
{
  /**
   * main method - Reads for the two legs of a right trianle 
   * 	and prints the hypotenuse
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// declare variables for the legs and hypotenuse
	double dLegOne, dLegTwo;
	double dHypotenuse;
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // prompt for two leg double values
    System.out.print("Please input two right triangle leg lengths, separated by a space: ");
    dLegOne = kb.nextDouble();
    dLegTwo = kb.nextDouble();
    
    // calculate the hypotenuse length
    dHypotenuse = Math.sqrt(Math.pow(dLegOne,  2) + Math.pow(dLegTwo,  2));
    
    // print the hypotenuse length
    System.out.println("\nHypotenuse length: " + dHypotenuse);
    
    // closing the Scanner object
    kb.close(); 
  }
}