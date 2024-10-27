package Arrays;

public class Reverse {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int j=a.length-1;
		int temp=0;
		
		for(int i=0;i<a.length/2;i++)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
			System.out.println(a[i]);
			
		}
		System.out.println("the reverse array is");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
