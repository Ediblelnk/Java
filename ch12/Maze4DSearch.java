package ch12;
/**
 * Maze4DSearch.java
 * 
 * Code Description: Test of the Maze4D Class
 * 
 * @author peters
 * @version 4/25/21
 * @contact 1009734@palisadessd.net
 */

public class Maze4DSearch
{
	/**
	 * main method - Creates a new 4d maze, prints its original form, attempts to
	 * 	solve it, and prints out its final form.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		//declare 4d maze instance
		Maze4D labyrinth = new Maze4D();
		
		//print maze presolve
		System.out.println("Maze (pre-solve):");
		System.out.println(labyrinth);
		
		//attempt to solve maze and print according statement
		if (labyrinth.solve())
			System.out.println("The maze was successfully traversed!\n");
		else
			System.out.println("There is no possible path.\n");
		
		//print maze postsolve
		System.out.println("Maze (post-solve):");
		System.out.println(labyrinth);
	}
}