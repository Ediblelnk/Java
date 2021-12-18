package ch10;
//********************************************************************
//  StaffMember.java
//
//  Represents a generic staff member.
//********************************************************************
abstract public class StaffMember
{
   protected String sName;
   protected String sAddress;
   protected String sPhone;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this staff member using the specified
   //  information.
   //-----------------------------------------------------------------
   public StaffMember(String sInputName, String sInputAddress,
                      String sInputPhone)
   {
      sName = sInputName;
      sAddress = sInputAddress;
      sPhone = sInputPhone;
   }

   //-----------------------------------------------------------------
   //  Returns a string including the basic employee information.
   //-----------------------------------------------------------------
   public String toString()
   {
      String sResult = "Name: " + sName + "\n";
      sResult += "Address: " + sAddress + "\n";
      sResult += "Phone: " + sPhone;
      return sResult;
   }

   //-----------------------------------------------------------------
   //  Derived classes must define the pay method for each type of
   //  employee.
   //-----------------------------------------------------------------
   public abstract double pay();
}