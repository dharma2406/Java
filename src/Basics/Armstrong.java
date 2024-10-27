package Basics;

public class Armstrong {

	public static void main(String[] args) {

		int n=153,k=0,count=0,rem;
		int temp=n;

		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		
		temp=n;
		
		while(temp>0)
		{
			int z=1;
			rem=temp%10;
			
			for(int i=1;i<=count;i++)
			{
				z=z*rem;
			}
			k=k+z;
			temp=temp/10;
		}

		if(k==n)
		{
			System.out.println("the given no. is armstrong");
		}
		else
		{
			System.out.println("the given no. is not armstrong");
		}
	}

}
