package ch3;
/**
 * TallyTrigCalculator.java
 * 
 * Code Description: Turns a tally number into a decimal integer put 
 * 		into trig functions and evauluated
 * 
 * @author peters
 * @version 11/12/20 11/13/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; // import Scanner class
import java.text.DecimalFormat; // import DecimalFormat class

public class TallyTrigCalculator
{
  /**
   * main method - Turns a tally number into a decimal integer put 
   * 	into trig functions and evaulated
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// declare variables for calculator
	String sTally, sTallyCaps, sMode, sTallyChar; 
	char cTallyChar;
	double dTally, dSine, dCosine, dTangent;
	int iTallyDecimal;
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // create DecimalFormat object "fmtDecimal"
    DecimalFormat fmtDecimal = new DecimalFormat("0.0000");
    
    
    // welcome message / prompt for a mode
    System.out.print("Welcome to the Tally Trig Calculator"
    		+ "\nPlease pick a mode (rad/deg): ");
    sMode = kb.next();
    sMode = sMode.toUpperCase();
    
    // prompt for a tally character
    System.out.print("\nPlease input your tally character: ");
    sTallyChar = kb.next();
    sTallyChar = sTallyChar.toUpperCase(); // case proof the input
    cTallyChar = sTallyChar.charAt(0);
    
    // prompt for the tally
    System.out.print("\nPlease input the tally: ");
    sTally = kb.next();
    sTallyCaps = sTally.toUpperCase();
    
    // convert the tally into decimal
    dTally = sTallyCaps.lastIndexOf(cTallyChar) + 1;
    iTallyDecimal = (int) dTally;
    
    // convert to radians from degrees is mode is degrees
    if (sMode.startsWith("D"))
    {
    	// convert the tally from degrees to radians
    	dTally = Math.toRadians(dTally);
    }
    
    // calculate the sin, cos, and tan
    dSine = Math.sin(dTally);
    dCosine = Math.cos(dTally);
    dTangent = Math.tan(dTally);
    
    // print the trig function results
    System.out.println("With a tally of " + sTally + " (" + iTallyDecimal + "),"
    		+ "\n\nSine\tequals\t" + fmtDecimal.format(dSine)
    		+ "\nCosine\tequals\t" + fmtDecimal.format(dCosine)
    		+ "\nTangent\tequals\t" + fmtDecimal.format(dTangent));
    
    // closing the Scanner object
    kb.close(); 
  }
}