package finalproject;
/**
 * Hand - class definition for a hand of cards
 * 
 * @author peters
 * @version 5/9/21
 * @contact 1009734@palisadessd.net
 */

import java.util.ArrayList;

public class Hand
{
	public ArrayList<Card> hand = new ArrayList<Card>();

	/**addCard - adds a card to the hand*/
	public void addCard(Card c)
	{
		hand.add(c);
	}
	
	/**removeCard - removes a card from the hand*/
	public void removeCard(Card c)
	{
		hand.remove(c);
	}
	
	/**toString - returns a string containing all the cards in the hand*/
	public String toString()
	{
		String returnString = "";
		
		//add first layer of each card to returnString
		for(int i = 0; i < hand.size(); i++)
			returnString += "┌───────┐";
		returnString += "\n";
		
		//add second layer of each card to returnString
		for(Card c : hand)
			returnString += "│ " + (c.value == "10" ? c.value + " " + c.value:
				c.value + " " + c.suit + " " + c.value) + " │";
		returnString += "\n";
		
		//add third layer of each card to returnString
		for(Card c : hand)
			returnString += "│  " + c.suit + " " + c.suit + "  │";
		returnString += "\n";
		
		//add fourth layer of each card to returnString
		for(Card c : hand)
			returnString += "│  " + c.suit + " " + c.suit + "  │";
		returnString += "\n";
		
		//add fifth layer of each card to returnString
		for(Card c : hand)
			returnString += "│ " + (c.value == "10" ? c.value + " " + c.value:
				c.value + " " + c.suit + " " + c.value) + " │";
		returnString += "\n";
		
		//add sixth layer of each card to returnString
		for(int i = 0; i < hand.size(); i++)
			returnString += "╘═══════╛";
		returnString += "\n";
		
		//return super-mega-string
		return returnString;
		
	}
	
	/**concealed - returns a string containing concealed versions of all the cards in the hand*/
	public String concealed()
	{
		String returnString = "";
		
		//add first layer of each card to returnString
		for(int i = 0; i < hand.size(); i++)
			returnString += "┌───────┐";
		returnString += "\n";
		
		//add second layer of each card to returnString
		for(int i = 0; i < hand.size(); i++)
			returnString += "│ ◄═╤═► │";
		returnString += "\n";
		
		//add third layer of each card to returnString
		for(int i = 0; i < hand.size(); i++)
			returnString += "│  ◄╪►  │";
		returnString += "\n";
		
		//add fourth layer of each card to returnString
		for(int i = 0; i < hand.size(); i++)
			returnString += "│  ◄╪►  │";
		returnString += "\n";
		
		//add fifth layer of each card to returnString
		for(int i = 0; i < hand.size(); i++)
			returnString += "│ ◄═╧═► │";
		returnString += "\n";
		
		//add sixth layer of each card to returnString
		for(int i = 0; i < hand.size(); i++)
			returnString += "╘═══════╛";
		returnString += "\n";
		
		//return super-mega-string
		return returnString;
	}
}