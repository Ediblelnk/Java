package ch10;
/**
 * Commission.java
 * 
 * Code Description: represents an employee that gets paid by the hour and commissions
 * 
 * @author peters
 * @version 4/3/21
 * @contact 1009734@palisadessd.net
 */

public class Commission extends Hourly
{
	private double dTotalSales;
	private double dCommissionRate;
	
	/**
	 * constructor - sets the name, address, phone, social security number, pay-rate, and commission rate
	 * 
	 * @param args
	 */
	public Commission(String sInputName, String sInputAddress, 
					String sInputPhone, String sSocSecNumber, 
					double dInputRate, double dCommissionRateIn)
	{
		//call hourly constructor
		super(sInputName, sInputAddress, sInputPhone, sSocSecNumber, dInputRate);
		dCommissionRate = dCommissionRateIn;
		dTotalSales = 0;
	}
	
	/**
	 * addSales - adds the input sales to the total sales
	 * 
	 * @param
	 */
	public void addSales(double dTotalSalesIn)
	{
		//add to total sales
		dTotalSales += dTotalSalesIn;
	}
	
	/**
	 * pay - computes and returns the pay for this commission employee
	 * 
	 * @param
	 */
	public double pay()
	{
		//combine pay of hourly with pay according to commissions and sales
		double dPay = dTotalSales * dCommissionRate + super.pay();
		dTotalSales = 0; //hours are reset via super.pay()
		return dPay;
	}
	
	/**
	 * toString - returns information about this commission employee as a string
	 * 
	 * @param
	 */
	public String toString()
	{
		//create string from hourly, and add sales
		String sResult = super.toString();
		sResult += "\nCurrent sales: " + dTotalSales;
		return sResult;
	}
}
