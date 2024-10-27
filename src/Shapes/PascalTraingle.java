package Shapes;

public class PascalTraingle {
	
	public static void main(String[] args) {
		
		int res = 0,n=5;

		for (int i = 0; i <= n; i++)
		{
			for (int spc = 1; spc <= n - i; spc++)
			{
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++)
			{
				if (i == 0 || i == j||j==0)
				{
					res = 1;
				}
				else
				{
					int ifact = 1;
					for (int k = 1; k <= i; k++)
					{
						ifact = ifact * k;
					}
					
					int ijfact = 1;
					for (int k = 1; k <= (i - j); k++)
					{
						ijfact = ijfact * k;
					}
					
					int jfact = 1;
					for (int k = 1; k <= j; k++)
					{
						jfact = jfact * k;
					}
					
					res = ifact / (ijfact * jfact);
				}

				System.out.print(res+" ");

			}

			System.out.println();
		}

	}

}
