package Strings;

public class InsertSubstring {
	
	public static void main(String[] args) {
		
		String a="hi hello how are you i am good";
		char [] str=a.toCharArray();

		String b="how";;
		char[] str1=b.toCharArray();

		String c="morning";
		char []str2=c.toCharArray();
		
		int count=0,index=0;
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str1.length;j++)
			{
				if(str1[j]==str[i+j])
				{
					index=i;
					count++;
				}
				else
				{
					break;
				}
			}
			if(count==str1.length)
			{
				break;
			}
		}
		
		index=index+count+1;
		
		for(int i=0;i<str2.length+1;i++)
		{
			for(int j=0;j<str.length-index;j++)
			{
				str[(str.length-1)-i]=str[(str.length-2)-i];
			}
		}
		
		for(int i=index;i<str.length;i++)
		{
			for(int j=0;j<str2.length;j++)
			{
				str[i+j]=str2[j];
			}
			break;
		}
		
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]);
		}

	}

}
