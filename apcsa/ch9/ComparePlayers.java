package ch9;
/**
 * ComparePlayers.java
 * 
 * Code Description: Driver program for Player.java; tests the unique equals method
 * 
 * @author peters
 * @version 3/22/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class ComparePlayers
{
	/**
	 * main method - tests equals method for Player class
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//instantiate Scanner and declare two player objects
		Scanner kb = new Scanner(System.in);

		Player playerOne = new Player();
		Player playerTwo = new Player();

		//welcome
		System.out.println("Welcome to the Player Comparer!\n");
		//prompt for playerOne information
		System.out.println("Please input information for player one below");
		playerOne.readPlayer(kb);
		System.out.println();
		
		//prompt for playerTwo information
		System.out.println("Please input information for player two below");
		playerTwo.readPlayer(kb);
		System.out.println();
		
		//compare two players and print appropriate statements
		System.out.println((playerTwo.equals(playerOne) ? "These two are the same player!"
				: "These two are NOT the same player!"));
		
		kb.close();
	}
}