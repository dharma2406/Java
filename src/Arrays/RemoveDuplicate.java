package Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int a[]= {1,1,7,7,4,1,6};
		int count =0;

		for(int i=0;i<a.length;i++)
		{
			boolean x= true;
			for(int k=0;k<i;k++) 
			{
				if(a[i]==a[k])
				{
					x=false;
					break;
				}
			}
			if(x==true)
			{
				count++;
			}
		}
			
			System.out.println("After removing the duplicates the array length is "+count);
			
			int newarr []=new int[count];
			int index=0;
			
			for(int i=0;i<a.length;i++)
			{
				boolean x= true;
				for(int k=0;k<i;k++) 
				{
					if(a[i]==a[k])
					{
						x=false;
						break;
					}
				}
				if(x==true)
				{
					newarr[index]=a[i];
					index++;
				}
		}
			System.out.println("after removing the duplicate the array is ");
			for(int p=0;p<newarr.length;p++)
			{
				System.out.println(newarr[p]);
			}
	}
}
