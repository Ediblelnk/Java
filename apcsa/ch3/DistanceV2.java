package ch3;
/**
 * DistanceV2.java
 *
 * Code Description: Computes the distance between two points
 * 		and formats the proper output, rounded to three decimal points
 *    
 * @author peters
 * @version 11/3/20
 * @contact 1009734@palisadessd.net
 */

import java.text.DecimalFormat;
// import the Scanner class
import java.util.Scanner;
// import the DecimalFormat class

public class DistanceV2
{
  /**
   * main method - Computes the distance between two points
   * 	and formats the proper out, rounded to three decimal points
   * @param args
   */
  public static void main (String[] args)
  {
	// declare doubles for each point x and y and distance
    double dXOne, dYOne, dXTwo, dYTwo; 
    double dDistance; 
    
    // declare Scanner as "kb"
    Scanner kb = new Scanner(System.in);
    // declare DecimalFormat as "fmtDecimal"
    DecimalFormat fmtDecimal = new DecimalFormat("0.000");
    
    // prompts the user for the first point
    System.out.print("Enter the coordinates of the first point " +
      "(put a space between them): ");
    dXOne = kb.nextDouble();
    dYOne = kb.nextDouble();

    // prompts the user for the second point
    System.out.print("Enter the coordinates of the second point: ");
    dXTwo = kb.nextDouble();
    dYTwo = kb.nextDouble();

    // compute the distance 
    // (the square root of the sum of the squares of the differences of the x and y values)
    dDistance = Math.sqrt((Math.pow((dXOne - dXTwo), 2) + Math.pow((dYOne - dYTwo), 2)));

    // print out the answer
    System.out.println("\nWith points (" + dXOne + ", " + dYOne + ")"
    		+ " and (" + dXTwo + ", " + dYTwo + "),\n"
    		+ "The distance between the points is " + fmtDecimal.format(dDistance));

    // close scanner
    kb.close();
  }
}