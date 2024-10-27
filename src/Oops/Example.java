package Oops;

public class Example {
	
	/*public static void main(String[] args) {      // valid ==> This is the actual main method and JVM also look for this main method
		
	}
	
	static public  void main(String[] args) {       // valid
		
	}
	
	public  void static main(String[] args) {       // invalid ==> Because return type should always be infront of method name 
		
	}
	
	void main(String[] args) public static  {       // invalid ==> Because, Nothing should written after closing method.
		
	}
	
	public static void main(int a[]) {              // valid ==> But not main method 
		
	}
	
	*/
	
	public static void main(String[] args) {
		
		System.out.println(args.length);
		
		for (String value : args) {
			
			System.out.println(value);
			
		}
		
	}
	
	

}
