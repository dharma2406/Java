package Basics;

import java.util.Scanner;

public class LargestSmallest {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter the x value");
		int x=sc.nextInt();
		int n=1;
		int largest=x,smallest=x;
		
		while(n==1)
		{
			System.out.println("Please enter the value");
			int n1=sc.nextInt();
			
			if(largest<n1)
			{
				largest=n1;
			}
			else if(smallest>n1)
			{
				smallest=n1;
			}
			System.out.println("Please enter 1, to enter the values");
			n=sc.nextInt();
		}
		System.out.println("The Largest no. is"+largest);
		System.out.println("The Smallest no. is"+smallest);

	}

}
