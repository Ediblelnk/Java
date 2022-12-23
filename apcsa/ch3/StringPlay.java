package ch3;
/**
 * StringPlay.java
 *
 * Code Description: Lab 3.2 to play with Strings!
 *    
 * @author peters
 * @version 10/16/20 10/20/20
 * @contact 1009734@palisadessd.net
 */

public class StringPlay
{
  public static void main (String[] args)
  {
   /**
    * main method - Lab 3.2 to play with Strings!
    * @param args
    */
   String sCollege = "PoDunk College";
   String sTown = "Anytown, USA"; // part (a)
   int iStringLength;
   String sChangeOne, sChangeTwo, sChangeThree;
   iStringLength = sCollege.length(); // part (b)
   System.out.println (sCollege + " contains " + iStringLength + " characters.");
   sChangeOne = sCollege.toUpperCase(); // part (c)
   sChangeTwo = sChangeOne.replace('O','*'); // part (d)
   sChangeThree = sCollege.concat(sTown); // part (e)
   System.out.println("*s for Os: " + sChangeTwo);
   System.out.println("The final string is " + sChangeThree);
 }
}