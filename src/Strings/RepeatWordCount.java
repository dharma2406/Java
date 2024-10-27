package Strings;

public class RepeatWordCount {
	
	public static void main(String[] args) {
		
		String a="hi madam madam ";
		char[] str=a.toCharArray();

		String b="madam";
		char[] str1=b.toCharArray();
		
		int count=0,num=0,k;
		
		for(int i=0;i<str.length;i++)
		{
			count=0;
			if(str1[0]==str[i])
			{
				k=i;
				for(int j=0;j<str1.length;j++)
				{
					if(str1[j]==str[k])
					{
						count++;
						k++;
					}
					
				}
				
				if(count==str1.length)
				{
					num++;
				}
			}
		}
		
		if(num>0)
		{
			for(int i=0;i<str1.length;i++)
			{
				System.out.print(str1[i]);
			}
			System.out.print(" "+num);
		}
		else
		{
			System.out.println("There is no repeated words");
		}

	}

}
