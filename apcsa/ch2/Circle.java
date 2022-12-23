package ch2;
/**
 * Circle.java
 *
 * Code Description: Print the area of a circle with two different radii.
 * 		Also prints the circumference of a circle with two different radii
 * 		and the change of growth between the two areas and circumferences.
 *    
 * @author peters
 * @version 9/24/20
 * @contact 1009734@palisadessd.org
 */
 
public class Circle
{
  /**
   * main method - Print the area of a circle with two different radii.
   * 	Also prints the circumference of a circle with two different radii
   * 	and the change of growth between the two areas and circumferences.
   * @param args
   */
  public static void main(String[] args)
  {
    // constant variable for the value of PI
    final double dPI = 3.14159;

    /* variable declarations and initializations to calculate area and circumference
       of circle */
    int iRadius = 10;
    double dArea = dPI * iRadius * iRadius;
    double dCircumference = iRadius * dPI * 2;

    // print the information for the first circle
    System.out.println("The area of a circle with radius " + iRadius +
      " is " + dArea);
    System.out.println("The circumference of a circle with radius " + iRadius +
      " is " + dCircumference);

    // change the radius and area for the second circle
    iRadius = 20;
    double dAreaTwo = dPI * iRadius * iRadius;
    double dCircumferenceTwo = iRadius * dPI * 2;

    // print the information for the second circle
    System.out.println("\nThe area of a circle with radius " + iRadius +
      " is " + dAreaTwo);
    System.out.println("The circumference of a circle with radius" + iRadius +
      " is " + dCircumferenceTwo);
    
    /* variable declarations and initializations to calculate the change in area
       and the change in circumference */
    double dAreaChange = dAreaTwo / dArea;
    double dCircumferenceChange = dCircumferenceTwo / dCircumference;
    		
    // print the information about the change in area and circumference
    System.out.println("\nThe factor of change for area of the two circles is " +
      dAreaChange);
    System.out.println("The factor of change for circumference of the two circles is " +
      dCircumferenceChange);
  }
}
