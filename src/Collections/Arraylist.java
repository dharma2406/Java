package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {

		//Declaration

		ArrayList al=new ArrayList();
		//ArrayList<String> aemp=new ArrayList<String>();
		//List list =new ArrayList();

		al.add(100);
		al.add("welcome");
		al.add(true);
		al.add(null);
		al.add(10.4);
		al.add(10.4);
		al.add(null);
		al.add(null);

		/*System.out.println("Size of an arraylist"+" "+al.size()); // Size of the list

		System.out.println("Printing of enetred arraylist"+al); //Printing the elements in the list

		al.remove(4); // removing element from the list

		System.out.println("After removing the element from the list:"+al);

		al.add(2,"good"); // inserting the element
		System.out.println("After inserting the element from the list:"+al);

		al.set(6,"boys"); // replacing the element
		System.out.println("After replacing the element from the list:"+al);

		System.out.println("Accesing the specific element from the list"+" "+al.get(5));*/	

		//reading all elements in the arraylist

		// USing normal for loop

		/*	for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

		//Using for-each loop

		for (Object ele : al) 
		{
			System.out.println(ele);
		}*/

		//Using iterator

		Iterator it =al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println("Is arraylist empty?"+" "+al.isEmpty()); // Checking arraylist empty or not
		
		// remove random elements in the arraylist
		
		ArrayList al2 =new ArrayList();
		al2.add("welcome");
		al2.add(null);
		al2.add(10.4);
		
		al.removeAll(al2);
		
		System.out.println("Removing random elements in the arraylist"+al);
		
	}

}
