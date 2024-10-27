package Shapes;

import java.util.Scanner;

public class Shape1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no. of rows ");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			for(int s=1;s<=n-r;s++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print(r);
			}
			for(int f=1;f<=r-1;f++)
			{
				System.out.print(r);
			}
			System.out.println();
		}
	}



}
