package ch6;
/**
 * CountingChar.java
 * 
 * Code Description: Enter a phrase and the computer will tell you how many spaces, 
 * 		e's, a's, s's, and t's there are
 * 
 * @author peters
 * @version 1/18/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class CountingChar
{
	/**
	 * main method - Enter a phrase and the computer will tell you how many spaces, 
	 * 	e's, a's, s's, and t's there are
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//create variables for storing message and characters
		String sPhrase;
		int iCountSpace, iCountA;
		int iCountE, iCountS, iCountT;
		char cChar;
		
		//loop variable
		boolean bRunning = true;
		
		Scanner kb = new Scanner(System.in); //instantiate scanner object
		
		//print welcome message
		System.out.println ("\nCharacter Counter");

		while(bRunning)
		{
			//set variable's value for the loop runthrough
			iCountA = 0; iCountS = 0; iCountSpace = 0;
			iCountE = 0; iCountT = 0;
			
			//print prompt
			System.out.print ("\nEnter a sentence or phrase, or 'quit' to quit: ");
			sPhrase = kb.nextLine();
			sPhrase = sPhrase.toLowerCase();
			
			if(sPhrase.startsWith("quit"))
				break;
	
			//for loop to go through the phrase one character at a time
			int iCount;
			for(iCount = 0; iCount < sPhrase.length(); iCount++)
			{
				//add character to possible character counts
				cChar = sPhrase.charAt(iCount);
				switch(cChar)
				{
				case ' ':
					iCountSpace++;
					break;
				case 'a':
					iCountA++;
					break;
				case 'e':
					iCountE++;
					break;
				case 's':
					iCountS++;
					break;
				case 't':
					iCountT++;
					break;
				}
			}
			
			//print final results
			System.out.println ("\nNumber of spaces: " + iCountSpace
					+ "\nNumber of A's:\t  " + iCountA
					+ "\nNumber of E's:\t  " + iCountE
					+ "\nNumber of S's:\t  " + iCountS
					+ "\nNumber of T's:\t  " + iCountT);
		}
		kb.close(); //close Scanner
	}
}