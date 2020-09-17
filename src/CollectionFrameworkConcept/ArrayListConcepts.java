package CollectionFrameworkConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {
	
	public static void main(String []args)
	{
		int a[] = new int [3]; // Static Array -- Size is fixed
		
		// dynamic array -- ArrayList
		// 1. can contain duplicate values/elements
		// 2. Maintain insertion order
		// 3. Not synchronized
		// 4. allows random access to fetch the element because it store the values on the basis of indexes
		
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(300);
		System.out.println(ar.size()); //Size of ArrayList
		ar.add("Tom");
		ar.add("Hello");
		ar.add(12.33);
		ar.add('M');
		ar.add(true);
		ar.add(400);
		System.out.println(ar.size());
		ar.remove(9);
		System.out.println(ar.size());
		System.out.println(ar);
		
		System.out.println(ar.get(4));  // To get the value from an index
		//System.out.println(ar.get(9));  //IndexOutOfBoundsException
		
		// To print all the values of ArrayList: 
		// 1. for loop
		// 2. Using iterator
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer>ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Tom");  -- String value is Not allowed
		System.out.println(ar1.size());
	
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");
		//ar2.add(100);  -- integer value not allowed
		System.out.println(ar2.size());
		
		// Employee class objects
		Employee e1 = new Employee("Tom", 25,"QA");
		Employee e2 = new Employee("Peter", 27,"Dev");
		Employee e3 = new Employee("Tony", 28,"Admin");
		
		// Create ArrayList
				ArrayList<Employee> ar3 = new ArrayList<Employee>();
				ar3.add(e1);
				ar3.add(e2);
				ar3.add(e3);			
		//Iterator to traverse the values
	System.out.println("--------------Using iterator-------------------");		
		Iterator<Employee> it = ar3.iterator();
		 
	    while(it.hasNext())
	    {
	    	Employee emp = it.next();
	    	System.out.println(emp.name);
	    	System.out.println(emp.age);
	    	System.out.println(emp.dept);
	    	
	    }
		
		System.out.println("------------------------------------");
		//addAll()
		
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("test");
		ar4.add("Java");
		ar4.add("Javascript");
			
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Ruby");
		ar5.add("Perl");
		ar5.add("Python");
		
		ar4.addAll(ar5);
		
		for(int i=0; i<ar4.size(); i++)
		{
			System.out.println(ar4.get(i));
		}
		System.out.println("----------------------------------");
		// removeAll()
		ar4.removeAll(ar5);
		
		for(int i=0; i<ar4.size(); i++)
		{
			System.out.println(ar4.get(i));
		}
		System.out.println("----------------------------------");
		
		// retainAll()
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("test");
		ar6.add("Java");
		ar6.add("Javascript");
			
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("Perl");
		ar7.add("Python");
		
		ar6.retainAll(ar7);
		for(int i=0; i<ar6.size(); i++)
		{
			System.out.println(ar6.get(i));
		}
	}

}
