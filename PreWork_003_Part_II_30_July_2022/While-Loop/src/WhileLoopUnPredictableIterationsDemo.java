import java.util.Scanner;

public class WhileLoopUnPredictableIterationsDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int counter = 0;
		boolean userInput = true;
		
		while (userInput) {
			
			System.out.println("Counter is " + counter);
			counter = counter + 1;
			
			System.out.println("Do you want to continue ?");
			System.out.println("For Yes, either provide Y/T/1");
			System.out.println("For No, either provide N/F/0");
			
			String input = scanner.nextLine();
			
			
			if (input.equalsIgnoreCase("Y") || 
					input.equalsIgnoreCase("T") ||
					input.equals("1")) {
//			if (input.equals("Y")) {
				userInput = true;
			}else {
				userInput = false;
			}			
		}
		
//		scanner.close();

	}
}
