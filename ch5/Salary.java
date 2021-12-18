package ch5;
/**
 * Salary.java
 * 
 * Code Description: Salary Lab; Use if and else statements
 * 
 * @author peters
 * @version 12/4/20 12/5/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import scanner class
import java.text.NumberFormat; //import numberformat class

public class Salary
{
	/**
	 * main method - Salary Lab; Use if and else statements
	 * 
	 * @param args
	 */
	public static void main (String[] args)
	{
		//declare salary related variables
		double dCurrentSalary; 
		double dRaise; 
		double dNewSalary; 
		String sRating; 
		
		//start scanner and numberformat
		Scanner kb = new Scanner(System.in);
		NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();

		//request input for base salary
		System.out.print("Enter the current salary: ");
		dCurrentSalary = kb.nextDouble();

		//request rating level
		System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
		sRating = kb.next();
   
		//determine raise value based on rating
		if(sRating.toLowerCase().startsWith("ex"))
			dRaise = 0.035; //3.5% increase
		else if(sRating.toLowerCase().startsWith("go"))
			dRaise = 0.02; //2% increase
		else
			dRaise = 0.005; //0.5% increase
			
		// Compute the new salary
		dNewSalary = dCurrentSalary + dRaise*dCurrentSalary;

		// Print the results ...
		System.out.println("\nOld Salary:\t" + fmtCurrency.format(dCurrentSalary)
				+ "\nRaise Percent:\t" + (dRaise*100) + "%"
				+ "\nRaise Amount:\t" + fmtCurrency.format((dRaise*dCurrentSalary))
				+ "\nNew Salary:\t" + fmtCurrency.format(dNewSalary));
		
		kb.close(); //close scanner
  }
}