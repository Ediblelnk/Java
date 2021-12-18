package ch12;
/**
 * Maze4D.java
 * 
 * Code Description: Class definition of a 4-dimensional maze, with solve method
 * 
 * @author peters
 * @version 4/25/21
 * @contact 1009734@palisadessd.net
 */

public class Maze4D
{
	//declare path and tried variables
	private final int iTRIED = 3;
	private final int iPATH = 7;
	
	//declare 4-d array to represent maze
	private int[][][][] iGrid = {
		{ //first time value
				//first depth value
		  { {1,1,1,0,1,1,1,0},
			{0,0,0,0,0,0,0,0},
			{1,0,1,0,0,0,1,0},
			{1,0,0,0,1,0,1,0},
			{1,1,1,1,1,0,0,1},
			{0,0,0,0,0,1,1,1},
			{0,1,0,0,1,0,0,0},
			{0,0,1,1,1,0,0,1} },
		  		//second depth value
		  { {0,1,0,1,0,1,0,1},
			{0,1,0,0,1,1,1,0},
			{1,1,0,1,0,0,0,0},
			{1,0,1,0,1,0,1,1},
			{0,1,0,1,0,0,1,0},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,1,0,1},
			{1,1,0,1,0,0,0,0} },
		  		//third depth value
		  { {1,0,1,0,1,1,0,1},
			{0,0,1,0,0,0,0,0},
			{1,0,0,1,0,1,1,1},
			{1,1,1,1,0,1,0,0},
			{0,0,0,0,0,0,1,1},
			{1,0,0,1,1,1,0,0},
			{1,0,0,1,0,1,0,1},
			{1,1,1,0,1,1,0,1} } },
		{ //second time value
				//first depth value
		  { {1,1,1,0,0,1,0,1},
			{1,0,1,0,1,1,0,1},
			{1,1,1,0,0,0,1,1},
			{0,0,0,1,1,0,0,0},
			{0,1,1,0,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{1,1,0,1,0,1,0,0},
			{1,0,1,1,0,0,1,0} },
				//second depth value
		  { {1,1,1,0,0,0,1,0},
			{1,0,0,0,1,0,1,0},
			{1,0,1,0,0,1,1,1},
			{0,0,1,0,1,0,0,0},
			{1,0,0,0,1,1,0,1},
			{1,1,0,1,0,0,1,1},
			{0,1,0,0,1,0,0,0},
			{0,1,1,0,1,1,1,1} },
		  		//third depth value
		  { {1,0,1,1,0,1,1,0},
			{0,1,0,1,0,0,1,1},
			{1,0,1,0,1,1,0,1},
			{1,0,1,0,1,0,1,0},
			{1,0,0,0,0,0,1,1},
			{1,0,1,1,0,1,1,0},
			{0,1,0,1,0,0,0,0},
			{0,1,0,1,1,0,1,0} }	},
		{ //third time value
				//first depth value
		  { {1,0,1,0,1,0,1,0},
			{1,0,0,0,1,0,0,1},
			{0,0,1,0,0,0,1,0},
			{1,0,1,1,0,1,0,1},
			{1,0,0,0,0,1,0,0},
			{0,1,0,1,0,0,0,1},
			{1,1,0,0,0,1,0,0},
			{0,1,0,1,0,0,1,0} },
		  		//second depth value
		  { {0,1,0,1,0,1,0,0},
			{1,1,0,1,0,1,0,0},
			{0,0,0,0,1,0,1,1},
			{1,0,1,1,1,0,0,0},
			{1,0,0,0,1,0,0,1},
			{0,0,0,0,0,0,0,0},
			{1,0,0,0,1,0,0,1},
			{1,0,1,1,1,1,0,1} },
		  		//third depth value
		  { {1,0,1,0,1,0,1,0},
			{0,0,0,1,1,0,1,0},
			{1,0,1,1,0,0,0,0},
			{0,1,0,0,1,0,1,0},
			{0,0,1,0,0,1,0,0},
			{0,1,0,1,1,0,1,1},
			{0,0,1,0,1,1,0,0},
			{1,0,1,0,1,0,0,1} } } };

	/**
	 * solve - solves the 4-dimensional maze. Returns true if the maze was solved. False otherwise
	 */
	public boolean solve()
	{
		return traverse(0,0,0,0); //honestly just liked this representation better
	}
	
	/**
	 * traverse - attempts to recursively traverse the maze. Inserts special characters
	 * 		indicating locations that have been tried and that eventually become part of
	 * 		the solution.
	 * 
	 * @param
	 */
	private boolean traverse(int iTime, int iDepth, int iRow, int iColumn)
	{
		//default value of finished is false
		boolean bFinished = false;
		//only continues recursion if input is valid on the maze
		if (valid(iTime, iDepth, iRow, iColumn))
		{
			//this cell has been tried
			iGrid[iTime][iDepth][iRow][iColumn] = iTRIED;
			
			//case for the end of the maze position
			if (iTime == iGrid.length-1 && iDepth == iGrid[0].length-1 && iRow == iGrid[0][0].length-1 && iColumn == iGrid[0][0][0].length-1)
				//the maze is solved
				bFinished = true;
			
			//if maze not solved, check the positions adjacent to it
			else
			{
				bFinished = traverse(iTime + 1, iDepth, iRow, iColumn);	//forward
				if (! bFinished)
					bFinished = traverse(iTime - 1, iDepth, iRow, iColumn);	//backward
				if (! bFinished)
					bFinished = traverse(iTime, iDepth + 1, iRow, iColumn);	//up
				if (! bFinished)
					bFinished = traverse(iTime, iDepth - 1, iRow, iColumn);	//down
				if (! bFinished)
					bFinished = traverse(iTime, iDepth, iRow + 1, iColumn);	//north
				if (! bFinished)
					bFinished = traverse(iTime, iDepth, iRow - 1, iColumn);	//south
				if (! bFinished)
					bFinished = traverse(iTime, iDepth, iRow, iColumn + 1);	//east
				if (! bFinished)
					bFinished = traverse(iTime, iDepth, iRow, iColumn - 1);	//west
			}
			if (bFinished)
				//this location is part of the final path
				iGrid[iTime][iDepth][iRow][iColumn] = iPATH;
		}
		return bFinished;
	}

	/**
	 * valid - private method used in traverse. Used to determine if
	 * 		a specific location is valid within the maze.
	 * 
	 * @param
	 */
	private boolean valid(int iTime, int iDepth, int iRow, int iColumn)
	{
		boolean bResult = false;
		
		//check if cell is in the bounds of the matrix (time, depth, row, column)
		if (iTime >= 0 && iTime < iGrid.length &&
				iDepth >= 0 && iDepth < iGrid[0].length &&
				iRow >= 0 && iRow < iGrid[0][0].length &&
				iColumn >= 0 && iColumn < iGrid[0][0][0].length)
			
			//check if cell is not blocked and not previously tried
			if (iGrid[iTime][iDepth][iRow][iColumn] == 1)
				bResult = true;
		
		//return result
		return bResult;
	}

	/**
	 * toString - returns the maze as a string.
	 * 
	 * @param
	 */
	public String toString()
	{
		//declare variables to use for nested loops and result variable
		int iTime, iDepth, iRow, iColumn;
		String sResult = "\n";
		
		//for loop to print each time
		for(iTime = 0; iTime < iGrid.length; iTime++)
		{
			sResult += "Time: " + (iTime+1) + "\n{\n";
			
			//for loop to print each depth (in each time)
			for(iDepth = 0; iDepth < iGrid[0].length; iDepth++)
			{
				sResult += "  Depth: " + (iDepth+1) + "\n  {\n";
				
				//for loop to print each row (in each depth, in each time)
				for(iRow = 0; iRow < iGrid[0][0].length; iRow++)
				{
					sResult += "    ";
					
					//for loop to print each column (in each row, in each depth, in each time)
					for(iColumn = 0; iColumn < iGrid[0][0][0].length; iColumn++)
					{
						//add the proper number according to time, depth, row, and column
						sResult += iGrid[iTime][iDepth][iRow][iColumn] + " ";
					}
					sResult += "\n"; //new line for each row
				}
				sResult += "  }\n\n"; //new line for each depth
			}
			sResult += "}\n\n"; //new line for each time
		}
		
		//return final mega-string
		return sResult;
	}
}