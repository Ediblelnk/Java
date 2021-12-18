package ch3;
/**
 * WholeNumbers.java
 * 
 * Code Description: Reads a double value and prints the 
 * 		closest whole numbers less  and greater
 * 
 * @author peters
 * @version 11/10/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class WholeNumbers
{
  /**
   * main method - Reads a double value and prints the 
   * 	closest whole numbers less  and greater
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// declare variables for the value and surround integers
	int iLessInteger, iGreaterInteger;
	Double dwValue;
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // prompt the user to input a double value
    System.out.print("Please input a double value: ");
    dwValue = kb.nextDouble();
    
    // find the surrounding integer values
    iLessInteger = dwValue.intValue();
    iGreaterInteger = iLessInteger + 1;
    
    // print the surrounding integer values
    System.out.println("\n" + iLessInteger + " < " + dwValue + " < " + iGreaterInteger);
    
    // closing the Scanner object
    kb.close(); 
  }
}