
public class ContinueUsageDemo {
	
	public static void main(String[] args) {
		
		for (int counter = 0; counter < 100 ; counter++ ) {
			if(counter > 9) {
				continue;
			}
			System.out.println("counter value : " + counter);
		}
	}
	
}
