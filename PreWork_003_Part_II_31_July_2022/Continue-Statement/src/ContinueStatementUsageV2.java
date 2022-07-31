
public class ContinueStatementUsageV2 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i ++) {			
			
			System.out.println();
			if (i == 3) {
				System.out.println("Processing skipped for I ->" + i);
				continue;
			}
			
			System.out.println("Processing Started for I ->" + i);
			System.out.println("Processing Done for I ->" + i);			
		}
		
	}
}
