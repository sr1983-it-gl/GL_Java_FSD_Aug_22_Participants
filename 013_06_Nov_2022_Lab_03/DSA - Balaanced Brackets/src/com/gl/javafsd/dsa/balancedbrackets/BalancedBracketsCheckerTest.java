package com.gl.javafsd.dsa.balancedbrackets;

public class BalancedBracketsCheckerTest {

	public static void main(String[] args) {
			
		test("");
		test("([[{}]])");
		
		test("([[{}]]))");

		test("[]");

		test("[)");
		
		test("[[[]]]");

		test("M{{[[[()]]]}}W");
		test("M{{[[[()]]]}}");
	}


	static void test(String brackets) {
		
		BalancedBracketsChecker checker = new BalancedBracketsChecker(
			brackets);
		
		boolean result = checker.check();
		if (result) {
			System.out.println("Bracket expression " + brackets + " is balanced");
		}else {
			System.out.println("Bracket expression " + brackets + " is NOT balanced");			
		}		
	}
}
