
public class SwitchCaseExample2 {
	public static void main(String[] args) {
		
		int dayOfWeek = 3;
		
		switch (dayOfWeek) {
			case 5 :
				System.out.println("Week day is Friday");
				break;
				
			case 6 :
				System.out.println("Week day is Saturday");
				break;
				
			case 1 :
				System.out.println("Week day is Monday");
				break;
				
			case 3 :
				System.out.println("Week day is Wednesday");
				break;
				
			case 7 :
				System.out.println("Week day is Sunday");
				break;
				
			case 4 :
				System.out.println("Week day is Thursday");
				break;
				
			case 2 :
				System.out.println("Week day is Tuesday");
				break;
				
			default:
				break;
		}	
	}
}
