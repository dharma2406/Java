package Basics;

import java.util.Scanner;

public class Traingle {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no. of rows");
		int n= sc.nextInt();
		
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		
	}

}
