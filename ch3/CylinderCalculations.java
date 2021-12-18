package ch3;
/**
 * CylinderCalculations.java
 * 
 * Code Description: Generates a random radius and height each between 1-20
 * 		and find and prints the volume and surface area
 * 
 * @author peters
 * @version 11/10/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Random; // import Scanner class

public class CylinderCalculations
{
  /**
   * main method - Generates a random radius and height each between 1-20
   * 	and find and prints the volume and surface area
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// declare variables for the radius, volume, and surface area
	double dVolume, dSurfaceArea;
	int iRadius, iHeight;
	
	// starts the scanner
    Random gen = new Random();
    
    // generates a radius value and height value
    iRadius = gen.nextInt(20) + 1;
    iHeight = gen.nextInt(20) + 1;
    
    // calculate the volume and surface area
    dVolume = Math.PI * Math.pow(iRadius, 2) * iHeight;
    dSurfaceArea = 2 * Math.PI * iRadius * iHeight;
    
    // print the rounded volume and surface area
    System.out.println("Radius:\t\t" + iRadius + " units"
    		+ "\nHeight:\t\t" + iHeight + " units"
    		+ "\nVolume:\t\t" + dVolume + " cube units"
    		+ "\nSurface Area:\t" + dSurfaceArea + " square units");
  }
}