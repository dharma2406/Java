package Arrays;

public class RightShift {
	
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};				
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		System.out.println("The elements after the RIGHT shift");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
