package Oops;

public class StaticKeyword {

	static int a=10;
	int b=20;
	
	static void m1()
	{
		System.out.println("static method");
	}
	
	void m2()
	{
		System.out.println("Non-ststic method");
	}
	
	void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	
	
	
	/*public static void main(String[] args) {
		
		System.out.println(a);
		m1();
		
		StaticKeyword sk=new StaticKeyword();
		System.out.println(sk.b);
		sk.m2();
		
		
		// Non-static methods access both non-static and static.
		// Static methods only access static methods.
		// When static methods or variables called in another class call with class-name.
		
	}*/

}
