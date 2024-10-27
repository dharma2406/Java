package Arrays;

public class Multiply {
	
	public static void main(String[] args) {
		
		int [] a= {1,2,4,8,7,9};	
		int multiply=1;

		for(int i=0;i<a.length;i++)
		{
			multiply=multiply*a[i];
		}
		System.out.println("Multiplication of the entered array is"+" "+multiply);

	}

}
