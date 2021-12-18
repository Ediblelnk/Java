package ch2;
/**
 * FloatCalculationsV2.java
 * 
 * Code Description: Prompts for two floating point (decimal) numbers and
 * 		prints their sum, difference, and product
 * 
 * @author peters
 * @version 10/15/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class FloatCalculationsV2
{
  /**
   * main method - Prompts for two floating point (decimal) numbers and
   * 	prints their sum, difference, and product
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // declares two floating point numbers
	float fNumOne, fNumTwo;
	
	// declares the sum, difference and product
	float fFloatSum, fFloatDifference, fFloatProduct;
	
	// starts the scanner
	Scanner kb = new Scanner(System.in);

	// prompts the user for the first float
	System.out.println("Input a float: ");
	fNumOne = kb.nextFloat();
	
	// prompts the user for the second float
	System.out.println("Input another float: ");
	fNumTwo = kb.nextFloat();
	
	// calculates the sum, difference and product of the two floats
	fFloatSum = fNumOne + fNumTwo;
	fFloatDifference = fNumOne - fNumTwo;
	fFloatProduct = fNumOne * fNumTwo;
	
	// prints the two floating point numbers, along with their
	//	sum, difference, and product
	System.out.println("Float One:\t" + fNumOne
			+ "\nFloat Two:\t" + fNumTwo
			+ "\nSum:\t\t" + fFloatSum
			+ "\nDifference:\t" + fFloatDifference
			+ "\nProduct:\t" + fFloatProduct);
	
    kb.close(); // closing the Scanner object
  }
}