package Basics;

public class Perfect1000 {
	
	public static void main(String[] args) {
		
		int n=1000,sum=0,count=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				if(i%j==0) 
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				count++;
				System.out.println("Perfect no. s are"+" "+i);
			}

			sum=0;

		}
		System.out.println("Total no.of perfect numbers are"+count);

	}

}
