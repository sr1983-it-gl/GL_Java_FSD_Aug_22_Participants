
public class ConditionsDemoComplex {

	public static void main(String[] args) {
		
		boolean condition1 = false;
		boolean condition2 = (10 < 5);
		boolean condition3 = (5 <=10);
		
		boolean finalCondition = 
			((!condition1 && condition2) 
				||
			(!condition1 && condition3))
			
				&&
			(condition2 || condition3);
		
		if (finalCondition) {
			System.out.println("Final statement is true");
		}
	}
}
