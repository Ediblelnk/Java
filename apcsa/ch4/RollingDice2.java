package ch4;
/**
 * RollingDice2.java
 * 
 * Code Description: Tests the methods for the PairOfDice class
 * 
 * @author peters
 * @version 11/21/20
 * @contact 1009734@palisadessd.net
 */

public class RollingDice2
{
	/**
	 * main method - Tests the methods for the PairOfDice class
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		// create the PairOfDice object
		PairOfDice TwoDie = new PairOfDice();
		
		// roll two die
		TwoDie.roll();
		
		// print the result of the die roll
		System.out.println("Random Roll of Two Dice:\n"
				+ "Die One:\t" + TwoDie.getFirstValue() + "\n"
				+ "Die Two:\t" + TwoDie.getSecondValue() + "\n"
				+ "Sum:\t\t" + TwoDie.getRollValue() + "\n");
		
		// roll the dice but cheat and turn them to fixed values
		TwoDie.roll();
		TwoDie.setFirstValue(1);
		TwoDie.setSecondValue(1);
		
		// print the "result" of the die roll
		System.out.println("Loaded Roll of Two Die:\n"
				+ "Die One:\t" + TwoDie.getFirstValue() + "\n"
				+ "Die Two:\t" + TwoDie.getSecondValue() + "\n"
				+ "Sum:\t\t" + TwoDie.getRollValue());
		System.out.println("\nWhat are the chances, snake eyes!");
	}
}