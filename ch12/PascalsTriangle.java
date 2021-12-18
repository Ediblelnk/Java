package ch12;
/**
 * PascalsTriangle.java
 * 
 * Code Description: Creates a Pascal's triangle of an input size
 * 
 * @author peters
 * @version 4/26/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class PascalsTriangle
{
	/**
	 * main method - Prompts the user for a size and prints a Pascal's triangle of that size
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//declare triangle and input variable
		int[][] iTriangle;
		int iInput;
		
		Scanner kb = new Scanner(System.in); //Scanner instance
		
		//prompt for a size to calculate
		System.out.println("How many rows of Pascal's Triangle would you like to calculate?");
		System.out.println("(The tip of the triangle is considered the 0th row)");
		System.out.print("Number of rows: ");
		iInput = kb.nextInt();
		
		if(iInput > 33) //maximum row value ints can handle is 33, round everything higher down to that
		{
			System.out.println("Sorry, maximum amount of rows is 33");
			iInput = 33; //set row input to 33
		}
		
		//calculate a pascal's triangle of input size
		iTriangle = computeTriangle(iInput+1); //account for tip being row 0, add 1
		
		//print pacal's triangle of input size
		System.out.print(inString(iTriangle));
		
		kb.close(); //close Scanner
	}
	
	/**
	 * computeTriangle - computes a Pascals triangle of input size and returns a 2-d array
	 * 
	 * @param
	 */
	public static int[][] computeTriangle(int iSize)
	{
		//create 2d array to store and return the triangle
		int[][] iReturn = new int[iSize][iSize];
		
		int iIndex; //for loop to go through each row and fill in numbers
		for(iIndex = 0; iIndex < iSize; iIndex++)
			//calls computeRow to find the correct values
			iReturn[iIndex] = computeRow(iIndex+1, iSize);
		
		//return completely filled out 2d array
		return iReturn;
	}
	
	/**
	 * computeRow - computes a row of pascal's triangle using recursion
	 * 
	 * @param
	 */
	public static int[] computeRow(int iRow, int iMax)
	{	
		//declare return variable and previousrow variable
		int[] iReturn = new int[iMax];
		int[] iPrevious;
		//for loop variable
		int iIndex;
	
		//there is always a 1 at the end of the array
		iReturn[iReturn.length-1] = 1;
		
		//base case, returns array with 1 at end
		if(iRow == 1)
			return iReturn;
		
		//anything else, uses recursion to find the previous row's values
		else
		{
			//find previous rows values
			iPrevious = computeRow(iRow-1, iMax);
			
			for(iIndex = 0; iIndex < iPrevious.length-1; iIndex++)
			{
				//take the two numbers above and next to the current focus and add them,
				//this is the next value
				iReturn[iIndex] = iPrevious[iIndex] + iPrevious[iIndex+1];
			}
			
			//return the filled out array
			return iReturn; //could not think of any other way than with two return statements, sorry
		}
	}
	
	/**
	 * digits - calculates how many digits the input value has
	 * 
	 * @param
	 */
	public static int digits(int iVal)
	{
		//create return variable representing digits
		int iDigits = 0;
		
		//make sure an input of 0 is counted a 1 digit
		if(iVal == 0)
			return 1;
		
		//while loop to remove a digits each pass
		while(iVal > 0)
		{
			//removes a digit and adds to counter
			iDigits++;
			iVal /= 10;
		}
		
		//return number of digits calculated
		return iDigits;
	}
	
	/**
	 * multiply - multiplies a string a given amount of times
	 * 
	 * @param
	 */
	public static String multiply(String sInput, int iTimes)
	{
		//create variables for for loop and return string
		int iTemp;
		String sResult = "";
		
		//adds to the return string an input amount of times
		for(iTemp = 0; iTemp < iTimes; iTemp++)
		{
			sResult += sInput;
		}
		
		//return the new string
		return sResult;
	}
	
	/**
	 * print - prints out a pascal's triangle stored in a 2d array
	 * 
	 * @param
	 */
	public static String inString(int[][] iTriangle)
	{
		//create variables for the for loop (row and column)
		int iRow, iColumn;
		//return string, set to "" to be able to concat
		String sResult = "";
		
		//calculates the maximum amount of digits
		int iMaxDigits = digits(iTriangle[iTriangle.length-1][iTriangle.length/2])+1;
		
		//for loop to print the 2d array, but with a twist
		for(iRow = 0; iRow < iTriangle.length; iRow++)
		{
			//for loop to print a specific column in a row
			for(iColumn = 0; iColumn < iTriangle[iRow].length; iColumn++)
			{
				//converts "0" to a specific amount of " "
				if(iTriangle[iRow][iColumn] == 0)
					sResult += multiply(" ", iMaxDigits/2);
				
				//uses the max digits and value in current focus to align when printed out
				else
					sResult += multiply(" ", iMaxDigits - digits(iTriangle[iRow][iColumn])) + iTriangle[iRow][iColumn];
			}
			//newline after each row
			sResult += "\n";
		}
		//return final mega string
		return sResult;
	}
}