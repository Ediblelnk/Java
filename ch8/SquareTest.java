package ch8;
/**
 * SquareTest.java
 * 
 * Code Description: Uses the Square class to read in square data and 
 * 		tell if each square is magic.
 * 
 * @author peters
 * @version 3/16/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import scanner class
import java.io.*; //import all classes from the io package

public class SquareTest
{
	/**
	 * main method - 
	 * 
	 * @param args
	 */
	public static void main(String[ ] args) throws IOException
	{
		//start scanner
		Scanner scan = new Scanner(new File("src\\magicdata.txt"));
		
		int iCount = 1; //count which square we're on
	    int iSize = scan.nextInt(); //size of next square
	    int iPlace;
	    
	    while (iSize != -1)  //Expecting -1 at bottom of input file
	    {
	    	Square current = new Square(iSize); //create square instance
	        
	    	current.readSquare(scan); //read the square
	    	
	    	System.out.println("\n<><><><><>");
	    	System.out.println("Square " + iCount + ":");
	    	System.out.println("<><><><><>\n");

	    	current.printSquare();
	    	
	    	System.out.println();

	    	//print the sums of its rows (use a for loop and a method from the Square class)
	    	for(iPlace = 0; iPlace < iSize; iPlace++)
	    	{
	    		System.out.println("Row " + (iPlace + 1) + " sum: " + current.sumRow(iPlace));
	    	}
	    	System.out.println();
	    	
	    	//print the sums of its columns (use a for loop and a method from the Square class)
	    	for(iPlace = 0; iPlace < iSize; iPlace++)
	    	{
	    		System.out.println("Column " + (iPlace + 1) + " sum: " + current.sumCol(iPlace));
	    	}
	    	System.out.println();

	    	//print the sum of the main diagonal (use a method from the Square class)
	    	System.out.println("Top-left to Bottom-right sum: " + current.sumMainDiag());

	    	//print the sum of the other diagonal (use a method from the Square class)
	    	System.out.println("Top-right to Bottom-left sum: " + current.sumOtherDiag());

	    	//determine and print whether it is a magic square
	    	System.out.println((current.magic() ? "\n[!!] This is a Magic Square [!!]" : "\n[!!] This is not a Magic Square [!!]"));
	    	//(use an if statement and a method from the Square class)

	    	iSize = scan.nextInt();  //gets size of next square
	        
	    	System.out.println();
	    	iCount++;
	    }
	}
}