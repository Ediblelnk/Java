package ch11;
/**
 * CountLetters.java
 * 
 * Code Description: Reads a words from the standard input and prints the number of
 * 		occurrences of each letter in that word.
 * 
 * @author peters
 * @version 4/14/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class CountLetters
{
	/**
	 * main method - Reads a words from the standard input and prints the number of
	 * 	occurrences of each letter in that word.
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//declare array to hold letter amounts
		int[] iCounts = new int[26];
		String sWord;
		int iIndex;
		
		Scanner kb = new Scanner(System.in); //scanner instance

		//prompt user for word
		System.out.print("Enter a single word (letters only, please): ");
		sWord = kb.nextLine();

		//convert to upper case
		sWord = sWord.toUpperCase();

		//count frequency of each letter in string
		for (iIndex = 0; iIndex < sWord.length(); iIndex++)
			try
			{
				//put the character into the array (if possible)
				iCounts[sWord.charAt(iIndex) - 'A']++;
			}
			catch(ArrayIndexOutOfBoundsException exception)
			{
				//print the non-letter that caused the error
				System.out.println("Not a letter: " + sWord.charAt(iIndex));
			}

		//print frequencies
		System.out.println();
		for (iIndex = 0; iIndex < iCounts.length; iIndex++)
			if (iCounts[iIndex] != 0)
				System.out.println((char)(iIndex + 'A') + ": " + iCounts[iIndex]);
		
		kb.close(); //close Scanner
	}
}