
public class Utilities {

	int max (int num1, int num2){
		
		if (num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}

	double max(double num1, double num2) {

		if (num1 > num2) {
			return num1;
		}else {
			return num2;
		}		
	}
	
	public static void main(String[] args) {
		
		Utilities utilities = new Utilities();		
		int result = utilities.max(30, 100);
		
		System.out.println("Integer Max result is " + result);
		
		double resultDouble = utilities.max(3.45D, 7.89D);
		System.out.println("Double Max result is " + resultDouble);
		
		utilities.max(10, 10.34D);
	}
}
