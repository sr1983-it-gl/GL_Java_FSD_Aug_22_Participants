
public class MathsUtils {

	
	public static void main(String[] args) {
		
		MathsUtils obj = new MathsUtils();
		
		int result = obj.add(100, 200);
		int grandResult = result * 2;
		
		System.out.println("Grand Result is " + grandResult);
		
		obj.addV2(100, 200);
		
		
		
	}

	int add(int a, int b) {
		
		int c = a + b;
		return c;
	}
	
	void addV2(int a, int b) {
		
		int c = a + b;
		System.out.println("Added value is " + c);
	}

}
