package Strings;

import java.util.Scanner;

public class ReverseEachWordInSentence {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		String str1="";

		for(int i=arr.length-1;i>=0;i--)
		{
			str1=str1+arr[i];			
		}

		String[] str2=str1.split(" ");

		for(int i=str2.length-1;i>=0;i--)
		{
			System.out.print(str2[i]+" ");
		}

	}
}
