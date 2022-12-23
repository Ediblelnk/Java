package ch12;

public class Maze
{
	private final int iTRIED = 3;
	private final int iPATH = 7;
	private int[][] iGrid = { {1,1,1,0,1,1},
			{1,0,1,1,1,0},
			{0,0,1,0,1,0},
			{1,1,1,0,1,0},
			{1,0,0,1,1,1},
			{1,1,1,0,0,1} };

	//  Attempts to recursively traverse the maze. Inserts special
	//  characters indicating locations that have been tried and that
	//  eventually become part of the solution.
	public boolean traverse(int iRow, int iColumn)
	{
		boolean bFinished = false;
		if (valid(iRow, iColumn))
		{
			iGrid[iRow][iColumn] = iTRIED;  // this cell has been tried
			if (iRow == iGrid.length - 1 && iColumn == iGrid[0].length - 1)
				bFinished = true;  // the maze is solved
			else
			{
				bFinished = traverse(iRow + 1, iColumn);     // south (next row)
				if (! bFinished)
					bFinished = traverse(iRow, iColumn + 1);   // east (next column)
				if (! bFinished)
					bFinished = traverse(iRow - 1, iColumn);   // north (previous row)
				if (! bFinished)
					bFinished = traverse(iRow, iColumn - 1);   // west (previous column)
			}
			if (bFinished)  // this location is part of the final path
				iGrid[iRow][iColumn] = iPATH;
		}
		return bFinished;
	}

	//  Determines if a specific location is valid.
	private boolean valid(int iRow, int iColumn)
	{
		boolean bResult = false;
		// check if cell is in the bounds of the matrix
		if (iRow >= 0 && iRow < iGrid.length &&
				iColumn >= 0 && iColumn < iGrid[iRow].length)
			//  check if cell is not blocked and not previously tried
			if (iGrid[iRow][iColumn] == 1)
				bResult = true;
		return bResult;
	}

	//  Returns the maze as a string.
	public String toString()
	{
		String sResult = "\n";
		int iRow, iColumn;
		for (iRow = 0; iRow < iGrid.length; iRow++)
		{
			for (iColumn=0; iColumn < iGrid[iRow].length; iColumn++)
				sResult += iGrid[iRow][iColumn] + " ";
			sResult += "\n";
		}
		return sResult;
	}
}