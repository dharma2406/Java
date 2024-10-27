package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {

		//Declaration

		HashMap<Integer,String> hm=new HashMap<Integer,String> ();
		//Map map=new HashMap();

		hm.put(101, "hi");
		hm.put(102, "how");
		hm.put(101, "good");
		hm.put(103, "hi");
		hm.put(104, "are");
		hm.put(105, "you");
		hm.put(106, "scott");


		System.out.println("Keys and values in the hashmap"+" "+hm);  // printing the keys and values of the map

		System.out.println("size of the hashmap"+hm.size());   // size of the map

		hm.remove(103);  // removing the value from the map
		System.out.println("After removing the pair "+hm);

		System.out.println("Access the value from the hashmap  "+hm.get(105));

		// accessing the all values from the hashmap

		System.out.println(hm.keySet());  // getting the keys from the hashmap

		System.out.println(hm.values());  // getting the values from the hashmap

		System.out.println(hm.entrySet()); // getting the both keys and values from the hashmap  

		//Reading the data from the hashmap

		for (int k: hm.keySet())
		{
			System.out.println(k+"    "+hm.get(k));
		}

		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());                                 // it will give both keys and value

			Entry <Integer, String> entry =it.next();
			System.out.println(entry.getKey());                            // It will get keys
			System.out.println(entry.getValue());                          // It will get values
			System.out.println(entry.getKey()+"       "+entry.getValue());       // it will give both keys and value
		}
	}

}
