package ch9;
/**
 * CashMoney.java
 * 
 * Code Description: Class definition for CashMoney, which extends ch6.Coin
 * 
 * @author peters
 * @version 3/18/21
 * @contact 1009734@palisadessd.net
 */

public class CashMoney extends ch6.Coin
{
	//int to store value of coin
	private int iCentValue;
	
	/**
	 * constructor - defines the cent value (and current face in the background)
	 * 
	 * @param args
	 */
	public CashMoney(int iCentValue)
	{
		this.iCentValue = iCentValue;
	}
	
	/**
	 * getValue - returns the value of the coin, in cents
	 * 
	 * @param
	 */
	public int getValue()
	{
		return iCentValue;
	}
	
	/**
	 * setValue - sets the value of the coin, in cents
	 * 
	 * @param
	 */
	public void setValue(int iCentValue)
	{
		this.iCentValue = iCentValue;
	}
	
	/**
	 * toString - returns a string about the info of the coin
	 * 
	 * @param
	 */
	public String toString()
	{
		String sSentence = "This coin is on " + (iFace == iHEADS ? "heads" : "tails");
		sSentence += " and is worth " + iCentValue + "¢.";
		return sSentence;
	}
}