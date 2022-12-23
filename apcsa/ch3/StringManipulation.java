package ch3;
/**
 * StringManipulation.java
 *
 * Code Description: Test several methods for manipulating String objects
 *    
 * @author peters
 * @version 10/20/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner;  //import Scanner class

public class StringManipulation
{
  /**
   * main method - Test several methods for manipulating String objects
   * @param args
   */
  public static void main (String[] args)
  {
    // Declare variables to be used for String manipulations
    String sPhrase = "This is a String test.";
    int iPhraseLength; 
    int iMiddleIndex; 
    String sFirstHalf; 
    String sSecondHalf; 
    String sSwitchedPhrase; 
    String sMiddleThree;
    String sCity, sState, sStateCityState;
    
    // starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // prompt the user for their state
    System.out.print("Please enter your state: ");
    sState = kb.next();
    
    // prompt the user for their city
    System.out.print("Please enter your city: ");
    sCity = kb.next();
    
    // make state uppercase and city lowercase
    sState = sState.toUpperCase();
    sCity = sCity.toLowerCase();
    
    // makes state city state string
    sStateCityState = sState.concat(sCity);
    sStateCityState = sStateCityState.concat(sState);

    // compute the length and middle index of the phrase
    iPhraseLength = sPhrase.length();
    iMiddleIndex = iPhraseLength / 2;
    sMiddleThree = sPhrase.substring(iMiddleIndex-1, iMiddleIndex+2);
    
    // get the substring for each half of the phrase
    sFirstHalf = sPhrase.substring(0,iMiddleIndex);
    sSecondHalf = sPhrase.substring(iMiddleIndex, iPhraseLength);

    // concatenate the sFirstHalf at the end of the sSecondHalf
    sSwitchedPhrase = sSecondHalf.concat(sFirstHalf);
    sSwitchedPhrase = sSwitchedPhrase.replace(' ', '*');

    // print information about the phrase
    System.out.println();
    System.out.println ("Original phrase: " + sPhrase);
    System.out.println ("Length of the phrase: " + iPhraseLength +
      " characters");
    System.out.println ("Index of the middle: " + iMiddleIndex);
    System.out.println ("Character at the middle index: " +
      sPhrase.charAt(iMiddleIndex));
    System.out.println("Middle Three indexes: " + sMiddleThree);
    System.out.println ("Switched phrase: " + sSwitchedPhrase);
    System.out.println("State and City: " + sStateCityState);
    System.out.println();
    
    // closing the Scanner object
    kb.close(); 
  }
}