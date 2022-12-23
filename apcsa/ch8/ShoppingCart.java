package ch8;
/**
 * ShoppingCart.java
 * 
 * Code Description: class definition for a shopping cart
 * 
 * @author peters
 * @version 2/21/21
 * @contact 1009734@palisadessd.net
 */

import java.text.NumberFormat; //import numberformat class

public class ShoppingCart
{
	//declare variable for a shopping cart
	private int iItemCount; // total number of items in the cart
	private double dTotalPrice; // total price of items in the cart
	private int iCapacity; // current cart capacity
	private int iCount;
	
	private Item[] cart;

	/**
     * constructor - creates an empty shopping cart with a capacity of 5 items
     * 
     * @param
     */
	public ShoppingCart()
	{
		iCapacity = 5;
	    iItemCount = 0;
	    dTotalPrice = 0.0;
	    
	    cart = new Item[iCapacity];
	}
	
	/**
     * addToCart - adds an item to the shopping cart
     * 
     * @param
     */
	public void addToCart(String sItemName, double dPrice, int iQuantity)
	{
		Item cartaddition = new Item(sItemName, dPrice, iQuantity);
		if(iItemCount >= cart.length)
			increaseSize();
		cart[iItemCount] = cartaddition;
		iItemCount++;
		dTotalPrice += dPrice * iQuantity;
	}
	
	/**
     * increaseSize - increases the capacity of the shopping cart by 3
     * 
     * @param
     */
	private void increaseSize()
	{
		Item[] tempcart = new Item[cart.length+3];
		for(iCount = 0; iCount < cart.length; iCount++)
		{
			tempcart[iCount] = cart[iCount];
		}
		
		//reassign tempcart to cart
		cart = tempcart;
	}
	
	/**
	 * getTotalPrice - returns the total price of the cart
	 * 
	 * @param
	 */
	public double getTotalPrice()
	{
		return dTotalPrice;
	}
	
	/**
     * toString - returns the contents of the cart together with summary information
     * 
     * @param
     */
	public String toString()
	{
		NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();
	    String sContents = "\nShopping Cart\n";
	    int iIndex;

	    sContents += "\nItem\t\t\tUnit Price\tQuantity\tTotal\n";

	    for (iIndex = 0; iIndex < iItemCount; iIndex++)
	    	sContents += cart[iIndex].toString() + "\n";

	    sContents += "\nTotal Price: " + fmtCurrency.format(dTotalPrice);
	    sContents += "\n";
	    return sContents;
	  }

}