package ch10;
//********************************************************************
//Hourly.java      
//
//Represents an employee that gets paid by the hour.
//********************************************************************
public class Hourly extends Employee
{
private int iHoursWorked;

//-----------------------------------------------------------------
//  Constructor: Sets up this hourly employee using the specified
//  information.
//-----------------------------------------------------------------
public Hourly(String sInputName, String sInputAddress,
           String sInputPhone,
             String sSocSecNumber, double dInputRate)
{
  super(sInputName, sInputAddress, sInputPhone,
  sSocSecNumber, dInputRate);
  iHoursWorked = 0;
}

//-----------------------------------------------------------------
//  Adds the specified number of hours to this employee's
//  accumulated hours.
//-----------------------------------------------------------------
public void addHours(int iMoreHours)
{
  iHoursWorked += iMoreHours;
}

//-----------------------------------------------------------------
//  Computes and returns the pay for this hourly employee.
//-----------------------------------------------------------------
public double pay()
{
  double dPayment = dPayRate * iHoursWorked;
  iHoursWorked = 0;
  return dPayment;
}

//-----------------------------------------------------------------
//  Returns information about this hourly employee as a string.
//-----------------------------------------------------------------
public String toString()
{
  String sResult = super.toString();
  sResult += "\nCurrent hours: " + iHoursWorked;
  return sResult;
}
}