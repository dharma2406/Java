package Arrays;

public class LeftShift {
	
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};

		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		System.out.println("The elements after the LEFT shift");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
