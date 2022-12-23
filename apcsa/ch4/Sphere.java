package ch4;
/**
 * Sphere.java
 * 
 * Code Description: Class definitions for a Sphere
 * 
 * @author peters
 * @version 11/16/20 11/18/20
 * @contact 1009734@palisadessd.net
 */

import java.text.DecimalFormat; // import DecimalFormat class

public class Sphere
{
	// declare diameter
	private double dDiameter, dVolume, dSurfaceArea;
	
	// create decimal format object
	DecimalFormat fmtDecimal = new DecimalFormat ("0.000");
	
    /**
     * constructor - sets the initial diameter
     * 
     * @param
     */
    public Sphere(double dDiameterIn)
    {
		// initialize value for diameter
    	dDiameter = dDiameterIn;
    }
    
    /**
     * setDiameter - sets the diameter of the Sphere object
     * 
     * @param
     */
    public void setDiameter(double dDiameterRequest)
    {
    	// sets the diameter to the requested number
    	dDiameter = dDiameterRequest;
    }
    
    /**
     * getDiameter - returns the value of the diameter 
     * 		of the Sphere object as a double
     * 
     * @param
     */
    public double getDiameter()
    {
    	// returns the double value of the diameter
    	return dDiameter;
    }
    
    /**
     * volume - returns the volume of a Sphere object
     * 
     * @param
     */
    public double volume()
    {
    	// calculate the volume of the sphere
    	dVolume = 4/3.0 * Math.PI * Math.pow(dDiameter/2.0, 3);
    	dVolume = Double.valueOf(fmtDecimal.format(dVolume));
    	// returns the volume of the sphere
    	return dVolume;  
    }
    
    /**
     * surfaceArea - returns the surface area of a Sphere object
     * 
     * @param
     */
    public double surfaceArea()
    {
    	// calculate the surface area of the sphere
    	dSurfaceArea = 4 * Math.PI * Math.pow(dDiameter/2.0, 3);
    	dSurfaceArea =  Double.valueOf(fmtDecimal.format(dSurfaceArea));
    	
    	// return the surface area of the sphere
    	return dSurfaceArea;
    }
    
    /**
     * toString - returns a description of the sphere, includes 
     * 
     * @param
     */
    public String toString()
    {
    	// define strings for description of the sphere
    	String sDiameterInfo = "A sphere with diameter " + dDiameter;
    	String sVolumeInfo = "a volume of " + fmtDecimal.format(dVolume);
    	String sSurfaceAreaInfo = "a surface area of " + fmtDecimal.format(dSurfaceArea)
    			+ ".";
    	String sParagraph = sDiameterInfo + " will have " + sVolumeInfo 
    			+ " units cubed and " + sSurfaceAreaInfo + " units squared";
    	
    	// return the paragraph of information about the sphere
    	return sParagraph;
    }
}