package ch5;
/**
 * SimpleSlot.java
 * 
 * Code Description: Simulates a simple 3-slot machine
 * 
 * @author peters
 * @version 12/30/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class
import java.util.Random; //import Random class

public class SimpleSlot
{
	/**
	 * main method - Simulates a simple 3-slot machine
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//creates logic flow variables
		boolean bRunning = true;
		boolean bDoubleWin, bTripleWin;
		String sInput = "";
		Double dwBetAmount = -1.0;
		double dStanding = 0.0;
		int iSlotOne, iSlotTwo, iSlotThree;
		
		Scanner kb = new Scanner(System.in); //create Scanner instance
		Random gen = new Random(); //create Random instance
		
		//print welcome message
		System.out.println("Welcome to the 3-Slot Machine!\n");
		
		//slot game running loop
		while(bRunning)
		{
			//prompt for confirmation
			while(dwBetAmount == -1.0)
			{
				System.out.print("Input how much you would like to bet or 'end' to end: ");
				sInput = kb.nextLine();
				
				try //try to determine a bet amount
				{
					dwBetAmount = Math.abs(Double.valueOf(sInput));
				}
				catch(Exception eOne) //special cases for unusual inputs
				{
					if(sInput.startsWith("$")) //sometimes $ is before amount
					{
						try
						{
							dwBetAmount = Math.abs(Double.valueOf(sInput.substring(1)));
						}
						catch(Exception eTwo) //case for unknown input
						{
							System.out.println("\nUnknown Input, please try again.\n");
						}
					}
					else if(sInput.startsWith("en")) //case for end
					{
						bRunning = false;
						dwBetAmount = 0.0;
					}
					else //case for unknown input
						System.out.println("\nUnknown Input, please try again.\n");
				}
				
			}
			//end game if requested
			if(!bRunning)
			{
				System.out.println("Final Standing:\t$" + dStanding);
				break;
			}
			
			//roll the slots
			iSlotOne = gen.nextInt(9);
			iSlotTwo = gen.nextInt(9);
			iSlotThree = gen.nextInt(9);
			
			//check if winning slot
			if(iSlotOne == iSlotTwo && iSlotTwo == iSlotThree)
			{
				bDoubleWin = false; //case for three of a kind
				bTripleWin = true;
			}
			else if(iSlotOne == iSlotTwo || iSlotTwo == iSlotThree || iSlotOne == iSlotThree)
			{
				bDoubleWin = true; //case for two of a kind
				bTripleWin = false;
			}
			else
			{
				bDoubleWin = false; //case for a loss
				bTripleWin = false;
			}
			
			//update standing according to win or loss
			if(bDoubleWin)
				dStanding += (2*dwBetAmount); //a double win means earning the amount bet
			else if(bTripleWin)
				dStanding += (20*dwBetAmount); //a triple win means earning double the amount bet
			else
				dStanding -= dwBetAmount; //a loss means losing the amount bet
			
			//display the results of the slot roll
			System.out.println("\n/---------\\"
					+ "\n| " + iSlotOne + "  " + iSlotTwo + "  " + iSlotThree + " |"
					+ "\n\\---------/");
			//display case for double or triple win
			if(bDoubleWin||bTripleWin)
			{
				System.out.println("\n$$ You Win! $$");
				if(bDoubleWin)
				{
					System.out.println("Amount Won:\t$" + 2*dwBetAmount);
				}
				if(bTripleWin)
				{
					System.out.println("Amount Won:\t$" + 20*dwBetAmount);
				}	
			}
			//display case for loss
			else
			{
				System.out.println("\n** You Lose! **"
						+ "\nAmount Lost:\t$" + dwBetAmount);
			}
			System.out.println("New Standing:\t$" + dStanding + "\n");
			
			//reset slot machine
			dwBetAmount = -1.0;
		}
		
		kb.close(); //close Scanner
	}
}