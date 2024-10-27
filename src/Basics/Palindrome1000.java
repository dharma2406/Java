package Basics;

public class Palindrome1000 {
	
	public static void main(String[] args) {
		
		int n=1000;
		
		
		for(int i=1;i<=n;i++)
		{
			int temp=i,rev=0;
			while (temp>0)
			{
				int mod=temp%10;
				int mov=rev*10;
				rev=mod+mov;
				temp=temp/10;
			}
			if(rev==i)
			{
			System.out.println(i);
			}
		}
	}

}
