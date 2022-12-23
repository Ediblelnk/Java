package ch12;
/**
 * EightQueens.java
 * 
 * Code Description: Solves the non-attacking queens problem for a given number of queens
 * 
 * @author peters
 * @version 5/10/21
 * @contact 1009734@palisadessd.net
 */

public class EightQueens
{
	//Declare final representing the number of queens
	public static final int iNUM_QUEENS = 5; //<-- CHANGE THIS VALUE TO SOLVE FOR DIFFERENT SIZES
	
	// iQueens[n] stores the column of the nth row where the nth queen is
	public static int[] iQueens = new int[iNUM_QUEENS];  
	public static int iSolutions = 0;

	/**
	 * main method - solves the queen problem and then prints the number of solutions
	 * 
	 * @param args
	 */
	public static void main(String args[])
	{
		//solve starting with the 0th queen
		solve(0);
		//print the final number of solutions found
		System.out.print("\nTotal number of solutions: " + iSolutions);
	}  

	/**
	 * solve - recursivly solves the non-attacking queens problem
	 * 
	 * @param
	 */
	public static void solve(int iQueenNumber)
	{
		//for loop variable
		int iColumn;

		//for loop to explore every possible placement of a queen
		for(iColumn = 0; iColumn < iNUM_QUEENS; iColumn++)
		{
			//makes sure that a given column in the row is valid for a queen
			if(canPlace(iQueenNumber, iColumn))
			{
				//set the queen location to that column
				iQueens[iQueenNumber] = iColumn;

				//true if has just placed the last queen 
				if(iQueenNumber == iNUM_QUEENS-1)
					printSolution();
				
				//else continue to next queen
				else
					solve(iQueenNumber+1);
			}
		}
	}

	/**
	 * canPlace - Returns true if a queen iQueenNumber can be placed in column.
	 * 
	 * @param
	 */
	public static boolean canPlace(int iQueenNumber, int iColumn)
	{
		//declare for loop variable
		int iRow;
		
		//two variables for diagonal identities of a given location
		int iDiagonalDiff = iQueenNumber - iColumn;
		int iDiagonalSum = iQueenNumber + iColumn;

		//for loop goes through each previous queen to make sure location is valid
		for(iRow = iQueenNumber-1; iRow >= 0; iRow--)
		{
			//check if a column of a previous queen is the evaluated column
			if(iQueens[iRow] == iColumn)
				return false;
			
			//checks the diagonal identities against diagonal identities of previous queens
			if(iRow - iQueens[iRow] == iDiagonalDiff)
				return false; 
			if(iRow + iQueens[iRow] == iDiagonalSum)
				return false; 
		}
		
		//only reaches here if there was no issues with columns or diagonals
		return true; 
	}

	/**
	 * printSolution - prints a grid showing the position of the queens on the board
	 * 
	 * @param
	 */
	public static void printSolution()
	{
		//for loop variables
		int iColumn, iRow;
		
		//increase the number of solutions
		iSolutions++;
		
		//print the solution banner
		System.out.println("---------------");
		System.out.println(" Solution #" + iSolutions);
		System.out.println("---------------");

		//for loop to print the found solution
		for(iRow = 0; iRow < iNUM_QUEENS; iRow++)
		{
			//for loop to print a given row
			for(iColumn = 0; iColumn < iNUM_QUEENS; iColumn++)
			{
				//prints an "X" for a queen, "0" for nothing
				if(iQueens[iRow] == iColumn)
					System.out.print("X ");
				else
					System.out.print("0 ");
			}
			
			//new line after each row
			System.out.println();
		}
	}
}
