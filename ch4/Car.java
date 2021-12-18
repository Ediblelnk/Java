package ch4;
/**
 * Car.java
 * 
 * Code Description: Class definition for a Car
 * 
 * @author peters
 * @version 11/20/20
 * @contact 1009734@palisadessd.net
 */

public class Car
{
	// declare variables for make, model, and year
	private String sMake, sModel;
	private String sMakeFirst, sModelFirst;
	private int iYear;
	
	/**
	 * constructor - sets the initial make, model, and year for a car
	 * 
	 * @param
	 */
	public Car(String sMakeIn, String sModelIn, int iYearIn)
	{
		// assign proper inputs to the local class variables that correspond
	  	iYear = iYearIn;
	  	
	  	// make the make proper name
	  	sMakeFirst = sMakeIn.substring(0, 1).toUpperCase();
	  	sMake = sMakeIn.substring(1);
	  	sMake = sMakeFirst.concat(sMake);
	  	
	  	// make the model proper name
	  	sModelFirst = sModelIn.substring(0, 1).toUpperCase();
	  	sModel = sModelIn.substring(1);
	  	sModel = sModelFirst.concat(sModel);
	}
  
	/**
	 * setMake - sets the make of the car
	 * 
	 * @param
	 */
	public void setMake(String sMakeIn)
	{
		// make the make proper name
	  	sMakeFirst = sMakeIn.substring(0, 1).toUpperCase();
	  	sMake = sMakeIn.substring(1);
	  	sMake = sMakeFirst.concat(sMake);
	}
	
	/**
	 * getMake - returns the make of the car
	 * 
	 * @param
	 */
	public String getMake()
	{
		// returns the make of the car
		return sMake;
	}
	
	/**
	 * setModel - sets the model of the car
	 * 
	 * @param
	 */
	public void setModel(String sModelIn)
	{
		// make the model proper name
	  	sModelFirst = sModelIn.substring(0, 1).toUpperCase();
	  	sModel = sModelIn.substring(1);
	  	sModel = sModelFirst.concat(sModel);
	}
	
	/**
	 * getModel - returns the model of the car
	 * 
	 * @param
	 */
	public String getModel()
	{
		// returns the model of the car
		return sModel;
	}
	
	/**
	 * setYear - sets the year of the car
	 * 
	 * @param
	 */
	public void setYear(int iYearIn)
	{
		// sets the year to the argument passed
		iYear = iYearIn;
	}
	
	/**
	 * getYear - returns the year of the car
	 * 
	 * @param
	 */
	public int getYear()
	{
		// return the year of the car
		return iYear;
	}
	
	/**
	 * toString - returns a description of the car
	 * 
	 * @param
	 */
	public String toString(String sCar)
	{
		// create paragraph variable
		String sParagraph;
		
		// instantiate the paragraph
		sParagraph = sCar + " is a " + iYear + " " + sMake + " " + sModel + ".";
		
		// return the paragraph
		return sParagraph;
	}
}