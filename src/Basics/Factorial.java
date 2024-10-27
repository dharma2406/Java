package Basics;

public class Factorial {
	
	public static void main(String[] args) {
		
		int n=25;
		long s=1L;
		
		for(int i=1;i<=n;i++)
		{
			s=s*i;
		}
		System.out.println(s);
	}

}
