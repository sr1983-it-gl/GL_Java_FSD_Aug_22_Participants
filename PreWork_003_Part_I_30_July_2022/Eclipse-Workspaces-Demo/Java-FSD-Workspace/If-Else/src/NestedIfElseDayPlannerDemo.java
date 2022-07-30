
public class NestedIfElseDayPlannerDemo {

	public static void main(String[] args) {
		
		String dayOfWeek = "Friday";
		
		// Outer if-else block
		
		if (dayOfWeek.equals("Saturday")
			|| dayOfWeek.equals("Sunday")) {
			
			// weekend flow
			
			if (dayOfWeek.equals("Saturday")) {
				System.out.println("Go to a movie...");
			}else {
				System.out.println("Relax at home...");
			}
			
		}else {
			
			// weekday flow
			
			if (dayOfWeek.equals("Monday") 
				|| dayOfWeek.equals("Wednesday")
				|| dayOfWeek.equals("Friday")) {
				
				System.out.println("Go to Gym");
			}else {
				System.out.println("Go to temple/church/mosque..");
			}
		}
	}
}
