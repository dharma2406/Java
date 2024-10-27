package Oops;

// In class, if any access modifier is not specified to method by default it takes "Default" access modifier

interface Shape
{
	int length=10;                 // by default static and final

	void square();                 // Abstract method -- the default access modifier is public

	default void circle()          // default methods are accepts in interface
	{
		System.out.println("this is circle.........");
	}

	static void rectangle()        // static methods are accepts in interface
	{
		System.out.println("This is rectangle...........");
	}

}



public class InterfaceDemo implements Shape {
	
	@Override
	public void square() 
	{
		System.out.println("The method is square");	
	}
	
	void triangle()
	{
		System.out.println("Triangle");
	}
	
	public static void main(String[] args) {
		
		Shape id = new InterfaceDemo();
		id.circle();
		id.square();
		Shape.rectangle();
		//id.triangle(); -- we cannot access with interface object variable because it belongs to class
		
		System.out.println(id.length);
		

	}


	

}
