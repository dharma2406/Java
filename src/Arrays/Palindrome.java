package Arrays;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,1};
		
		boolean val=true;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=a[a.length-1-i])
			{
				val=false;
				break;
			}
		}
		
		if(val==true)
		{
			System.out.println("Array is Palindrome");
		}
		else
		{
			System.out.println("Array is not Palindrome");

		}
	}

}
