package ch5;
/**
 * RockPaperScissors.java
 * 
 * Code Description: Simulates a game of Rock-Paper-Scissors
 * 
 * @author peters
 * @version 12/29/20 12/30/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class
import java.util.Random; //import Random class

public class RockPaperScissors
{
	/**
	 * main method - Simulates a game of Rock-Paper-Scissors
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//create variables for input and computer
		int iGenerated, iComputerWinCount = 0;
		int iPlayerWinCount = 0, iTieCount = 0;
		String sComputerGuess;
		String sPlayerGuess = "";
		boolean bRunning = true;
		boolean bPlayerGuessMade = false;
		
		Scanner kb = new Scanner(System.in); //create Scanner instance
		Random gen = new Random(); //create Random instance
		
		//print welcome message
		System.out.println("Welcome to Rock Paper Scissors!\n");
		
		//game running loop
		while(bRunning)
		{
			//create Computer guess
			iGenerated = gen.nextInt(2);
			
			//assign Computer decision
			if(iGenerated == 0)
				sComputerGuess = "rock";
			else if(iGenerated == 1)
				sComputerGuess = "paper";
			else
				sComputerGuess = "scissors";
			
			while(!bPlayerGuessMade)
			{
				//request input
				System.out.print("Input your decision, or 'end' to end: ");
				sPlayerGuess = kb.nextLine().toLowerCase();
				
				//check if valid guess
				if(sPlayerGuess.startsWith("ro"))
				{
					//case for rock
					sPlayerGuess = "rock";
					bPlayerGuessMade = true;
				}
				else if(sPlayerGuess.startsWith("pa"))
				{
					//case for paper
					sPlayerGuess = "paper";
					bPlayerGuessMade = true;
				}
				else if(sPlayerGuess.startsWith("sc"))
				{
					//case for scissors
					sPlayerGuess = "scissors";
					bPlayerGuessMade = true;
				}
				else if(sPlayerGuess.startsWith("en"))
				{
					//case for end game
					bPlayerGuessMade = true;
					bRunning = false;
				}
				else //case for unvalid guess
				{
					System.out.println("\nPlease Input a valid decision!\n");
					bPlayerGuessMade = false;
				}
			}
			
			//break if requested game end
			if(bRunning == false)
			{
				System.out.println("\nGame Ended"
						+ "\nTotal Rounds:\t" + (iPlayerWinCount + iComputerWinCount + iTieCount)
						+ "\nPlayer Wins:\t" + iPlayerWinCount
						+ "\nPlayer Losses:\t" + iComputerWinCount
						+ "\nTies:\t\t" + iTieCount);
				break;
			}
			
			//check if tie
			if(sComputerGuess.equals(sPlayerGuess))
			{
				iTieCount++;
				System.out.println("\nTie! Both decided " + sComputerGuess);
			}
			
			//player guessed rock
			if(sPlayerGuess.equals("rock"))
			{
				//computer guessed paper
				if(sComputerGuess.equals("paper"))
				{
					iComputerWinCount++;
					System.out.println("\nYou lose!\nComputer Decision: paper"
							+ "\nPlayer Decision: rock");
				}
				//computer guessed scissors
				else if(sComputerGuess.equals("scissors"))
				{
					iPlayerWinCount++;
					System.out.println("\nYou win!\nComputer Decision: scissors"
							+ "\nPlayer Decision: rock");
				}
			}
			//player guessed paper
			else if(sPlayerGuess.equals("paper"))
			{
				//computer guessed rock
				if(sComputerGuess.equals("rock"))
				{
					iPlayerWinCount++;
					System.out.println("\nYou win!\nComputer Decision: rock"
							+ "\nPlayer Decision: paper");
				}
				//computer guessed scissors
				else if(sComputerGuess.equals("scissors"))
				{
					iComputerWinCount++;
					System.out.println("\nYou lose!\nComputer Decision: scissors"
							+ "\nPlayer Decision: paper");
				}
			}
			//player guessed scissors
			else if(sPlayerGuess.equals("scissors"))
			{
				//computer guessed rock
				if(sComputerGuess.equals("rock"))
				{
					iComputerWinCount++;
					System.out.println("\nYou lose!\nComputer Decision: rock"
							+ "\nPlayer Decision: scissors");
				}
				//computer guessed paper
				else if(sComputerGuess.equals("paper"))
				{
					iPlayerWinCount++;
					System.out.println("\nYou win!\nComputer Decision: paper"
							+ "\nPlayer Decision: scissors");
				}
			}
			
			//reset player guess
			bPlayerGuessMade = false;
		}
		
		kb.close(); //close scanner
	}
}