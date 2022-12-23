package ch2;
/**
 * SquareCalculationsV1.java
 * 
 * Code Description: Initializes an integer representing the length of a 
 * 		square’s side, then prints the square’s perimeter and area.
 * 
 * @author peters
 * @version 10/5/20
 * @contact 1009734@palisadessd.net
 */

public class SquareCalculationsV1
{
  /**
   * main method - Initializes an integer representing the length of a 
   * 	square’s side, then prints the square’s perimeter and area.
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // initializes a integer representing the length of a square's side
	int iSquareSide = 20; // in cm
	
	// declares integers representing the perimeter and area of square
	int iSquarePerimeter; // in cm
	int iSquareArea; // in cm^2
	
	// calculates the square's perimeter
	iSquarePerimeter = 4 * iSquareSide;
	
	// calculates the square's area
	iSquareArea = iSquareSide * iSquareSide;
	
	// prints the perimeter and area along with the side length
	System.out.println("A square with the side length of " + iSquareSide
			+ " cm has a perimeter of " + iSquarePerimeter + " cm and"
			+ " an area of " + iSquareArea + " cm squared.");
	
  }
}