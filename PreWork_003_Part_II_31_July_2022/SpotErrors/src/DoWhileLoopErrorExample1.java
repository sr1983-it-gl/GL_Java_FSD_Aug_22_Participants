
public class DoWhileLoopErrorExample1 {
	public static void main(String[] args) {
		
		int loopCounter = 0;
		
		do {
			System.out.println("inside do block of do-while...");
			loopCounter = loopCounter + 1;
			System.out.println("loop execution count is " + loopCounter);
		} while (loopCounter < 10); 
		
		
		{
			System.out.println("inside while block of do-while..");
		}
			
	}
}
