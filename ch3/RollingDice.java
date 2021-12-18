package ch3;
/**
 * RollingDice.java
 * 
 * Code Description: Simulates rolling two dice
 * 
 * @author peters
 * @version 10/22/20
 * @contact 1009734@palisadessd.net
 */

// import Random class
import java.util.Random;

public class RollingDice
{
  /**
   * main method - Simulates rolling two dice
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// starts the random class
    Random gen = new Random();
    
    // declare variables for each dice
    int iDiceOne, iDiceTwo, iTotalRoll;
    
    // assign random integer values for each dice between 1-6
    iDiceOne = gen.nextInt(6)+1;
    iDiceTwo = gen.nextInt(6)+1;
    
    // calculate total roll
    iTotalRoll = iDiceOne + iDiceTwo;
    
    // prints out the simulated dice roll result
    System.out.println("Dice Rolls: " + iDiceOne + ", " + iDiceTwo
    		+ "\nTotal: " + iTotalRoll);
  }
}