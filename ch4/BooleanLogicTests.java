package ch4;
/**
 * BooleanLogicTests.java
 * 
 * Code Description: Tests for the Boolean Logic Worksheet
 * 
 * @author peters
 * @version 
 * @contact 1009734@palisadessd.net
 */

public class BooleanLogicTests
{
	/**
	 * main method - Tests for the Boolean Logic Worksheet
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		int x = 12;
		int y = 7;
		int z = 28;
		String s = "mid term";
		boolean bFlag = false;
		
		if (x < 14)
		{
			System.out.println("True1.1");
		}
		
		if (x % 2 < 1)
		{
			System.out.println("False1.2");
		}
		
		if (z / x < x /y * x)
		{
			System.out.println("True1.4");
		}
		
		if (s.length() == y)
		{
			System.out.println("True1.5");
		}
		
		if (s.toUpperCase().equals("MID TERM"))
		{
			System.out.println("True1.6");
		}
		
		if (s.substring(z/x).length() > y)
		{
			System.out.println("True1.8");
		}
		
		System.out.println(3 * 2 + 4 + "+" + 2 + 3 * 4);
		System.out.println(2.3 * 3 + 19 / 5 / 2 + 6.0 / 5);
		System.out.println(108 / 20 * 3 / 4 / 2.0 + 1.0 /2);
		System.out.println(2 * 4/4);
		
		bFlag = !(bFlag == true);
		System.out.println(bFlag);
	}
}