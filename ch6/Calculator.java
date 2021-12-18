package ch6;
/**
 * Template.java
 * 
 * Code Description: Emulates a basic calculator
 * 
 * @author peters
 * @version 1/7/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class
import java.text.DecimalFormat; //import DecimalFormat class

public class Calculator 
{
	/**
	 * main method - Emulates a basic calculator
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//declare variables for Calculator Inputs
		String sOperator;
		boolean bUndefinedOperator = false;
		double dNumOne, dNumTwo, dResult;
    	
		Scanner kb = new Scanner(System.in); //create Scanner instance
		DecimalFormat fmtDecimal = new DecimalFormat("0.0"); //create DecimalFormat instance
   
		//prompt for a user number input
		System.out.print("Enter two numbers, with a space between each: ");
		dNumOne = kb.nextDouble();
		dNumTwo = kb.nextDouble();

		//prompt for a user operator input
		System.out.print("Enter the operator (+, -, *, or /): ");
		sOperator = kb.next();
		
		//switch to proper request for operator
		switch(sOperator)
		{
			case "+":
				dResult = dNumOne + dNumTwo;
				break;
			case "-":
				dResult = dNumOne - dNumTwo;
				break;
			case "*":
				dResult = dNumOne * dNumTwo;
				break;
			case "/":
				dResult = dNumOne / dNumTwo;
				break;
			default:
				dResult = dNumOne + dNumTwo;
				bUndefinedOperator = true;
				break;
		}
		
		//print results
		System.out.println(dNumOne + " " + ((bUndefinedOperator) ? "+" : sOperator) 
				+ " " + dNumTwo + " = " + fmtDecimal.format(dResult));
		
		kb.close(); //close Scanner
  }
}