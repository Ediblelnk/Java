package ch10;
/**
 * IntegerList.java
 * 
 * Code Description: Define an IntegerList class with methods to create, fill,
 * 		sort, and search in a list of integers
 * 
 * @author peters
 * @version 4/5/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Random; //import random class

public class IntegerList
{
	int[] iList; //holds the values in the list
	
	Random gen = new Random(); //random instance
	
	/**
	 * constructor - create a list of the given size
	 * 
	 * @param
	 */
	public IntegerList(int iSize)
	{
		//assign size input into array size
		iList = new int[iSize];
	}
	
	/**
	 * randomize - fill iList with integers between 1 and 100, inclusive
	 * 
	 * @param
	 */
	public void randomize()
	{
		//foreach loop to assign random values
		int iIndex;
		for(iIndex = 0; iIndex < iList.length; iIndex++)
		{
			iList[iIndex] = gen.nextInt(100) + 1;
			//values between 1 and 100
		}
	}
	
	/**
	 * print - print iList elements along with their indices
	 * 
	 * @param
	 */
	public void print()
	{
		//for each loop to print list with indexes
		int iIndex;
		for(iIndex = 0; iIndex < iList.length; iIndex++)
		{
			System.out.println("(" + iIndex + ")\t" + iList[iIndex]); //(index)  value
		}
	}
	
	/**
	 * search - returns the index of the first occurrence of target in the list
	 * 			returns -1 if target does not appear in the list
	 * 
	 * @param
	 */
	public int search(int iTarget)
	{
		int iIndex;
		int iRet = -1;
		
		for(iIndex = 0; iIndex < iList.length; iIndex++)
		{
			//return *first* index of target in list
			if(iList[iIndex] == iTarget)
			{
				iRet = iIndex;
				iIndex = iList.length; //forcequits for loop through bounds
			}
		}
		
		return iRet; //will return -1 if not found
	}
	
	/**
	 * selectionSort - sort the list into ascending order using a selection sort algorithm
	 * 
	 * @param
	 */
	public void selectionSort()
	{
		//declare variables needed to keep track of order
		int iSweepMin, iTemp; //SweepMin holds index of useful min value
		int iPlace, iIndex; //for loop variables
		for(iPlace = 0; iPlace < iList.length; iPlace++)
		{
			iSweepMin = iPlace; //default sweep minimum index
			//find index of minimum value, starting from first unsorted index
			for(iIndex = iPlace; iIndex < iList.length; iIndex++)
			{
				if(iList[iSweepMin] > iList[iIndex])
					iSweepMin = iIndex;
			}
			//switch values of min and first unsorted value
			iTemp = iList[iSweepMin];
			iList[iSweepMin] = iList[iPlace];
			iList[iPlace] = iTemp;
		}
	}
	
	/**
	 * replaceFirst - replaces the first occurrence of iOldVal in list with iNewVal.
	 * 			If iOldVal does not appear in the list, does nothing.
	 * 
	 * @param
	 */
	public void replaceFirst(int iOldVal, int iNewVal)
	{
		int iResult = search(iOldVal); //assign search index to result
		if(iResult != -1) //if value was found in list
			iList[iResult] = iNewVal;
		//only reassignes if oldval is found
	}
	
	/**
	 * replaceAll - replaces all occurrences of iOldVal in list with iNewVal.
	 * 			If iOldVal does not appear in the list, does nothing.
	 * 
	 * @param
	 */
	public void replaceAll(int iOldVal, int iNewVal)
	{
		int iIndex; //for each loop
		for(iIndex = 0; iIndex < iList.length; iIndex++)
			if(iList[iIndex] == iOldVal) //instance of oldval
				iList[iIndex] = iNewVal; //replace with newval
	}
	
	/**
	 * sortDecreasing - sorts list in decreasing order
	 * 
	 * @param
	 */
	public void sortDecreasing()
	{
		//declare variables needed to keep track of order
		int iSweepMax, iTemp; //SweepMax holds index of useful max value
		int iPlace, iIndex; //for loop variables
		for(iPlace = 0; iPlace < iList.length; iPlace++)
		{
			iSweepMax = iPlace; //default sweep maximum index
			//find index of maximum value, starting from first unsorted index
			for(iIndex = iPlace; iIndex < iList.length; iIndex++)
			{
				if(iList[iSweepMax] < iList[iIndex])
					iSweepMax = iIndex;
			}
			//switch values of max and first unsorted value
			iTemp = iList[iSweepMax];
			iList[iSweepMax] = iList[iPlace];
			iList[iPlace] = iTemp;
		}
	}
	
	/**
	 * binarySearchDec - uses a binary search to find the target value.
	 * 			Assumes list is in descending order.
	 * 
	 * @param
	 */
	public int binarySearchDec(int iTarget)
	{
		int iMin = 0, iMax = iList.length-1;
		int iMid = 0; //variables to conduct binary search
		int iRet = -1; //if no value is found, return -1
		
		boolean bFound = false;
		
		//keeps searching until bounds exhausted or target found
		while((!bFound)&&(iMin <= iMax))
		{
			iMid = (iMax + iMin)/ 2;
			if(iList[iMid] == iTarget)
				bFound = true;
			else if(iTarget < iList[iMid])
				iMin = iMid + 1;
			else //bounds set up for descending order
				iMax = iMid - 1;
		}
		
		if(bFound) //returns index if target found
			iRet = iMid;
		return iRet; //else return -1
	}
}