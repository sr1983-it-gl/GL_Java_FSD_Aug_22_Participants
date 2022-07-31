import java.util.Scanner;

public class SwitchBreakStatementExcludedCorrectDemo {

	public static void main(String[] args) {
		
		
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");

		System.out.println("Select an option (1/2/3/4/5/6/7): ");

		Scanner input = new Scanner(System.in);
		
		int dayofWeek = input.nextInt();
		
		switch (dayofWeek) {
			
			case 1: {
				departmentHead = "person-1";
				break;				
			}			
			
			case 3: {
				departmentHead = "person-1";
				break;				
			}
			
			case 5: {
				departmentHead = "person-1";
				break;
			}
			
			case 2: {
				departmentHead = "person-2";				
				break;
			}
			
			case 4: {
				departmentHead = "person-3";
				break;
			}
			
				
			
			case 2: {}			
			case 3: {}			
			case 4: {}
			case 5: {
				System.out.println("The day you selected is a weekday");
				break;
			}
			case 6: {}
			case 7: {
				System.out.println("The day you selected is a weekend");
				break;				
			}
			
			default : {
				
				System.out.println("Wrong option selected. Select (1/2/3/4/5/6/7)");
			}
			
		}
		
	}
}
