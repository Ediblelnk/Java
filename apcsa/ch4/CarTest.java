package ch4;
/**
 * CarTest.java
 * 
 * Code Description: tests the methods for the class Car
 * 
 * @author peters
 * @version 11/20/20
 * @contact 1009734@palisadessd.net
 */

public class CarTest
{
	/**
	 * main method - tests the methods for the class Car
	 * 
	 * @param args
	 */
	public static void main(String[ ] args)
	{
		// create three instances of the car object
		Car CarOne = new Car("BMW", "explorer", 2004);
		Car CarTwo = new Car("chevy", "malibu", 2021);
		Car CarThree = new Car("honda", "pilot", 2010);
		
		// print the original information for the cars
		System.out.println("Original Information for the cars:\n"
				+ CarOne.toString("CarOne") + "\n"
				+ CarTwo.toString("CarTwo") + "\n"
				+ CarThree.toString("CarThree") + "\n");
		
		// change the make of the first and second cars
		CarOne.setMake("ford");
		CarTwo.setMake("chevrolet");
		
		// print the first change
		System.out.println("First Change:\n"
				+ "CarOne new Make: " + CarOne.getMake() + "\n"
				+ "CarTwo new Make: " + CarTwo.getMake() + "\n");
		
		// change the year of the first and third cars
		CarTwo.setModel("camaro");
		CarThree.setModel("civic");
		
		// print the second change
				System.out.println("Second Change:\n"
						+ "CarOne new Model: " + CarOne.getModel() + "\n"
						+ "CarThree new Model: " + CarThree.getModel() + "\n");
		
		// change the model of the second and third cars
		CarOne.setYear(2008);
		CarThree.setYear(2015);
		
		// print the third change
		System.out.println("Third Change:\n"
				+ "CarTwo new Year: " + CarTwo.getYear() + "\n"
				+ "CarThree new Year: " + CarThree.getYear() + "\n");
		
		// print the final information for the cars
		System.out.println("Final Information for the cars:\n"
				+ CarOne.toString("CarOne") + "\n"
				+ CarTwo.toString("CarTwo") + "\n"
				+ CarThree.toString("CarThree") + "\n");
	}
}