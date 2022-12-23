package ch4;
/**
 * PairOfDice.java
 * 
 * Code Description: Class definitions for a Pair of Dice
 * 
 * @author peters
 * @version 11/21/20
 * @contact 1009734@palisadessd.net
 */

public class PairOfDice
{
	// declare two die objects
	Die DieOne = new Die();
	Die DieTwo = new Die();
	
	/**
	 * constructor - Creates two die objects
	 * 
	 * @param args
	 */
	public PairOfDice()
	{
		// set initial value for two dice
		DieOne.setFaceValue(1);
		DieTwo.setFaceValue(1);
	}
	
	/**
	 * roll - rolls two dice
	 * 
	 * @param
	 */
	public void roll()
	{
		// rolls two dice
		DieOne.roll();
		DieTwo.roll();
	}
	
	/**
	 * setFirstFaceValue - sets the first die to int input
	 * 
	 * @param
	 */
	public void setFirstValue(int iNum)
	{
		// set the first die to input iNum
		DieOne.setFaceValue(iNum);
	}
	
	/**
	 * getFirstFaceValue - returns the first die face value
	 * 
	 * @param
	 */
	public int getFirstValue()
	{
		// return the DieOne Face Value
		return DieOne.getFaceValue();
	}
	
	/**
	 * setSecondValue - sets the second die face value
	 * 
	 * @param
	 */
	public void setSecondValue(int iNum)
	{
		// set the second die to input iNum
		DieTwo.setFaceValue(iNum);
	}
	/**
	 * getSecondValue - returns the second die face value
	 * 
	 * @param
	 */
	public int getSecondValue()
	{
		// return the DieTwo Face Value
		return DieTwo.getFaceValue();
	}
	
	/**
	 * getRollValue - returns the sum of the two dice rolls
	 * 
	 * @param
	 */
	public int getRollValue()
	{
		// return the total roll value
		return DieOne.getFaceValue() + DieTwo.getFaceValue();
	}
}