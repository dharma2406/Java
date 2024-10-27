package Strings;

public class Ascending {
	
	public static void main(String[] args) {
		
		String a= "good morning";
		char[] str=a.toCharArray();
		char temp;
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length;j++)
			{
				if(str[i]<str[j])
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]!=' ')
			{
				System.out.print(str[i]);
			}
		}
	}

}
