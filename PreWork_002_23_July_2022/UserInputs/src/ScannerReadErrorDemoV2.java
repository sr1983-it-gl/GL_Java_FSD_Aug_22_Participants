import java.util.Scanner;

public class ScannerReadErrorDemoV2 {

	public static void main(String[] args) {
		
		Scanner scanner = new 
				Scanner(System.in);
			
		System.out.println("Enter some number:");
		
		boolean isAnIntegerValue = scanner.hasNextInt();
		
		if (isAnIntegerValue) {

			int number = scanner.nextInt();			
			System.out.println("You have entered->" + number);					
		}else {
			
			System.out.println("You are expected to enter an integer number.");
		}
		
	}
}
