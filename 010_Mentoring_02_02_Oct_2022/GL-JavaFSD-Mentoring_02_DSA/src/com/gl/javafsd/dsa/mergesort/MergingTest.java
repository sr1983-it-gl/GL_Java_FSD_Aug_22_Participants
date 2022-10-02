package com.gl.javafsd.dsa.mergesort;

import com.gl.javafsd.dsa.arrayrotater.DataStructureUtils;

public class MergingTest {

	public static void main(String[] args) {
		
//		mergeTest1();
		mergeTest2();
	}
	
	static void mergeTest1() {
		
		int aArray[] = DataStructureUtils.generateRandomArray(2);
		DataStructureUtils.print(aArray);

		int bArray[] = DataStructureUtils.generateRandomArray(2);
		DataStructureUtils.print(bArray);

		Merging merging = new Merging(aArray, bArray);
		int cArray[] = merging.merge();
		
		DataStructureUtils.print(cArray);
			
		
	}

	static void mergeTest2() {
		
		int aArray[] = DataStructureUtils.generateRandomArray(2);
		DataStructureUtils.print(aArray);

		int bArray[] = DataStructureUtils.generateRandomArray(3);
		DataStructureUtils.print(bArray);

		Merging merging = new Merging(aArray, bArray);
		int cArray[] = merging.merge();
		
		DataStructureUtils.print(cArray);
			
		
	}

}
