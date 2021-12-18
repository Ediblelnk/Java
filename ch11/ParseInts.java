package ch11;
/**
 * ParseInts.java
 * 
 * Code Description: Reads a line of text and prints the integers in the line.
 * 
 * @author peters
 * @version 4/14/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class ParseInts
{
	/**
	 * main method - Reads a line of text and prints the integers in the line.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		//declare variables for sum and current value
		int iVal, iSum = 0;
		
		Scanner kb = new Scanner(System.in); //declare scanner instance

		System.out.print("Enter a line of text: ");
		Scanner scanLine = new Scanner(kb.nextLine());

		//scans the input for pure integers (no other characters in the term)
		while (scanLine.hasNext())
		{
			try
			{
				//try to convert into an integer
				iVal = Integer.parseInt(scanLine.next());
				iSum += iVal;
			}
			catch(NumberFormatException exception) {}
			//catch exception, but do nothing
		}

		//print the pure integer sum
		System.out.println("\nThe sum of the integers on this line is: " + iSum);
		
		scanLine.close(); //close Scanner
		kb.close(); //close Scanner
	}
}