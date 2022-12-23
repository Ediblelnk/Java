package ch2;
/**
 * ChangeCounterV1.java
 * 
 * Code Description: Interprets the amount of coins in a jar as
 * 		a value in dollars and cents and then prints it
 * 
 * @author peters
 * @version 10/5/20
 * @contact 1009734@palisadessd.net
 */

public class ChangeCounterV1
{
  /**
   * main method - Interprets the amount of coins in a jar as
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
	
	// initializes integers representing the number of coins in a jar
	int iQuarters = 345;
	int iDimes = 374;
	int iNickles = 57;
	int iPennies = 4;
	
	// declares int values representing the total value of coins in the jar
	int iTotalDollars;
	int iTotalCents;
	
	// calculates how much money is in the jar in cents based on numbers of coins
	iTotalCents = iQuarters*iQUARTER_WORTH + iDimes*iDIME_WORTH +
			iNickles*iNICKLE_WORTH + iPennies*iPENNY_WORTH;

	// calculates how many integer dollars are in the jar
	iTotalDollars = iTotalCents / 100;
	// removes the dollars place from the iTotalCents integer
	iTotalCents %= 100;
	
	// prints the resulting amount in dollars and cents
	System.out.println("The total amount in the jar is " + iTotalDollars 
			+ " dollars and " + iTotalCents + " cents.");
  }
}