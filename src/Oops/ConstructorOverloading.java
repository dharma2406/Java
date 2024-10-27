package Oops;

public class ConstructorOverloading {
	
	 int a=0;
	 int b=0;
	 double c=0;
	 
	 ConstructorOverloading() 
	 { 
		a=10;
		b=20;
		c=20.5;
	 }
	 
	 ConstructorOverloading(int x,int y)
	 {
		 x=this.a;
		 b=y;
	 }
	 
	 ConstructorOverloading(int x,double y)
	 {
		 a=x;
		 c=y;
	 }
	 
	 void display()
	 {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
	 }
	 
	 
	 public static void main(String[] args) {
		
		 //ConstructorOverloading co = new ConstructorOverloading();
		 
		// ConstructorOverloading co = new ConstructorOverloading(10,0.5);
		 
		 ConstructorOverloading co = new ConstructorOverloading(10, 30);
		 
		 co.display();
	}

}
