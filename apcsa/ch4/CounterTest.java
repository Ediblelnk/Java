package ch4;
/**
 * CounterTest.java
 * 
 * Code Description: Creates two Counter objects and test their methods
 * 
 * @author peters
 * @version 11/16/20
 * @contact 1009734@palisadessd.net
 */

public class CounterTest
{
  /**
   * main method - Creates two Counter objects and tests their methods
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// create two Counter objects
	Counter CounterOne = new Counter();
	Counter CounterTwo = new Counter();
	
	// test the click method of Counter
	CounterOne.click();
	CounterTwo.click();
	CounterTwo.click(); // click CounterTwo twice
	
	// test the getCount method of Counter
	System.out.println("CounterOne count: " + CounterOne.getCount()
			+ "\nCounterTwo count: " + CounterTwo.getCount());
	
	// test the reset method of Counter
	CounterOne.reset();
	CounterTwo.reset();
	
	// test the getCount method of Counter after reset
	System.out.println("\nCounterOne reset: " + CounterOne.getCount()
			+ "\nCounterTwo reset: " + CounterTwo.getCount());
  }
}