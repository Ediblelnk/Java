package ch3;
/**
 * PlayingCards.java
 * 
 * Code Description: Prints the card and values of some two card hands
 * 
 * @author peters
 * @version 11/4/20
 * @contact 1009734@palisadessd.net
 */

// declare object Rank which contains possible playing cards
enum Rank {ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king}

public class PlayingCards
{
  /**
   * main method - Prints the card and values of some two card hands
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // declare cards for high, face, 1, and 2
	Rank eHighCard = Rank.ace; 
	Rank eFaceCard = Rank.king; 
	Rank eCardOne = Rank.three; 
	Rank eCardTwo = Rank.ten;
	
	// declare integers for cardone and cardtwo
	int iCardOneVal = eCardOne.ordinal() + 1;
	int iCardTwoVal = eCardTwo.ordinal() + 1;
	
	// print highcard and facecard
	System.out.println("A blackjack hand: " + eHighCard + " and " + eFaceCard);
	
	// print cardone and cardtwo cards and values
	System.out.println("\nA two card hand: " + eCardOne + " and " + eCardTwo);
	System.out.println("Hand Value: " + (iCardOneVal + iCardTwoVal));
  }
}