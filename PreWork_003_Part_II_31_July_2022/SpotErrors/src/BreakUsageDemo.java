
public class BreakUsageDemo {
	
	public static void main(String[] args) {
		
		for (int counter = 0; counter < 10; counter++) {
			System.out.println("counter is " + counter);
			if(counter == 3) {
				break;
			}			
		}
	}
	
}
