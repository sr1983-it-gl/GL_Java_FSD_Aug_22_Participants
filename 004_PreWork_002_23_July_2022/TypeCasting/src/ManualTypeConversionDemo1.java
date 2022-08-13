
public class ManualTypeConversionDemo1 {

	public static void main(String[] args) {
		
		double d1 = 10.234;
		double d2 = 2.345;
		
		int x = (int) (d1 / d2);
		System.out.println("X's value is " + x);
		
		long longValue = 123L;
		short shortValue = (short)longValue;
		
		System.out.println("Short's value is ->" + shortValue);
		
		longValue = 123456789L;
		shortValue = (short)longValue;

		System.out.println("Short's value is ->" + shortValue);
		

		byte aByte = 70;
		char charValue = (char) aByte;
		// 65 - A . 70 - F
		
		System.out.println("Char value ->" + charValue);
	}
	
}
