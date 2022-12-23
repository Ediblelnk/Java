package ch4;
/**
 * MultiSphere.java
 * 
 * Code Description: creates several Sphere 
 * 		objects and tests their methods
 * 
 * @author peters
 * @version 11/18/20
 * @contact 1009734@palisadessd.net
 */

public class MultiSphere
{
  /**
   * main method - creates several Sphere 
   *	objects and tests their methods
   * 
   * @param args
   */
  public static void main(String[ ] args)
  {
	// create several Sphere objects
	Sphere SphereOne = new Sphere(5.0);
	Sphere SphereTwo = new Sphere(1.5);
	Sphere SphereThree = new Sphere(3.1415);
	
	// print information for each sphere object
	System.out.println("SphereOne's diameter:\t\t" + SphereOne.getDiameter() + " units"
			+ "\nSphereOne's volume:\t\t" + SphereOne.volume() + " units cubed"
			+ "\nSphereOne's surface area:\t" + SphereOne.surfaceArea() + " units squared"
			+ "\nSphereOne's info sentence:\n"
			+ "\n" + SphereOne.toString());
	System.out.println("\n\nSphereTwo's diameter:\t\t" + SphereTwo.getDiameter() + " units"
			+ "\nSphereTwo's volume:\t\t" + SphereTwo.volume() + " units cubed"
			+ "\nSphereTwo's surface area:\t" + SphereTwo.surfaceArea() + " units squared"
			+ "\nSphereTwo's info sentence:\n"
			+ "\n" + SphereTwo.toString());
	System.out.println("\n\nSphereThree's diameter:\t\t" + SphereThree.getDiameter() + " units"
			+ "\nSphereThree's volume:\t\t" + SphereThree.volume() + " units cubed"
			+ "\nSphereThree's surface area:\t" + SphereThree.surfaceArea() + " units squared"
			+ "\nSphereThree's info sentence:\n"
			+ "\n" + SphereThree.toString());
  }
}