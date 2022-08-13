
public class FactorialDemo {

	public static void main(String[] args) {
		
		int number = 5;
		
		long intermediateValue = 1;
		int currentElement = 1;
		
		for (int index = number; index >=1; index --) {
			
			currentElement = index;
			
			intermediateValue = 
				currentElement * intermediateValue;
			
		}
		
		System.out.println("Factorial (" + number + ") is " 
			+ intermediateValue);
	}
}
