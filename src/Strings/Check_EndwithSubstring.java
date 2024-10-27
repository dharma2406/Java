package Strings;

public class Check_EndwithSubstring {
	
	public static void main(String[] args) {
		
		String a="Objective Airthetic";
		char[] str=a.toCharArray();
		
		String b="Airthmetic";
		char[] str1=b.toCharArray();
		
		int count=0;
		
		for(int i=0;i<str1.length;i++)
		{
			if(str[(str.length-1)-i]==str1[(str1.length-1)-i])
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
			System.out.println("Ended with Substring");
		}
		else
		{
			System.out.println("Not ended with substring");
		}
	}

}
