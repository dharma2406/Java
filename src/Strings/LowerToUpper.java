package Strings;

public class LowerToUpper {
	
	public static void main(String[] args) {
		
		String a="chinnaraorukumini";
		char[] str=a.toCharArray();

		for(int i=0;i<str.length;i++)
		{
			if(str[i]>=97&&str[i]<=122)
			{
				str[i]=(char) (str[i]-32);
				System.out.print(str[i]);
			}
			else
			{
				System.out.println(str[i]);
			}
		}

	}

}
