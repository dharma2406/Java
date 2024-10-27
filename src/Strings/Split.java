package Strings;

public class Split {
	
	public static void main(String[] args) {
		
		String a="  Honest is   the best policy  ";
		char[] str=a.toCharArray();
		
		int count=1;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]==' ')
			{
				count++;
			}
		}
		
		String[] str1 = new String[count];
		int index=0;
		String temp=" ";
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]==' ')
			{
				index++;
				temp="";
			}
			else
			{
				temp=temp+str[i];
				str1[index]=temp;
			}
		}
		
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
	}

}
