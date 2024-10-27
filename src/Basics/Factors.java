package Basics;

public class Factors {
	
	public static void main(String[] args) {
		
		int n=125;
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;	
				System.out.println("the given no. factors are"+" "+i);
			}
		
		}
		System.out.println("Total no. of factors to the given no. is"+" "+count);

	}

}
