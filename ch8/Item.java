package ch8;
/**
 * Item.java
 * 
 * Code Description: class definition for a shopping item
 * 
 * @author peters
 * @version 2/21/21
 * @contact 1009734@palisadessd.net
 */

import java.text.NumberFormat; //import number format class

public class Item
{
	private String sName;
	private double dPrice;
	private int iQuantity;
	
	/**
     * constructor - sets the name, price, and amount of an item
     * 
     * @param
     */
	public Item(String sItemName, double dItemPrice, int iNumPurchased)
	{
		sName = sItemName;
	    dPrice = dItemPrice;
	    iQuantity = iNumPurchased;
	}
	
	/**
     * getPrice - returns the price of an item
     * 
     * @param
     */
	public double getPrice()
	{
		return dPrice;
	}
	
	/**
     * getName - returns the name of an item
     * 
     * @param
     */
	public String getName()
	{
		return sName;
	}
	
	/**
     * getQuantity - returns the quantity of an item
     * 
     * @param
     */
	public int getQuantity()
	{
		return iQuantity; 
	}
	
	/**
     * toString - return a string with the information about the item
     * 
     * @param
     */
	public String toString ()
	{
		String sSpacing = "\t\t\t";
		if(sName.length() > 7)
			sSpacing = "\t\t";
		if(sName.length() > 15)
			sSpacing = "\t";
		NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();
		
		return (sName + sSpacing + fmtCurrency.format(dPrice) + "\t\t" + iQuantity + "\t\t"
	      + fmtCurrency.format(dPrice * iQuantity));
	}
}