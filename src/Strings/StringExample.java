package Strings;

public class StringExample {

	public static void main(String[] args) {

		String str ="   my name is laxmi prasad ";
		char ch[] = str.toCharArray();
		
		int  count =1;

		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i] =='a' && ch[i+1] !='a')
			{
				count++;
			}
		}

		String a[] = new String[count];
		int	index=0;
		String temp="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				index++;
				temp=" ";
			}
			else
			{
				temp=temp+ch[i];
				a[index]=temp;


			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
}
