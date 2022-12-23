package finalproject;
/**
 * CrazyEight - driver class to simulate a crazy eight game
 * 
 * @author peters
 * @version 5/17/21 - 6/8/21
 * @contact 1009734@palisadessd.net
 */ 

public class CrazyEight 
{
	/**main method - does the whole Crazy Eights thing*/
	public static void main(String[] args)
	{
		//create game instance
		Game crazy = new Game();
		
		//run game, then ask if want to play another game
		do
		{
			crazy.initialize();
			
			while(crazy.running)
			{
				//prompt for start, play turn, and clear (if need be)
				crazy.promptTurn();
				crazy.nextTurn();
				if(!crazy.vsAI)
					crazy.clear(1000);
			}
			
			//declare winner!
			crazy.declareWinner();
		} while (crazy.promptNewGame());
		
		//if you want to end, you get a message! :)
		System.out.println(crazy.endingMessage());
	}
}