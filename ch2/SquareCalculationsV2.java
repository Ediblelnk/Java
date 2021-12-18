package ch2;
/**
 * SquareCalculationsV2.java
 * 
 * Code Description: Prompts for an integer representing the length of a 
 * 		square’s side, then prints the square’s perimeter and area.
 * 
 * @author peters
 * @version 10/15/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class SquareCalculationsV2
{
  /**
   * main method - Prompts for an integer representing the length of a 
   * 	square’s side, then prints the square’s perimeter and area.
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // declares a integer representing the length of a square's side
	int iSquareSide; // in cm
	
	// declares integers representing the perimeter and area of square
	int iSquarePerimeter; // in cm
	int iSquareArea; // in cm^2
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // prompts the user for the length of a square's side
    System.out.println("Please input an integer for a square's side (cm): ");
    iSquareSide = kb.nextInt();
	
	// calculates the square's perimeter
	iSquarePerimeter = 4 * iSquareSide;
	
	// calculates the square's area
	iSquareArea = iSquareSide * iSquareSide;
	
	// prints the perimeter and area along with the side length
	System.out.println("\nA square with the side length of " + iSquareSide
			+ " cm has a perimeter of " + iSquarePerimeter + " cm and"
			+ " an area of " + iSquareArea + " cm squared.");
	
	kb.close(); // closing the Scanner object
  }
}