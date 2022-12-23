package ch4;
/**
 * Die.java
 *
 * Code Description: Class definitions for a die
 * 
 * @author peters
 * @version 11/21/20
 * @contact 1009734@palisadessd.net
 */

public class Die
{
	// set maximum face value
	private final int iMAX = 6;

	// declare current value showing on the die
	private int iFaceValue; 

	/**
	 * Constructor - Sets the initial face value
	 * 
	 * @param 
	 */
	public Die()
	{
		// initialize die face value
		iFaceValue = 1;
	}

	/**
	 * roll - Rolls the die
	 * 
	 * @param 
	 */
	public void roll()
	{
		// randomize die face value
		iFaceValue = (int) (Math.random() * iMAX) + 1;
	}

	/**
	 * setFaceValue - Face value mutator
	 * 
	 * @param iValue - face value to be set
	 */
	public void setFaceValue(int iValue)
	{
		// set die face value to passed-in value
		iFaceValue = iValue;
	}

	/**
	 * getFaceValue - Face value accessor
	 * 
	 * @param 
	 */
	public int getFaceValue()
	{
		return iFaceValue; //returns die face value
	}

	/**
	 * toString - Returns a string representation of this die
	 * 
	 * @param 
	 */
	public String toString()
	{
		// create String with the die face value
		String sResult = Integer.toString(iFaceValue);

		return sResult; //returns die face value
	}
}