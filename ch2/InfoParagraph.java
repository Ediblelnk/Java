package ch2;
/**
 * InfoParagraph.java
 * 
 * Code Description: Prompts for a person’s name, age, school name, and pet’s name.
 * 		Uses the information to print out a paragraph with the information.
 * 
 * @author peters
 * @version 10/12/20  10/15/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class InfoParagraph
{
  /**
   * main method - Prompts for a person’s name, age, school name, and pet’s name.
   * 	Uses the information to print out a paragraph with the information.
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
    // declares variables for the name, age, school name, and pet name
    String sName, sSchoolName, sPetName;
    int iAge;
    
    // starts the scanner
 	Scanner kb = new Scanner(System.in);
    
    // prompts the user to input their name
    System.out.println("Please input your name: ");
    sName = kb.next();
    System.out.println("");
    
    // prompts the user to input their age
    System.out.println("Please input your age: ");
    iAge = kb.nextInt();
    
    // prompts the user to input their school
    System.out.println("\nPlease input your school's name: ");
    sSchoolName = kb.next();
    
    // prompts the user to input their pet's name
    System.out.println("\nPlease input your pet's name: ");
    sPetName = kb.next();
    
    // prints a paragraph using the user's input information
    System.out.println("\nHello my name is " + sName
    		+ " and I am " + iAge + " years old."
    		+ "\nI'm enjoying my time at " + sSchoolName
    		+ ",\nthough I miss my pet " + sPetName
    		+ " very much!");
    
    kb.close(); // closing the Scanner object
  }
}