package OOPSConceptPart1;

public class StaticAndNonStaticConcept {
	String name = "Tom";  // Non-Static global variable
	static int age = 25;  // Static global variable
	// Global variables: The scope of global variables will be available across all th functions with some conditions
	public static void main (String []args)
	{
		// How to calls Static method and variables
		// 1.Direct calling
		sum();
		// 2.Calling by class name
		StaticAndNonStaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		// How to call Non-Static methods and variables
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		// Can I access static methods using object reference? Yes
		obj.sum(); // Warning will be given
		
	}
	
	public void sendMail()   // Non-Static method
	{
		System.out.println("Send mail method");
		
	}
	
	public static void sum()  // Static method
	{
		System.out.println("Sum Method");
	}
	}

