package ch2;
/**
 * MoneyConversionV1.java
 * 
 * Code Description: Converts any dollar and cent amount into bills and coins of the same total value
 * 
 * @author peters
 * @version 10/2/20  10/5/20
 * @contact 1009734@palisadessd.net
 */

public class MoneyConversionV1
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
	
	// initializes a double value representing a monetary amount
	double dMoney = 98.28;
	
	// initializes and defines a int value representing a monetary amount in cents
	int iTotalCents = (int) ((dMoney + 0) * 100);

	// declares integers for the amounts of each bill/coin in cents
	int iTotalTwenties;
	int iTotalTens;
	int iTotalFives;
	int iTotalOnes;
	int iTotalQuarters;
	int iTotalDimes;
	int iTotalNickles;
	int iTotalPennies;
	
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
	
	System.out.println(iTotalTwenties + " twenty-dollar bills\n"
			+ iTotalTens + " ten-dollar bills\n"
			+ iTotalFives + " five-dollar bills\n"
			+ iTotalOnes + " one-dollar bills\n"
			+ iTotalQuarters + " quarters\n"
			+ iTotalDimes + " dimes\n"
			+ iTotalNickles + " nickles\n"
			+ iTotalPennies + " pennies\n");
  }
}