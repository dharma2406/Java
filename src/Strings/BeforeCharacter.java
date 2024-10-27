package Strings;

public class BeforeCharacter {
	
	public static void main(String[] args) {
		
		String a="Welcome";
		char[] str=a.toCharArray();
		char b='c';
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]!=b)
			{
				System.out.print(str[i]);
			}
			else
			{
				break;
			}
		}
		
	}

}
