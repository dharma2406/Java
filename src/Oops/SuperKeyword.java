package Oops;

//this -- invoke class variable
//Super -- invoke immediate parent class variable, method

class p
{
	int a=10;
	
	void m1()
	{
		System.out.println("prime no.");
	}
}

class Q extends p
{
	int a=100;
	void m()
	{
		System.out.println(super.a);
	}
	
	void m1()
	{
		//System.out.println("composite no.");
		super.m1();
	}
	
	
}

public class SuperKeyword {
	
	public static void main(String[] args) {
		
		Q q = new Q();
		
		q.m();
		q.m1();
		
	}

}
