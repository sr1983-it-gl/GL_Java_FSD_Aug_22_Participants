package com.gl.javafsd.dsa.mergesort;

public class RecursionDemo2 {

	static int counter = 0;
	
	public static void main(String[] args) {
		
		function1("From Main");
		// line
	}
	
	static void function1(String indicator) {

		System.out.println(indicator);

		if (counter == 5) {
			System.exit(-1);;
		}

		counter ++;

		function1("First time ");
		function1("Second time");		
		
	}
	
}
