package Arrays;

import java.util.Scanner;

public class CopyandReplace {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array length");
		int l= sc.nextInt();

		int []a = new int[l];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}

		int a1[]=new int[a.length];

		for(int i=0;i<a.length;i++)
		{
			a1[i]=a[i];
		}

		System.out.println("The copy and replace of an array is");
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}

	}

}
