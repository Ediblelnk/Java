package finalproject;
/**
 * Player - class definition for a player, which has a name and hand
 * 
 * @author peters
 * @version 5/9/21
 * @contact 1009734@palisadessd.net
 */

public class Player
{
	//set up instance data: hand and name
	public Hand hand = new Hand();
	public String name;
	
	/**constructor - creates a new player with a name*/
	public Player(String name)
	{
		this.name = name; //obvious what is going on here
	}
	
	/**toString - returns a string with the name and printed hand*/
	public String toString()
	{
		//returns name's hand: with printed hand
		return this.name + (this.name.toUpperCase().endsWith("S") ? "'" : "'s")
				+ " hand:\n" + this.hand.toString();
	}
	
	/**concealed - returns a string with the name and concealed hand*/
	public String concealed()
	{
		//returns name's hand: with concealed hand
		return this.name + (this.name.toUpperCase().endsWith("S") ? "'" : "'s")
				+ " hand:\n" + this.hand.concealed();
	}
}