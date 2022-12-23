package ch3;
/**
 * SphereCalculations.java
 * 
 * Code Description: Reads for a radius and prints the volume and 
 * 		surface area, rounded to four decimal places
 * 
 * @author peters
 * @version 11/10/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; // import Scanner class
import java.text.DecimalFormat; // import DecimalFormat class

public class SphereCalculations
{
  /**
   * main method - Reads for a radius and prints the volume and 
   * 	surface area, rounded to four decimal places
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// declare variables for the radius, volume, and surface area
	double dRadius, dVolume, dSurfaceArea;
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // start DecimalFormat object
    DecimalFormat fmtDecimal = new DecimalFormat("0.0000");
    
    // prompt for a radius value
    System.out.print("Please input a radius value: ");
    dRadius = kb.nextDouble();
    
    // calculate the volume and surface area based on the radius
    dVolume = (4.0/3) * Math.PI * Math.pow(dRadius, 3);
    dSurfaceArea = 4 * Math.PI * Math.pow(dRadius, 2);
    
    // print the rounded volume and surface area
    System.out.println("\nVolume:\t\t" + fmtDecimal.format(dVolume) + " cube units"
    		+ "\nSurface Area:\t" + fmtDecimal.format(dSurfaceArea) + " square units");
    
    // closing the Scanner object
    kb.close(); 
  }
}