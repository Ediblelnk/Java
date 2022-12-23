package ch6;
/**
 * CountFlips.java
 * 
 * Code Description: Flips a coin an amount of times and reports head and tails
 * 
 * @author peters
 * @version 2/1/21
 * @contact 1009734@palisadessd.net
 */

public class CountFlips
{
	/**
	 * main method - Flips a coin an amount of times and reports head and tails
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//create variable for total flips
		final int iFLIPS = 100;
		
		//create variable for each side
		int iHeads = 0;
		int iTails = 0;
		
		Coin c = new Coin();
		
		//for loop to flip a coin 100 times
		int iCount;
		for(iCount = 0; iCount < iFLIPS; iCount++)
		{
			c.flip();
			if(c.isHeads())
				iHeads++;
			else
				iTails++;
		}
		
		//print results
		System.out.println("After " + iFLIPS + " flips of a coin..."
				+ "\n" + iHeads + " were heads (expected ~" + (iFLIPS/2) + ")"
						+ "\n" + iTails + " were tails (expected ~" + (iFLIPS/2) + ")");
	}
}