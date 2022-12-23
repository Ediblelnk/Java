package ch8;
/**
 * Parameters.java
 * 
 * Code Description: Calculates average and minimum of a number of integers input by the user
 * 
 * @author peters
 * @version 2/28/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class Parameters
{
	/**
	 * main method - Calculates average and minimum of a number of integers input by the user
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//declare variables for average and minumum tests
		double dMeanOne, dMeanTwo, dSingleAvg, dEmptyAvg;
		int iMinOne, iMinTwo, iSingleMin, iEmptyMin;
		dMeanOne = average(42, 69, 37);
		iMinOne = minimum(42, 69, 37);
		dMeanTwo = average(35, 43, 93, 23, 40, 21, 75);
		iMinTwo = minimum(35, 43, 93, 23, 40, 21, 75);
		dSingleAvg = average(19);
		iSingleMin = minimum(19);
		dEmptyAvg = average();
		iEmptyMin = minimum();
		
		//decalre variables for user input average and minumum tests
		int iIndex, iCount;
		int[] inputarray = new int[20];
		boolean bFinished = false;
		
		Scanner kb = new Scanner(System.in); //create Scanner instance
		
		//set every index of the input array to -1
		for(iCount = 0; iCount < inputarray.length; iCount++)
			inputarray[iCount] = -1;
		
		//print first basic average caculations
		System.out.println("dMeanOne = " + dMeanOne + "\niMinOne  = " + iMinOne);
		System.out.println("\ndMeanTwo = " + dMeanTwo + "\niMinTwo  = " + iMinTwo);
		System.out.println("\ndSingleAvg = " + dSingleAvg + "\niSingleMin = " + iSingleMin);
		System.out.println("\ndEmptyAvg = " + dEmptyAvg + "\niEmptyMin = " + iEmptyMin); //yes this is the behavior I expected
		
		//prompt the user for some positive integers
		System.out.println("\nInput up to 20 postive integers (or a negative integer to end early without counting the negative)");
		for(iIndex = 0; iIndex < inputarray.length; iIndex++)
		{
			if(!bFinished)
			{
				//prompt for a specific number
				System.out.print("Input number " + (iIndex + 1) + ": ");
				inputarray[iIndex] = kb.nextInt();
				
				//check if the number of less than 0
				if(inputarray[iIndex] < 0)
				{
					inputarray[iIndex] = -1;
					bFinished = true;
				}
			}
		}
		//print the average result
		System.out.println("\nAverage Value: " + average(inputarray) + "\nMinimum Value: " + minimum(inputarray));
		
		kb.close(); //close Scanner
	}
	
	/**
	 * average - returns the average of its parameters
	 * 
	 * @param iList
	 */
	public static double average(int...iList)
	{
		//create temporary variables for calculating the average value
		double dResult = 0.0;
	    int iSum, iIndex;
	    int iLength = iList.length;

	    if (iList.length != 0)
	    {
	      iSum = 0;
	      for (iIndex = 0; iIndex < iList.length; iIndex++)
	      {
	        iSum += iList[iIndex];
	        
	        //-1 is the default value in array, should not be considered in average
	        if(iList[iIndex] == -1)
	        {
	        	iSum++; //undo adding -1
	        	iLength--; //change calculated average because this value was not input by the user
	        }
	      }
	      if(iLength == 0)
	    	  return 0;
	      dResult = (double) iSum / iLength;
	    }
	    return dResult;
	}
	
	/**
	 * minimum - returns the minimum of its parameters
	 * 
	 * @param iList
	 */
	public static int minimum(int...iList)
	{
		int iMin = Integer.MAX_VALUE; //set to max so every value is less than current minimum
		int iCount;
		
		if(iList.length == 0)
			iMin = 0; //case for an empty list
		
		//go throught entire list and determine minimum
		for(iCount = 0; iCount < iList.length; iCount++)
		{
			if(iList[iCount] < iMin && iList[iCount] != -1)
				iMin = iList[iCount];
		}
		//return minimum
		return iMin;
	}
}