package Arrays;

public class InsertElementStart {
	
	public static void main(String[] args) {
		
		int a[]= {3,5,7,9,6};
		int ele=88;
		
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=ele;
		System.out.println("After inserting the element at starting of the row is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
