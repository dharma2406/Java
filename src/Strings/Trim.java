package Strings;

public class Trim {
	
	public static void main(String[] args) {
		
		String a="      go    back    ";
		char[] str=a.toCharArray();
		String temp="";
		for(int i=0;i<str.length;i++)
		{
			if(str[i]!=' ')
			{
				for (int j=i;j<str.length;j++)
				{
					temp=temp+str[j];
				}
				break;
			}
		}
		char st[]=temp.toCharArray();
		String temp1="";
		for(int i=st.length-1;i>=0;i--)
		{
			if(st[i]!=' ')
			{
				for (int j=i;j>=0;j--)
				{
					temp1=st[j]+temp1;
				}
				break;
			}
		}

		System.out.println(temp1);
	}

}
