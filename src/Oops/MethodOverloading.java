package Oops;

public class MethodOverloading {
	
	//MethodOverloading -- Polymorphism
	
	int a;
	int b;
	
	void sum()
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	
	void sum(int x,double y)
	{
		System.out.println(x-y);
	}
	
	
	

	public static void main(String[] args) {

		MethodOverloading mo= new MethodOverloading();
		mo.sum();
		mo.sum(100, 20);
		mo.sum(40, 50.0);

	}

}
