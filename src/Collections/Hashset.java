package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {
	
	public static void main(String[] args) {
		
		//Declaration
		
		HashSet hs=new HashSet();
		//Set s=new HashSet();
		
		//Adding elements in the list
		hs.add("welcome");
		hs.add("welcome");
		hs.add(null);
		hs.add(null);
		hs.add(100);
		hs.add("101.58");
		
		System.out.println("Elements in the list are"+hs);  // Printing elements in the hashset
		
		System.out.println("Removing the element in the hashset"+" "+hs.remove(null)+hs); // Removing element in the hashset
		
		// Inserting is not possible in hashset because no index order
		
		// Accessing the specific element is not possible
		
		//Convert Hashset to arraylist
		
		ArrayList al=new ArrayList(hs);
		
		System.out.println("After converting the elements into arraylist"+" "+al);
		
		System.out.println("Accesing the first index"+" "+al.get(1));
		
		//Read all elements in the hashset
		
		for (Object hsobj : hs) 
		{
			System.out.println(hsobj);
		}
		
		Iterator it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
