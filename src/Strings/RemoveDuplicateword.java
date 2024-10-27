package Strings;

import java.util.Scanner;

public class RemoveDuplicateword {

	public static void main(String[] args) {

		String a="hi hello how are you hello";
		char [] str=a.toCharArray();

		String b="hello";
		char [] str1=b.toCharArray();

		int count=1,x=0,index=0,count1=0; 

		for(int i=0;i<str.length;i++)
		{
			count=0;
			
			for(int j=0;j<str1.length;j++)
			{
				if(str[i+j]==str1[j])
				{
					count++;
				}
				else
				{
					break;
				}
				if(count==str1.length)
				{
					x++;
				}
				if(count==str1.length)
				{
					count1++;
					if(count1>1)
					{
						index=i;
						
						for(int m=0;m<str1.length;m++)
						{
							for(int k=index;k<str.length-1;k++)
							{
								str[k]=str[k+1];
							}
						}
					}
				}
			}
		}
		
		for(int l=0;l<str.length-((x*str1.length)-str1.length);l++)
		{
			System.out.print(str[l]);
		}
	}

}


