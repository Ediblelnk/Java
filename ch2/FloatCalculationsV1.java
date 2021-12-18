package ch2;
/**
 * FloatCalculations.java
 * 
 * Code Description: initializes two floating point (decimal) numbers and
 * 		prints their sum, difference, and product
 * 
 * @author peters
 * @version 10/4/20  10/5/20
 * @contact 1009734@palisadessd.net
 */

public class FloatCalculationsV1
{
  /**
   * main method - initializes two floating point (decimal) numbers and
   * 	prints their sum, difference, and product
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // initializes two floating point numbers
	float fNumOne = 34.5f;
	float fNumTwo = 83.23f;
	
	// declares the sum, difference and product
	float fFloatSum;
	float fFloatDifference;
	float fFloatProduct;
	
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
  }
}