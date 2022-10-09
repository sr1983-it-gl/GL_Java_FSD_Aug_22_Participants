package com.g.javafsd.traveller;

public class DenominationCalculatorTest {

	public static void main(String[] args) {
		
//		test1(new int[] {10, 5, 1}, 12);
//		test1(new int[] {5, 1, 10}, 12);		
		
//		test1(new int[] {78, 60, 25, 12, 5}, 128);		
		test1(new int[] {60, 5, 12, 78, 25}, 128);		
		
//		test1(new int[] {123, 18, 12, 5}, 158);		
//		test1(new int[] {123, 18, 12, 5}, 160);	
	}
	
	static void test1(int[] denominations, int paymentAmount) {
		
		System.out.println("----------------------------");
		
		DenominationCalculator calculator = 
			new DenominationCalculator(denominations, paymentAmount);
		
		calculator.calculate();
	}
}
