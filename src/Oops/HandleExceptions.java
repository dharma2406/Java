package Oops;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {

		System.out.println("Program is started");

		Scanner sc = new Scanner(System.in);

		// Example -1

		/*System.out.println("Please enter the number");
		int n =sc.nextInt();
		try {
			System.out.println(100/n); //Arithmetic exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Throws Exception");
		}*/

		//Example -2

		int a[]=new int[5];

		System.out.println("Enter the position between 0 to 4");
		int pos = sc.nextInt();

		try {
		System.out.println("Enter the value");   //Index out of bound exception
		int value=sc.nextInt();
		System.out.println(a[pos]);
		}
		catch(Exception e)
		{
			System.out.println("Throws Exception");
			System.out.println(e.getMessage());
		}

	

		System.out.println("exit");
	}

}
