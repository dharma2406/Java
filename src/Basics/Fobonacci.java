package Basics;

public class Fobonacci {
	
	public static void main(String[] args) {
		
		int n=6,first=0,second=1,next;
		
		for(int i=0;i<n;i++)
		{
			System.out.println(first);
			next=first+second;
			first=second;
			second =next;
		}
	}

}
