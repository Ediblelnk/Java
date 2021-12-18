package ch2;
/**
 * ChangeCounterV2.java
 * 
 * Code Description: Prompts for the amount of coins in a jar as
 * 		a value in dollars and cents and then prints it
 * 
 * @author peters
 * @version 10/15/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class ChangeCounterV2
{
  /**
   * main method - Prompts for the amount of coins in a jar as
   * 	a value in dollars and cents and then prints it
   * @param args
   */
  public static void main(String[ ] args)
  {
    // finalizes ints representing how much each coin is worth in cents
	final int iQUARTER_WORTH = 25;
	final int iDIME_WORTH = 10;
	final int iNICKLE_WORTH = 5;
	final int iPENNY_WORTH = 1;
	
	// declares integers representing the number of coins in a jar
	int iQuarters, iDimes, iNickles, iPennies;
	int iTotalDollars, iTotalCents;
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // prompts for an amount of quarters
    System.out.println("Please input an amount of quarters: ");
    iQuarters = kb.nextInt();
    
    // prompts for an amount of dimes
    System.out.println("Please input an amount of dimes: ");
    iDimes = kb.nextInt();
    
    // prompts for an amount of nickles
    System.out.println("Please input an amount of nickles: ");
    iNickles = kb.nextInt();
    
    // prompts for an amount of pennies
    System.out.println("Please input an amount of pennies: ");
    iPennies = kb.nextInt();
	
	// calculates how much money is in the jar in cents based on numbers of coins
	iTotalCents = iQuarters*iQUARTER_WORTH + iDimes*iDIME_WORTH +
			iNickles*iNICKLE_WORTH + iPennies*iPENNY_WORTH;

	// calculates how many integer dollars are in the jar
	iTotalDollars = iTotalCents / 100;
	// removes the dollars place from the iTotalCents integer
	iTotalCents %= 100;
	
	// prints the resulting amount in dollars and cents
	System.out.println("\nThe total amount in the jar is " + iTotalDollars 
			+ " dollars and " + iTotalCents + " cents.");
	
	kb.close(); // closing the Scanner object
  }
}