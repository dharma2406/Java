package Oops;

import java.util.Scanner;

public class Exceptions {
	
	public static void main(String[] args) {
		
		System.out.println("Program is started");
		
		Scanner sc = new Scanner(System.in);
		
		// Example -1
		/*System.out.println("Please enter the number");
		int n =sc.nextInt();
		
		System.out.println(100/n);*/        //Airthmetic exception
		
		//Example - 2
		
		/*int a[]=new int[5];
		
		System.out.println("Enter the position between 0 to 4");
		int pos = sc.nextInt();
		
		System.out.println("Enter the value");   //Index out of bound ezxception
		int value=sc.nextInt();
		
		System.out.println(a[pos]);*/
		
		//Example -3
		
		/*String s="welcome";
		System.out.println(Integer.parseInt(s));  //Number format exception*/
		
		//Example -4
		
		String s =null;
		System.out.println(s.length());     //NullPointerException
		
		
		System.out.println("exit");
	}

}
