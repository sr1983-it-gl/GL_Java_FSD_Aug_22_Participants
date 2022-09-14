import java.util.Scanner;

public class AbstractionDemoForObjects {

	public static void main(String[] args) {
		
		System.out.println("Enter a message");
		
		Scanner scanner = new Scanner(System.in);
		
		String userMessage = scanner.nextLine();
		
//		scanner.nextInt();
		
		System.out.println("You entered ->" + userMessage);
	}
}
