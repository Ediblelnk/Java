package ch2;
/**
 * AverageThreeV2.java
 * 
 * Code Description: Prompts for three integers and prints their average
 * 
 * @author peters
 * @version 10/12/20  10/15/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class AverageThreeV2
{
  /**
   * main method - Prompts for three integers and prints their average
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // declares three integers and assigns values to them
    int iIntegerOne;
    int iIntegerTwo;
    int iIntegerThree;
    
    // declares a double representing that will represent the average of the three integers
    double dAverage;
    
    // start the scanner
    Scanner kb = new Scanner(System.in);
    
    // prompts the user for the first integer
    System.out.println("Please input the first integer: ");
    iIntegerOne = kb.nextInt();
    
    // prompts the user for the second integer
    System.out.println("Please input the second integer: ");
    iIntegerTwo = kb.nextInt();
    
    // prompts the user for the second integer
    System.out.println("Please input the third integer: ");
    iIntegerThree = kb.nextInt();
    
    // determines an average of the three integers
    dAverage = (double) (iIntegerOne + iIntegerTwo + iIntegerThree) / 3;
    
    // prints the three integers and their average
    System.out.println("\nIntegers:\t" + iIntegerOne + "\t"
    		+ iIntegerTwo + "\t" + iIntegerThree);
    System.out.println("Average:\t" + dAverage);
    
    kb.close(); // closing the Scanner object
  }
}