package Arrays;

public class InsertElementEnd {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6};
		int ele =555;
		
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=ele;
		
		System.out.println("After inserting the element at the end of the array is :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
