
public class BreakStatementWithinForLoopDemoV2 {

	public static void main(String[] args) {
				
		for (int i = 1; i <=10; i++) {

			if (i == 6) {
				
				System.out.println("Processing has stopped from I ->" + i);
				break;				
				// No further processing happens after this point
			}

			System.out.println("Processing I for value ->" + i);			
		}
		
		System.out.println("Outside the for loop");
		
	}
}
