package Basics;

public class Prime1000 {
	
	public static void main(String[] args) {
		
		int n=1000;
		int sum=0,i,j,count=0;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0) 
				{
					sum++;
				}
			}
			
			if(sum==2)
			{
				count++;
				System.out.println("Prime no. s are"+" "+i);
			}
			
			sum=0;
		}
		System.out.println("Total no.of prime no. to given no. is"+count);

	}
}
