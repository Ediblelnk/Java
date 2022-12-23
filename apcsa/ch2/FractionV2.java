package ch2;
/**
 * FractionV2.java
 * 
 * Code Description: Prompts for a numerator and denominator of a fraction as integers,
 * 		then prints the decimal equivalent of the fraction
 * 
 * @author peters
 * @version 10/15/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class FractionV2
{
  /**
   * main method - Prompts for a numerator and denominator of a fraction as integers,
   * 	then prints the decimal equivalent of the fraction
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // initializes a numerator and denominator as integers
	int iNumerator;
	int iDenominator;
	
	// declares dDecimal double
	double dDecimal;
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // prompts the user for a numerator
    System.out.println("Please input an integer for a numerator: ");
    iNumerator = kb.nextInt();
    
    // prompts the user for a denominator
    System.out.println("Please input an integer for a denominator: ");
    iDenominator = kb.nextInt();
	
	// uses the double to convert the fraction into decimal
	dDecimal = (double) iNumerator / iDenominator;
	
	// prints the fraction and the calculated decimal equivalent
	System.out.println("\n" + iNumerator + "/" + iDenominator + " is equal to "
			+ dDecimal);
	
	kb.close(); // closing the Scanner object
  }
}