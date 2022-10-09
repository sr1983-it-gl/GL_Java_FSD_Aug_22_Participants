package com.gl.javafsd.dsa.mergesort;

public class RecursionDemo {

	static int counter = 0;
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		function1();
		
		long end = System.currentTimeMillis();
		
		System.out.println((end - start));
		// line
	}
	
	static void function1() {
		
		counter ++;
		System.out.println("Within function1..." + counter);
		
		try {
			Thread.sleep(2 * 1000);			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		boolean exitCondition = (counter == 5);
		if (exitCondition) {
			return;
		}
		
		function1();
	}
	
}
