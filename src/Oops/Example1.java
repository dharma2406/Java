package Oops;

public class Example1 {
	
	int empid;
	String empname;
	int salary;
	int deptno;
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);	
	}
	

	/*Constructor
	
	Example1(int id,String name, int sal, int no)
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=no;
		
	}*/
	
	// Assigning class variable using Method
	
	void setdata(int id,String name, int sal, int no)
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=no;
	}
	
	
	

	public static void main(String[] args) {
		
		/*Type-1: Assigning class variable using object
		 * 
		Example1 ex1=new Example1();
		ex1.empid=101;
		ex1.empname="abc0";
		ex1.salary=5000;
		ex1.deptno=20001;
		ex1.display();
		
		Example1 ex2=new Example1();
		ex2.empid=102;
		ex2.empname="abc1";
		ex2.salary=9000;
		ex2.deptno=20002;
		ex2.display();*/
		
		/*Type-2: Assigning class variable using constructor
		
		Example1 emp1 = new Example1(101, "abc", 5000, 120);
		emp1.display();
		
		Example1 emp2 = new Example1(102, "abcd",10000, 121);
		emp2.display();*/
		
		//Type-3: Assigning class variable using Method
		
		Example1 ex1 = new Example1();
		ex1.setdata(101, "null", 5000, 10023);
		ex1.display();
		
		/* Example1 ex1 = new Example1();
		 * Example1 ==> ClassName
		 * ex1==> reference variable object name
		 * Example1 ==> instantiaon*/
		 
		
	}
}
