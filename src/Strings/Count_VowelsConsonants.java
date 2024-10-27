package Strings;

public class Count_VowelsConsonants {
	
	public static void main(String[] args) {
		
		String a="attitude";
		char[] str=a.toCharArray();
		int count=0,count1=0;
		for(int i=0;i<str.length;i++)
		{

			if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')
				count++;
			else if(str[i]!=' ')
			{
				count1++;
			}
		}
		System.out.println("Total Vowels in the string"+" "+count);
		System.out.println("Total Consonants in the string"+" "+count1);

	}

}
