package Shapes;

import java.util.Scanner;

public class InvertRevRtTriangle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no. of rows ");
		int n=sc.nextInt();

		for(int r=1;r<=n;r++)
		{
			for(int c=n;c>=r;c--)
			{
				System.out.print("* ");
			}
			System.out.println();	
		}

	}

}
