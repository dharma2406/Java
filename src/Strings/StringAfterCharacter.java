package Strings;

public class StringAfterCharacter {

	public static void main(String[] args) {

		String a="Hi hi how are tou";
		char[] str=a.toCharArray();

		char b='o';

		for(int i=0;i<str.length;i++)
		{
			if(str[i]==b)
			{
				for(int j=i+1;j<str.length;j++)
				{
					System.out.print(str[j]);
				}
			}
		}

	}

}
