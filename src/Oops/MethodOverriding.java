package Oops;

class Bank
{
	double roi()
	{
		return 0;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 10.25;
	}
}

public class MethodOverriding {
	
	// MethodOverriding -- Inheritance
	
	public static void main(String[] args) {
		
		ICICI ic=new ICICI();
		System.out.println(ic.roi());
	}
	
	

}
