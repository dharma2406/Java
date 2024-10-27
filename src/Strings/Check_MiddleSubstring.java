package Strings;

public class Check_MiddleSubstring {
	
	public static void main(String[] args) {
		
		String a="good hi are you";
		char[] str=a.toCharArray();
		
		String b="how";
		char[] str1=b.toCharArray();
		
		int count=0;
		
		for(int i=0;i<str.length;i++)
		{
			
			if(str[i]==str1[0])
			{
				int j=i;
				for(int k=0;k<str1.length;k++)
				{
					if(str[j]==str1[k])
					{
						count++;
						j++;
					}
					else
					{
						count=0;
						continue;
					}
				}
			}
		}
		
		if(count==str1.length)
		{
			System.out.println("Substring is present");
		}
		else
		{
			System.out.println("Substring is not present");
		}
		
	}

}
