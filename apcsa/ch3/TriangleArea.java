package ch3;
/**
 * TriangleArea.java
 * 
 * Code Description: Prompts for the side lengths of a triangle 
 * 		and prints the area to three decimal places
 * 
 * @author peters
 * @version 11/10/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; // import Scanner class
import java.text.DecimalFormat; // import DecimalFormat class

public class TriangleArea
{
  /**
   * main method - Prompts for the side lengths of a triangle 
   * 	and prints the area to three decimal places
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// declare variables for the lengths, semi-perimeter
	double dSideOne, dSideTwo, dSideThree,
		   dSemiPerimeter, dArea;
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // start DecimalFormat object
    DecimalFormat fmtDecimal = new DecimalFormat("0.000");
    
    // prompt for the side lengths
    System.out.print("Please input three side lengths, with a space between each: ");
    dSideOne = kb.nextDouble();
    dSideTwo = kb.nextDouble();
    dSideThree = kb.nextDouble();
    
    // calculate the semi-perimeter
    dSemiPerimeter = (dSideOne + dSideTwo + dSideThree) / 2.0;
    
    // calculate the triangle area
    dArea = Math.sqrt(dSemiPerimeter * (dSemiPerimeter - dSideOne) * 
    		(dSemiPerimeter - dSideTwo) * (dSemiPerimeter - dSideThree));
    
    // print the area rounded to three decimal places
    System.out.println("\nArea of the Triangle: " + fmtDecimal.format(dArea) + " square units");
    
    // closing the Scanner object
    kb.close(); 
  }
}