package ch12;
/**
 * TowersOfHanoi.java
 * 
 * Code Description: solves a tower of Hanoi of an input size
 * 
 * @author peters
 * @version 4/19/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class TowersOfHanoi
{
	//declare total disks and scanner object
	public static int iTotalDisks;
	public static Scanner kb = new Scanner(System.in);

	/**
	 * main method - solves a tower of Hanoi of an input size
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		//declare variables to time to process
		long lStart, lEnd;
		
		//prompt for a number of disks
		System.out.print("How many disks would you like to solve? ");
		iTotalDisks = kb.nextInt();
		System.out.println();
		
		//solve the tower and time the process
		lStart = System.nanoTime();
		moveTower(iTotalDisks, 1, 3, 2);
		lEnd = System.nanoTime();
		
		//print a fun fact about the number of moves taken
		System.out.println("\nThis Tower of " + iTotalDisks + " disks took " + ((int)(Math.pow(2,iTotalDisks))-1) 
				+ " moves and " + (lEnd-lStart)/1000 + "µs to complete");
		System.out.println("\nFun Fact: A Tower of 64 disks takes 18,446,744,073,709,551,615 moves."
				+ "\nIf a move is made each second, it would take 584,942,417,355 years to complete!");
	}

	/**
	 * moveTower - recursively solves a Hanoi tower of input size
	 * 
	 * @param
	 */
	private static void moveTower(int iNumDisks, int iStart, int iEnd, int iTemp)
	{
		if (iNumDisks == 1)
			//move disk from start to end
			moveOneDisk(iNumDisks, iStart, iEnd);
		else
		{
			//move tower
			moveTower(iNumDisks-1, iStart, iTemp, iEnd);
			//move disk from start to end
			moveOneDisk(iNumDisks, iStart, iEnd);
			//move tower
			moveTower(iNumDisks-1, iTemp, iEnd, iStart);
		}
	}

	/**
	 * moveOneDisk - moves one disk from the start to end and prints the move
	 * 
	 * @param
	 */
	private static void moveOneDisk(int iNumDisks, int iStart, int iEnd) 
	{
		//prints instructions to move one disk
		System.out.println("Move disk " + iNumDisks + " from peg " + iStart + " to peg " + iEnd);
	}
}