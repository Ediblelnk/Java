package ch9;
/**
 * Player.java
 * 
 * Code Description: class definition for a player
 * 
 * @author peters
 * @version 3/22/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class Player
{
	//create variables for aspects of a player
	private String sName;
	private String sTeam;
	private int iJerseyNumber;
	
	/**
	 * readPlayer - reads for the information of a player
	 * 
	 * @param
	 */
	public void readPlayer(Scanner kb)
	{
	    
		System.out.print("Name: ");
		sName = kb.nextLine();

		System.out.print("Team: ");
		sTeam = kb.nextLine();

		System.out.print("Jersey number: ");
		iJerseyNumber = kb.nextInt();
		kb.nextLine();
	}
	
	/**
	 * equals - compares the team and uniform number of two players
	 * 
	 * @param
	 */
	public boolean equals(Player playerIn)
	{
		if(sTeam.equals(playerIn.sTeam) && iJerseyNumber == playerIn.iJerseyNumber)
			return true;
		else
			return false;
	}
	
	/**
	 * getName - return name of player
	 * 
	 * @param
	 */
	public String getName()
	{
		return sName;
	}
}