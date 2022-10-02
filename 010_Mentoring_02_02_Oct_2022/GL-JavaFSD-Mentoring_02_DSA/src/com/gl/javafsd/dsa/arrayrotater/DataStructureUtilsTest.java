package com.gl.javafsd.dsa.arrayrotater;

public class DataStructureUtilsTest {

	public static void main(String[] args) {
		
//		evenRandomArrayTest();
//		oddRandomArrayTest();
		
		evenNumbersArrayTest();
	}
	
	static void evenRandomArrayTest() {
		int[] array = DataStructureUtils.generateRandomArray(10);
		
		DataStructureUtils.print(array);
	}

	static void oddRandomArrayTest() {
		int[] array = DataStructureUtils.generateRandomArray(7);
		
		DataStructureUtils.print(array);
	}

	static void evenNumbersArrayTest() {
		
		int[] array = DataStructureUtils.generateEvenNumbersRandomArray(10);
		
		DataStructureUtils.print(array);
	}
	
}
