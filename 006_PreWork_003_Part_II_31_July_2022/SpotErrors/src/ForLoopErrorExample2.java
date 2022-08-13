
public class ForLoopErrorExample2 {
	
	public static void main(String[] args) {
		
		int codeRunCounter;
        for (
        		codeRunCounter = 0; codeRunCounter > 0; 
        		codeRunCounter = codeRunCounter + 1
		) {
        	System.out.println("Count of code executions is " + codeRunCounter);
        }
        
        
        if ( (3 < 10)) {
        	System.out.println("IF");
        }
        
        if ( 
        		(3 < 10)
        	) {
        	System.out.println("IF");
        }
        
        
	}
}
