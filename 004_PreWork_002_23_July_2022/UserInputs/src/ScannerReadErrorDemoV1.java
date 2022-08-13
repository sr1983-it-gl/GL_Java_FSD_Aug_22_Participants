import java.util.Scanner;

public class ScannerReadErrorDemoV1 {

	public static void main(String[] args) {
		
		Scanner scanner = new 
				Scanner(System.in);
			
		System.out.println("Enter some number:");
			
		int number = scanner.nextInt();
			
		System.out.println("You have entered->" + number);		
	}
}
