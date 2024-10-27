package Oops;

public class CheckedExceptions {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Checked Exceptions hadled by 2 ways 
		//1) try and catch
		//2) throws exception -- at method level
		
		System.out.println("Program started.....");
		System.out.println("Program in progress..........");
		
		Thread.sleep(5000);
		
		System.out.println("Programm is finished and exits");
	}

}
