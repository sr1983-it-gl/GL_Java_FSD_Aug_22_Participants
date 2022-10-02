package com.gl.javafsd.dsa.arraysearch;

import com.gl.javafsd.dsa.arrayrotater.DataStructureUtils;

public class DividePhaseTest {

	public static void main(String[] args) {
		
		test1();
	}
	
	static void test1() {
		
		int [] array = DataStructureUtils.generateRandomSortedArray(9);		
//		DataStructureUtils.print(array);
		
//		int[] array = {21 , 54 , 9 , 12 , 10 , 44 , 19 , 110 , 41};
		DataStructureUtils.print(array);

		DividePhase phase = new DividePhase(array);
		
		for (int index = 0; index < 2; index ++) {

			int searchElement = DataStructureUtils.pickRandomNumber(array);
			
			phase.divide(searchElement);	
			
			System.out.println("-------------");
		}
	}
}
