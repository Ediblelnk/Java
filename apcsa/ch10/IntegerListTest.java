package ch10;
/**
 * Template.java
 * 
 * Code Description: Provide a menu-driven tester for the IntegerList class.
 * 
 * @author peters
 * @version 4/5/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class IntegerListTest
{
	//declare static variables to be known by all methods in the class
	static IntegerList list = new IntegerList(10);
	static Scanner kb = new Scanner(System.in);
	//instance of Scanner
	static boolean bRunning = true;
	
	/**
	 * main method - Create a list, then repeatedly print the
	 * 		menu and do what the user asks until they quit
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//declare variables to consider user's input
		int iRequest;
		
		while(bRunning)
		{
			//print the menu
			printMenu();
			//assign user request
			iRequest = kb.nextInt();
			//read in user choice
			execute(iRequest);
		}
	}
	
	/**
	 * execute - Do what the menu item calls for
	 * 
	 * @param iChoice
	 */
	public static void execute(int iChoice)
	{
		int iRequest; //request variable for new list
		int iHolder; //holder variable to reduce variable complexity

		switch(iChoice)
		{
			case 0:
				//set running boolean to false
				System.out.println("\n:Program quitted:");
				bRunning = false;
				break;
				
			case 1:
				//prompt for size of list
				System.out.print("Input size of list: ");
				iRequest = kb.nextInt();
				//create and randomize list
				list = new IntegerList(iRequest);
				list.randomize();
				break;
				
			case 2:
				//perform a selection sort, ascending order
				list.selectionSort();
				System.out.println("\nList sorted in ascending order");
				break;
			case 3:
				//perform a selection sort, ascending order
				list.sortDecreasing();
				System.out.println("\nList sorted in descending order");
				break;
				
			case 4:
				//prompt for value to search for
				System.out.print("Input element to be searched for: ");
				iRequest = kb.nextInt();
				//search list for element
				iHolder = list.search(iRequest);
				System.out.println((iHolder == -1 ? "\nElement " + iRequest + " not found in list": 
						"\nElement " + iRequest + " found at index " + iHolder));
				//if found print where it was found at
				break;
				
			case 5:
				//prompt for value to search for
				System.out.print("Input element to be searched for: ");
				iRequest = kb.nextInt();
				//search list for element
				iHolder = list.binarySearchDec(iRequest);
				System.out.println((iHolder == -1 ? "\nElement " + iRequest + " not found in list":
						"\nElement " + iRequest + " found at index " + iHolder));
				//if found print where it was found at
				break;
				
			case 6:
				//prompt for replacement and replace values
				System.out.print("Element to be replaced: ");
				iRequest = kb.nextInt();
				System.out.print("Element replacement value: ");
				iHolder = kb.nextInt();
				//call replace first function
				list.replaceFirst(iRequest, iHolder);
				System.out.println("Replaced first value of " + iRequest + " with " + iHolder);
				break;
				
			case 7:
				//prompt for replacement and replace values
				System.out.print("Element to be replace: ");
				iRequest = kb.nextInt();
				System.out.print("Element replacement value: ");
				iHolder = kb.nextInt();
				//call replace all function
				list.replaceAll(iRequest, iHolder);
				System.out.println("Replaced all values of " + iRequest + " with " + iHolder);
				break;
				
			case 8:
				//print the list
				System.out.println("\nValues of Current List:");
				list.print();
				break;
				
			default:
				//print invalid input, request retry
				System.out.print("\nUnknown Input, Please Try Again: ");
				iRequest = kb.nextInt();
				//run function again with new input
				execute(iRequest);
		}

	}
	
	/**
	 * printMenu - Print the user's choices
	 * 
	 * @param
	 */
	public static void printMenu()
	{
		System.out.println("\n Menu ");
		System.out.println(" ====");
		System.out.println("0: Quit");
		System.out.println("1: Create new list (** do this first!! **)");
		System.out.println("2: Sort list in ascending order using selection sort");
		System.out.println("3: Sort list in descending order using selection sort");
		System.out.println("4: Find an element in list via linear search");
		System.out.println("5: Find an element in list via binary search (only works when in descending order)");
		System.out.println("6: Replace first input element value with another");
		System.out.println("7: Replace all input element value with another");
		System.out.println("8: Print list");
		System.out.print("\nEnter your choice: ");
	}
}