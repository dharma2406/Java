package Oops;

//overloading -- declaration and implementation changes -- can achieve with or without inheritance -- possible in single and multiple classes
//overriding -- only implementation changes -- achieves only by inheritance -- possible only in multiple classes

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1(int a)                   //overriding
	{
		System.out.println(a*a);
	}
	
	void m2(int a, int b)           // Overloading
	{
		System.out.println(a+b);
	}
}



public class Overloading_Overriding {
	
	public static void main(String[] args) {
		
		XYZ xyz = new XYZ();
		
		xyz.m1(10);
		xyz.m2(20);
		xyz.m2(5, 20);
	}

}
