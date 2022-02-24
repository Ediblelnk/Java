package ch8;
/**
 * Shopping.java
 * 
 * Code Description: Simulates shopping	using classes
 * 
 * @author peters
 * @version 2/21/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import scanner class

public class Shopping
{
	/**
	 * main method - Simulates shopping	using classes
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//declare variables to keep track of shopping
		boolean bShopping = true;
		String sRequest, sEndRequest;
		String sItemName;
		double dItemPrice;
		int iItemQuantity;
		
		//create the empty shopping cart
		ShoppingCart personalCart = new ShoppingCart();
		
		Scanner kb = new Scanner(System.in); //instantiate scanner object
		
		//welcome message
		System.out.println("-------------------------------------");
		System.out.println(" Welcome to the APCSA Grocery Store!");
		System.out.println("-------------------------------------\n");
		
		//while loop to keep asking for items
		while(bShopping)
		{
			//set request variables to default state
			sRequest = "";
			sEndRequest = "";
			
			//prompt to keep shopping
			System.out.print("Would you like to add an item to the cart? (y/n) ");
			sRequest = kb.nextLine();
			
			//case for no new item
			if(sRequest.toLowerCase().startsWith("n"))
			{
				System.out.print("Would you like to end shopping? (y/n) ");
				sEndRequest = kb.nextLine();
				
				//case for shopping ending
				if(sEndRequest.toLowerCase().startsWith("y"))
				{
					bShopping = false;
				}
			}
			
			//case for new item
			else if(sRequest.toLowerCase().startsWith("y"))
			{
				//prompt for the information needed for an item
				System.out.print("Input the item Name: ");
				sItemName = kb.nextLine();
				System.out.print("Input the item Price: $");
				dItemPrice = kb.nextDouble();
				kb.nextLine();
				System.out.print("Input the item Quantity: ");
				iItemQuantity = kb.nextInt();
				kb.nextLine();
				
				//add item to shopping cart
				personalCart.addToCart(sItemName, dItemPrice, iItemQuantity);
				
				//print items now in cart
				System.out.println(personalCart.toString());
				System.out.println();
			}
			
		}
		
		//return the shopping cart owed
		System.out.println("\nPlease pay: $" + personalCart.getTotalPrice());
		
		kb.close(); //close scanner
	}
}