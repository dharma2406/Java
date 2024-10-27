package Oops;

class Parent1
{
	int ip =98;
	void m1()
	{
		System.out.println("m1");
	}
}

class child extends Parent1
{
	int ic=88;
	void m2()
	{
		System.out.println("m2");
	}
}

public class TypecastingObjects {

	public static void main(String[] args) {

		/*child cobj = new child();

		System.out.println(cobj.ip);
		System.out.println(cobj.ic);
		cobj.m1();
		cobj.m2();*/

		//upcasting
		
		/*Parent p=new child();    
		System.out.println(p.ip);
		p.m1();*/
		
		//in Upcasting,we can access only from parent class as parent object reference variable is created 
		
		//DownCasting
		
		Parent1 p =new Parent1();
		child c=(child) p;
		System.out.println(c.ic);
		System.out.println(c.ip);
		c.m1();
		c.m2();
		
		//in down casting, we can access all methods and variables but at runtime it shows "ClassCastException" exception.
		
		

	}

}
