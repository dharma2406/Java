package Strings;

public class CharacterRepeat {
	
	public static void main(String[] args) {
		
		String a="goooood morning";
		char[] str=a.toCharArray();
		
		char b='o';
		
		int count=0;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]==b)
			{
				count++;
			}
		}
		
		System.out.println("the letter repeats :"+count);
	}

}
