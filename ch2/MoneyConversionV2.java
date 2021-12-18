package ch2;
/**
 * MoneyConversionV2.java
 * 
 * Code Description: Converts any dollar and cent amount into bills and coins of the same total value
 * 
 * @author peters
 * @version 10/15/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class MoneyConversionV2
{
  /**
   * main method - Converts any dollar and cent amount into bills and coins of the same total value
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// finalizes an integer value representing a bill/coin amount
	final int iTWENTIES = 2000;
	final int iTENS = 1000;
	final int iFIVES = 500;
	final int iONES = 100;
	final int iQUARTERS = 25;
	final int iDIMES = 10;
	final int iNICKLES = 5;
	final int iPENNIES = 1;
	
	// initializes a value representing a monetary amount
	double dMoney;
	int iTotalCents;

	// declares integers for the amounts of each bill/coin in cents
	int iTotalTwenties, iTotalTens, iTotalFives, iTotalOnes;
	int iTotalQuarters, iTotalDimes, iTotalNickles, iTotalPennies;
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // prompts for a monetary amount
    System.out.println("Please input a monetary amount: ");
    dMoney = kb.nextDouble();
	
	// initializes and defines a int value representing a monetary amount in cents
	iTotalCents = (int) ((dMoney + 0) * 100);
	
	// calculates how many twenties are needed and hold it in iTotalTwenties
	iTotalTwenties = (iTotalCents / iTWENTIES);
	// calculates the remaining amount to be sorted
	iTotalCents %= iTWENTIES;
	
	// calculates how many tens are needed and holds it in iTotalTens
	iTotalTens = (iTotalCents / iTENS);
	// calculates the remaining amount to be sorted
	iTotalCents %= iTENS;
	
	// calculates how many fives are needed and holds it in iTotalFives
	iTotalFives = (iTotalCents / iFIVES);
	// calculates the remaining amount to be sorted
	iTotalCents %= iFIVES;
	
	// calculates how many ones are needed and holds it in iTotalOnes
	iTotalOnes = (iTotalCents / iONES);
	// calculates the remaining amount to be sorted
	iTotalCents %= iONES;
	
	// calculates how many quarters are needed and holds it in iTotalQuarters
	iTotalQuarters = (iTotalCents / iQUARTERS);
	// calculates the remaining amount to be sorted
	iTotalCents %= iQUARTERS;
	
	// calculates how many dimes are needed and holds it in iTotalDimes
	iTotalDimes = (iTotalCents / iDIMES);
	// calculates the remaining amount to be sorted
	iTotalCents %= iDIMES;
	
	// calculates how many nickles are needed and holds it in iTotalNickles
	iTotalNickles = (iTotalCents / iNICKLES);
	// calculates the remaining amount to be sorted
	iTotalCents %= iNICKLES;
	
	// calculates how many pennies are needed and holds it in iTotalPennies
	iTotalPennies = (iTotalCents / iPENNIES);
	
	System.out.println("\n" + iTotalTwenties + " twenty-dollar bills\n"
			+ iTotalTens + " ten-dollar bills\n"
			+ iTotalFives + " five-dollar bills\n"
			+ iTotalOnes + " one-dollar bills\n"
			+ iTotalQuarters + " quarters\n"
			+ iTotalDimes + " dimes\n"
			+ iTotalNickles + " nickles\n"
			+ iTotalPennies + " pennies\n");
	
	kb.close(); // closing the Scanner object
  }
}