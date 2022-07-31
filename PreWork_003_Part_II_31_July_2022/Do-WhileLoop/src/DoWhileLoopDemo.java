import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		
		System.out.println("Demoing Do While Loop...");
		
		boolean skipAds = false;
		do {
			
			System.out.println("Displaying some random Advertisement...");
			
			System.out.println("Do you want to skip Ads (Y/N) ?");
			
			Scanner scanner = new Scanner(System.in);
			String userOption = scanner.nextLine();
			
			if (userOption.equals("Y")) {
				skipAds = true;
			}else {
				skipAds = false;	
			}
			
		}while (skipAds == false);
	}
}
