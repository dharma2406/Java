package Arrays;

public class FindDuplicate {

	public static void main(String[] args) {

		int []a= {1,1,2,4,2,3,3,3};

		for(int i=0;i<a.length;i++)
		{
			boolean x =true;

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
				System.out.println(a[i]);
			}

		}
	}
}



