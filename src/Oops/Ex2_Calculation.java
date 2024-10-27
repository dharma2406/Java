package Oops;

public class Ex2_Calculation {
	
	int a,b;
	
	//Type-1: A method may not take parameters
	
	void sum()
	{
		System.out.println(a+b);
	}
	
	//Type-2: A method take parameters
	
	void sub(int x, int y)
	{
		a=x;
		b=y;
		System.out.println(x-y);
	}
	
	//Type-3: A method returns value
	
	int multiply(int x, int y)
	{
		a=x;
		b=y;
		return(x*y);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Ex2_Calculation cal= new Ex2_Calculation();

		//Type-1: A method may not take parameters
		cal.a=10;
		cal.b=20;
		cal.sum();
		
		//Type-2: A method take parameters
		cal.sub(200, 30);
		
		//Type-3: A method returns value
		int res =cal.multiply(5,65);
		System.out.println(res);
		
		
		
	}
	

}
