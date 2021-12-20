package finalproject;
/**
 * Deck - class definition for a deck of cards. Depends upon Card.java
 * 	By default includes 52 cards. (Jokers excluded)
 * @author peters
 * @version 5/7/21
 * @contact 1009734@palisadessd.net
 */

import java.util.ArrayList;
import java.util.Random;

public class Deck
{
	//set up arrays to contain the values and suits of a normal deck
	private String[] suits = {"♥", "♦", "♣", "♠"};
	private String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private String name;
	
	//random instance to use for various methods
	private Random rand = new Random();
	
	//ArrayList that contains every card
	public ArrayList<Card> cardlist = new ArrayList<Card>();
	
	/**constructor - puts decks cards into the deck of cards upon construction*/
	public Deck(String name, int playercount)
	{
		this.name = name;
		
		//if over 5 players, add another deck
		for(int i = 0; i <= playercount/6; i++)
		{
			//for each suit...
			for(String suit : suits)
			{
				//and for each value...
				for(String value : values)
				{
					//add a card containing that value and suit
					Card input = new Card(suit, value);
					cardlist.add(input);
				}
			}
		}
	}
	
	/**constructor - does not put ANY cards into the deck, used for the play deck*/
	public Deck(String name)
	{
		this.name = name; //yes this is a comment
	}
	
	/**prime - primes an empty deck using the giverdeck*/
	public void prime(Deck giverdeck)
	{
		Card primercard = giverdeck.dealRandCard(); //"primes" a deck, meaning that it gets a card in it
		this.cardlist.add(primercard);
	}
	
	/**addCard - adds a card to the deck*/
	public void addCard(Card c)
	{
		cardlist.add(c); //obvious what is going on here
	}
	
	/**getCard - returns a card from the deck given an index*/
	public Card getCard(int index)
	{
		return cardlist.get(index);
	}
	
	/**dealCards - deals a specified number of cards to the input hands*/
	public void dealCards(int cardnumber, Player[] players)
	{
		for(Player player: players)
			for(int i = 0; i < cardnumber; i++)
				player.hand.addCard(dealRandCard());
	}
	
	/**dealCards - deals a specified number of card to just one player*/
	public void dealCards(int cardnumber, Player player)
	{
		for(int i = 0; i < cardnumber; i++)
			player.hand.addCard(dealRandCard());
	}
	
	/**dealRandCard - deals (and removes from the deck) a random card*/
	public Card dealRandCard()
	{
		//pick a random index
		int index = rand.nextInt(cardlist.size());
		
		//capture the value of the card, remove from deck, and return card
		Card returnCard = cardlist.get(index);
		cardlist.remove(index);
		return returnCard;
		
	}
	
	/**topCard - return the top card of the deck*/
	public Card topCard()
	{
		return this.cardlist.get(cardlist.size()-1);
	}
	
	public String toString()
	{
		//create card representing last card in the deck
		Card lastcard = cardlist.get(cardlist.size()-1);
		String returnString = this.name + ":\n";
		
		//create a print for the last card in a deck
		returnString += "┌───────╥╖\n";
		returnString += "│ " + (lastcard.value == "10" ? lastcard.value + " " + lastcard.value:
			lastcard.value + " " + lastcard.suit + " " + lastcard.value) + " ║║\n";
		returnString += "│  " + lastcard.suit + " " + lastcard.suit + "  ║║\n";
		returnString += "│  " + lastcard.suit + " " + lastcard.suit + "  ║║\n";
		returnString += "│ " + (lastcard.value == "10" ? lastcard.value + " " + lastcard.value:
			lastcard.value + " " + lastcard.suit + " " + lastcard.value) + " ║║\n";
		returnString += "╘═══════╩╝\n";
		
		return returnString;
	}
	
	/**with - returns a string containing the top card of the deck and other decks concealed*/
	public String with(Deck...otherdecks)
	{
		Card lastcard = cardlist.get(cardlist.size()-1);
		
		//add first layer for each deck
		String returnString = "\t " + this.name + ":\t   ";
		for(Deck d: otherdecks)
			returnString += d.name + ":\t   ";
		returnString += "\n\t ";
		
		//add first layer for each deck
		returnString += "┌───────╥╖\t   ";
		for(int i = 0; i < otherdecks.length; i++)
			returnString += "┌───────╥╖\t   ";
		returnString += "\n\t ";
		
		//add first layer for each deck
		returnString += "│ " + (lastcard.value == "10" ? lastcard.value + " " + lastcard.value:
			lastcard.value + " " + lastcard.suit + " " + lastcard.value) + " ║║\t   ";
		for(int i = 0; i < otherdecks.length; i++)
			returnString += "│ ◄═╤═► ║║\t   ";
		returnString += "\n\t ";
		
		//add first layer for each deck
		returnString += "│  " + lastcard.suit + " " + lastcard.suit + "  ║║\t   ";
		for(int i = 0; i < otherdecks.length; i++)
			returnString += "│  ◄╪►  ║║\t   ";
		returnString += "\n\t ";
		
		//add first layer for each deck
		returnString += "│  " + lastcard.suit + " " + lastcard.suit + "  ║║\t   ";
		for(int i = 0; i < otherdecks.length; i++)
			returnString += "│  ◄╪►  ║║\t   ";
		returnString += "\n\t ";
		
		//add first layer for each deck
		returnString += "│ " + (lastcard.value == "10" ? lastcard.value + " " + lastcard.value:
			lastcard.value + " " + lastcard.suit + " " + lastcard.value) + " ║║\t   ";
		for(int i = 0; i < otherdecks.length; i++)
			returnString += "│ ◄═╤═► ║║\t   ";
		returnString += "\n\t ";
		
		//add first layer for each deck
		returnString += "╘═══════╩╝\t   ";
		for(int i = 0; i < otherdecks.length; i++)
			returnString += "╘═══════╩╝\t   ";
		returnString += "\n";
		
		return returnString;
	}
	
	/**concealed - prints a deck in a concealed manner*/
	public String concealed()
	{
		String returnString = "┌───────╥╖\n" +
							  "│ ◄═╤═► ║║\n" +
							  "│  ◄╪►  ║║\n" +
							  "│  ◄╪►  ║║\n" +
							  "│ ◄═╧═► ║║\n" +
							  "╘═══════╩╝\n";
		return returnString;
	}
	
	/**fillWith - refills the target deck with cards from another deck*/
	public void fillWith(Deck donordeck)
	{
		//keep last card
		Card lastcard = donordeck.getCard(donordeck.cardlist.size()-1);
		
		//remove the last card from the donordeck
		donordeck.cardlist.remove(donordeck.cardlist.size()-1);
		
		//take all of the cards and copy them to the filled deck
		this.cardlist.addAll(donordeck.cardlist);
		
		//clear the donordeck
		donordeck.cardlist.clear();
		//reinsert last card
		donordeck.addCard(lastcard);
	}
}