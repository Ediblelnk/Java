package ch8;
/**
 * Square.java
 * 
 * Code Description: Define a Square class with methods to create and read in
 * 		info for a square matrix and to compute the sum of a row,
 * 		a col, either diagonal, and whether it is magic
 * 
 * @author peters
 * @version 3/16/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import scanner class

public class Square
{
	int[][] iSquare;

	/**
	 * constructor - creates a square of size iSize
	 * 
	 * @param iSize
	 */
	public Square(int iSize)
	{
		iSquare = new int[iSize][iSize];
	}

	/**
	 * sumRow - return the sum of the values in the given row
	 * 
	 * @param iRow
	 * @return
	 */
	public int sumRow(int iRow)
	{
		//for loop to go through each column in a row
		int iIndex;
		int iSum = 0;
		for(iIndex = 0; iIndex < iSquare[iRow].length; iIndex++)
			iSum += iSquare[iRow][iIndex];
		return iSum;
	}

	/**
	 * sumCol - return the sum of the values in the given column
	 * 
	 * @param iCol
	 * @return
	 */
	public int sumCol(int iCol)
	{
		//for loop to go through each row in a column
		int iIndex;
		int iSum = 0;
		for(iIndex = 0; iIndex < iSquare.length; iIndex++)
			iSum += iSquare[iIndex][iCol];
		return iSum;
	}

	/**
	 * sumMainDiag - return the sum of the values in the main diagonal
	 * 
	 * @return
	 */
	public int sumMainDiag()
	{
		//for loop to go through diagonal from top left to bottom right
		int iIndex;
		int iSum = 0;
		for(iIndex = 0; iIndex < iSquare.length; iIndex++)
			iSum += iSquare[iIndex][iIndex];
		return iSum;
	}

	/**
	 * sumOtherDiag - return the sum of the values in the other ("reverse") diagonal
	 * 
	 * @return
	 */
	public int sumOtherDiag()
	{
		//for loop to go through diagonal from top right to bottom left
		int iIndexOne;
		int iIndexTwo;
		int iSum = 0;
		for(iIndexOne = 0; iIndexOne < iSquare.length; iIndexOne++)
		{
			iIndexTwo = iSquare.length-1 - iIndexOne;
			iSum += iSquare[iIndexOne][iIndexTwo];
		}
		return iSum;
	}

	/**
	 * magic - return true if the square is magic (all rows, cols, and diags have 
	 * same sum), false otherwise
	 * 
	 * @return
	 */
	public boolean magic()
	{
		boolean bMagic = true;
		int iSum = sumRow(0);
		int iIndex;
		
		//check rows
		for(iIndex = 0; iIndex < iSquare.length; iIndex++)
		{
			bMagic = bMagic && (iSum == sumRow(iIndex));
			bMagic = bMagic && (iSum == sumCol(iIndex));
		}
		
		bMagic = bMagic && (iSum == sumMainDiag()) && (iSum == sumOtherDiag());
		
		return bMagic;
		
	}

	/**
	 * readSquare - read info into the square from the input stream associated with the 
	 * Scanner parameter
	 * 
	 * @param scan
	 */
	public void readSquare(Scanner scan)
	{
		int iRow, iCol;
		for (iRow = 0; iRow < iSquare.length; iRow++)
			for (iCol = 0; iCol < iSquare.length; iCol ++)
				iSquare[iRow][iCol] = scan.nextInt();
	}

	/**
	 * printSquare - print the contents of the square, neatly formatted
	 * 
	 */
	public void printSquare()
	{
		//for loop to print out square
		int iRow;
		int iCol;
		String iSpace = "";
		
		for(iRow = 0; iRow < iSquare.length; iRow++)
		{
			for(iCol = 0; iCol < iSquare.length; iCol++)
			{
				if(iSquare[iRow][iCol] < 10 && iCol != 0)
					iSpace = "   ";
				else if(iSquare[iRow][iCol] < 10 && iCol == 0)
					iSpace = " ";
				else if(iSquare[iRow][iCol] > 9 && iCol != 0)
					iSpace = "  ";
				else if(iSquare[iRow][iCol] > 9 && iCol == 0)
					iSpace = "";
				System.out.print(iSpace + iSquare[iRow][iCol]);
			}
			System.out.println();
		}
	}
}