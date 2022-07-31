import java.util.Scanner;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		
		int maxNoOfPages = 5;
		int personIndex = 0;
		
		Scanner scanner = new Scanner(System.in);
		boolean anyoneStandingInQueue = true;

		while (anyoneStandingInQueue) {
			
			System.out.println("Is anyone standing in the queue (Y/N)?");
			
			String answer = scanner.nextLine();
			if (answer.equals("Y")) {

				anyoneStandingInQueue = true;
				personIndex = personIndex + 1;
				
				System.out.println("For person ->" + personIndex);
				for (int pageNo = 1; pageNo <= maxNoOfPages; pageNo = pageNo + 1) {
					
					System.out.println("Take print out of page no ->" + pageNo);
				}
				
			}else {
				
				anyoneStandingInQueue = false;
			}
			
		}
		
		
		
	}
}
