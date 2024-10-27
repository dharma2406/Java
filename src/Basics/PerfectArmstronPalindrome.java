package Basics;

public class PerfectArmstronPalindrome {

	public static void main(String[] args) {

		int n=1000;

		for(int i=1;i<=n;i++)
		{
			int sum=0;
			
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			
			if(sum==i)
			{
				int temp=i,count=0,temp1=i,prod=1,m=0;
				
				while(temp>0)
				{
					temp=temp/10;
					count++;
				}
				
				while(temp1>0)
				{
					int rem=temp1%10;
					for(int k=1;k<=count;k++)
					{
						prod=prod*rem;
					}
					m=m+prod;
					temp1=temp1/10;
				}
				
				if(m==i)
				{
					int a=i,rev=0;
					while(a>0)
					{
						int mod=a%10;
						rev=(rev*10)+mod;

						a=a/10;
					}
					if(rev==i)
					{
						System.out.println("exists"+" "+i);
					}

				}
			}
		}
	}

}
