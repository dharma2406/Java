package Basics;

public class DigitsCount {
	
	public static void main(String[] args) {
		
		int n=8976;
		int sum=0;
		int temp=n;
		while(temp>0)
		{
			temp=temp/10;
			sum++;
		}
		System.out.println("The no. of digits in "+" "+n+" "+"is"+" "+sum);

	}

}
