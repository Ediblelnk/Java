package ch12;
/**
 * ArrayListSandbox.java
 * 
 * Code Description: Uses an array list to mimic the function of a grocery list
 * 
 * @author peters
 * @version 5/3/21
 * @contact 1009734@palisadessd.net
 */

import java.util.ArrayList; //import ArrayList class
import java.util.Scanner; //import Scanner class

public class ArrayListSandbox
{
	//declare groceryList, scanner, and running boolean as class variables
	static ArrayList<String[]> groceryList = new ArrayList<String[]>();
	static Scanner kb = new Scanner(System.in);
	static boolean bRunning = true;
	
	/**
	 * main method - Uses an array list to mimic the function of a grocery list
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//declare variable for input
		int iChoice;
		
		//running loop
		while(bRunning)
		{
			//prints options, reads, then executes
			printOptions();
			iChoice = kb.nextInt();
			executeOption(iChoice);
		}
	}
	
	/**
	 * printOptions - prints out a menu detailing the options that the user has
	 * 
	 * @param
	 */
	public static void printOptions()
	{
		//printst the options for the grocery list, does NOT read for an input
		System.out.println("\nGrocery List Options"
				+ "\n~~~~~~~~~~~~~~~~~~~~"
				+ "\n1: Add item"
				+ "\n2: Remove item"
				+ "\n3: Change item attribute"
				+ "\n4: Get information about list"
				+ "\n5: Create new Grocery List (scraps current list)"
				+ "\n6: Print Grocery List"
				+ "\n0: Quit");
		System.out.print("\nInput option here: ");
	}
	
	/**
	 * executeOption - executes an action based on the request from user
	 * 
	 * @param
	 */
	public static void executeOption(int iChoice)
	{
		//declare temp variables for executing requests
		String[] sItem = new String[3];
		String sInput;
		int iIndex;
		int iRequest;

		kb.nextLine(); //clear input stream
		
		switch(iChoice)
		{
			case 1: //add item
				
				//prompt for and read name, price, and quantity
				System.out.print("\nItem name: ");
				sItem[0] = kb.nextLine().toUpperCase(); //converts all names to uppercase
				System.out.print("Item price: $");
				sItem[1] = kb.nextLine();
				System.out.print("Item quantity: ");
				sItem[2] = kb.nextLine();
				
				//add filled out item to grocery list
				groceryList.add(sItem);
				break;
				
			case 2: //remove item
				
				//prompt for item that should be removed
				System.out.print("\nWhat item would you like to remove? ");
				sInput = kb.nextLine().toUpperCase();
				iIndex = findItem(sInput); //attempts to find item in grocery list
				
				if(iIndex == -1) //item is not found in list
					System.out.println("\nItem not found: '" + sInput + "'");
				
				else //item is found in the list
				{
					groceryList.remove(iIndex);
					System.out.println("\nItem removed: '" + sInput + "'");
				}
				break;
				
			case 3: //change item
				
				//prompt for item to change
				System.out.print("\nWhat item would you like to change? ");
				sInput = kb.nextLine().toUpperCase();
				iIndex = findItem(sInput); //attempts to find item in grocery list
				
				if(iIndex == -1) //item is not found in list
					System.out.println("\nItem not found: '" + sInput + "'");
				
				else //item is found in list
				{
					//declare temporary variable to edit and then put back in to grocery list
					String[] sFocus = groceryList.get(iIndex);
					
					//prompt for attribute to change
					System.out.print("\nWhat would you like to change:"
							+ "\n1: Item name"
							+ "\n2: Item price"
							+ "\n3: Item quantity"
							+ "\nInput: ");
					iRequest = kb.nextInt();
					
					kb.nextLine(); //clear input stream
					
					//change the value requested
					switch(iRequest)
					{
						default: //prompt for new name, also the default request
							System.out.print("\nWhat would like the new name to be? ");
							sFocus[0] = kb.nextLine().toUpperCase();
							break;
							
						case 2: //prompt for new price
							System.out.print("\nWhat would you like the new price to be? $");
							sFocus[1] = kb.nextLine();
							break;
							
						case 3: //prompt for new quantity
							System.out.print("\nWhat would you like the new quantity to be? ");
							sFocus[2] = kb.nextLine();
							break;
					}
					
					groceryList.set(iIndex, sFocus); //set the edited item over its original content
				}
				break;
				
			case 4: //get information about list
				
				//lint list to get rid of non numerical prices and quantities
				lintList();
				
				//declare variables representing the total cost and length of list
				double dTotalCost = totalCost();
				int iLength = groceryList.size();
				
				//print a statement about the length of list, total cost, and average cost
				System.out.println("\nThe grocery list is " + iLength + " items long"
						+ " & costs $" + dTotalCost);
				System.out.println("The average cost per item is $" + (dTotalCost/iLength));
				break;
				
			case 5: //create new grocery list
				
				//reinitialize a grocerylist to be an empty ArrayList of String[]
				groceryList = new ArrayList<String[]>();
				
				//print a statement that new list was created
				System.out.println("\nNew grocery list created (old one scrapped)");
				break;
				
			case 6: //print grocery list
				
				//lint list to get rid of non numerical prices and quantities
				lintList();
				
				//print the fixed grocery list
				print(groceryList);
				break;
				
			case 0: //quit the program
				
				//set main method loop value to false, print statement
				bRunning = false;
				System.out.println("\n[Grocery List simulator ended]");
				break;
			
			default: //unknown input
				
				//prompt for a new value, then execute it
				System.out.print("\nUnknown input, please try again: ");
				iIndex = kb.nextInt();
				executeOption(iIndex);
		}
	}
	
	/**
	 * findItem - finds an item in groceryList, returns the index.
	 * 	returns -1 if not found in groceryList
	 * 
	 * @param
	 */
	public static int findItem(String sRequest)
	{
		//go throught the grocery list and return the first occurence of the requested item
		int iIndex;
		for(iIndex = 0; iIndex < groceryList.size(); iIndex++)
			if(sRequest.equals(groceryList.get(iIndex)[0]))
				return iIndex;
		
		//return -1 if item is not found
		return -1;
	}
	
	/**
	 * print - prints out a groceryList
	 * 
	 * @param
	 */
	public static void print(ArrayList<String[]> list)
	{
		//declare for loop value and temperary item value sFocus
		int iIndex;
		String[] sFocus;
		
		//print title of Grocery List
		System.out.println("\nContents of Grocery List:"
					+ "\n~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//go through each item and print the name, price, and quantity
		for(iIndex = 0; iIndex < list.size(); iIndex++)
		{
			sFocus = list.get(iIndex);
			System.out.println(sFocus[0] + "\t$" + sFocus[1] + "\t" + sFocus[2] + "x");
		}
	}
	
	/**
	 * lintList - verifies the price and amount are numbers, if they aren't they default to 0
	 * 
	 * @param
	 */
	public static void lintList()
	{
		//declare variables for new name, price, and quantity
		int iIndex; //for loop variable
		String sName, sPrice, sQuantity;
		
		//go through each item in list and check/correct the price or quantity
		for(iIndex = 0; iIndex < groceryList.size(); iIndex++)
		{
			try //check if price is a number
			{
				Double.valueOf(groceryList.get(iIndex)[1]);
			}
			catch(Exception NumberFormatException) //if price is not a number
			{
				//unchanged name and quantity
				sName = groceryList.get(iIndex)[0];
				sQuantity = groceryList.get(iIndex)[2];
				
				//replace with price of 0
				String[] sReplacement = {sName, "0", sQuantity};
				groceryList.set(iIndex, sReplacement);
			}
			
			try //check if quantity is a number
			{
				Double.valueOf(groceryList.get(iIndex)[2]);
			}
			catch(Exception NumberFormatException) //if quantity is not a number
			{
				//unchanged name and price
				sName = groceryList.get(iIndex)[0];
				sPrice = groceryList.get(iIndex)[1];
				
				//replace with quantity of "0"
				String[] sReplacement = {sName, sPrice, "0"};
				groceryList.set(iIndex, sReplacement);
			}

		}
	}
	
	/**
	 * totalCost - returns a double value of the total cost of the grocery list
	 * 
	 * @param
	 */
	public static double totalCost()
	{
		//create value for total cost, and set to 0
		double dTotal = 0;
		int iIndex;
		
		//go through each item in list and take the price*quantity and add to running total
		for(iIndex = 0; iIndex < groceryList.size(); iIndex++)
			dTotal += Double.valueOf(groceryList.get(iIndex)[1]) * Double.valueOf(groceryList.get(iIndex)[2]);
		
		//return the calculated total
		return dTotal;
	}
}