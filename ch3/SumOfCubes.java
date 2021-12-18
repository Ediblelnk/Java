package ch3;
/**
 * SumOfCubes.java
 * 
 * Code Description: Prompts for two integers and prints their cube sum
 * 
 * @author peters
 * @version 11/10/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class SumOfCubes
{
  /**
   * main method - Prompts for two integers and prints their cube sum
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// declare the variables for the integers
	int iNumOne, iNumTwo, iCubeOne, iCubeTwo;
	Double dwCubeOne, dwCubeTwo;
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // prompts for two integer values
    System.out.print("Please input two integers, with a space between them: ");
    iNumOne = kb.nextInt();
    iNumTwo = kb.nextInt();
    
    // calculate the number's cubes and add then together
    dwCubeOne = Math.pow(iNumOne, 3);
    iCubeOne = dwCubeOne.intValue();
    dwCubeTwo = Math.pow(iNumTwo, 3);
    iCubeTwo = dwCubeTwo.intValue();
    
    // prints the sum of the cubes
    System.out.println("\nSum of the Cubes: " + (iCubeOne + iCubeTwo));
    
    // closing the Scanner object
    kb.close(); 
  }
}