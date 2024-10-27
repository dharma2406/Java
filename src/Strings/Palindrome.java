package Strings;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String a="MALAYALAM";
		char[]str=a.toCharArray();
		
		boolean val=true;
		
		for(int i=0;i<str.length/2;i++)
		{
			if(str[i]!=str[str.length-1-i])
			{
				val=false;
				break;
			}
		}
		
		if(val==true)
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
