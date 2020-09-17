package CollectionFrameworkConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add:
		ll.add("Tom");
		ll.add("Selenium");
		ll.add("QTP");
		
		System.out.println("Content of linked list are " +ll);

		//addFirst:
		ll.addFirst("Atul");
		
		//addLast:
		ll.addLast("Automation");
		
		System.out.println("Content of linked list are " +ll);
		// get:
		System.out.println(ll.get(0));
		// Set:
		ll.set(0, "Peter");
		System.out.println(ll.get(0));
		
		// remove first and remove last
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Content of linked list are " +ll);
		// remove index value
		ll.remove(1);
		System.out.println("Content of linked list are " +ll);
		
		
		// How to print all the values of LinkedList
		//1. for loop
		System.out.println("****** Using for loop************");
		for(int n=0; n<ll.size(); n++)
		{
			System.out.println(ll.get(n));
		}
		// 2. advance for loop
		System.out.println("****** Using for loop************");
		for(String str : ll)
		{
			System.out.println(str);
		}
		// 3. iterator
		System.out.println("****** Using for iterator************");
		
		  Iterator<String> it=ll.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		// 4. While loop
		  System.out.println("****** Using for while loop************");  
		 int m=0;
		 while(m<ll.size())
		 {
			 System.out.println(ll.get(m));
			 m++;
		 }
		
	}
	
	

}
