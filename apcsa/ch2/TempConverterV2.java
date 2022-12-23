package ch2;
/**
 * TempConverterV2.java
 * 
 * Code Description: Converts a temperature in Fahrenheit input
 * 		by the user into Celsius
 * 
 * @author peters
 * @version 10/15/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class TempConverterV2
{
  /**
   * main method - Converts a temperature in Fahrenheit input
   * 	by the user into Celsius
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // creates variables for Fahrenheit and Celcius
	double dFahrenheit;
	double dCelcius;
	  
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // asks the user for the Fahrenheit to be converted
    System.out.println("Please input degrees in Fahrenheit: ");
    dFahrenheit = kb.nextDouble();
    
    // calculates the corresponding Celcius value for the inputed fahrenheit value
    dCelcius = (dFahrenheit - 32) * 5/9;
    
    // prints the input Fahrenheit and then the resulting Celcius value
    System.out.println(dFahrenheit + " F is equal to " + dCelcius + " C.");
    
    kb.close(); // closing the Scanner object
  }
}