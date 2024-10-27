package Arrays;

import java.util.Scanner;

public class Ascending {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array length");
	int a=sc.nextInt();
	
	int [] array=new int[a];
	System.out.println("Enter the elements of the array");
	for(int i=0;i<array.length;i++)
	{
		
		array[i]=sc.nextInt();
	}
	int temp=0;
	
	for (int j=0;j<array.length;j++)
	{
		for(int k=0;k<array.length;k++)
		{
			if(array[j]<array[k])
			{
				temp=array[j];
				array[j]=array[k];
				array[k]=temp;
			}
		}
	}
	
	System.out.println("Ascending order of the entered numbers is");
	
	for (int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
}

}
