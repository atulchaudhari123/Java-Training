package OOPSConceptPart2;

public class BMW extends Car {
	
	// When same method is present in parent class as well as in child class with same name and same number of arguments is
	// called method-overriding
	
	public void start()  // Overridden method
	{
		System.out.println("BMW---Start");
	}

	public void theftSafety()
	{
		System.out.println("BMW---theftSafety");
	}
}
