package ch10;
/**
 * Staff.java
 * 
 * Code Description: represents the personnel staff of a business
 * 
 * @author peters
 * @version 4/3/21
 * @contact 1009734@palisadessd.net
 */
public class Staff
{
	//declare staffmember array
	private StaffMember[] staffList;
	
	/**
	 * constructor - sets up the list of staff members
	 * 
	 * @param
	 */
	public Staff()
	{
		//declare staffList to be of size 8
		staffList = new StaffMember[8];
		//executives
		staffList[0] = new Executive("Sam", "123 Main Line",
				"555-0469", "123-45-6789", 2423.07);
		//employees
		staffList[1] = new Employee("Carla", "456 Off Line",
				"555-0101", "987-65-4321", 1246.15);
		staffList[2] = new Employee("Woody", "789 Off Rocker",
				"555-0000", "010-20-3040", 1169.23);
		//hourly employees
		staffList[3] = new Hourly("Diane", "678 Fifth Ave.",
				"555-0690", "958-47-3625", 10.55);
		//volunteers
		staffList[4] = new Volunteer("Norm", "987 Suds Blvd.",
				"555-8374");
		staffList[5] = new Volunteer("Cliff", "321 Duds Lane",
				"555-7282");
		//commission and hourly employees
		staffList[6] = new Commission("Jacob", "888 Lucky Way",
				"555-8888", "284-482-982", 6.25, 0.2);
		staffList[7] = new Commission("Abia", "135 Oddish Drive",
				"513-7955", "571-975-975", 9.75, 0.15);
	
		//Sam did something good and got a $500 bonus
		((Executive)staffList[0]).awardBonus(500.00);
		
		//Diane worked 40 hours
		((Hourly)staffList[3]).addHours(40);
		
		//Jacob worked 35 hours and made $400 in sales
		((Commission)staffList[6]).addHours(35);
		((Commission)staffList[6]).addSales(400);
		
		//Abia worked 40 hours and made $950 in sales
		((Commission)staffList[7]).addHours(40);
		((Commission)staffList[7]).addSales(950);
	}
	
	/**
	 * payday - pays all staff members
	 * 
	 * @param
	 */
	public void payday()
	{
		double dAmount;
		int iCount;
		//calculates and print the amount that each staffmember is paid
		for (iCount=0; iCount < staffList.length; iCount++)
		{
			System.out.println(staffList[iCount]);
			dAmount = staffList[iCount].pay();  // polymorphic
			//only shows a pay greater than $0
			if (dAmount == 0.0)
				System.out.println("Thanks!");
			else
				System.out.println("Paid: " + dAmount);
			System.out.println("-----------------------------------");
		}
	}
}