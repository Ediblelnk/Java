package finalproject;
/**
 * Game - class definition for a Game of Crazy Eights
 * 
 * @author peters
 * @version 5/17/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Random;

public class Game 
{
	//input vairables
	private int input = 0, eightinput = 0;
	private String sinput = "";
	
	//game variables
	private int drawtwostacks = 0;
	private String message = "";
	private int turnplace = 0;
	private boolean turnskip = false;
	private int turndirection = 1; //1 for forward,  numplayers-1 for backward
	public boolean vsAI = false;
	
	//running variable
	public boolean running = true;
	private Player winner;
	
	//object variables
	private Deck drawdeck;
	private Deck playdeck;
	private Player[] players;
	private Player focusplayer;
	
	//tool instances
	private Scanner kb = new Scanner(System.in);
	private Random rand = new Random();
	
	/**initialize - prompts for a creates the players for the game*/
	public void initialize()
	{
		//make sure the initial variables are correct
		vsAI = false; turnskip = false; running = true;
		eightinput = 0; sinput = ""; input = 0; turnplace = 0;
		turndirection = 1; message = ""; drawtwostacks = 0;
		
		//welcome message
		System.out.println("\nWelcome to CRAZY EIGHTS.");
		
		//input loop to make sure of a correct input
		while(input < 1)
		{
			System.out.print("How many are going to play? ");
			try {input = kb.nextInt();}
			catch(Exception exception)
			{
				System.out.println("Please input a number!");
				kb.nextLine();
			}
		}
		
		kb.nextLine(); //clear input stream
		
		//define players[] to be correct size
		//if the player count is one need space for Robert (AI)
		players = new Player[(input == 1 ? 2 : input)];
		
		//if one player game add AI to roster, set vsAI to true
		if(input == 1) {players[1] = new Player("Robert (AI)"); vsAI = true;}
		
		//for loop to get the player names
		for(int i = 0; i < input; i++)
		{
			System.out.print("What is player " + (i+1) + "'s name? ");
			
			sinput = "";
			while(sinput.length() == 0)
				sinput = kb.nextLine();
			//add that defined player to the array in the proper place
			players[i] = new Player(sinput);
		}
		
		//create decks in accordance to the size of roaster
		playdeck = new Deck("Play Pile");
		drawdeck = new Deck("Draw Pile", input);
		playdeck.prime(drawdeck); //prime the new play deck
		
		//deal amount of cards to player (if 2 or less players, deal 7, else deal 5)
		if(input < 3) drawdeck.dealCards(7, players);
		else drawdeck.dealCards(5, players);
	}
	
	/**promptTurn - prompts for the next turn without revealing sensitive info*/
	public void promptTurn()
	{
		if(!vsAI) //only prompts in multiplayer environment
		{
			System.out.print("It is " + (players[turnplace%players.length].name
					+ (players[turnplace%(players.length-1)].name.toUpperCase().endsWith("S") ? "' turn. " : "'s turn. ")));
			System.out.println(message);
			System.out.print("Press 'Enter' to begin turn. ");
			
			clear(2);
			
			//wait for next input
			kb.nextLine();
		}
		else
		{
			clear(2);
		}
	}
	
	/**nextTurn - plays the next turn, according to vs AI or PvP*/
	public void nextTurn()
	{
		displayGame();
		takeTurn();
		advanceTurn();
	}
	
	/**clearTurn - clears the console for the next player's turn*/
	public void clear(int amount)
	{
		for(int i = 0; i < amount; i++)
		{
			System.out.println();
		}
	}
	
	/**displayGame - displays the correct display from a turn*/
	private void displayGame()
	{	//determines focusplayer based on "game mode"	
		focusplayer = players[turnplace%players.length];
		if(vsAI) focusplayer = players[0];
		
		//print out each player that is not the current player, concealed
		for(Player player: players)
		{
			if(!player.name.equals(focusplayer.name))
				System.out.print(player.concealed());
		}
		
		//print the draw and play deck
		System.out.print(playdeck.with(drawdeck));
		
		//print the current player's hand
		System.out.println(focusplayer);
	}
	
	/**takeTurn - shows the options that a player has for completing a turn, and executes the choice*/
	private void takeTurn()
	{
		System.out.println("Turn Options:");
		
		Card[] options = findOptions(focusplayer);
		
		int i;
		for(i = 1; i <= options.length; i++)
			System.out.println(i + ": " + options[i-1] + rule(options[i-1]));
		System.out.println(i + ": Draw card" + (drawtwostacks > 0 ? "s (" + 2*drawtwostacks + ")" : ""));
		
		//ensure a valid input from the user
		input = Integer.MIN_VALUE;
		while(input == Integer.MIN_VALUE)
		{
			System.out.print("Selected option: ");
			
			try {input = kb.nextInt();}
			catch(Exception exception)
			{
				System.out.println("Please input a number!");
				kb.nextLine();
			}
		}
		kb.nextLine();
		
		//draw the card(s) depending on input
		if(input < 1 || input > options.length)
		{
			if(drawtwostacks == 0) //regular draw
			{
				drawdeck.dealCards(1, focusplayer);
				message = focusplayer.name + " drew a card.";
			}
			else
			{
				drawdeck.fillWith(playdeck); //ensure enough cards available
				drawdeck.dealCards(2*drawtwostacks, focusplayer);
				message = focusplayer.name + " drew " + (2*drawtwostacks) + " cards.";
				drawtwostacks = 0;	//reset stacks of draw twos
			}
		}
		else //play a specific card
		{
			playdeck.addCard(options[input-1]);
			focusplayer.hand.removeCard(options[input-1]);
			actOn(options[input-1]);
		}
		
		checkWinning();
		
		if(playdeck.topCard().value.equals("Q") && vsAI && !message.endsWith("drew a card."))
		{
			clear(2);
			displayGame();
			takeTurn(); //get to go again if played a queen and against 2 players
		}
	}
	
	/**advanceTurn - advances a turn based on played cards*/
	private void advanceTurn()
	{
		if(running)
		{
			if(!vsAI) //only uses turn system if not against ai
			{
				//return the focusplayer to their position in players list
				players[turnplace%players.length] = focusplayer;
				
				//advance one or two turns, depending on card played
				turnplace += turndirection;
				//skip a turn if a queen was played
				if(playdeck.topCard().value.equals("Q") && turnskip)
				{
					turnplace += turndirection;
					turnskip = false;
				}
			}
			else aiTurn();
		}
	}
	
	/**aiTurn - completes a turn from Roger's viewpoint*/
	private void aiTurn()
	{
		focusplayer = players[1];
		
		Card[] options = findOptions(focusplayer);
		
		if(options.length > 0) //condition where there are playable options
		{
			input = rand.nextInt(options.length);
			
			playdeck.addCard(options[input]);
			focusplayer.hand.removeCard(options[input]);
			actOn(options[input]);
		}
		else //condition where there are no playable options (the AI only draws when it must)
		{
			if(drawtwostacks == 0) //regular draw
			{
				drawdeck.dealCards(1, focusplayer);
				message = focusplayer.name + " drew a card.";
			}
			else //forced draw via draw 2s
			{
				drawdeck.fillWith(playdeck); //ensure enough cards available
				drawdeck.dealCards(2*drawtwostacks, focusplayer);
				message = focusplayer.name + " drew " + (2*drawtwostacks) + " cards.";
				drawtwostacks = 0;
			}
		}
		
		//add a little time delay for dramatic effect
		try {TimeUnit.MILLISECONDS.sleep(500 + rand.nextInt(1501));}
		catch(InterruptedException ie) {Thread.currentThread().interrupt();}
		
		checkWinning();
		
		clear(2);
		
		System.out.println(message); //where the output of what Robert did that round is shown to the player
		
		//add a little time delay for dramatic effect
		try {TimeUnit.MILLISECONDS.sleep(250 + rand.nextInt(251));}
		catch(InterruptedException ie) {Thread.currentThread().interrupt();}
		
		if(playdeck.topCard().value.equals("Q") && !message.endsWith("drew a card.")) aiTurn(); //ai gets to play again if they played a queen
	}
	
	/**checkWinning - checks each player's hand to see if it is empty*/
	private void checkWinning()
	{
		for(Player p: players) //ends the game if someone has no cards, and declares them the winner
		{
			if(p.hand.hand.size() == 0) {winner = p; running = false;}
		}
	}
	
	/**declareWinner - declares the winner of the game*/
	public void declareWinner()
	{
		if(vsAI) clear(2);
		
		System.out.println("The WINNER of this game of CRAZY EIGHTS:"
				+ "\n\n!#!#!#! " + winner.name + " !#!#!#!"
				+ "\n\nCongrats!");
	}
	
	/**promptNewGame - asks if another game would like to be played*/
	public boolean promptNewGame()
	{
		clear(2);
		
		System.out.print("Would you like to play again? ");
		
		if(kb.nextLine().toUpperCase().startsWith("Y")) return true;
		else return false;
	}
	
	/**endingMessage - gives a short message of ending*/
	public String endingMessage()
	{
		return "\nThank you for playing! Created by Peter Schaefer, Mid-2021";
	}
	
	/**rule - returns a string of the rule associated with a card*/
	private String rule(Card c)
	{
		switch(c.value)
		{
		case "Q":
			return " skips next player's turn";
		case "8":
			return " force next player to play requested suit";
		case "A":
			if(players.length == 2) return ""; //direction does not matter in a 2 player game
			return " reverses turn direction";
		case "2":
			return " makes the next player draw 2 or play another 2";
		default:
			return "";
		}
	}
	
	/**printOptions - prints the available options of a player, based on last card*/
	private Card[] findOptions(Player focusplayer)
	{
		ArrayList<Card> valid = new ArrayList<Card>();
		
		Card topcard = playdeck.topCard();
		
		for(Card c: focusplayer.hand.hand)
		{
			if(topcard.value.equals("8") && eightinput != 0) //case for when an eight is played by the previous player
			{
				switch(eightinput)
				{
				case 1: //previous player requested hearts
					if(c.suit.equals("♥"))
						valid.add(c);
					break;
					
				case 2: //previous player requested diamonds
					if(c.suit.equals("♦"))
						valid.add(c);
					break;
					
				case 3: //previous player requested clubs
					if(c.suit.equals("♣"))
						valid.add(c);
					break;
					
				case 4: //previous player requested spades
					if(c.suit.equals("♠"))
						valid.add(c);
					break;
				}
			}
			
			else if(topcard.value.equals("2") && drawtwostacks > 0) //if the last card is a 2, only other twos may be played
			{
				if(c.value.equals("2")) valid.add(c);
			}
			
			else //default case for a playable card
			{
				//if suit or value the same, it is valid, applies to NON-EIGHTS
				if(c.value.equals(topcard.value)||c.suit.equals(topcard.suit))
					valid.add(c);
				else if(c.value.equals("8"))
					valid.add(c);
			}
		}
		
		//stuff the arraylist into an array for return
		Card[] ret = new Card[0];
		ret = valid.toArray(ret);
		
		return ret;
	}
	
	/**actOn - acts in the proper way according to the card evaluated*/
	private void actOn(Card c)
	{
		switch(c.value)
		{
		case "Q": //skip next player's turn
			turnskip = true; //message: [player] played [card], skipping [next player]'s turn.
			if(!vsAI) message = focusplayer.name + " played " + c + ", skipping " + players[(turnplace+turndirection)%players.length].name
					+ (players[(turnplace+turndirection)%players.length].name.endsWith("s") ? "' turn." : "'s turn.");
			else message = focusplayer.name + " played " + c + ", skipping " + players[0].name
					+ (players[0].name.endsWith("s") ? "' turn." : "'s turn.");
			
			break;
			
		case "8": //like a wild; prompt for a suit that the next person must play
			
			if(vsAI && focusplayer.name.equals("Robert (AI)")) //case for when Robert plays an *
			{
				eightinput = rand.nextInt(4) + 1; //chooses a random suit
				
				message = focusplayer.name + " played " + c + " and requested you play ";
				
				switch(eightinput)
				{
				case 1: //one to hearts
					message += "♥.";
					break;
					
				case 2: //two to diamonds
					message += "♦.";
					break;
				case 3: //three to clubs
					message += "♣.";
					break;
				
				case 4: //four to spades
					message += "♠.";
				}
			}
			else //case for when anyone BUT Robert plays an 8
			{
				//prompt for a suit for the next person to play
				System.out.println("\nWhat suit must the next player play?");
				System.out.println("1: ♥\n2: ♦\n3: ♣\n4: ♠");
				
				//ensure a valid input from user
				eightinput = Integer.MIN_VALUE;
				while(eightinput == Integer.MIN_VALUE)
				{
					System.out.print("Selected option: ");
					
					try {eightinput = kb.nextInt();}
					catch(Exception exception)
					{
						System.out.println("Please input a number!");
						kb.nextLine();
					}
				}
				kb.nextLine();
				
				//change numbers outside the decision range to 1 (hearts)
				if(eightinput < 1 || eightinput > 4)
					eightinput = 1;
				
				message = focusplayer.name + " played " + c + " and requested you play ";
				
				switch(eightinput)
				{
				case 1: //one to hearts
					message += "♥.";
					break;
					
				case 2: //two to diamonds
					message += "♦.";
					break;
				case 3: //three to clubs
					message += "♣.";
					break;
				
				case 4: //four to spades
					message += "♠.";
				}
			}
			break;
			
		case "2": //acts as a draw two
			drawtwostacks++; //increase stack of draw twos
			message = focusplayer.name + " played " + c + ", a draw 2!";
			break;
			
		case "A": //reverses the direction of play if playing with >2 players
			if(players.length != 2) //will trickle to default if there are only 2 "players"
			{
				if(turndirection == 1) 	//from forward to backwards
					turndirection = players.length - 1;
				else 					//from backwards to forwards
					turndirection = 1;
				message = focusplayer.name + " played " + c + ", and reversed the turn direction.";
				break;
			}
			
		default: //default message for a card being played
			message = focusplayer.name + " played " + c + ".";
			break;
		}
	}
}