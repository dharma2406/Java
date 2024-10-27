package Oops;

public class C1 extends ParentC2 implements I1,I2    {// Hybrid Inheritance
	
	@Override
	public void m2() {
		System.out.println(y);
		
	}

	@Override
	public void m1() {
		System.out.println(x);
		
	}
	
public static void main(String[] args) {
	
	I2 i2= new C1();
	i2.m2();
	
	
	System.out.println();
	
	I1 i1 = new C1();
	i1.m1();
	
	
	System.out.println();
	
	C1 c1=new C1();
	c1.m1();
	c1.m2();
	
		
	}

}
