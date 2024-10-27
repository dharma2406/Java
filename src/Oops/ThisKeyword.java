package Oops;

public class ThisKeyword {
	
	int x,y;
	
	 ThisKeyword(int x,int y) 
	 {
		x=this.x;   //Here instance variable is assigned to local variable
		y=this.y;
		
		this.x=x;   //Here local variable is assigned to instance variable 
	}
	 
	 void display()
	 {
		 System.out.println(x+y);
	 }
	 
	 public static void main(String[] args) {
		
		 ThisKeyword thk=new ThisKeyword(100, 200);
		 thk.display();
	}

}
