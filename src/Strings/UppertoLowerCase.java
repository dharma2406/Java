package Strings;

public class UppertoLowerCase {
	
	public static void main(String[] args) {
		
		String a="BHARATH IS SMART BOY";
		char[] str=a.toCharArray();

		for(int i=0;i<str.length;i++)
		{
			if(str[i]>=65&&str[i]<=90)
			{
				str[i]=(char) (str[i]+32);
				System.out.print(str[i]);
			}
			else
			{
				System.out.print(str[i]);
			}
		}

	}

}
