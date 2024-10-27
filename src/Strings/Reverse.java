package Strings;

public class Reverse {

	public static void main(String[] args) {

		String a="go away";
		char[] str=a.toCharArray();

		char temp;
		int j=str.length-1;

		for(int i=0;i<str.length/2;i++)
		{
			temp=str[i];
			str[i]=str[j];
			str[j]=temp;
			j--;
		}

		System.out.println("The reversed string is");

		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]);
		}

	}

}
