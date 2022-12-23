package ch10;
//********************************************************************
//Employee.java      
//
//Represents a general paid employee.
//********************************************************************
public class Employee extends StaffMember
{
protected String sSocialSecurityNumber;
protected double dPayRate;

//-----------------------------------------------------------------
//  Constructor: Sets up this employee with the specified
//  information.
//-----------------------------------------------------------------
public Employee(String sInputName, String sInputAddress,
          String sInputPhone,
               String sSocSecNumber, double dInputRate)
{
  super(sInputName, sInputAddress, sInputPhone);
  sSocialSecurityNumber = sSocSecNumber;
  dPayRate = dInputRate;
}

//-----------------------------------------------------------------
//  Returns information about an employee as a string.
//-----------------------------------------------------------------
public String toString()
{
  String sResult = super.toString();
  sResult += "\nSocial Security Number: " + sSocialSecurityNumber;
  return sResult;
}

//-----------------------------------------------------------------
//  Returns the pay rate for this employee.
//-----------------------------------------------------------------
public double pay()
{
 return dPayRate;
}
}