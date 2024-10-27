package Oops;

class Parent
{
   void display(int a)
   {
	   System.out.println(a);
   }
}

class Child1 extends Parent
{
	void display1(int b)
	{
		System.out.println(b);
	}
}

class Child2 extends Parent
{
	void display2(int c)
	{
		System.out.println(c);
	}
}

public class HirerchyInheritance {
	
	//Hirerchy inheritance means 1 parent "N" no. of children
	
	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		c1.display1(100);
		c1.display(500);
		
		System.out.println();
		
		Child2 c2=new Child2();
		c2.display2(8);
		c2.display(55);
	}
	

}
