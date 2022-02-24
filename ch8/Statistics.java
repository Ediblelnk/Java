package ch8;
/**
 * Statistics.java
 * 
 * Code Description: Calculates the mean and standard deviation of a set of numbers
 * 
 * @author peters
 * @version 3/11/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Random; //import Random class

public class Statistics
{
	/**
	 * main method - Calculates the mean and standard deviation of a set of numbers
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//declare variables for number calculation
		int iSetSize;
		int iIndex;
		
		Random gen = new Random(); //instantiate random class
		
		//set size
		iSetSize = gen.nextInt(50) + 1;
		
		//create array of set size
		int[] iSet = new int[iSetSize];
		
		//for loop to assign random integers to each index
		for(iIndex = 0; iIndex < iSet.length; iIndex++)
			iSet[iIndex] = gen.nextInt(100) + 1;
		
		//print information about the array
		System.out.println("Sample Size:        " + iSetSize);
		System.out.println("Mean:               " + mean(iSet));
		System.out.println("Standard Deviation: " + standardDeviation(iSet));
		
	}
	
	/**
	 * mean - Calculates the mean of the input array
	 * 
	 * @param
	 */
	public static double mean(int[] iArray)
	{
		//declare sum/index
		double dSum = 0;
		int iIndex;
		
		//calculate sum
		for(iIndex = 0; iIndex < iArray.length; iIndex++)
			dSum += iArray[iIndex];
		
		return dSum / iArray.length;
	}
	
	/**
	 * standardDeviation - Calculates the standard deviation of the input array
	 * 
	 * @param
	 */
	public static double standardDeviation(int[] iArray)
	{
		//declare sum variable
		double dDevSum = 0, dMean = mean(iArray);
		int iIndex;
		
		//for loop to calculate inside sqrt
		for(iIndex = 0; iIndex < iArray.length; iIndex++)
		{
			dDevSum += Math.pow(iArray[iIndex] - dMean, 2);
		}
		
		//return after sqrting
		return Math.sqrt(dDevSum);
	}
}