package ch5;
/**
 * HiLo.java
 * 
 * Code Description: Guessing game between 1-100
 * 
 * @author peters
 * @version 12/29/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import scanner class

import java.util.Random; //import random class

public class HiLo
{
	/**
	 * main method - Guessing game between 1-100
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//create variables for number and guess count
		boolean bRunning = true;
		boolean bCorrect = false;
		int iNumber;
		int iGuessCount = 1;
		String sGuess = "";
		Integer iwGuess = -1;
		
		Scanner kb = new Scanner(System.in); //create scanner instance
		Random gen = new Random(); //create random instance
		
		//assign random number to iNumber
		iNumber = gen.nextInt(100) + 1;
			
		//declare a number was chosen
		System.out.println("A random number between 1 and 100 has been chosen!");
		
		while(bRunning)
		{
			//guess loop
			while(iwGuess == -1)
			{
				//prompt for a guess
				System.out.print("Please input a guess, or 'exit' to exit: ");
				sGuess = kb.nextLine();
				
				//try to assign the guess to a number
				try
				{
					iwGuess = Math.abs(Integer.valueOf(sGuess));
				}
				catch(Exception e) //if encounter an error handle accordingly
				{
					if(sGuess.toLowerCase().startsWith("ex"))
					{
						bRunning = false; break;
					}
					else
					{
						System.out.println("Input an integer!");
					}
				}
			}
			//break if the request is exit
			if(bRunning == false)
				break;
			
			//check to see if guess is correct
			if(iNumber == iwGuess)
				bCorrect = true;
			else
				bCorrect = false;
			
			//case for correct guess
			if(bCorrect)
			{
				System.out.println("Correct!, the number was " + iNumber
						+ "\nNumber of guesses: " + iGuessCount + "\n");
				//reassign random number to iNumber
				iNumber = gen.nextInt(100) + 1;
					
				//redeclare a number was chosen
				System.out.println("A random number between 1 and 100 has been chosen!");
				iGuessCount = 1;
			}
			//case for incorrect guesses
			if(!bCorrect)
			{
				if(iwGuess < iNumber)
					System.out.println("That guess is too low!\n");
				if(iwGuess > iNumber)
					System.out.println("That guess is too high!\n");
				iGuessCount++;
			}
			
			//reset guess
			iwGuess = -1;
		}
		
		kb.close(); //close scanner
	}
}