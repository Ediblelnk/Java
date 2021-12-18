package ch2;
/**
 * Paint.java
 *
 * Code Description: Determine how much paint is needed to paint the walls
 * of a room given its length, width, height, number of windows, and number of doors
 *    
 * @author peters
 * @version 10/1/20
 * @contact 1009734@palisadessd.net
 */

public class Paint
{
  /**
   * main method - Determine how much paint is needed to paint the walls
   * of a room given its length, width, height, number of windows, and number of doors
   *
   * @param args
   */
  public static void main(String[] args)
  {
    //paint covers 350 sq ft/gal
    final int iCOVERAGE = 350;
    //each window is 15 sq ft
    final int iWINDOW_COVERAGE = 15;
    //each door is 20 sq ft
    final int iDOOR_COVERAGE = 20;

    //declare integers for length, width, and height
    int iLength;
    int iWidth;
    int iHeight;
    
    //declare integers for number of Windows and Doors
    int iWindows;
    int iDoors;
    
    //declare doubles for Total Square Feet and Gallons Needed 
    double dTotalSquareFt;
    double dGallonsNeeded;

    //Assign the length of the room
    iLength = 10;
    //Assign the width of the room
    iWidth = 10;
    //Assign the height of the room
    iHeight = 10;
    //Assign the number of windows of the room
    iWindows = 1;
    //Assign the number of doors of the room
    iDoors = 1;

    //Compute the total square feet to be painted
    dTotalSquareFt = iLength * iHeight * 2 + iWidth * iHeight * 2;
    
    //Compute the amount of paint needed
    dGallonsNeeded = (dTotalSquareFt - (iWindows*iWINDOW_COVERAGE) - (iDoors*iDOOR_COVERAGE))/ iCOVERAGE;

    //Print the length, width, and height of the room and the 
    //   and number of gallons of paint needed in a meaningful way for the user.
    System.out.println("Length:\t"+ iLength
    		+ "\nWidth:\t" + iWidth
    		+ "\nHeight:\t" + iHeight);
    System.out.println("Windows: " + iWindows
    		+ "\nDoors:\t " + iDoors);
    System.out.println("Gallons Needed:\t" + dGallonsNeeded);
  }
}
