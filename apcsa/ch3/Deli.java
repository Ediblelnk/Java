package ch3;
/**
 * Deli.java
 *
 * Code Description: Computes the price of a deli item given the weight
 * (in ounces) and price per pound -- prints a label,
 * nicely formatted, for the item.
 *    
 * @author peters
 * @version 11/3/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner;  // import Scanner class
import java.text.DecimalFormat; // import DecimalFormat class
import java.text.NumberFormat; // import NumberFormat class

public class Deli
{
  /**
   * main method - reads in the price per pound of a deli item
   * and number of ounces of a deli item then computes
   * the total price and prints a "label" for the item
   * @param args
   */
  public static void main (String[] args)
  {
	// declares final for ounce to pound conversion
    final double dOUNCES_PER_POUND = 16.0;

    // declares variables for needed values
    double dPricePerPound;
    double dWeightOunces; 
    double dWeightLbs; 
    double dTotalPrice; 
    
    // declare scanner as "kb"
    Scanner kb = new Scanner(System.in);

    // declare NumberFormat.getCurrencyInstance as "fmtCurrency"
    NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();

    // declare DecimalFormat as "fmtDecimal"
    DecimalFormat fmtDecimal = new DecimalFormat("0.00");

    // welcomes and prompts for price per pound
    System.out.println("Welcome to the CS Deli!! \n ");
    System.out.print("Enter the price per pound of your item: ");
    dPricePerPound = kb.nextDouble();
    
    // prompts for weight in ounces
    System.out.print ("Enter the weight (ounces): ");
    dWeightOunces = kb.nextDouble();

    dWeightLbs = dWeightOunces / dOUNCES_PER_POUND;
    dTotalPrice = dPricePerPound * dWeightLbs;

    // prints recipt in proper formatting
    System.out.println("\n   ***** CSDeli *****");
    System.out.println("Unit Price: " + fmtCurrency.format(dPricePerPound) + " per pound");
    System.out.println("    Weight: " + fmtDecimal.format(dWeightLbs) + " pounds");
    System.out.println("     TOTAL: " + fmtCurrency.format(dTotalPrice));
    
    // close scanner object
    kb.close();
  }
}