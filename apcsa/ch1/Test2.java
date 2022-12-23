package ch1;
/**
 * Test2.java
 * 
 * Code Description: Prints "An Emergency Broadcast" At bottom are comments on
 * 		various changes to the code and what errors arise when they are made.
 * 
 * @author peters
 * @version 9/9/20
 * @contact 1009734@palisadessd.net
 */

public class Test2
{
  /**
   * main method - Prints "An Emergency Broadcast" At bottom are comments on
   * 	various changes to the code and what errors arise when they are made.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    System.out.println("An Emergency Broadcast");
  }
}

//a.('Test' to 'test'): 'Error in Workspace', but when hit Proceed the Program worked as expected
//b.('Emergency' to 'emergency'): Program Ran without Error, but Console was "An emergency Broadcast" instead of 
//		"An Emergency Broadcast"
//c.(Removed first quotation mark in string): 'Error in Workspace', Syntax Error in Console
//d.(Removed last quotation mark in string): 'Error in Workspace', java.lang.Error in Console
//e.(Changed 'main' to 'man'): Showed 'Error in Workspace', 'Error: Main method not found in class Test2'
//		in Console
//f.(Changed 'println' to 'bogus'): 'Error in Workspace', 'java.lang.Error: method bogus(String) is 
//		undefined for the type PrintStream'
//g.(Removed Semicolon at end of println statement): 'Error in Workspace', 'Syntax Error, insert ";" to complete'
//		BlockStatements
//h.(Removed Last Brace in Program): 'Error in Workspace', 'Syntax Error, insert "}" to complete ClassBody'