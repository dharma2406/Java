package Strings;

public class StringStratwithSubstring {
	
	public static void main(String[] args) {
		
		String a="java is a programming language";
		char [] str=a.toCharArray();

		String b="java";
		char [] str1=b.toCharArray();
		int count=0;
		
		for(int i=0;i<str1.length;i++)
		{
			if(str[i]==str1[i])
			{
				count++;
			}
			else
			{
				break;
			}
		}
		
		if(count==str1.length)
		{
			System.out.println("String started with substring");
		}
		else
		{
			System.out.println("String not started with substring");
		}
	}

}
