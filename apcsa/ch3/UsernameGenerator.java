package ch3;
/**
 * UsernameGenerator.java
 * 
 * Code Description: Generates a username based on the first letter or the first name 
 * 		and the first five letters of the last name with numbers
 * 
 * @author peters
 * @version 11/10/20
 * @contact 1009734@palisadessd.net
 */

import java.util.Scanner; // import Scanner class
import java.util.Random; // import Random Class

public class UsernameGenerator
{
  /**
   * main method - Generates a username based on the first letter or the first name 
   * 	and the first five letters of the last name with numbers
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// declares variables for the names and characters
	String sFirstName, sLastName, sFirstFive, sUsername;
	char cFirstLetter;
	int iRandomNumber;
	
	// starts the scanner
    Scanner kb = new Scanner(System.in);
    
    // starts the number generator
    Random gen = new Random();
    
    // prompts the user to input their name
    System.out.print("Please Input Your First Name: ");
    sFirstName = kb.nextLine();
    System.out.print("Please Input Your Last Name: ");
    sLastName = kb.nextLine();
    
    // find the firstname first letter and lastname first five letters
    cFirstLetter = sFirstName.charAt(0);
    sFirstFive = sLastName.substring(0, 5);
    
    // generate a random number between 10-99
    iRandomNumber = gen.nextInt(90) + 10;
    
    // construct username
    sUsername = cFirstLetter + sFirstFive + iRandomNumber;
    
    // print the constructed username
    System.out.println("\nGenerated Username: " + sUsername);
    
    // closing the Scanner object
    kb.close(); 
  }
}