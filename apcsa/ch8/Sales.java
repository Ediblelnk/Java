package ch8;
/**
 * Sales.java
 * 
 * Code Description: Lists and compares sales from a number of sales people
 * 
 * @author peters
 * @version 2/9/21
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner;

public class Sales
{
	/**
	 * main method - Lists and compares sales from a number of sales people
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		//create array and sum variable
		int iSum, iMax = Integer.MIN_VALUE;
		int iIndex, iMin = Integer.MAX_VALUE;
		int iMaxID = 0, iMinID = 0;
		int iReqSales, iReqSalespersons = 0;
		int iCounter, iSalesPeople;
		
		Scanner kb = new Scanner(System.in); //create scanner instance
		
		//prompt for number of sales people
		System.out.print("Input how many sales people made sales: ");
		iSalesPeople = kb.nextInt();
		
		//create array based on people requested
		int[] iSales = new int[iSalesPeople];

		for (iIndex = 0; iIndex < iSales.length; iIndex++)
		{
			System.out.print("Enter sales for salesperson " + (iIndex + 1) + ": $");
			iSales[iIndex] = kb.nextInt();
			
			//redefine max and min, with saleperson numbers
			if(iSales[iIndex] < iMin)
			{
				iMin = iSales[iIndex];
				iMinID = iIndex + 1;
			}
			if(iSales[iIndex] > iMax)
			{
				iMax = iSales[iIndex];
				iMaxID = iIndex + 1;
			}
		}

		//set up print for sales report
		System.out.println("\n  Sales Report");
		System.out.println(" ------------------ ");

		//sales report loop
		iSum = 0;
		for (iIndex = 0; iIndex < iSales.length; iIndex++)
		{
			System.out.println(" " + (iIndex + 1) + " $" + iSales[iIndex]);
			iSum += iSales[iIndex];
		}
		
		//print total sales
		System.out.println("\nTotal sales: $" + iSum);
		
		//print average sales
		System.out.println("Average Sale: $" + ((double) iSum)/ iSalesPeople);
		
		//print max and minimum sales
		System.out.println("\nLargest Sale: $" + iMax + ", from Salesperson " + iMaxID
				+ "\nSmallest Sale: $" + iMin + ", from Salesperson " + iMinID);
		
		//prompt for a minimum sale amount
		System.out.print("\nInput a minimum sale amount: $");
		iReqSales = kb.nextInt();
		System.out.println("");
		
		//for loop determine who "fits the bill"
		for(iCounter = 0; iCounter < iSales.length; iCounter++)
		{
			if(iReqSales < iSales[iCounter])
			{
				System.out.println("Salesperson " + (iCounter + 1) + " sold more than $" + iReqSales
						+ ", with total sales of $" + iSales[iCounter]);
				iReqSalespersons++;
			}
		}
		
		//print the amount of people that "made the cut"
		System.out.println("\nTotal people that made more sales than $" + iReqSales + ": " 
				+ iReqSalespersons + ((iReqSalespersons == 1) ? " person" : " people"));

		kb.close();
	}
}