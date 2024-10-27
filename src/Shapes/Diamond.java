package Shapes;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no. of rows ");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			for(int s=n;s>r;s--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int r=1;r<=n;r++)
		{
			for(int s=1;s<=r;s++)
			{
				System.out.print(" ");		
			}
			for(int c=n-1;c>=r;c--)
			{
				System.out.print("* ");
			}
			System.out.println( );
		}

	}

}
