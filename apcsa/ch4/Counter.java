package ch4;
/**
 * Counter.java
 * 
 * Code Description: Class definitions for a clicker
 * 
 * @author peters
 * @version 11/16/20
 * @contact 1009734@palisadessd.net
 */

public class Counter
{
	// declare counter
	private int iCount;
	
	/**
     * constructor - sets the initial counter value
     * 
     * @param args
     */
	public Counter()
	{
		// initialize starting counter value
		iCount = 0;
	}
	
	/**
	 * click - increments the counter by one
	 * 
	 * @param
	 */
	public void click()
	{
		// increment the count by one
		iCount++;
	}
	
	/**
	 * getCount - returns the integer value of the counter
	 * 
	 * @param
	 */
	public int getCount()
	{
		// returns the integer value of Counter
		return iCount;
	}
	
	/**
	 * reset - resets the counter to 0
	 * 
	 * @param
	 */
	public void reset()
	{
		// reset iCount to 0
		iCount = 0;
	}
}