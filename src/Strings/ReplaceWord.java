package Strings;

public class ReplaceWord {

	public static void main(String[] args) {

		String a="hi hello how abcd are you";
		char str[]=a.toCharArray();

		String b="how";
		char str1[]=b.toCharArray();

		String c="morning";
		char str2[]=c.toCharArray();


		boolean flag=false;

		int count=0;
		int index=0;
		for(int i=0;i<str.length;i++)
		{
			count =0;
			index=0;
			for(int j=0;j<str1.length;j++)
			{
				if(str1[j]==str[j+i])
				{
					index=i;
					count++;
				}
				else

					break;

			}

			if(count==str1.length)
			{
				flag =true;
				break;
			}
		}
		if(flag==true)
		{

			for(int i=0;i<str.length;i++)
			{
				if(index==i)
				{
					for(int j=0;j<str2.length;j++)
					{

						str[i+j]=str2[j];

					}
					break;
				}	

			}
			for(int i=0;i<str.length;i++)
			{

				System.out.print(str[i]);
			}

		}
		else
		{
			System.out.println("word is not found to insert");
		}
	}

}
