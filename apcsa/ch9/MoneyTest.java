package ch9;
/**
 * MoneyTest.java
 * 
 * Code Description: Driver Class to test the CashMoney object
 * 
 * @author peters
 * @version 3/18/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Random; //import random class

public class MoneyTest
{
	/**
	 * main method - Driver Class to test the CashMoney object
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//declare cashmoney array
		CashMoney[] Pouch = new CashMoney[7];
		int iIndex;
		int iSum = 0;
		int iNewSum = 0;
		
		Random gen = new Random(); //declare random instance
		
		//for loop to assign some random values into Pouch
		for(iIndex = 0; iIndex < Pouch.length; iIndex++)
		{
			Pouch[iIndex] = new CashMoney(gen.nextInt(99) + 1);
			//these are very out dated coins and their value can range from 1 to 99, in cents
		}
		
		//print out value of each coin and total value
		for(iIndex = 0; iIndex < Pouch.length; iIndex++)
		{
			System.out.println("Coin " + (iIndex + 1) + (Pouch[iIndex].getValue() > 9 ? ": " : ":  ")
					+ Pouch[iIndex].getValue() + "¢");
			iSum += Pouch[iIndex].getValue();
		}
		System.out.println("\nTotal Value: " + iSum + "¢, $" + (iSum/100.0));
		
		//tell that the coins are going to be flipped, and if they are tails their value will not be counted
		System.out.println("\n\nAll the coins have been flipped; if a coin landed on tails its value will be ignored\n");
		
		//for loop to flip each coin
		for(iIndex = 0; iIndex < Pouch.length; iIndex++)
		{
			Pouch[iIndex].flip();
			if(!Pouch[iIndex].isHeads())
				Pouch[iIndex].setValue(0);
		}
		
		//print the new value of each coin and total value
		for(iIndex = 0; iIndex < Pouch.length; iIndex++)
		{
			System.out.println("Coin " + (iIndex + 1) + (Pouch[iIndex].getValue() > 9 ? ": " : ":  ")
					+ Pouch[iIndex].getValue() + "¢" + (Pouch[iIndex].getValue() == 0 ? " (tails)" : ""));
			iNewSum += Pouch[iIndex].getValue();
		}
		System.out.println("\nNew Total Value: " + iNewSum + "¢, $" + (iNewSum/100.0));
		
		//print difference in two sums
		System.out.println("\nDifference of the sums: " + (iSum - iNewSum) + "¢, $" + (iSum - iNewSum)/100.0);
		
		//for loop to display each coin's info as a complete sentence
		System.out.println("\nEach coin's info:");
		for(iIndex = 0; iIndex < Pouch.length; iIndex++)
		{
			System.out.println((iIndex + 1) + " " + Pouch[iIndex].toString());
		}
	}
}