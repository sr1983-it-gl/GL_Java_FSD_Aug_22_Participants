
public class AutomaticTypeConversionWideningDemo {

	public static void main(String[] args) {
		
		byte aByte = 10;
		short aShort = 200;
		
		int anInteger = 12345;
		
		long aVeryLongValue = 123456789L;
		
		
		aVeryLongValue = anInteger;
		System.out.println("Long's value->" + aVeryLongValue);
		
		anInteger = aShort;
		System.out.println("Integer's value->" + anInteger);
		
		aShort = aByte;
		System.out.println("Short's value->" + aShort);
	}
}
