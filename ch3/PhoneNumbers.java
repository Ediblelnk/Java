package ch3;
/**
 * PhoneNumbers.java
 * 
 * Code Description: Generate a phone number. First three digits do not contain 
 * 		a 8 or 9. The second set of numbers is not greater than 655.
 * 
 * @author peters
 * @version 11/10/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Random; // import Random class

public class PhoneNumbers
{
  /**
   * main method - Generate a phone number. First three digits do not contain 
   * 	a 8 or 9. The second set of numbers is not greater than 655.
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// declare variables for numbers in the phone number
	int iSetOneOne, iSetOneTwo, iSetOneThree;
	int iSetTwo;
	int iSetThree;
	String sPhoneNumber, sSetOne;
	
    // starts the number generator
    Random gen = new Random();
    
    // generate the first three numbers, omit an 8 or 9
    iSetOneOne = gen.nextInt(7) + 1;
    iSetOneTwo = gen.nextInt(7) + 1;
    iSetOneThree = gen.nextInt(7) + 1;
    sSetOne = "" + iSetOneOne + iSetOneTwo + iSetOneThree;
    
    // generate the middle three numbers, max 655
    iSetTwo = gen.nextInt(555) + 100;
    
    // generate the last four numbers
    iSetThree = gen.nextInt(9000) + 1000;
    
    // construct the phone number
    sPhoneNumber = sSetOne + "-" + iSetTwo + "-" + iSetThree;
    
    // print the constructed phone number
    System.out.println("Generated Phone Number: \n" + sPhoneNumber);
  }
}