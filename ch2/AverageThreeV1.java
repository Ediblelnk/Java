package ch2;
/**
 * AverageThreeV1.java
 * 
 * Code Description: Initializes three integers and prints their average
 * 
 * @author peters
 * @version 10/4/20  10/5/20
 * @contact 1009734@palisadessd.net
 */

public class AverageThreeV1
{
  /**
   * main method - Initializes three integers and prints their average
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    //initializes three integers and assigns values to them
    int iIntegerOne = 4;
    int iIntegerTwo = 9;
    int iIntegerThree = 16;
    
    // declares a double representing that will represent the average of the three integers
    double dAverage;
    
    // determines an average of the three integers
    dAverage = (double) (iIntegerOne + iIntegerTwo + iIntegerThree) / 3;
    
    // prints the three integers and their average
    System.out.println("Integers:\t" + iIntegerOne + "\t"
    		+ iIntegerTwo + "\t" + iIntegerThree);
    System.out.println("Average:\t" + dAverage);
  }
}