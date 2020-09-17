package OOPSConceptPart1;

public class LocalVsGlobalVariables {

	String name = "Tom";  //Global variable or Class variable
	int age = 25;
	public static void main (String []args)
	{
		int i=10;  //Local variable for main method
		System.out.println(i);

		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.age);
		System.out.println(obj.name);
		obj.sum();		
	}

	public void sum()
	{
		int i=20;  //Local variable for sum method
	    int j=40;
		int k = i+j;
		System.out.println(i);
		System.out.println(k);
	}
}
