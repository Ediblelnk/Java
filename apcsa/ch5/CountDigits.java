package ch5;
/**
 * CountDigits.java
 * 
 * Code Description: Determines how many odd, even, and 0's digits there are in an integer
 * 
 * @author peters
 * @version 12/18/20 12/21/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import scanner class

public class CountDigits
{
	/**
	 * main method - Determines how many odd, even, and 0's digits there are in an integer
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//declare loop variables
		boolean bRunning = true;
		
		//declare input variables
		String sInput = "";
		int iOddCount = 0;
		int iEvenCount = 0;
		int iZeroCount = 0;
		Integer iwInteger = -1; //set default value
		
		Scanner kb = new Scanner(System.in); //create scanner object
		
		while(bRunning == true)
		{
			//keep asking for an integer while iwInteger == -1
			while(iwInteger == -1)
			{
				//prompt for a number request
				System.out.print("Please input an integer, or 'exit' to exit: ");
				sInput = kb.next();
				
				//exit the program if the user types 'exit'
				if(sInput.toLowerCase().startsWith("ex"))
				{
					bRunning = false;
					break;
				}
				
				try //try to assign the request to a number
				{
					iwInteger = Math.abs(Integer.valueOf(sInput));
				}
				catch(Exception e) //if unsuccessful display error message
				{
					System.out.println("\nInput an actual integer or 'exit'!\n");
				}
			}
			
			//break loop if bRunning is false
			if(bRunning == false)
				break;
			
			//special case in which the number starts with zero
			if(iwInteger == 0)
				iZeroCount++;
			
			//calculate how many odds, evens, and zeros
			while(iwInteger > 0)
			{
				//case for even digit
				if((iwInteger%10 == 2 || iwInteger%10 == 4 || iwInteger%10 == 6 || iwInteger%10 == 8))
					iEvenCount++;
				//case for odd digit
				if(iwInteger%10 == 1 || iwInteger%10 == 3 || iwInteger%10 == 5 || iwInteger%10 == 7 || iwInteger%10 == 9)
					iOddCount++;
				//case for zero digit
				if(iwInteger%10 == 0)
					iZeroCount++;
				
				//remove digit that was counted
				iwInteger /= 10;
			}
			
			//display results
			System.out.println("\n" + sInput + " has " + iEvenCount + " even digits, "
					+ iOddCount + " odd digits, and " + iZeroCount + " zero digits.\n");
			
			//reset values to initial state
			iEvenCount = 0;
			iOddCount = 0;
			iZeroCount = 0;
			iwInteger = -1;
		}
		
		kb.close(); //close scanner
	}
}