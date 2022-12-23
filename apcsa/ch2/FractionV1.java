package ch2;
/**
 * FractionV1.java
 * 
 * Code Description: Initializes a numerator and denominator of a fraction as integers,
 * 		then prints the decimal equivalent of the fraction
 * 
 * @author peters
 * @version 10/12/20  10/15/20
 * @contact 1009734@palisadessd.net
 */

public class FractionV1
{
  /**
   * main method - Initializes a numerator and denominator of a fraction as integers,
   * 	then prints the decimal equivalent of the fraction
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // initializes a numerator and denominator as integers
	int iNumerator = 7;
	int iDenominator = 5;
	
	// declares dDecimal double
	double dDecimal;
	
	// uses the double to convert the fraction into decimal
	dDecimal = (double) iNumerator / iDenominator;
	
	// prints the fraction and the calculated decimal equivalent
	System.out.println(iNumerator + "/" + iDenominator + " is equal to "
			+ dDecimal);
  }
}