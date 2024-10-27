package Strings;

public class EachCharacterRepeat {

	public static void main(String[] args) {

		String a="hi how are you";
		char[] str=a.toCharArray();

		for(int i=0;i<str.length;i++)
		{
			int count=0;
			if(str[i]!=' ')
			{
				for(int j=i;j<str.length;j++)
				{
					if(str[i]==str[j])
					{
						count++;
						for(int k=i-1;k>=0;k--)
						{
							if(str[i]==str[k])
							{
								count--;
							}

						}
					}
				}
			}
			if(count>=1)
			{
				System.out.println("The character"+" "+str[i]+" "+"repeated"+" "+count);
			}
		}
	}

}
