package Strings;

public class String_StringBuilder_StringBuffer {
	
	public static void main(String[] args) {
		
		//String--Immutable-- cannot change
		
		String s="Welcome";
		s.concat("to india");
		System.out.println(s);    // we cannot change original value of s
		
		
		
		//StringBuffer--Mutable-- can change
		
		StringBuffer s1=new StringBuffer("good");
		s1.append("morning");
		System.out.println(s1);  // we can change the original value of s1
		
		
		
		//StringBuilder--Mutable--can change
		
		StringBuilder s2=new StringBuilder("hi");
		s2.append("how are you");
		System.out.println(s2);  // we can change the original value of s2
		
	}

}
