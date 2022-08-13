
public class StarPrinter {

	public static void main(String[] args) {
		
		int count = 7;
		
		boolean spacingNeeded = true;
		
		boolean emptySpaceCondition = false;
		
		for (int outerIndex = 1; outerIndex <=count; outerIndex ++ ) {

			for (int innerIndex = 1; innerIndex <=count; innerIndex ++) {
				
				int temp1 = count - outerIndex;
				
				if (innerIndex <= temp1) {
					emptySpaceCondition = true;
				}else {
					emptySpaceCondition = false;
				}
				
				
				if (emptySpaceCondition) {
					System.out.print(" ");
				}else {
					System.out.print("*");									
				}
				
				if (spacingNeeded) {
					System.out.print(" ");
				}							
			}	
			System.out.println();
		}
		
	}
}
