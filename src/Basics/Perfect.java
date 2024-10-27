package Basics;

public class Perfect {
	
	public static void main(String[] args) {
		
		int n=7,sum=0;
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(n==sum)
		{
			System.out.println("The given no. is Perfect Number");
		}
		else
		{
			System.out.println("The given no. is not a perfect no.");
		}

	}

}
