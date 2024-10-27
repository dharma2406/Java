package Arrays;

public class InsertElementMiddle {
	
	public static void main(String[] args) {
		
		int a[]= {1,4,6,7,3,5};
		int selectele=6;
		int ele=33;
		int index=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==selectele)
			{
				index=i;
				break;
			}
		}
		for(int i=a.length-1;i>index;i--)
		{
			a[i]=a[i-1];
		}
		a[index+1]=ele;
		System.out.println("After inserting the element at the middle of the array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
