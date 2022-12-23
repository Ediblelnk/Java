package ch6;
/**
 * Coin.java
 * 
 * Code Description: Class definition for a Coin
 * 
 * @author peters
 * @version 2/1/21
 * @contact 1009734@palisadessd.net
 */

public class Coin
{
	//create finals
	protected final int iHEADS = 0;

	//create normal variables
	protected int iFace;
	
	public Coin()
	{
		flip();
	}
	
	public void flip()
	{
		iFace = (int) (Math.random() * 2);
	}
	
	public boolean isHeads()
	{
		return (iFace == iHEADS);
	}
	
	public String toString()
	{
		String sFaceName;
		if (iFace == iHEADS)
			sFaceName = "Heads";
		else
			sFaceName = "Tails";
		 return sFaceName;
	}
}