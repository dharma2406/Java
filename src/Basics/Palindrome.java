package Basics;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int n=12321;
		int temp=n,rev=0;
		
		while(temp>0)
		{
			int mod=temp%10;
			int mov =rev*10;
			rev=mod+mov;
			temp=temp/10;
		}
		if(rev==n)
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
	}

}
