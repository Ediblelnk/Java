package finalproject;
/**
 * Card - class definition for a card. A card includes suit & number
 * 
 * @author peters
 * @version 5/7/21
 * @contact 1009734@palisadessd.net
 */

public class Card 
{
	//values that hold the suit and value of the card
	public String suit;
	public String value;
	
	/**constructor - creates a card with a suit and a value*/
	public Card(String suit, String value)
	{
		this.suit = suit;
		this.value = value;
	}
	
	/**toString - returns a string containing the suit and value of the card*/
	public String toString()
	{
		return "[" + this.value + " " + this.suit + "]";
	}
	
	/**equals - returns true if the cards have the same suit and value*/
	public boolean equals(Card other)
	{
		return (this.value.equals(other.value) && this.suit.equals(other.suit));
	}
}