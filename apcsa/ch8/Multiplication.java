package ch8;
/**
 * Multiplication.java 
 * 
 * Code Description: Creates a multiplication table using a two-dimensional array
 * 
 * @author peters
 * @version 3/2/21
 * @contact 1009734@palisadessd.net
 */

public class Multiplication
{
	/**
	 * main method - Creates a multiplication table using a two-dimensional array
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//final for size of the mult table
		final int iSize = 24; //max is 127 with proper formatting
		//beyond 127 and numbers get cut off
		
		//create double array
		int[][] iTable = new int[iSize][iSize];
		int[] iLegend = new int[iSize];
		int iRow, iColumn, iCount;
		
		//variables for the amount of spaces and legend
		int iMax = iSize * iSize;
		String sMaxSpace = " ", sLegendHoriChar = ".", sLegendVertChar = ":";
		int iLegendDotLength = 0;
		int iOffset;
		int iCurrentValue;
		
		//while loop to determine the amount of spaces if a 1 digit number (max spaces)
		while(iMax > 0)
		{
			iMax /= 10;
			sMaxSpace += " ";
		}
		
		//for loop to assign values to the legend
		for(iCount = 0; iCount < iSize; iCount++)
		{
			iLegend[iCount] = iCount+1;
		}
		
		//print out the horizontal legend
		System.out.print(sMaxSpace.substring(1) + "x " + sLegendVertChar); //"x"
		iLegendDotLength += (sMaxSpace.substring(1) + "x " + sLegendHoriChar).length();
		
		//for loop for horizontal legend
		for(iCount = 0; iCount < iSize; iCount++)
		{
			//determine how many spaces are needed
			iCurrentValue = iLegend[iCount];
			iOffset = 0;
			while(iCurrentValue > 0)
			{
				iCurrentValue /= 10;
				iOffset++;
			}
			System.out.print(sMaxSpace.substring(iOffset) + iLegend[iCount]);
			iLegendDotLength += (sMaxSpace.substring(iOffset) + iLegend[iCount]).length();
		}
		System.out.println();
		
		//for loop to print the correct amount of dot between legend and table
		System.out.print(sMaxSpace.substring(1)); //fill space before x in legend with empty
		iLegendDotLength -= sMaxSpace.substring(1).length(); //compensate by removing from iLegendDotLength
		for(iCount = iLegendDotLength; iCount > 0; iCount--)
		{
			System.out.print(sLegendHoriChar);
		}
		System.out.println();
		
		//for loop to assign values to the table
		for(iRow = 0; iRow < iSize; iRow++)
		{
			for(iColumn = 0; iColumn < iSize; iColumn++)
			{
				iTable[iRow][iColumn] = (iRow+1)*(iColumn+1);
			}
		}
		
		//print loop to print each row then the row below
		for(iColumn = 0; iColumn < iSize; iColumn++)
		{
			for(iRow = 0; iRow < iSize; iRow++)
			{
				//determine how many spaces are needed
				iCurrentValue = iTable[iRow][iColumn];
				iOffset = 0;
				while(iCurrentValue > 0)
				{
					iCurrentValue /= 10;
					iOffset++;
				}
				if(iRow == 0) //create legend for vertical number
					System.out.print(sMaxSpace.substring(iOffset) + iLegend[iColumn] + " " + sLegendVertChar);
				//print the number with correct spaces
				System.out.print(sMaxSpace.substring(iOffset) + iTable[iRow][iColumn]);
			}
			System.out.println();
		}
	}
}