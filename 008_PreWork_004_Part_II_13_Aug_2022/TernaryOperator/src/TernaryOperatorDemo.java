
public class TernaryOperatorDemo {

	public static void main(String[] args) {
		
		int num1 = 90;
		
		int num2 = 140;
		
		//  Logic if-Else
		
		if (num1 < num2) {
			System.out.println(num1 + " is smallest compared to " + num2);
		}else {
			System.out.println(num2 + " is smallest compared to " + num1);							
		}
	
		int result = 
			(num1 < num2) ? num1 : num2;
		System.out.println("Result is " + result);
	}
}
