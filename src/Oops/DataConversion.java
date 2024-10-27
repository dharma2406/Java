package Oops;

public class DataConversion {
	
	public static void main(String[] args) {
		
		//String – int ⇒ Integer.parseInteger(String value)
		
	/*	String s= "welcome";  //Cannot convert because string is in character for it must be in numeric form
		String s1="12354";
		int sint = Integer.parseInt(s1);
		System.out.println(sint);
		
		String s3="10";
		String s4="7";
		System.out.println(s3+s4);  // It will concat the both the strings not adding
		System.out.println(Integer.parseInt(s4)+Integer.parseInt(s3)); //It will add*/
		
		
		//String – double ⇒ Double.parseDouble(String value)
		
		/*String s6 ="10.5";
		String s7 ="3.8";
		System.out.println(Double.parseDouble(s7)+Double.parseDouble(s6));*/
		
		//String – boolean ⇒ Boolean.parseBoolean(String value)
		
		String s8="asfodjsa";   // Other than true, it will pass false
		System.out.println(Boolean.parseBoolean(s8));
		
		
		
		
		// COnversion any datatype into String format
		
		int a=98;
		double d=3.3;
		boolean b=true;
		char c ='w';
		
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(a));
	}

}
