package ch3;
/**
 * Distance.java
 *
 * Code Description: Computes the distance between two points
 *    
 * @author peters
 * @version 10/22/20
 * @contact 1009734@palisadessd.net
 */

// import the scanner class
import java.util.Scanner;   

public class Distance
{
  /**
   * main method - Computes the distance between two points
   * @param args
   */
  public static void main (String[] args)
  {
	// declare doubles for each point x and y
    double dXOne, dYOne, dXTwo, dYTwo; 
    double dDistance; 
    
    // start scanner
    Scanner kb = new Scanner(System.in);

    // prompts the user for the first point
    System.out.print ("Enter the coordinates of the first point " +
      "(put a space between them): ");
    dXOne = kb.nextDouble();
    dYOne = kb.nextDouble();

    // prompts the user for the second point
    System.out.print ("Enter the coordinates of the second point: ");
    dXTwo = kb.nextDouble();
    dYTwo = kb.nextDouble();

    // compute the distance 
    // (the square root of the sum of the squares of the differences of the x and y values)
    dDistance = Math.sqrt((Math.pow((dXOne - dXTwo), 2) + Math.pow((dYOne - dYTwo), 2)));

    // print out the answer
    System.out.println("\nWith points (" + dXOne + "," + dYOne + ")"
    		+ " and (" + dXTwo + "," + dYTwo + "),\n"
    		+ "The distance between the points is " + dDistance);

    // close scanner
    kb.close();
  }
}