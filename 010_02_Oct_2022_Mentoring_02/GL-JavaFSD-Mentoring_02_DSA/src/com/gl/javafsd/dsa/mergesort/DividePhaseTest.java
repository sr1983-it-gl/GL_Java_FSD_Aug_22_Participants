package com.gl.javafsd.dsa.mergesort;

import com.gl.javafsd.dsa.arrayrotater.DataStructureUtils;

public class DividePhaseTest {

	public static void main(String[] args) {
		
		test1();
	}
	
	static void test1() {
		
		int []array = 
				DataStructureUtils.generateRandomArray(7);
		
		DividePhase phase = new DividePhase(array);
		phase.divide();
	}
}
