package ch10;
//********************************************************************
//  Volunteer.java      
//
//  Represents a staff member that works as a volunteer.
//********************************************************************
public class Volunteer extends StaffMember
{
   //-----------------------------------------------------------------
   //  Constructor: Sets up this volunteer using the specified
   //  information.
   //-----------------------------------------------------------------
   public Volunteer(String sInputName, String sInputAddress,
               String sInputPhone)
   {
      super(sInputName, sInputAddress, sInputPhone);
   }

   //-----------------------------------------------------------------
   //  Returns a zero pay value for this volunteer.
   //-----------------------------------------------------------------
   public double pay()
   {
      return 0.0;
   }
}