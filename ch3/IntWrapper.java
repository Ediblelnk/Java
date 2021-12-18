package ch3;
/**
 * IntWrapper.java
 * 
 * Code Description: Converts an inputed integer into binary, heximal,
 * 		and octal. Then prints the max and min java integers. Then prompts
 * 		for two more integers, adds them and prints the result.
 * 
 * @author peters
 * @version 11/5/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class IntWrapper
{
  /**
   * main method - Converts an inputed integer into binary, heximal,
   * 	and octal. Then prints the max and min java integers. Then prompts
   * 	for two more integers, adds them and prints the result.
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // declare variables for the inputed integers
    int iInput, iIntInputOne, iIntInputTwo;
    String sBinary, sHeximal, sOctal;
    String sIntInputOne, sIntInputTwo;
    
    
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // request the user to input an integer
    System.out.print("Please Input an Decimal Integer: ");
    iInput = kb.nextInt();
    
    // convert the number to heximal, octal, and binary
    sBinary = Integer.toBinaryString(iInput);
    sHeximal = Integer.toHexString(iInput);
    sOctal = Integer.toOctalString(iInput);
    
    // print the converted numbers of the user input
    System.out.println("\nBinary:\t\t" + sBinary
    		+ "\nHeximal:\t" + sHeximal
    		+ "\nOctal:\t\t" + sOctal);
    
    // print the max and min values of integers for java
    System.out.println("\nMaximum Integer Value:\t" + Integer.MAX_VALUE
    		+ "\nMinimum Integer Value:\t" + Integer.MIN_VALUE);
    
    // prompts the user to input two more decimal values
    System.out.print("\nPlease Input Two More Decimal Integer Numbers: ");
    sIntInputOne = kb.next();
    sIntInputTwo = kb.next();
    
    // converts the string integer inputs into integers
    iIntInputOne = Integer.parseInt(sIntInputOne);
    iIntInputTwo = Integer.parseInt(sIntInputTwo);
        
    // print the resulting integer sum
    System.out.println("\nSum of the Two Integers: " + (iIntInputOne + iIntInputTwo));
    
    // closing the Scanner object
    kb.close(); 
  }
}