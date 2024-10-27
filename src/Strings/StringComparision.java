package Strings;

public class StringComparision {
	
	public static void main(String[] args) {
		
		//Scenerio -1
		
		String s1="Welcome";
		String s2="Welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		
		//Scenerio-2
		
		String s3=new String("Welcome");
		String s4=new String("Welcome");
		
		System.out.println(s3==s4);             // == ==> to compare the objects
		System.out.println(s3.equals(s4));      // equalis() ==> to compare thr values of objects
		
		
		
		//Scenerio-3
		
		String s5="Welcome";
		String s6=new String("Welcome");
		
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
		//Scenerio-4
		
		String s7="Welcome";
		String s8=new String("Welcome");
		String s9=s8;
		
		System.out.println(s7==s8);
		System.out.println(s7.equals(s8));
		
		System.out.println(s8==s9); // true because objects are same
		System.out.println(s7==s9);
		System.out.println(s7.equals(s9));
	}

}
