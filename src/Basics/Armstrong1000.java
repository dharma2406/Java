package Basics;

public class Armstrong1000 {
	
	public static void main(String[] args) {
		
		int n=1000;
		
		for(int i=1;i<=n;i++)
		{
			int count=0,rem,k=0;
			int temp=i;
			while(temp>0)
			{
				temp=temp/10;
				count++;
			}
			
			 int temp1=i;
			 
			 while(temp1>0)
			 {
				 int z=1;
				 rem=temp1%10;
				 for(int j=1;j<=count;j++)
				 {
					z=z*rem; 
				 }
				 k=k+z;
				 temp1=temp1/10;
			 }
			 
			 if(k==i)
			 {
				 System.out.println("The armstrong numbers upto 1000 are"+i);
			 }
			 
		}
	}

}
