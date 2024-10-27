package Arrays;

public class LargestSmallest {
	
	public static void main(String[] args) {
		
		int [] a= {11,2,3,4,5};
		int largest=a[0];
		int smallest=a[0];

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];	
			}
			else if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("The largest no. in the array is"+" "+largest);
		System.out.println("The smallest no. in the array is"+" "+smallest);

	}

}
