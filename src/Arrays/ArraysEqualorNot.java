package Arrays;

public class ArraysEqualorNot {

	public static void main(String[] args) {

		int [] a= {1,2,4,5,6};
		int [] b= {1,2,3,4,5};


		boolean arraysAreEqual = true;     // Initialize flag for comparison


		if (a.length != b.length)          // Manually comparing lengths
		{
			arraysAreEqual = false;
		} 
		else                              // Manually compare each element
		{                             
			for (int i = 0; i < a.length; i++) 
			{
				if (a[i] != b[i]) 
				{
					arraysAreEqual = false;
					break;                 // Exit loop early if elements are not equal
				}
			}
		}

		// Output result
		if (arraysAreEqual)
		{
			System.out.println("Both arrays are equal");
		} 
		else 
		{
			System.out.println("Both arrays are NOT equal");
		}


	}
}
