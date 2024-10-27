package Arrays;

import java.util.Arrays;

public class Mutable_Immutable {
	
	public static void main(String[] args) {
		
		//Mutable ==> can change
		int a[]={11,2,33,4,5};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		//Immutable ==> Cannot change -- String
		
		String s="Welcome";
		s.concat("to india");
		
		System.out.println(s);
	}

}
