package OOPSConceptPart2;

public class HSBCBank implements USBank, BrazilBank {  // We are achieving multiple inheritance
	
	// Is-a relationship
	// If a class is implementing any Interface then its mandatory to define/override all the methods of an interface
	// Overriding from US Bank
	public void credit()
	{
		System.out.println("hsbc---credit");
	}
	
	public void debit()
	{
		System.out.println("hsbc----debit");
	}
	public void transferMoney()
	{
		System.out.println("hsbc---moneytransfer");
	}
	// Separate methods of HSBC Bank class
	public void educationLoan()
	{
		System.out.println("hsbc---education loan");
	}
	public void carLoan()
	{
	    System.out.println("hsbc-----car loan");	
	}
	// Brazil bank method: Overriding from BrazilBank
	
	public void mutualFund()
	{
		System.out.println("hsbc---Mutual fund");
	}

}
