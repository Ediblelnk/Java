package ch10;
//********************************************************************
//Executive.java
//
//Represents an executive staff member, who can earn a bonus.
//********************************************************************
public class Executive extends Employee
{
private double dBonus;

//-----------------------------------------------------------------
//  Constructor: Sets up this executive with the specified
//  information.
//-----------------------------------------------------------------
public Executive(String sInputName, String sInputAddress,
           String sInputPhone,
                String sSocSecNumber, double dInputRate)
{
  super(sInputName, sInputAddress, sInputPhone,
     sSocSecNumber, dInputRate);
  dBonus = 0;  // bonus has yet to be awarded
}

//-----------------------------------------------------------------
//  Awards the specified bonus to this executive.
//-----------------------------------------------------------------
public void awardBonus(double dExecBonus)
{
  dBonus = dExecBonus;
}

//-----------------------------------------------------------------
//  Computes and returns the pay for an executive, which is the
//  regular employee payment plus a one-time bonus.
//-----------------------------------------------------------------
public double pay()
{
  double dPayment = super.pay() + dBonus;
  dBonus = 0;
  return dPayment;
}
}