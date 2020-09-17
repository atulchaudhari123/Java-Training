package OOPSConceptPart2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	// Only method declaration
	// No method body - Only method prototype, No return type so method should be void
	// In interface we can declare variables. Variables are by default static in nature
	// Variables value will not be changed, its final constant in nature
	// Method are abstract and No static method in interface
	// No main method in interface
	// We can not create the Object on an interface
	// Interface is abstract in nature

}
