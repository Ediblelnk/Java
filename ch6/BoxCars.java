package ch6;
/**
 * BoxCars.java
 * 
 * Code Description: Rolls a pair of dice 1000 times and reports how many boxcars there are
 * 
 * @author peters
 * @version 2/1/21
 * @contact 1009734@palisadessd.net
 */

import ch4.PairOfDice; //import PairOfDie class from ch4 package 

public class BoxCars
{
	/**
	 * main method - Rolls a pair of dice 1000 times and reports how many boxcars there are
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//create number of rows and collums
		final int iROWS = 50;
		final int iCOLLUMS = 20;
		
		//create reused string for row printing
		String sRow = "";
		int iBoxCars = 0;
		
		PairOfDice pair = new PairOfDice(); //create PairOfDice instance
		
		//declare about rolling the dice
		System.out.println((iROWS*iCOLLUMS) + " Dice Rolls:\n");
		
		//number of rows loop
		int iCount;
		for(iCount = 1; iCount <= iROWS; iCount++)
		{
			//create row creating loop
			int iCount2;
			for(iCount2 = 1; iCount2 <= iCOLLUMS; iCount2++)
			{
				pair.roll();
				sRow += (pair.getFirstValue() + ":" + pair.getSecondValue()) + " ";
				if(pair.getFirstValue() == 6 && pair.getSecondValue() == 6)
					iBoxCars++;
			}
			System.out.println(sRow);
			sRow = "";
		}
		
		//print how many boxcars there were against the expected results
		System.out.println("\n");
		System.out.println("Number of Box Cars:\t " + iBoxCars
				+ "\nExpected Number:\t~" + ((iCOLLUMS*iROWS)/36));
	}
}