package Strings;

public class Word {

	public static void main(String[] args) {

		String a="Never ever give up";
		char[] str=a.toCharArray();

		int count=1;

		for(int i=0;i<str.length-1;i++)
		{

			if(str[i]==' ')
			{
				if(!(i==0||i==str.length-1))
				{
					count++;
				}
				if(i!=str.length-1)
				{
					if(str[i+1]==' ')
					{
						count--;
					}
				}

			}
		}

		System.out.println(count);



	}

}
