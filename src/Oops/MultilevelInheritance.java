package Oops;

class A1
{
	String s="Hi how are you";
	void display()
	{
		System.out.println(s);
	}
}

class B1 extends A1
{
	String s1="Welcome";
	void dispaly1()
	{
		System.out.println(s1);
	}
}

class C extends B1
{
	String s2="Good Morning";
	void display2()
	{
		System.out.println(s2);
	}
}

public class MultilevelInheritance {
	
	public static void main(String[] args) {
		
		C cobj =new C();
		
		System.out.println(cobj.s);
		System.out.println(cobj.s1);
		System.out.println(cobj.s2);
		
		System.out.println();
		
		cobj.display();
		cobj.dispaly1();
		cobj.display2();
	}

}
