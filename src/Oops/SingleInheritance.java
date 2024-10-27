package Oops;

class A
{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b=200;
	void dispaly1()
	{
		System.out.println(b);
	}
}

public class SingleInheritance {
	
	public static void main(String[] args) {
		
		B bobject = new B();
		
		System.out.println(bobject.a);
		System.out.println(bobject.b);
		
		bobject.dispaly1();
		bobject.display();
				
	}

}
