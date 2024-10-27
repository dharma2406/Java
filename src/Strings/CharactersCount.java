package Strings;

public class CharactersCount {

	public static void main(String[] args) {

		String a="good langauage";
		char[] str=a.toCharArray();

		int count=0;

		for(int i=0;i<str.length;i++)
		{
			if(str[i]!=' ')
			{
				count++;
			}
		}

		System.out.println(count);
	}

}
