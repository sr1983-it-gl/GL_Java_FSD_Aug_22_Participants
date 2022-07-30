
public class CodeBlockDemo {

	public static void main(String[] args) {
		
		if (true) {
			
			System.out.println("Line 1");
			System.out.println("Line 2");
		}
		
		{
			int a = 10;
			System.out.println(a);
		}
		
		System.out.println(a);
	}
}
