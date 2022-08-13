
public class NestedLoops {

	public static void main(String[] args) {
		
		for (int outerIndex = 1; outerIndex <= 10; outerIndex ++) {

			for (int innerIndex = 1; innerIndex <= 5; innerIndex ++) {
				System.out.print("* ");			
			}
			
			System.out.println();
		}
		
		
		for (int i = 1; i<=10; i++) {
			System.out.println("i" + i);
		}
	}
}
