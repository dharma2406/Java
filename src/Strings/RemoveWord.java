package Strings;

public class RemoveWord {

	public static void main(String[] args) {

		String a="hi hello how are you";
		char st[]=a.toCharArray();

		String b="how are";
		char su[]=b.toCharArray();

		boolean flag=false;

		int count=0;
		int index=0;

		for(int i=0;i<st.length;i++)
		{
			count =0;
			index=0;
			for(int j=0;j<su.length;j++)
			{
				if(su[j]==st[j+i])
				{
					index=i;
					count++;
				}
			}

			if(count==su.length)
			{
				flag =true;
				break;
			}
		}

		if(flag==true)
		{
			for(int i=index;i<st.length-count;i++)
			{
				st[i]=st[i+count];
			}
			for(int i=0;i<st.length-count;i++)
			{

				System.out.print(st[i]);
			}

		}
		else
		{
			System.out.println("word is not found to remove");
		}


	}

}
